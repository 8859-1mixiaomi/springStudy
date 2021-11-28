package controller;

import mapper.UserDao;
import mapper.impl.UserDaoImpl;

public class UserController {


    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.delete();
        userDao.update();
        userDao.query();
    }
}
