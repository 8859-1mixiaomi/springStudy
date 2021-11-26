package Controller;

import Domain.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentController {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }




}
