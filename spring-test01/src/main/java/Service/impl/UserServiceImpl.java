package Service.impl;

import Dao.UserDao;
import Service.UserService;

/**
 * @author xiaomi
 */
public class UserServiceImpl implements UserService {


    /**
     * 思考：现在要增加很多种userDao实现方式,每增加一种实现方式就要修改该文件
     * 有没有好的方式不用修改这些代码呢！
     *
     *下面是实现方式一：传统方式
     */
    /*private UserDao userDao = new UserDaoImpl();
    @Override
    public void gitUser() {
        userDao.getUser();
    }*/

    /**
     * 实现方式二 利用set实现
     */
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void gitUser() {
        userDao.getUser();
    }


}
