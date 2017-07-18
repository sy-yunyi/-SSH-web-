package sy.qust.three.dao;

import sy.qust.three.domain.Administrator_three;

/**
 * Created by sy on 2017/5/23 0023.
 * 管理员DAO接口
 *
 */
public interface AdminDao {
    /**
     * 管理员登录
     * @param admin
     * @return
     */
    Administrator_three findByUsernameAndPassword(Administrator_three admin);
    int add(Administrator_three administrator_three);
}
