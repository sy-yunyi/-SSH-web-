package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.FollowDao;
import sy.qust.three.domain.Follow_three;
import sy.qust.three.service.FollowService;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
@Transactional
public class FollowServiceImpl implements FollowService{
    private FollowDao followDao;

    public void setFollowDao(FollowDao followDao) {
        this.followDao = followDao;
    }

    @Override
    public int add(Follow_three follow_three) {
        int fno=followDao.add(follow_three);
        return fno;
    }

    @Override
    public ArrayList<Follow_three> findByPhone(Follow_three follow_three) {
        ArrayList<Follow_three> list=followDao.findByPhone(follow_three);
        return list;
    }
}
