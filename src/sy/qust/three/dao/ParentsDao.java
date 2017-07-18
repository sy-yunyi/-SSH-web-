package sy.qust.three.dao;

import sy.qust.three.domain.Parents_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/27 0027.
 */
public interface ParentsDao {
    public Parents_three findByPhone(Parents_three parents_three);

    //家长注册
    int register(Parents_three parents_three);

    //用户登录
    Parents_three findByPhoneAndPasswd(Parents_three parents_three);

    ArrayList<Parents_three> getAll();

    void updateInfo(Parents_three pt);

    int findCount();

    List<Parents_three> findByPage(int begin, int pageSize);
}
