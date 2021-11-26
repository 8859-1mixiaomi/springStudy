package service;

import Dao.UserDao;
import Service.UserService;

public class UserServiceImpl implements UserService {
    public UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
