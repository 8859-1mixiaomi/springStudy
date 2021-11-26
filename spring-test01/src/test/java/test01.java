import Dao.impl.UserMysqlImpl;
import Dao.impl.UserOracleImpl;
import org.junit.Test;
import Service.UserService;
import Service.impl.UserServiceImpl;

public class test01 {

    /**
     * 传统方式一实现
     */
    @Test
    public void testOne(){
        UserService userService = new UserServiceImpl();
        userService.gitUser();
    }

    /**
     * 利用set方式
     * 其实这两个方式已经发生了根本性的改变
     * 方式一：主动权是用底层决定的（Service）
     * 方式二：主动交给了使用者（Controller）
     */
    @Test
    public void testTwo() {
        UserServiceImpl userService1 = new UserServiceImpl();
        userService1.setUserDao(new UserMysqlImpl());
        userService1.gitUser();
        //那我们现在又想用Oracle去实现呢
        userService1.setUserDao(new UserOracleImpl());
        userService1.gitUser();

    }





}
