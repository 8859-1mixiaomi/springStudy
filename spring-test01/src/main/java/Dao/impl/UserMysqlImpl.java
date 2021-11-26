package Dao.impl;

import Dao.UserDao;

/**
 * @author xiaomi
 */
public class UserMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("使用mysql实现获取用户信息。。。");
    }
}
