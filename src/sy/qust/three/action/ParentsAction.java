package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.Fteacher_three;
import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Parents_three;
import sy.qust.three.service.ParentsService;
import sy.qust.three.util.JsonResultUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sy on 2017/5/27 0027.
 */
public class ParentsAction extends ActionSupport implements ModelDriven<Parents_three> {
    private Parents_three parents_three=new Parents_three();

    @Override
    public Parents_three getModel() {
        return parents_three;
    }

    private ParentsService parentsService;
    public void setParentsService(ParentsService parentsService) {
        this.parentsService = parentsService;
    }

    /**
     * 判断是否存在
     * @return
     */
    public String exist(){
        try {
            PrintWriter out= ServletActionContext.getResponse().getWriter();
            Parents_three existParent=parentsService.exist(parents_three);
            if(existParent==null){
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
     * 注册
     * @return
     */
    public String register(){
        try {
            PrintWriter out=ServletActionContext.getResponse().getWriter();
            int pno=parentsService.register(parents_three);
            out.print("OK");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 家长登录，首先判定用户是否存在，不存在返回NE，存在继续判断用户密码是否正确，不正确返回F，正确返回OK
     * @return
     */
    public String login(){

            Map<String,Object> map=new HashMap<String,Object>();
            System.out.print(parents_three.getPphone());
            Parents_three existP=parentsService.exist(parents_three);
            if(existP==null){
                map.put("ST","NE");
              //  out.print("NE");
               // return null;
            }else{
                Parents_three loginParent=parentsService.login(parents_three);
                if(loginParent==null){
                    map.put("ST","F");
                  //  out.print("F");
                }else{
                //    out.print(loginParent.getPname());
                    map.put("loginName",loginParent.getPname());
                    map.put("user",loginParent);
                }
            }
            JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }

    /**
     * 获取家长信息
     * @return
     */
    public String getAllinfo(){

        Map<String,Object> map=new HashMap<String,Object>();
        ArrayList<Parents_three> list=parentsService.getAllInfo();
        if(list!=null){
            map.put("isEmpty",false);
            map.put("parent",list);
        }else{
            map.put("isEmpty",true);
        }
        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }

    public String changePwd(){
        try {
            PrintWriter out=ServletActionContext.getResponse().getWriter();
            String pw=parents_three.getPpasswd();
            Parents_three pt=parentsService.exist(parents_three);
            System.out.println(pt.getPpasswd());
            pt.setPpasswd(pw);

            parentsService.update(pt);
            out.print("OK");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String findAll(){
        PageBean<Parents_three> pageBean=parentsService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "FIND";
    }


    public String asynUpdata(){

        String grade=ServletActionContext.getRequest().getParameter("gradec");
        String sex1=ServletActionContext.getRequest().getParameter("sexc");
        String sex=sex1.trim();
        ArrayList<Parents_three> list=parentsService.getAllInfo();
        ArrayList<Parents_three> p_grade_list =new ArrayList<Parents_three>();
        ArrayList<Parents_three> p_sex_list  =new ArrayList<Parents_three>();;
        if(grade.equals("A")){
            p_grade_list=list;
        }else{
            for(int i=0;i<list.size();i++){
                if(grade.equals(list.get(i).getCgrade())){
                    p_grade_list.add(list.get(i));
                }

            }
        }
        System.out.println(p_grade_list.size());
        if(sex.equals("A")){
            p_sex_list=p_grade_list;
        }else{
            for(int k=0;k<p_grade_list.size();k++){
                if(sex.equals(p_grade_list.get(k).getCsex())){
                    p_sex_list.add(p_grade_list.get(k));
                }
            }
        }
        System.out.println(p_sex_list.size());

        PageBean<Parents_three> pageBean=new PageBean<Parents_three>();
        pageBean.setCurrPage(1);
        pageBean.setTotalCount(p_sex_list.size());
        pageBean.setPageSize(p_sex_list.size());
        pageBean.setTotalPage(1);
        pageBean.setList(p_sex_list);

        ActionContext.getContext().getValueStack().push(pageBean);
        Map<String,Object> map=new HashMap<String,Object>();

        map.put("gradec",grade);
        map.put("sexc",sex);
        ActionContext.getContext().setSession(map);
        return "FIND";
    }

    private String ppasswd;
    private int currPage;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public String getPpasswd() {
        return ppasswd;
    }

    public void setPpasswd(String ppasswd) {
        this.ppasswd = ppasswd;
    }
}
