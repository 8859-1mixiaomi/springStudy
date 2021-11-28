import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserTransactionService;

public class UserTransactionTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        UserTransactionService service = (UserTransactionService) context.getBean("userTransactionService");
        service.deleteUser();
    }


}
