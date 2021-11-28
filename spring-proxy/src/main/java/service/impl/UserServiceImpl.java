package service.impl;


import mapper.UserDao;
import mapper.impl.UserDaoImpl;
import service.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;


    public UserServiceImpl(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {

    }



    public void setUserDao(UserDaoImpl userDao) {
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
