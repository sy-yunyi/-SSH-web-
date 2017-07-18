package sy.qust.three.service;

import sy.qust.three.domain.Sqinfo_three;

import java.util.ArrayList;

/**
 * Created by sy on 2017/5/30 0030.
 */
public interface SqinfoService {
    ArrayList<Sqinfo_three> getAll(String loginUser);

    int add(Sqinfo_three sqinfo_three);
}
