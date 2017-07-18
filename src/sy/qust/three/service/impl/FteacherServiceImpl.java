package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.FteacherDao;
import sy.qust.three.dao.TsinfoDao;
import sy.qust.three.domain.Follow_three;
import sy.qust.three.domain.Fteacher_three;
import sy.qust.three.domain.PageBean;
import sy.qust.three.service.FteacherService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/25 0025.
 */

@Transactional
public class FteacherServiceImpl implements FteacherService{

    private FteacherDao fteacherDao;
    public void setFteacherDao(FteacherDao fteacherDao) {
        this.fteacherDao = fteacherDao;
    }
    private TsinfoDao tsinfoDao;
    public void setTsinfoDao(TsinfoDao tsinfoDao) {
        this.tsinfoDao = tsinfoDao;
    }

    //用户注册
    @Override
    public int registerTeacher(Fteacher_three fteacher_three) {

//       for(int i=0;i<ts_list.size();i++){
//           tsinfoDao.add(ts_list.get(i));
//       }
       int tno= fteacherDao.register(fteacher_three);
        if(tno==0){
            return tno;
        }else{
            return -1;
        }
    }

    @Override
    public Fteacher_three login(Fteacher_three fteacher_three) {
        Fteacher_three loginFteacher=fteacherDao.findByPhoneAndPasswd(fteacher_three);

        return loginFteacher;
    }

    @Override
    public ArrayList<Fteacher_three> getAllInfo() {
        ArrayList<Fteacher_three> list=fteacherDao.getAll();
        return list;
    }

    @Override
    public ArrayList<Fteacher_three> findFollowed(Follow_three follow_three) {
        ArrayList<Fteacher_three> list=fteacherDao.findFollowed(follow_three);
        return list;
    }

    @Override
    public void update(Fteacher_three ft) {
        fteacherDao.updateInfo(ft);
    }

    @Override
    public Fteacher_three findByPhone(String tphone) {
        Fteacher_three fteacher_three=fteacherDao.findByOnlyPhone(tphone);
        return fteacher_three;
    }

    @Override
    public PageBean<Fteacher_three> findByPage(int currPage) {
        PageBean<Fteacher_three> pageBean=new PageBean<Fteacher_three>();
        pageBean.setCurrPage(currPage);
        //页面大小
        int pageSize=3;
        pageBean.setPageSize(pageSize);
        //总记录数
        int totalCount=fteacherDao.findCount();
        pageBean.setTotalCount(totalCount);
        //总页数
        double tc=totalCount;
        Double num=Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //每页的数据数
        int begin=(currPage-1)*pageSize;
        List<Fteacher_three> list=fteacherDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    //验证用户是否存在
    @Override
    public Fteacher_three existTeacher(Fteacher_three fteacher_three) {

        Fteacher_three existTeacher=fteacherDao.findByPhone(fteacher_three);

        return existTeacher;
    }
}
