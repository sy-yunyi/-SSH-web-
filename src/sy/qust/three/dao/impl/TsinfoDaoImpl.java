package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.TsinfoDao;
import sy.qust.three.domain.Tsinfo_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/26 0026.
 */
public class TsinfoDaoImpl extends HibernateDaoSupport implements TsinfoDao {
    @Override
    public ArrayList<Tsinfo_three> getAllInfo() {
        String hql="from Tsinfo_three";
        ArrayList<Tsinfo_three> list=(ArrayList<Tsinfo_three>)this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    /**
     * 实现添加擅长科目
     * @param tsinfo_three
     * @return
     */
    @Override
    public int add(Tsinfo_three tsinfo_three) {;
        int tsno=(int)this.getHibernateTemplate().save(tsinfo_three);
        return tsno;
    }

    @Override
    public int delete(Tsinfo_three tsinfo_three) {
        this.getHibernateTemplate().delete(tsinfo_three);
        return 1;
    }

    @Override
    public Tsinfo_three findByPhoneAndSid(Tsinfo_three tsinfo_three) {
        String hql="from Tsinfo_three where sid=? and tphone=?";
        List<Tsinfo_three> list=(List<Tsinfo_three>)this.getHibernateTemplate().find(hql,tsinfo_three.getSid(),tsinfo_three.getTphone());
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }
}
