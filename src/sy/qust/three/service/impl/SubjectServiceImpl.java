package sy.qust.three.service.impl;


import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.SubjectDao;
import sy.qust.three.domain.Subject_three;
import sy.qust.three.service.SubjectService;

import java.util.ArrayList;


/**
 * Created by sy on 2017/5/28 0028.
 */
@Transactional
public class SubjectServiceImpl implements SubjectService{
    private SubjectDao subjectDao;

    public void setSubjectDao(SubjectDao subjectDao) {
        this.subjectDao = subjectDao;
    }

    @Override
    public ArrayList<Subject_three> getAllInfo() {
        ArrayList<Subject_three> sub_list=subjectDao.getAllInfo();
        return sub_list;
    }
}
