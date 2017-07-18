package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.TcinfoDao;
import sy.qust.three.domain.Tcinfo_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class TcinfoDaoImpl extends HibernateDaoSupport implements TcinfoDao{

    @Override
    public ArrayList<Tcinfo_three> getAllInfo() {
        String hql="from Tcinfo_three";
        ArrayList<Tcinfo_three> tc_list=(ArrayList<Tcinfo_three>)this.getHibernateTemplate().find(hql);
        if(tc_list.size()>0){
            return tc_list;
        }else{
            return null;
        }
    }

    @Override
    public Tcinfo_three findByPhoneAndGrade(Tcinfo_three tcinfo_three) {
        String hql="from Tcinfo_three where tphone=? and grade=?";
        List<Tcinfo_three> list=(List<Tcinfo_three>)this.getHibernateTemplate().find(hql,tcinfo_three.getTphone(),tcinfo_three.getGrade());
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public void addTc(Tcinfo_three tcinfo_three) {
        this.getHibernateTemplate().save(tcinfo_three);
    }
    public void deleteTc(Tcinfo_three tcinfo_three){
        this.getHibernateTemplate().delete(tcinfo_three);
    }
}
