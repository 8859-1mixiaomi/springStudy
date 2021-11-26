package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class UserAnnotationController {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/UserAnnotationPointcut.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.query();


    }

}
