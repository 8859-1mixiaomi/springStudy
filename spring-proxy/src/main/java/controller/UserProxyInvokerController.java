package controller;

import mapper.UserDao;
import mapper.impl.UserDaoImpl;
import service.UserServiceProxyInvoke;

public class UserProxyInvokerController {

    public static void main(String[] args) {
        //真实对象
        UserDao userDao = new UserDaoImpl();
        //代理对象的调用处理程序
        UserServiceProxyInvoke pih  = new UserServiceProxyInvoke();

        //设置要代理的对象
        pih.setTarget(userDao);

        //动态生成代理类！
        UserDao proxy  = (UserDao) pih.getInvoker();

        proxy.delete();

    }

}
