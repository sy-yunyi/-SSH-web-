package sy.qust.three.service;

import sy.qust.three.domain.Tcinfo_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
public interface TcinfoService {
    ArrayList<Tcinfo_three> getAllInfo();

    Tcinfo_three findByPhoneAndGrade(Tcinfo_three tcinfo_three);

    void addTc(Tcinfo_three tcinfo_three);

    void deleteTc(Tcinfo_three tcinfo_three);
}
