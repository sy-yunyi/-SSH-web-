package sy.qust.three.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Sqinfo_three;
import sy.qust.three.service.SqinfoService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class SqinfoAction extends ActionSupport implements ModelDriven<Sqinfo_three>{
    private Sqinfo_three sqinfo_three=new Sqinfo_three();
    @Override
    public Sqinfo_three getModel() {
        return sqinfo_three;
    }
    private SqinfoService sqinfoService;

    public void setSqinfoService(SqinfoService sqinfoService) {
        this.sqinfoService = sqinfoService;
    }


    /**
     *
     * @return
     */
    public String add(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            Timestamp date=new Timestamp((new Date()).getTime());
            sqinfo_three.setSqtime(date);
            int sqid=sqinfoService.add(sqinfo_three);
            if(sqid==0){
                out.print("OK");
            }else{
                out.print("F");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
