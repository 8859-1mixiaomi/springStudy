package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserTransactionService;

public class UserTransactionController {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserTransactionService service = (UserTransactionService) context.getBean("userTransactionService");
        service.addUser();
      /*  service.deleteUser();
        service.selectUser();*/

    }









}
