package controller;

import pojo.Host;
import pojo.Proxy;

public class ClientController {


    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东租房
        Proxy proxy = new Proxy(host);

        //你找中介租房
        proxy.rent();

    }





}
