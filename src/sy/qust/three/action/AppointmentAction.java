package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Appointment_three;
import sy.qust.three.domain.Tporders_three;
import sy.qust.three.service.AppointmentService;
import sy.qust.three.service.TpordersService;
import sy.qust.three.util.JsonResultUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class AppointmentAction  extends ActionSupport implements ModelDriven<Appointment_three>{

   private Appointment_three appointment_three=new Appointment_three();
    @Override
    public Appointment_three getModel() {
        return appointment_three;
    }
    private AppointmentService appointmentService;
    private TpordersService tpordersService;

    public void setTpordersService(TpordersService tpordersService) {
        this.tpordersService = tpordersService;
    }

    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    private String phone;
    private String loginType;
    private String apid;

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAppInfo(){

        Map<String,Object> map=new HashMap<String,Object>();

        List<Appointment_three> list=new ArrayList<Appointment_three>();
        List<Tporders_three> tp_list=new ArrayList<Tporders_three>();
        if(loginType.equals("T")) {
            list = appointmentService.findTappByPhone(phone);
            tp_list=tpordersService.findTorderByPhone(phone);
        }else{
            list=appointmentService.findPappByPhone(phone);
            tp_list=tpordersService.findPorderByPhone(phone);
        }
        map.put("appointment",list);
        map.put("tporder",tp_list);
        if(list!=null){
            map.put("isEmpty",false);
        }else{
            map.put("isEmpty",true);
        }
        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }


    public String add(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
           // Timestamp date=new Timestamp((new Date()).getTime());
            Date date=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
            String id=sdf.format(new Date());
            appointment_three.setApid(id);
            appointment_three.setAflag(0);
           int aid=appointmentService.add(appointment_three);
            if(aid>=0){
                out.print("OK");
            }else{
                out.print("NO");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String webAppointment(){
//        List<Appointment_three> list=new ArrayList<Appointment_three>();
        ArrayList<Appointment_three>  list = appointmentService.findTappByPhone(phone);
        ActionContext.getContext().put("appointment",list);
        return "APP";
    }

    public String webAdd(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmSS");
        String id=sdf.format(new Date());
        appointment_three.setApid(id);
        appointment_three.setAflag(0);
        appointment_three.setAday(10);
        System.out.println(appointment_three.getAtphone());
        int aid=appointmentService.add(appointment_three);

        return "ADD";
    }



//    public String reject(){
//        try {
//            PrintWriter out=ServletActionContext.getResponse().getWriter();
//            System.out.print(apid);
//            Appointment_three rejectApointment=appointmentService.findByApid(apid);
//            rejectApointment.setAflag(2);
//            appointmentService.updateApp(rejectApointment);
//            out.print("OK");
//            out.flush();
//            out.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
