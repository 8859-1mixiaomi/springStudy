import domian.User;
import domian.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class userTest {

    @Test
    public void userTest01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/userByName.xml");
        User userByName = (User) context.getBean("userByName");
        System.out.println(userByName.toString());

    }

    @Test
    public void  userTest02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/user.xml");
        User user = (User) context.getBean("user");
        user.getDog().shout();
        user.getCat().shout();

    }

    @Test
    public void userTest03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/userAnnotation.xml");
        UserInfo userAnnotation = (UserInfo) context.getBean("userAnnotation");
        userAnnotation.getCat().shout();
        userAnnotation.getDog().shout();



    }







}
