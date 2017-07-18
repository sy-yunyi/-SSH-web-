package sy.qust.three.service;

import sy.qust.three.domain.Administrator_three;

/**
 * Created by sy on 2017/5/23 0023.
 *
 *管理员管理的业务接口
 */
public interface AdminService {
    Administrator_three login(Administrator_three admin);
    int add(Administrator_three administrator_three);
}
