package sy.qust.three.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Qbank_three;
import sy.qust.three.domain.Qconent_three;
import sy.qust.three.domain.Sqinfo_three;
import sy.qust.three.service.QbankService;
import sy.qust.three.service.QconentService;
import sy.qust.three.service.SqinfoService;
import sy.qust.three.util.JsonResultUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class QbankAction extends ActionSupport implements ModelDriven<Qbank_three>{
    private Qbank_three qbank_three=new Qbank_three();
    @Override
    public Qbank_three getModel() {
        return qbank_three;
    }
    private QbankService qbankService;
    public void setQbankService(QbankService qbankService) {
        this.qbankService = qbankService;
    }
    private QconentService qconentService;

    public void setQconentService(QconentService qconentService) {
        this.qconentService = qconentService;
    }
    private SqinfoService sqinfoService;

    public void setSqinfoService(SqinfoService sqinfoService) {
        this.sqinfoService = sqinfoService;
    }

    private  String loginUser;

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    /**
     *
     * @return
     */
    public String getAllQ(){
        Map<String,Object> map=new HashMap<String,Object>();
        ArrayList<Qbank_three> list=qbankService.getAll();
        ArrayList<Qconent_three> qc_list=qconentService.getAll();
        ArrayList<Sqinfo_three> sq_list=sqinfoService.getAll(loginUser);
        if(list!=null){
            map.put("isEmpty",false);
            map.put("qbank",list);
            map.put("qconent",qc_list);
            map.put("sqinfo",sq_list);
        }else{
            map.put("isEmpty",true);
        }
        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }
}
