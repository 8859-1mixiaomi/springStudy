package controller;

import mapper.UserDao;
import mapper.impl.UserDaoImpl;
import service.UserServiceProxy;


public class UserProxyController {

    public static void main(String[] args) {
        //真实业务
        UserDao UserDao = new UserDaoImpl();
        //代理类
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        //使用代理类实现日志功能！
        userServiceProxy.setUserDaoImpl(UserDao);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.query();

    }

}
