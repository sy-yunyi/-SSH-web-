package sy.qust.three.service;

import sy.qust.three.domain.Appointment_three;
import sy.qust.three.domain.Tporders_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/28 0028.
 */
public interface AppointmentService {
    int add(Appointment_three appointment_three);

    ArrayList<Appointment_three> findByPhone(String tphone);

    ArrayList<Appointment_three> findTappByPhone(String phone);

    ArrayList<Appointment_three> findPappByPhone(String phone);

    Appointment_three findByApid(String apid);

    void updateApp(Appointment_three appointment_three);

}
