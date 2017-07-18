package sy.qust.three.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sy.qust.three.domain.Administrator_three;
import sy.qust.three.service.AdminService;

/**
 * Created by sy on 2017/5/23 0023.
 * 管理员的Action类
 * 调用Service
 */
public class AdminAction extends ActionSupport implements ModelDriven<Administrator_three>{

    //模型驱动使用的对象
    private Administrator_three admin=new Administrator_three();
    //    @Override
    public Administrator_three getModel() {
        return admin;
    }

    //注入业务层的类 Service
    private AdminService adminService;
    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    private String name;
    private String pwd;
    /**
     * 登录执行的方法
     * @return
     */
    public String login(){
        //调用业务层的类
       // Administrator_three existAdmin=adminService.login(admin);

        System.out.println("name:"+name);
        System.out.println("iiiiii");
        return "INPUT";
//        if(existAdmin==null){
//            //登录失败,存入错误信息
//            this.addActionError("用户名或密码错误！");
//            return INPUT;
//        }else{
//            //登录成功
//            ActionContext.getContext().getSession().put("existAdmin",existAdmin);
//            return SUCCESS;
//        }
    }



    /**
     * 添加管理员
     * @return
     */
    public String add(){
        int n=adminService.add(admin);
        return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
