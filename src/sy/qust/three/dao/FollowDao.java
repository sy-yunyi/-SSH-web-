package sy.qust.three.dao;

import sy.qust.three.domain.Follow_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/28 0028.
 */
public interface FollowDao {
    int add(Follow_three follow_three);

    ArrayList<Follow_three> findByPhone(Follow_three follow_three);
}
