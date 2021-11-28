package mapper;

import Dao.UserDao;

public class UserDaoMysqlImpl implements UserDao{
    public void getUser() {
        System.out.println("mysql获取用户信息。。。");
    }
}
