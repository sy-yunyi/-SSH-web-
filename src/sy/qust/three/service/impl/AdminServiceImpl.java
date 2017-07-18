package sy.qust.three.service.impl;

import org.springframework.transaction.annotation.Transactional;
import sy.qust.three.dao.AdminDao;
import sy.qust.three.domain.Administrator_three;
import sy.qust.three.service.AdminService;

/**
 * Created by sy on 2017/5/23 0023.
 * 管理员业务层实现类
 * 调用DAO
 */
@Transactional
public class AdminServiceImpl implements AdminService{

    //注入DAO
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    /**
     * 业务层的登录方法实现
     * 调用DAO
     */
    public Administrator_three login(Administrator_three admin) {
       Administrator_three existAdmin= adminDao.findByUsernameAndPassword(admin);
        return existAdmin;
    }
    public int add(Administrator_three administrator_three){
        int n=adminDao.add(administrator_three);
        return 1;
    }
}
