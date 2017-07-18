package sy.qust.three.dao;

import sy.qust.three.domain.Tsinfo_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/26 0026.
 */
public interface TsinfoDao {
    //用户注册时添加擅长科目
    public int add(Tsinfo_three tsinfo_three);
    //删除
    public int delete(Tsinfo_three tsinfo_three);
    //查找
    public Tsinfo_three findByPhoneAndSid(Tsinfo_three tsinfo_three);

    ArrayList<Tsinfo_three> getAllInfo();
}
