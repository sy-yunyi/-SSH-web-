package sy.qust.three.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.ParentsDao;
import sy.qust.three.domain.Parents_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/27 0027.
 */
public class ParentsDaoImpl extends HibernateDaoSupport implements ParentsDao {
    @Override
    public Parents_three findByPhone(Parents_three parents_three) {
        String hql="from Parents_three where pphone=?";
        List<Parents_three> list=(List<Parents_three>)this.getHibernateTemplate().find(hql,parents_three.getPphone());
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    /**
     * 添加家长入数据库
     * @param parents_three
     * @return
     */
    @Override
    public int register(Parents_three parents_three) {
        int pno=(int)this.getHibernateTemplate().save(parents_three);
        return pno;
    }

    /**
     * 用户登录实现，通过用户手机号和密码查询数据库，查询到返回用户对象，否则返回NULL
     * @param parents_three
     * @return
     */
    @Override
    public Parents_three findByPhoneAndPasswd(Parents_three parents_three) {
        String hql="from Parents_three where pphone=? and ppasswd=?";
        List<Parents_three> list=(List<Parents_three>)this.getHibernateTemplate().find(hql,parents_three.getPphone(),parents_three.getPpasswd());
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Parents_three> getAll() {
        String hql="from Parents_three";
        ArrayList<Parents_three> list=(ArrayList<Parents_three>)this.getHibernateTemplate().find(hql);
        return list;
    }

    @Override
    public void updateInfo(Parents_three pt) {
        this.getHibernateTemplate().update(pt);
    }

    @Override
    public int findCount() {
        String hql="select count(*) from Parents_three";
        List<Long> list=(List<Long>)this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Parents_three> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria=DetachedCriteria.forClass(Parents_three.class);
        List<Parents_three> list=(List<Parents_three>)this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);

        return list;
    }
}
