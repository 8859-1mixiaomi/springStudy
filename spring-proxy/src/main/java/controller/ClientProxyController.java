package controller;

import pojo.Host;
import pojo.Proxy;
import pojo.ProxyInvocationHandler;
import pojo.Rent;

public class ClientProxyController {


    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
        //将真实角色放置进去！
        proxy.setRent(host);
        //动态生成对应的代理类！
        Rent rent= (Rent) proxy.getProxy();
        rent.rent();



    }
}
