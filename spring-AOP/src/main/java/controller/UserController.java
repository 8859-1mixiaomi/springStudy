package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class UserController {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/UserBeans.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.query();
        userService.add();


    }


}
