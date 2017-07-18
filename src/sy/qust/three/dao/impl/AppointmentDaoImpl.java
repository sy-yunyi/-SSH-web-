package sy.qust.three.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import sy.qust.three.dao.AppointmentDao;
import sy.qust.three.domain.Appointment_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/28 0028.
 */
public class AppointmentDaoImpl extends HibernateDaoSupport implements AppointmentDao {

    @Override
    public int add(Appointment_three appointment_three) {
        int aid=1;
        this.getHibernateTemplate().save(appointment_three);
        return aid;
    }

    @Override
    public ArrayList<Appointment_three> findByPhone(String tphone) {
        String hql="from Appointment_three where atphone=? and aflag=0";

        ArrayList<Appointment_three> list=(ArrayList<Appointment_three>)this.getHibernateTemplate().find(hql,tphone);
        if(list.size()>0){
            return list;
        }else{
            return null;
        }
    }

    @Override
    public ArrayList<Appointment_three> findTappByPhone(String phone) {
        String hql="from Appointment_three where atphone=?";
        ArrayList<Appointment_three> list=(ArrayList<Appointment_three>)this.getHibernateTemplate().find(hql,phone);
        return list;
    }

    @Override
    public ArrayList<Appointment_three> findPappByPhone(String phone) {
        String hql="from Appointment_three where apphone=?";
        ArrayList<Appointment_three> list=(ArrayList<Appointment_three>)this.getHibernateTemplate().find(hql,phone);
        return list;
    }

    @Override
    public Appointment_three findByApid(String apid) {
        String hql="from Appointment_three where apid=?";
        List<Appointment_three> list=(List<Appointment_three>)this.getHibernateTemplate().find(hql,apid);

        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

    @Override
    public void updataApp(Appointment_three appointment_three) {
        this.getHibernateTemplate().update(appointment_three);
    }
}
