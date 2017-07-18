package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.ParentsDao;
import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Parents_three;
import sy.qust.three.service.ParentsService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/27 0027.
 */
@Transactional
public class ParentsServiceImpl implements ParentsService {
    private ParentsDao parentsDao;
    public void setParentsDao(ParentsDao parentsDao) {
        this.parentsDao = parentsDao;
    }

    /**
     * 验证用户是否存在
     * @param parents_three
     * @return
     */
    @Override
    public Parents_three exist(Parents_three parents_three) {
        Parents_three existParent=parentsDao.findByPhone(parents_three);
        return existParent;
    }

    /**
     * 用户注册
     * @param parents_three
     * @return
     */
    @Override
    public int register(Parents_three parents_three) {
        int pno=parentsDao.register(parents_three);
        return pno;
    }

    /**
     * 用户登录
     * @param parents_three
     * @return
     */
    @Override
    public Parents_three login(Parents_three parents_three) {
        Parents_three loginParent=parentsDao.findByPhoneAndPasswd(parents_three);
        return loginParent;
    }

    @Override
    public ArrayList<Parents_three> getAllInfo() {
        ArrayList<Parents_three> list=parentsDao.getAll();
        return list;
    }

    @Override
    public void update(Parents_three pt) {
        parentsDao.updateInfo(pt);
    }

    @Override
    public PageBean<Parents_three> findByPage(int currPage) {
        PageBean<Parents_three> pageBean=new PageBean<Parents_three>();
        pageBean.setCurrPage(currPage);
        //页面大小
        int pageSize=3;
        pageBean.setPageSize(pageSize);
        //总记录数
        int totalCount=parentsDao.findCount();
        pageBean.setTotalCount(totalCount);
        //总页数
        double tc=totalCount;
        Double num=Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //每页的数据
        int begin=(currPage-1)*pageSize;

        List<Parents_three> list=parentsDao.findByPage(begin,pageSize);
        pageBean.setList(list);

        return pageBean;
    }
}
