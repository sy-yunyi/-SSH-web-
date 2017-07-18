package sy.qust.three.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Follow_three;
import sy.qust.three.domain.Fteacher_three;
import sy.qust.three.service.FollowService;
import sy.qust.three.service.FteacherService;
import sy.qust.three.util.JsonResultUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class FollowAction extends ActionSupport implements ModelDriven<Follow_three>{
   private FollowService followService;

    public void setFollowService(FollowService followService) {
        this.followService = followService;
    }
    private FteacherService fteacherService;

    public void setFteacherService(FteacherService fteacherService) {
        this.fteacherService = fteacherService;
    }

    private Follow_three follow_three=new Follow_three();
    @Override
    public Follow_three getModel() {
        return follow_three;
    }

    /**
     *
     * @return
     */
    public String add(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            Timestamp date=new Timestamp((new Date()).getTime());
            follow_three.setFtime(date);
            int fno=followService.add(follow_three);
            if(fno>=0){
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
     * 家长查找关注的老师信息
     * @return
     */
    public String findFollowFteacher(){
        Map<String,Object> map=new HashMap<String,Object>();
        ArrayList<Follow_three> list=followService.findByPhone(follow_three);
       // ArrayList<Fteacher_three> flist=new ArrayList<Fteacher_three>();
        map.put("fteacher",list);
//        if(list!=null){
//            for(int i=0;i<list.size();i++){
//                ArrayList<Fteacher_three> f_list=fteacherService.findFollowed(list.get(i));
//                if(f_list!=null){
//                    flist.add(f_list.get(0));
//                }
//            }
//            map.put("fteacher",flist);
//            map.put("isEmpty",false);
//        }
        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }

    /**
     *
     * @return
     */

    public String findFollowParent(){
        return null;
    }

}
