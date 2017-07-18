package sy.qust.three.dao;

import sy.qust.three.domain.Appointment_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
public interface AppointmentDao {

    int add(Appointment_three appointment_three);

    ArrayList<Appointment_three> findByPhone(String tphone);

    ArrayList<Appointment_three> findTappByPhone(String phone);

    ArrayList<Appointment_three> findPappByPhone(String phone);

    Appointment_three findByApid(String apid);

    void updataApp(Appointment_three appointment_three);

}
