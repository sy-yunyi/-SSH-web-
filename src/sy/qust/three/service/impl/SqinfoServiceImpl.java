package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.SqinfoDao;
import sy.qust.three.domain.Sqinfo_three;
import sy.qust.three.service.SqinfoService;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
@Transactional
public class SqinfoServiceImpl implements SqinfoService{
    private SqinfoDao sqinfoDao;

    public void setSqinfoDao(SqinfoDao sqinfoDao) {
        this.sqinfoDao = sqinfoDao;
    }

    @Override
    public ArrayList<Sqinfo_three> getAll(String loginUser) {
        ArrayList<Sqinfo_three> sq_list=sqinfoDao.getAll(loginUser);
        return sq_list;
    }

    @Override
    public int add(Sqinfo_three sqinfo_three) {
        int sqid=sqinfoDao.add(sqinfo_three);
        return sqid;
    }
}
