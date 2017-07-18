package sy.qust.three.service;

import sy.qust.three.domain.PageBean;
import sy.qust.three.domain.Tporders_three;

import java.util.List;

/**
 * Created by sy on 2017/5/31 0031.
 */
public interface TpordersService {
    void add(Tporders_three tporders_three);

    List<Tporders_three> findTorderByPhone(String phone);

    List<Tporders_three> findPorderByPhone(String phone);

    PageBean<Tporders_three> findByPage(int currPage,String phone);
}
