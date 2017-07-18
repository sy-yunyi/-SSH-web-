package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.AppointmentDao;
import sy.qust.three.domain.Appointment_three;
import sy.qust.three.domain.Tporders_three;
import sy.qust.three.service.AppointmentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/28 0028.
 */
@Transactional
public class AppointmentServiceImpl implements AppointmentService{
    AppointmentDao appointmentDao;

    public void setAppointmentDao(AppointmentDao appointmentDao) {
        this.appointmentDao = appointmentDao;
    }

    @Override
    public int add(Appointment_three appointment_three) {
        int aid=1;
        appointmentDao.add(appointment_three);
        return aid;
    }

    @Override
    public ArrayList<Appointment_three> findByPhone(String tphone) {
        ArrayList<Appointment_three> list=appointmentDao.findByPhone(tphone);
        return list;
    }

    @Override
    public ArrayList<Appointment_three> findTappByPhone(String phone) {
        ArrayList<Appointment_three> list=appointmentDao.findTappByPhone(phone);
        return list;
    }

    @Override
    public ArrayList<Appointment_three> findPappByPhone(String phone) {
        ArrayList<Appointment_three> list=appointmentDao.findPappByPhone(phone);
        return list;
    }

    @Override
    public Appointment_three findByApid(String apid) {
        Appointment_three appointment_three=appointmentDao.findByApid(apid);
        return appointment_three;
    }

    @Override
    public void updateApp(Appointment_three appointment_three) {
        appointmentDao.updataApp(appointment_three);
    }


}
