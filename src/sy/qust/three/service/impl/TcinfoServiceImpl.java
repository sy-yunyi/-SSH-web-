package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.TcinfoDao;
import sy.qust.three.domain.Tcinfo_three;
import sy.qust.three.service.TcinfoService;

import java.util.ArrayList;


/**
 * Created by sy on 2017/5/28 0028.
 */
@Transactional
public class TcinfoServiceImpl  implements TcinfoService {
    TcinfoDao tcinfoDao;
    public void setTcinfoDao(TcinfoDao tcinfoDao) {
        this.tcinfoDao = tcinfoDao;
    }

    @Override
    public ArrayList<Tcinfo_three> getAllInfo() {
        ArrayList<Tcinfo_three> tc_list =tcinfoDao.getAllInfo();
        return tc_list;
    }

    @Override
    public Tcinfo_three findByPhoneAndGrade(Tcinfo_three tcinfo_three) {
        Tcinfo_three tc=tcinfoDao.findByPhoneAndGrade(tcinfo_three);
        return tc;
    }

    @Override
    public void addTc(Tcinfo_three tcinfo_three) {
        tcinfoDao.addTc(tcinfo_three);
    }

    @Override
    public void deleteTc(Tcinfo_three tcinfo_three) {
        tcinfoDao.deleteTc(tcinfo_three);
    }
}
