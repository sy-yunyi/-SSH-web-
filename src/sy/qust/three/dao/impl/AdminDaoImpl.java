package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.AdminDao;
import sy.qust.three.domain.Administrator_three;

import java.util.List;
/**
 * Created by sy on 2017/5/23 0023.
 * Dao实现类
 * 完成数据库的操作
 */

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

    /**
     * dao中根据用户名和密码查询用户
     */
    public Administrator_three findByUsernameAndPassword(Administrator_three admin) {
        String hql="from Administrator_three where aname=? and apasswd=?";
        List<Administrator_three> list= (List<Administrator_three>)this.getHibernateTemplate().find(hql,admin.getAname(),admin.getApasswd());
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public int add(Administrator_three administrator_three) {
        int n=(int)this.getHibernateTemplate().save(administrator_three);
        System.out.print(n);
        return 0;
    }
}
