package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.FollowDao;
import sy.qust.three.domain.Follow_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class FollowDaoImpl extends HibernateDaoSupport implements FollowDao{

    @Override
    public int add(Follow_three follow_three) {
        int fno=(int)this.getHibernateTemplate().save(follow_three);
        return fno;
    }

    @Override
    public ArrayList<Follow_three> findByPhone(Follow_three follow_three) {
        String hql="from Follow_three where followId=?";
        ArrayList<Follow_three> list=(ArrayList<Follow_three>)this.getHibernateTemplate().find(hql,follow_three.getFollowId());
        return list;
    }
}
