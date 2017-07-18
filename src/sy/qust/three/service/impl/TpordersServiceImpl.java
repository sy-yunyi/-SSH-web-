package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.TpordersDao;
import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Tporders_three;
import sy.qust.three.service.TpordersService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/31 0031.
 */
@Transactional
public class TpordersServiceImpl implements TpordersService{
    private TpordersDao tpordersDao;

    public void setTpordersDao(TpordersDao tpordersDao) {
        this.tpordersDao = tpordersDao;
    }

    @Override
    public void add(Tporders_three tporders_three) {
        tpordersDao.add(tporders_three);
    }

    @Override
    public List<Tporders_three> findTorderByPhone(String phone) {
        ArrayList<Tporders_three> tp_list=tpordersDao.findTorderByPhone(phone);
        return tp_list;
    }

    @Override
    public List<Tporders_three> findPorderByPhone(String phone) {
        ArrayList<Tporders_three> tp_list=tpordersDao.findPorderByPhone(phone);
        return tp_list;
    }

    @Override
    public PageBean<Tporders_three> findByPage(int currPage ,String phone) {
        PageBean<Tporders_three> pageBean=new PageBean<Tporders_three>();
        //当前页数
        pageBean.setCurrPage(currPage);
        //页面大小
        int pageSize=3;
        pageBean.setPageSize(pageSize);
        //总记录数
        int totalCount=tpordersDao.findCount(phone);
        pageBean.setTotalCount(totalCount);
        //总页数
        double tc=totalCount;
        Double num=Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //每页的数据数
        int begin=(currPage-1)*pageSize;
       List<Tporders_three> list= tpordersDao.findByPage(begin,pageSize,phone);
        pageBean.setList(list);
        return pageBean;
    }
}
