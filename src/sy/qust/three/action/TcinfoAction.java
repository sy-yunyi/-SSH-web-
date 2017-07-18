package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sy.qust.three.domain.Tcinfo_three;
import sy.qust.three.service.TcinfoService;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
public class TcinfoAction extends ActionSupport implements ModelDriven<Tcinfo_three> {
    private Tcinfo_three tcinfo_three=new Tcinfo_three();
    @Override
    public Tcinfo_three getModel() {
        return tcinfo_three;
    }
    private TcinfoService tcinfoService;

    public void setTcinfoService(TcinfoService tcinfoService) {
        this.tcinfoService = tcinfoService;
    }


    public String webAddTc(){
        Tcinfo_three tc=tcinfoService.findByPhoneAndGrade(tcinfo_three);
        if(tc!=null){
            return "ADD";
        }
        tcinfoService.addTc(tcinfo_three);
        ArrayList<String> tc_str=new ArrayList<String>();
        ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();
        for (int i=0;i<tc_list.size();i++){
            if(tc_list.get(i).getTphone().equals(tcinfo_three.getTphone())){
                tc_str.add(tc_list.get(i).getGrade());
            }
        }
        ActionContext.getContext().getSession().put("tc_str",tc_str);
        return "ADD";
    }

    public  String webDeleteTc(){
        Tcinfo_three tc=tcinfoService.findByPhoneAndGrade(tcinfo_three);
        if(tc==null){
            return "DETE";
        }
        tcinfoService.deleteTc(tc);
        ArrayList<String> tc_str=new ArrayList<String>();
        ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();
        for (int i=0;i<tc_list.size();i++){
            if(tc_list.get(i).getTphone().equals(tcinfo_three.getTphone())){
                tc_str.add(tc_list.get(i).getGrade());
            }
        }
        ActionContext.getContext().getSession().put("tc_str",tc_str);
        return "DETE";
    }

}
