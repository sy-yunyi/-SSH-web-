package sy.qust.three.service;

import sy.qust.three.domain.Tsinfo_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/26 0026.
 */
public interface TsinfoService {
    //添加
    int addTS(Tsinfo_three tsinfo_three);
    //删除
    int deleteTS(Tsinfo_three tsinfo_three);

    ArrayList<Tsinfo_three> getAllInfo();

    Tsinfo_three findByPhoneAndSid(Tsinfo_three tsinfo_three);
}
