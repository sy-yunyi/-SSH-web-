package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.SqinfoDao;
import sy.qust.three.domain.Sqinfo_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
public class SqinfoDaoImpl extends HibernateDaoSupport implements SqinfoDao{
    @Override
    public ArrayList<Sqinfo_three> getAll(String loginUser) {
        String hql="from Sqinfo_three where spphone=?";
        ArrayList<Sqinfo_three> sq_list=(ArrayList<Sqinfo_three>)this.getHibernateTemplate().find(hql,loginUser);
        return sq_list;
    }

    @Override
    public int add(Sqinfo_three sqinfo_three) {

        int sqid=(int)this.getHibernateTemplate().save(sqinfo_three);
        return sqid;
    }
}
