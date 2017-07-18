package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Appointment_three;
import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Tporders_three;
import sy.qust.three.service.AppointmentService;
import sy.qust.three.service.TpordersService;
import sy.qust.three.util.DateToString;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sy on 2017/5/31 0031.
 */
public class TpordersAction extends ActionSupport implements ModelDriven<Tporders_three> {


    private String apid;
    private String phone;
    private int currPage;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    private Tporders_three tporders_three=new Tporders_three();
    @Override
    public Tporders_three getModel() {
        return tporders_three;
    }
    TpordersService tpordersService;
    private AppointmentService appointmentService;

    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    public void setTpordersService(TpordersService tpordersService) {
        this.tpordersService = tpordersService;
    }

    /**
     * 教师同意预约，生成一个订单
     * @return
     */
    public String add(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            Appointment_three appointment_three=appointmentService.findByApid(apid);
            appointment_three.setAflag(1);
            appointmentService.updateApp(appointment_three);
            Timestamp date=new Timestamp((new Date()).getTime());
            String da= DateToString.toString(new Date());
            tporders_three.setOid(da);
            tporders_three.setOtime(date);
            tporders_three.setIsValid(1);
            tporders_three.setCanceltime(date);
            tporders_three.setOprice(tporders_three.getStudyTime()*40.0);
            tpordersService.add(tporders_three);
            out.print("OK");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String reject(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            Appointment_three appointment_three=appointmentService.findByApid(apid);
            appointment_three.setAflag(2);
            appointmentService.updateApp(appointment_three);
            out.print("OK");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String webAdd(){
        Appointment_three appointment_three=appointmentService.findByApid(apid);
        appointment_three.setAflag(1);
        appointmentService.updateApp(appointment_three);


        tporders_three.setEndTime(appointment_three.getAstoptime());
        tporders_three.setOcage(appointment_three.getAcage());
        tporders_three.setOcgrade(appointment_three.getAcgrade());
        tporders_three.setOcname(appointment_three.getAcname());
        tporders_three.setOcsex(appointment_three.getAcsex());
        tporders_three.setOsubject(appointment_three.getAsubject());
        tporders_three.setPphone(appointment_three.getApphone());
        tporders_three.setStartTime(appointment_three.getAstarttime());
        tporders_three.setStudyTime(appointment_three.getAday());

        Timestamp date=new Timestamp((new Date()).getTime());
        String da= DateToString.toString(new Date());
        tporders_three.setOid(da);
        tporders_three.setOtime(date);
        tporders_three.setIsValid(1);
        tporders_three.setCanceltime(date);
        tporders_three.setOprice(tporders_three.getStudyTime()*40.0);
        tpordersService.add(tporders_three);
        ArrayList<Appointment_three> list = appointmentService.findTappByPhone(tporders_three.getTphone());
        ActionContext.getContext().put("appointment",list);
        return "ADD";
    }
    public String webReject(){
        Appointment_three appointment_three=appointmentService.findByApid(apid);
        System.out.print(apid);
        appointment_three.setAflag(2);
        appointmentService.updateApp(appointment_three);
        ArrayList<Appointment_three>  list = appointmentService.findTappByPhone(phone);
        ActionContext.getContext().put("appointment",list);
        return "APP";
    }

    public String webFind(){

        List<Tporders_three> tp_list= new ArrayList<Tporders_three>();
        tp_list=tpordersService.findTorderByPhone(phone);
        ActionContext.getContext().put("order",tp_list);
        return "FIND";
    }

    public String webFindPage(){
        PageBean<Tporders_three> tporder=tpordersService.findByPage(currPage,phone);
        ActionContext.getContext().getValueStack().push(tporder);
        return "PAGE";
    }

}
