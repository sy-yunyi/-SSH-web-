package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.SubjectDao;
import sy.qust.three.domain.Subject_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class SubjectDaoImpl extends HibernateDaoSupport implements SubjectDao{

    @Override
    public ArrayList<Subject_three> getAllInfo() {
        String hql="from Subject_three";
        ArrayList<Subject_three> sub_list=(ArrayList<Subject_three>)this.getHibernateTemplate().find(hql);
        if(sub_list.size()>0){
            return sub_list;
        }else{
            return null;
        }
    }
}
