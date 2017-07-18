package sy.qust.three.action;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import sy.qust.three.domain.*;
import sy.qust.three.service.*;
import sy.qust.three.util.JsonResultUtil;

import javax.xml.ws.Action;
import java.io.*;

import java.sql.Array;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by sy on 2017/5/25 0025.
 */
public class FteacherAction extends ActionSupport implements ModelDriven<Fteacher_three> {

    private Fteacher_three fteacher_three = new Fteacher_three();


    @Override
    public Fteacher_three getModel() {
        return fteacher_three;
    }

    private FteacherService fteacherService;
    public void setFteacherService(FteacherService fteacherService) {
        this.fteacherService = fteacherService;
    }

    private TsinfoService tsinfoService;

    public void setTsinfoService(TsinfoService tsinfoService) {
        this.tsinfoService = tsinfoService;
    }

    private TcinfoService tcinfoService;

    public void setTcinfoService(TcinfoService tcinfoService) {
        this.tcinfoService = tcinfoService;
    }

    public SubjectService subjectService;

    public void setSubjectService(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    private AppointmentService appointmentService;


    private String grade;
    private String graden;
    private String sub;
    private  String subn;
    private String univ;
    private String univn;
    private String newpwd;
    private int currPage;


    public void setAppointmentService(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    //判断用户是否存在
    public String exist() {
        try {
            PrintWriter out = ServletActionContext.getResponse().getWriter();
            Fteacher_three existTeacher = fteacherService.existTeacher(fteacher_three);

            if (existTeacher == null) {
                out.print("OK");
            } else {
                out.print("NO");
            }
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    //用户注册
    public String register() {
        try {
            PrintWriter out=ServletActionContext.getResponse().getWriter();
            Timestamp date=new Timestamp((new Date()).getTime());
          // Timestamp d=new Timestamp(System.currentTimeMillis());
            fteacher_three.setIsGold(0);
            fteacher_three.setIsPass(0);
            fteacher_three.setTpoints(0);
            fteacher_three.setRegisterDate(date);
            int tno=fteacherService.registerTeacher(fteacher_three);
            if(tno==0){
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

    public String webRegis(){
        Timestamp date=new Timestamp((new Date()).getTime());
        // Timestamp d=new Timestamp(System.currentTimeMillis());
//        System.out.println(fteacher_three.getTname());
//        System.out.println(fteacher_three.getTphone().length());
        String nphone=fteacher_three.getTphone().substring(2,fteacher_three.getTphone().length());
//        System.out.println(nphone.length());
        fteacher_three.setTphone(nphone);
        String npasswd=fteacher_three.getTpasswd().substring(2,fteacher_three.getTpasswd().length());
        fteacher_three.setTpasswd(npasswd);
//        System.out.println(fteacher_three.getTpasswd());
//        System.out.println(fteacher_three.getTphone());
//        System.out.println(fteacher_three.getTshool());
        fteacher_three.setIsGold(0);
        fteacher_three.setIsPass(0);
        fteacher_three.setTpoints(0);
        fteacher_three.setRegisterDate(date);
        fteacher_three.setTimage("image/ic_launcher.png");

        int tno=fteacherService.registerTeacher(fteacher_three);
        if(tno==0){
           return SUCCESS;
        }else{
            return ERROR;
        }
    }

public String webLogin(){
    Fteacher_three existF=fteacherService.existTeacher(fteacher_three);
    if(existF==null){
        this.addActionError("用户不存在！");
        return "NOUSER";
    }else {
        Fteacher_three loginFteacher = fteacherService.login(fteacher_three);
        if(loginFteacher==null){
            this.addActionError("用户名或密码错误！");
           return ERROR;
        }else{
            ArrayList<String> tc_str=new ArrayList<String>();
            ArrayList<String> ts_str=new ArrayList<String>();
            ArrayList<Tsinfo_three> ts_list=tsinfoService.getAllInfo();
            ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();
            ArrayList<Subject_three> sub_list=subjectService.getAllInfo();

            for (int i=0;i<ts_list.size();i++){
                if(ts_list.get(i).getTphone().equals(loginFteacher.getTphone())){
                    ts_str.add(ts_list.get(i).getSname());
                }
            }

            for (int j=0;j<tc_list.size();j++){
                if(tc_list.get(j).getTphone().equals(loginFteacher.getTphone())){
                    tc_str.add(tc_list.get(j).getGrade());
                }
            }

            ActionContext.getContext().getSession().put("sub_list",sub_list);
            ActionContext.getContext().getSession().put("tc_str",tc_str);
            ActionContext.getContext().getSession().put("ts_str",ts_str);
            ActionContext.getContext().getSession().put("loginUser",loginFteacher);
            ActionContext.getContext().getSession().put("userName",loginFteacher.getTphone());
            ActionContext.getContext().getSession().put("passwd",loginFteacher.getTpasswd());
            return SUCCESS;
        }
    }
}
public String logout(){
    ActionContext.getContext().getSession().remove("loginUser");

    return SUCCESS;
}


    public String login(){
           // ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
            //PrintWriter out=ServletActionContext.getResponse().getWriter();
            Map<String,Object> map=new HashMap<String,Object>();
            Fteacher_three existF=fteacherService.existTeacher(fteacher_three);
            if(existF==null){
                map.put("ST","NE");
              //  out.print("NE");
              //  return null;
            }else{
                Fteacher_three loginFteacher=fteacherService.login(fteacher_three);
                if(loginFteacher==null){
                    map.put("ST","F");
                   // out.print("F");
                }else{
                    ArrayList<Appointment_three> list=appointmentService.findByPhone(loginFteacher.getTphone());
                    if(list!=null){
                        map.put("appointment",list);
                    }else{
                        map.put("appointment",null);
                    }
                  //  out.print(loginFteacher.getTname());
                    map.put("loginName",loginFteacher.getTname());
                    map.put("user",loginFteacher);
                }
            }
            JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }

    /**
     * 前台加载页面时，进行信息获取，返回JSON格式数据
     * @return
     */
    public String getAllInfo(){
        Map<String,Object> map=new HashMap<String,Object>();
        ArrayList<Fteacher_three> list=fteacherService.getAllInfo();
        ArrayList<Tsinfo_three> ts_list=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> tc_list=tcinfoService.getAllInfo();
        if(list!=null){
            map.put("isEmpty",false);
            map.put("fteacher",list);
            map.put("tsinfo",ts_list);
            map.put("tcinfo",tc_list);
        }else{
            map.put("isEmpty",true);
        }
        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return null;
    }

    public String changePasswd(){
        try {
            PrintWriter out=ServletActionContext.getResponse().getWriter();
            String fw=fteacher_three.getTpasswd();
            Fteacher_three ft=fteacherService.existTeacher(fteacher_three);
            ft.setTpasswd(fw);
            fteacherService.update(ft);
            out.print("OK");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String webFind(){
        ArrayList<Fteacher_three> nowFteacher=fteacherService.getAllInfo();
        ArrayList<Tsinfo_three> nowts=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> nowtc=tcinfoService.getAllInfo();

        ActionContext.getContext().put("tc",nowtc);
        ActionContext.getContext().put("ts",nowts);
        ArrayList<Fteacher_three> f_list=new ArrayList<Fteacher_three>();
//        Map<String,Object> map;
//        ArrayList<String>  tc_list;
//        ArrayList<String> ts_list;
//        ArrayList<Map<String,Object>> finfo=new ArrayList<Map<String,Object>>();
//        if(nowFteacher!=null){
//            for (int i=0;i<nowFteacher.size();i++){
//                map=new HashMap<String,Object>();
//                tc_list=new ArrayList<String>();
//                ts_list=new ArrayList<String>();
//                map.put("fteacher",nowFteacher.get(i));
//                for(int j=0;j<nowtc.size();j++){
//                    if(nowFteacher.get(i).getTphone()==nowtc.get(j).getTphone()){
//                        tc_list.add(nowtc.get(j).getGrade());
//                    }
//                }
//                for(int k=0;k<nowts.size();k++){
//                    if(nowFteacher.get(i).getTphone()==nowts.get(k).getTphone()){
//                        ts_list.add(nowts.get(k).getSname());
//                    }
//                }
//                map.put("tc",tc_list);
//                map.put("ts",ts_list);
//                finfo.add(map);
//            }
        if(sub!=null){
           for(int i=0;i<nowts.size();i++){
               if(subn.equals(nowts.get(i).getSname())){
                   for(int j=0;j<nowFteacher.size();j++){
                       if(nowFteacher.get(j).getTphone().equals(nowts.get(i).getTphone())){
                           f_list.add(nowFteacher.get(j));
                          System.out.println(nowFteacher.get(j).getTname());
                       }
                   }
               }
           }
        }else{
            f_list=nowFteacher;
        }

        ActionContext.getContext().put("fteacher",f_list);
//        ActionContext.getContext().put("tc",nowtc);
//        ActionContext.getContext().put("ts",nowts);
        //ActionContext.getContext().put("info",finfo);
        return "INFO";
    }

    public String findAll(){
        PageBean<Fteacher_three> pageBean=fteacherService.findByPage(currPage);

//        ArrayList<Fteacher_three> nowFteacher=fteacherService.getAllInfo();

        ArrayList<Tsinfo_three> nowts=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> nowtc=tcinfoService.getAllInfo();

        ActionContext.getContext().put("tc",nowtc);
        ActionContext.getContext().put("ts",nowts);

        ActionContext.getContext().getValueStack().push(pageBean);

        return "INFO";
    }

    public String webChangeInfo(){
        Fteacher_three beforeF=fteacherService.existTeacher(fteacher_three);
        beforeF.setTage(fteacher_three.getTage());
        beforeF.setTgread(fteacher_three.getTgread());
        beforeF.setTeducation(fteacher_three.getTeducation());
        beforeF.setThabit(fteacher_three.getThabit());
        beforeF.setTintroduce(fteacher_three.getTintroduce());
        beforeF.setTsex(fteacher_three.getTsex());
        beforeF.setTshool(fteacher_three.getTshool());
        fteacherService.update(beforeF);
        ActionContext.getContext().put("loginUser",beforeF);
        return "CHANGE";
    }

    public String webChangePwd(){

        Fteacher_three ft=fteacherService.login(fteacher_three);
        if(ft==null){
           this.addActionError("旧密码错误！");
           return "CHPW";
        }
        ft.setTpasswd(newpwd);
        fteacherService.update(ft);
        return "CHPW";

    }

    public String webChangeImg(){

        try {
            InputStream is = new FileInputStream(file);
//            String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
            String dir="F:/sy/ThreeUp/web/img";
            Fteacher_three ft=fteacherService.existTeacher(fteacher_three);

            String fileName=fteacher_three.getTphone()+".png";
            ft.setTimage("img"+"/"+fileName);
            fteacherService.update(ft);
            ActionContext.getContext().put("loginUser",ft);
            File uploadFile = new File(dir, fteacher_three.getTphone()+".png");
            OutputStream out = new FileOutputStream(uploadFile);
            byte[] buffer = new byte[1024 * 1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            is.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "UP";
    }


    public String asynUpdate(){
        String grade=ServletActionContext.getRequest().getParameter("grade");
        String sub=ServletActionContext.getRequest().getParameter("sub");
        String sex=ServletActionContext.getRequest().getParameter("sex");
        String school=ServletActionContext.getRequest().getParameter("school");

        //获取全部的教员信息，授课信息，授课年级信息
        ArrayList<Fteacher_three> nowFteacher=fteacherService.getAllInfo();
        ArrayList<Tsinfo_three> nowts=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> nowtc=tcinfoService.getAllInfo();
        ArrayList<Fteacher_three> ft_grade_list =new ArrayList<Fteacher_three>();
        ArrayList<Fteacher_three> ft_sex_list  =new ArrayList<Fteacher_three>();;
        ArrayList<Fteacher_three> ft_sub_list  =new ArrayList<Fteacher_three>();;
        ArrayList<Fteacher_three> ft_school_list  =new ArrayList<Fteacher_three>();;

        if(grade.equals("A")){
            //不需要处理年级问题
            ft_grade_list=nowFteacher;
        }else{
            //筛选出符合年级的放在
            //ft_grade_list
            //通过在查询出的TC中筛选出符合的，然后在FT中进行筛选
            for(int i=0;i<nowtc.size();i++){
                if(grade.equals(nowtc.get(i).getGrade())){
                    for(int j=0;j<nowFteacher.size();j++){
                        if(nowtc.get(i).getTphone().equals(nowFteacher.get(j).getTphone())){
                            ft_grade_list.add(nowFteacher.get(j));
                        }
                    }
                }
            }
        }
        if(sex.equals("A")){
            //不需要处理性别问题
            ft_sex_list=ft_grade_list;
        }else{
            if(sex.equals("男")){
                sex="M";
            }else{
                sex="W";
            }
            System.out.println(sex);

            //在FT中筛选出符合性别的
            //ft_sex_list
            for(int k=0;k<ft_grade_list.size();k++){
                if(sex.equals(ft_grade_list.get(k).getTsex())){
                    ft_sex_list.add(ft_grade_list.get(k));
                }
            }
        }
        if(sub.equals("A")){
            //不需要处理科目
            ft_sub_list=ft_sex_list;
        }else{
            //筛选科目
            //ft_sub_list
            for(int l=0;l<nowts.size();l++){
                if(sub.equals(nowts.get(l).getSname())){
                    for(int p=0;p<ft_sex_list.size();p++){
                       if(nowts.get(l).getTphone().equals(ft_sex_list.get(p).getTphone())) {
                           ft_sub_list.add(ft_sex_list.get(p));
                       }
                    }
                }
            }
        }

        if(school.equals("A")){
            ft_school_list=ft_sub_list;
            //不需要处理
        }else{
            //筛选学校
            for(int i=0;i<ft_sub_list.size();i++){
                if(school.equals(ft_sub_list.get(i).getTshool())){
                    ft_school_list.add(ft_sub_list.get(i));
                }
            }
        }
//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("fteacher",ft_school_list);
//        map.put("tc",nowtc);
//        map.put("ts",nowts);

        PageBean<Fteacher_three> pageBean=new PageBean<Fteacher_three>();

        pageBean.setList(ft_school_list);
        pageBean.setTotalPage(1);
        pageBean.setPageSize(ft_school_list.size());
        pageBean.setTotalCount(ft_school_list.size());
        pageBean.setCurrPage(1);

        ActionContext.getContext().put("tc",nowtc);
        ActionContext.getContext().put("ts",nowts);

        ActionContext.getContext().getValueStack().push(pageBean);
//        ActionContext.getContext().getSession().put("sub",sub);
//        ActionContext.getContext().getSession().put("school",school);
//        ActionContext.getContext().getSession().put("grade",grade);
//        ActionContext.getContext().getSession().put("sex",sex);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("sub",sub);
        map.put("school",school);
        map.put("grade",grade);
        map.put("sex",sex);
        ActionContext.getContext().setSession(map);

//        JsonResultUtil.toJosn(ServletActionContext.getResponse(),map);
        return "INFO";
    }



    public String findPersoon(){
        Fteacher_three ft=fteacherService.existTeacher(fteacher_three);
        ArrayList<Tsinfo_three> nowts=tsinfoService.getAllInfo();
        ArrayList<Tcinfo_three> nowtc=tcinfoService.getAllInfo();
        ActionContext.getContext().put("tc",nowtc);
        ActionContext.getContext().put("ts",nowts);
        ActionContext.getContext().put("perf",ft);
        return "PER";
    }
    public String appPersoon(){
        Fteacher_three ft=fteacherService.existTeacher(fteacher_three);
        ActionContext.getContext().getSession().put("perf",ft);
        return "APP";
    }

    //上传文件存放路径
    private final static String UPLOADDIR = "/img";
    private File file;
    private String fileFileName;
    private String fileContentType;

    public TsinfoService getTsinfoService() {
        return tsinfoService;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    private String tpasswd;

    public String getTpasswd() {
        return tpasswd;
    }

    public void setTpasswd(String tpasswd) {
        this.tpasswd = tpasswd;
    }

    public Fteacher_three getFteacher_three() {
        return fteacher_three;
    }

    public void setFteacher_three(Fteacher_three fteacher_three) {
        this.fteacher_three = fteacher_three;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getUniv() {
        return univ;
    }

    public void setUniv(String univ) {
        this.univ = univ;
    }

    public FteacherService getFteacherService() {
        return fteacherService;
    }

    public String getGraden() {
        return graden;
    }

    public void setGraden(String graden) {
        this.graden = graden;
    }

    public String getSubn() {
        return subn;
    }

    public void setSubn(String subn) {
        this.subn = subn;
    }

    public String getUnivn() {
        return univn;
    }

    public void setUnivn(String univn) {
        this.univn = univn;
    }

    public String getNewpwd() {
        return newpwd;
    }

    public void setNewpwd(String newpwd) {
        this.newpwd = newpwd;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }
}
