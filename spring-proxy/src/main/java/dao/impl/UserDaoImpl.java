package dao.impl;

import dao.UserDao;


public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("增加一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("更改一个用户");
    }

    public void query() {
        System.out.println("查询一个用户");
    }


}
