package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Fteacher_three;
import sy.qust.three.domain.Subject_three;
import sy.qust.three.domain.Tcinfo_three;
import sy.qust.three.domain.Tsinfo_three;
import sy.qust.three.service.FteacherService;
import sy.qust.three.service.SubjectService;
import sy.qust.three.service.TcinfoService;
import sy.qust.three.service.TsinfoService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by sy on 2017/5/26 0026.
 */
public class TsinfoAction extends ActionSupport implements ModelDriven<Tsinfo_three> {

    private TsinfoService tsinfoService;
    public void setTsinfoService(TsinfoService tsinfoService) {
        this.tsinfoService = tsinfoService;
    }
    private SubjectService subjectService;

    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    private TcinfoService tcinfoService;

    public void setTcinfoService(TcinfoService tcinfoService) {
        this.tcinfoService = tcinfoService;
    }
    private FteacherService fteacherService;

    public void setFteacherService(FteacherService fteacherService) {
        this.fteacherService = fteacherService;
    }

    private Tsinfo_three tsinfo_three=new Tsinfo_three();
    @Override
    public Tsinfo_three getModel() {
        return tsinfo_three;
    }

    /**
     * 根据传过来的信息将教师擅长科目添加至数据库
     * @return
     */
    public String addTS(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            ArrayList<Subject_three> sub_list=subjectService.getAllInfo();
            if(sub_list!=null){
                for(int i=0;i<sub_list.size();i++){
                    if(tsinfo_three.getSid()==sub_list.get(i).getSid()){
                        tsinfo_three.setTprice(sub_list.get(i).getSprice());
                    }
                }
            }
            int tsno= tsinfoService.addTS(tsinfo_three);

            if(tsno>=0){
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

    /**
     * 删除教师擅长科目
     * @return
     */

    public String deleteTS(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            tsinfoService.deleteTS(tsinfo_three);
            out.print("OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String webAddTs(){

        Tsinfo_three ts=tsinfoService.findByPhoneAndSid(tsinfo_three);
        if(ts!=null){
            return "ADD";
        }
        ArrayList<Subject_three> sub_list=subjectService.getAllInfo();
        if(sub_list!=null){
            for(int i=0;i<sub_list.size();i++){
                if(tsinfo_three.getSid()==sub_list.get(i).getSid()){
                    tsinfo_three.setTprice(sub_list.get(i).getSprice());
                }
            }
        }
        int tsno= tsinfoService.addTS(tsinfo_three);

        ArrayList<String> tc_str=new ArrayList<String>();
        ArrayList<String> ts_str=new ArrayList<String>();

        ArrayList<Tsinfo_three> ts_list=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();

        Fteacher_three loginFteacher=fteacherService.findByPhone(tsinfo_three.getTphone());

        for (int i=0;i<ts_list.size();i++){
            if(ts_list.get(i).getTphone().equals(loginFteacher.getTphone())){
                ts_str.add(ts_list.get(i).getSname());
            }
        }
        ActionContext.getContext().getSession().put("ts_str",ts_str);
        return "ADD";
    }

    public String webDeleteTs(){
        Tsinfo_three ts=tsinfoService.findByPhoneAndSid(tsinfo_three);
        if(ts==null){
            return "DETE";
        }
        int tsno= tsinfoService.deleteTS(tsinfo_three);
        ArrayList<String> tc_str=new ArrayList<String>();
        ArrayList<String> ts_str=new ArrayList<String>();

        ArrayList<Tsinfo_three> ts_list=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();

        Fteacher_three loginFteacher=fteacherService.findByPhone(tsinfo_three.getTphone());

        for (int i=0;i<ts_list.size();i++){
            if(ts_list.get(i).getTphone().equals(loginFteacher.getTphone())){
                ts_str.add(ts_list.get(i).getSname());
            }
        }
        ActionContext.getContext().getSession().put("ts_str",ts_str);
        return "DETE";
    }
}
