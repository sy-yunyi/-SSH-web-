package sy.qust.three.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.FteacherDao;
import sy.qust.three.domain.Follow_three;
import sy.qust.three.domain.Fteacher_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/25 0025.
 */
@Transactional
public class FteacherDaoImpl extends HibernateDaoSupport implements FteacherDao{

    /**
     * 用户注册，将用户信息存进数据库
     * @param fteacher_three
     * @return
     */
    @Override
    public int register(Fteacher_three fteacher_three) {
        int tno=(int)this.getHibernateTemplate().save(fteacher_three);
        return tno;
    }

    @Override
    public Fteacher_three findByPhoneAndPasswd(Fteacher_three fteacher_three) {
        String hql="from Fteacher_three where tphone=? and tpasswd=?";
        List<Fteacher_three> list=(List<Fteacher_three>) this.getHibernateTemplate().find(hql,fteacher_three.getTphone(),fteacher_three.getTpasswd());
       if(list.size()>0){
           return list.get(0);
       }else{
           return null;
       }
    }

    @Override
    public ArrayList<Fteacher_three> getAll() {
        String hql="from Fteacher_three";
        ArrayList<Fteacher_three> list=(ArrayList<Fteacher_three>)this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Fteacher_three> findFollowed(Follow_three follow_three) {
        String hql="from Fteacher_three where tphone=?";
        ArrayList<Fteacher_three> list=(ArrayList<Fteacher_three>)this.getHibernateTemplate().find(hql,follow_three.getFollowedId());
        return list;
    }

    @Override
    public void updateInfo(Fteacher_three ft) {
        this.getHibernateTemplate().update(ft);
    }

    @Override
    public Fteacher_three findByOnlyPhone(String tphone) {
        String hql="from Fteacher_three where tphone=?";
        List<Fteacher_three> list=(List<Fteacher_three>)this.getHibernateTemplate().find(hql,tphone);
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int findCount() {
        String hql="select count(*) from Fteacher_three";
        List<Long> list=(List<Long>)this.getHibernateTemplate().find(hql);
        if(list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Fteacher_three> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria=DetachedCriteria.forClass(Fteacher_three.class);
        List<Fteacher_three> list=(List<Fteacher_three>)this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

    /**
     * 在注册是通过手机号判断用户是否注册
     * @param fteacher_three
     * @return
     */
     @Override
    public Fteacher_three findByPhone(Fteacher_three fteacher_three) {
        String hql="from Fteacher_three where tphone=?";
        List<Fteacher_three> list=(List<Fteacher_three>)this.getHibernateTemplate().find(hql,fteacher_three.getTphone());
       if(list.size()>0){
           return list.get(0);
       }else{
           return null;
       }
    }
}
