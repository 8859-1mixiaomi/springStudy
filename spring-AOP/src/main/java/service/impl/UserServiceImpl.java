package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import service.UserService;


public class UserServiceImpl implements UserService {

   public static UserDao userDao=new UserDaoImpl();


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        userDao.add();
    }

    public void delete() {
        userDao.delete();
    }

    public void update() {
        userDao.update();
    }

    public void query() {
        userDao.query();
    }


}
