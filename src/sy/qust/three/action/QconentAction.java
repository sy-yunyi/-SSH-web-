package sy.qust.three.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sy.qust.three.domain.Qconent_three;
import sy.qust.three.service.QconentService;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class QconentAction extends ActionSupport implements ModelDriven<Qconent_three>{
    private Qconent_three qconent_three=new Qconent_three();
    @Override
    public Qconent_three getModel() {
        return qconent_three;
    }
    private QconentService qconentService;

    public void setQconentService(QconentService qconentService) {
        this.qconentService = qconentService;
    }
}
