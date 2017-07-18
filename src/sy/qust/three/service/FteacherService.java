package sy.qust.three.service;

import sy.qust.three.domain.Follow_three;
import sy.qust.three.domain.Fteacher_three;
import sy.qust.three.domain.PageBean;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/25 0025.
 */
public interface FteacherService {
    //验证用户是否存在
    Fteacher_three existTeacher(Fteacher_three fteacher_three);
    //用户注册
    int registerTeacher(Fteacher_three fteacher_three);

    Fteacher_three login(Fteacher_three fteacher_three);

    ArrayList<Fteacher_three> getAllInfo();

    ArrayList<Fteacher_three> findFollowed(Follow_three follow_three);

    void update(Fteacher_three ft);

    Fteacher_three findByPhone(String tphone);

    PageBean<Fteacher_three> findByPage(int currPage);
}
