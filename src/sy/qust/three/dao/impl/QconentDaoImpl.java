package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.QconentDao;
import sy.qust.three.domain.Qconent_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class QconentDaoImpl extends HibernateDaoSupport implements QconentDao{
    @Override
    public ArrayList<Qconent_three> getAll() {
        String hql="from Qconent_three";
        ArrayList<Qconent_three> qc_list=(ArrayList<Qconent_three>)this.getHibernateTemplate().find(hql);
        return qc_list;
    }
}
