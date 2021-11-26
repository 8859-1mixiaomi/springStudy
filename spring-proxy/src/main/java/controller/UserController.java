package controller;

import dao.UserDao;
import dao.impl.UserDaoImpl;

public class UserController {


    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.delete();
        userDao.update();
        userDao.query();
    }
}
