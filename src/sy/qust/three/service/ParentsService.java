package sy.qust.three.service;

import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Parents_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/27 0027.
 */
public interface ParentsService {
    //判断用户是否存在
    public Parents_three exist(Parents_three parents_three);
    //用户注册
    int register(Parents_three parents_three);
    //用户登录
    Parents_three login(Parents_three parents_three);

    ArrayList<Parents_three> getAllInfo();

    void update(Parents_three pt);

    PageBean<Parents_three> findByPage(int currPage);
}
