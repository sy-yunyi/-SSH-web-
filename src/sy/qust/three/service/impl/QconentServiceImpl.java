package sy.qust.three.service.impl;


import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.QconentDao;
import sy.qust.three.domain.Qconent_three;
import sy.qust.three.service.QconentService;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
@Transactional
public class QconentServiceImpl implements QconentService{
    private QconentDao qconentDao;

    public void setQconentDao(QconentDao qconentDao) {
        this.qconentDao = qconentDao;
    }

    @Override
    public ArrayList<Qconent_three> getAll() {
        ArrayList<Qconent_three>  qc_list=qconentDao.getAll();
        return qc_list;
    }
}
