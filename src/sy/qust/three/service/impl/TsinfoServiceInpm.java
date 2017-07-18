package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.TsinfoDao;

import sy.qust.three.domain.Tsinfo_three;
import sy.qust.three.service.TsinfoService;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/26 0026.
 */
@Transactional
public class TsinfoServiceInpm implements TsinfoService {

    TsinfoDao tsinfoDao ;

    public void setTsinfoDao(TsinfoDao tsinfoDao) {
        this.tsinfoDao = tsinfoDao;
    }

    /**
     *
     * @param tsinfo_three
     * @return
     */
    @Override
    public int addTS(Tsinfo_three tsinfo_three) {
       int tsno= tsinfoDao.add(tsinfo_three);
        return tsno;
    }

    /**
     *
     * @param tsinfo_three
     * @return
     */
    @Override
    public int deleteTS(Tsinfo_three tsinfo_three) {
        Tsinfo_three tsinfo_three1 =tsinfoDao.findByPhoneAndSid(tsinfo_three);
        int tsno=tsinfoDao.delete(tsinfo_three1);
        return tsno;
    }

    @Override
    public ArrayList<Tsinfo_three> getAllInfo() {
        ArrayList<Tsinfo_three> list=tsinfoDao.getAllInfo();
        return list;
    }

    @Override
    public Tsinfo_three findByPhoneAndSid(Tsinfo_three tsinfo_three) {
        Tsinfo_three ts=tsinfoDao.findByPhoneAndSid(tsinfo_three);
        return ts;
    }
}
