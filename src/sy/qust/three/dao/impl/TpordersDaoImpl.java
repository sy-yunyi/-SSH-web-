package sy.qust.three.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.TpordersDao;
import sy.qust.three.domain.Tporders_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/31 0031.
 */
public class TpordersDaoImpl extends HibernateDaoSupport implements TpordersDao{

    @Override
    public void add(Tporders_three tporders_three) {
        this.getHibernateTemplate().save(tporders_three);
    }

    @Override
    public ArrayList<Tporders_three> findTorderByPhone(String phone) {
        String hql="from Tporders_three where tphone=?";
        ArrayList<Tporders_three> tp_list=(ArrayList<Tporders_three>)this.getHibernateTemplate().find(hql,phone);
        return tp_list;
    }

    @Override
    public ArrayList<Tporders_three> findPorderByPhone(String phone) {
        String hql="from Tporders_three where pphone=?";
        ArrayList<Tporders_three> tp_list=(ArrayList<Tporders_three>)this.getHibernateTemplate().find(hql,phone);
        return tp_list;
    }

    @Override
    public int findCount(String phone) {
        String hql="select count(*) from Tporders_three where tphone=?";
        List<Long> list=(List<Long>)this.getHibernateTemplate().find(hql,phone);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Tporders_three> findByPage(int begin, int pageSize,String phone) {
        DetachedCriteria criteria=DetachedCriteria.forClass(Tporders_three.class);
        criteria.add(Restrictions.eq("tphone",phone));
        List<Tporders_three> list=(List<Tporders_three>)this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }
}
