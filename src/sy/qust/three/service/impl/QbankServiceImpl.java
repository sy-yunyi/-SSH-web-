package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.QbankDao;
import sy.qust.three.domain.Qbank_three;
import sy.qust.three.service.QbankService;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
@Transactional
public class QbankServiceImpl implements QbankService{
    private QbankDao qbankDao;
    public void setQbankDao(QbankDao qbankDao) {
        this.qbankDao = qbankDao;
    }

    @Override
    public ArrayList<Qbank_three> getAll() {
        ArrayList<Qbank_three> list=qbankDao.getAll();
        return list;
    }
}
