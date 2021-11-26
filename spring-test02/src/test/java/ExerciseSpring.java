import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Hello;
import pojo.User;
import pojo.UserT;
import service.UserServiceImpl;

public class ExerciseSpring {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }

    @Test
    public void test02() {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();

    }

    @Test
    public void test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();

    }
    @Test
    public  void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        UserT userT = (UserT) context.getBean("userT");
        System.out.println(userT.toString());

    }

    @Test
    public void test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        UserT userT02 = (UserT) context.getBean("userT02");
        System.out.println(userT02.toString());


    }

    @Test
    public void test06(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        UserT userT04 = (UserT) context.getBean("userT04");
        System.out.println(userT04.toString());
    }

    @Test
    public void test07() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        UserT newUserT = (UserT) context.getBean("newUserT");
        System.out.println(newUserT.toString());
    }

    @Test
    public void test08(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();

    }

}
