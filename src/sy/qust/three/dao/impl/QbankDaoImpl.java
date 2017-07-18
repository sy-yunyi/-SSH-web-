package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.QbankDao;
import sy.qust.three.domain.Qbank_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class QbankDaoImpl extends HibernateDaoSupport implements QbankDao {

    @Override
    public ArrayList<Qbank_three> getAll() {
        String hql="from Qbank_three";
        ArrayList<Qbank_three> list=(ArrayList<Qbank_three>)this.getHibernateTemplate().find(hql);
        return list;
    }
}
