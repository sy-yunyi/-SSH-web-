package sy.qust.three.dao;

import sy.qust.three.domain.Tporders_three;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sy on 2017/5/31 0031.
 */
public interface TpordersDao {
    void add(Tporders_three tporders_three);

    ArrayList<Tporders_three> findTorderByPhone(String phone);

    ArrayList<Tporders_three> findPorderByPhone(String phone);

    int findCount(String phone);

    List<Tporders_three> findByPage(int begin, int pageSize,String phone);
}
