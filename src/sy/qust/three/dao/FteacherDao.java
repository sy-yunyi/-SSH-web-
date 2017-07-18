package sy.qust.three.dao;

import sy.qust.three.domain.Follow_three;
import sy.qust.three.domain.Fteacher_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/25 0025.
 */
public interface FteacherDao {
    //验证用户是否存在
    Fteacher_three findByPhone(Fteacher_three fteacher_three);
    //用户注册
    int register(Fteacher_three fteacher_three);

    Fteacher_three findByPhoneAndPasswd(Fteacher_three fteacher_three);

    ArrayList<Fteacher_three> getAll();

    ArrayList<Fteacher_three> findFollowed(Follow_three follow_three);

    void updateInfo(Fteacher_three ft);

    Fteacher_three findByOnlyPhone(String tphone);

    int findCount();

    List<Fteacher_three> findByPage(int begin, int pageSize);
}
