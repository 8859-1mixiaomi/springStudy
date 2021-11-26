import Domain.Address;
import Domain.Student;
import Domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.reflect.generics.tree.VoidDescriptor;

public class StudentTest01 {

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());

    }

    @Test
    public void  test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/studentRef.xml");
        Student studentRef = (Student) context.getBean("studentRef");
        System.out.println(studentRef.getName());
    }

    @Test
    public void  test03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/studentList.xml");
        Student studentList = (Student) context.getBean("studentList");
        studentList.show();

    }

    @Test
    public void test04(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/user.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.toString());

    }

    @Test
    public void  test05(){
        ApplicationContext context = new ClassPathXmlApplicationContext("config/userC.xml");
        User userC = (User) context.getBean("userC");
        System.out.println(userC.toString());

    }




















}
