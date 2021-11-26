package service;

import dao.UserDao;
import dao.impl.UserDaoImpl;

/**
 * 代理角色，在这里面增加日志的实现
 * @author xiaomi
 */
public class UserServiceProxy implements UserService {

    private UserDao userDao;



    public void setUserDaoImpl(UserDao userDao) {
        this.userDao = userDao;
    }



    public UserServiceProxy() {
    }

    public UserServiceProxy(UserDaoImpl userDaoImpl) {
        this.userDao = userDaoImpl;
    }

    public void add() {
        log("add");
        userDao.add();
    }

    public void delete() {
        log("delete");
        userDao.delete();
    }

    public void update() {
        log("update");
        userDao.update();
    }

    public void query() {
        log("query");
        userDao.query();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法。。。");
    }



}
