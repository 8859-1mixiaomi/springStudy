package Dao.impl;

import Dao.UserDao;

/**
 * @author xiaomi
 */
public class UserOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("使用oracle获取用户信息。。。");
    }
}
