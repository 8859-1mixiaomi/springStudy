import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.UserInfo;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SelectUser {

    @Test
    public void selectUser() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<UserInfo> users = mapper.selectUser();
        for (UserInfo user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void test02() {
        ApplicationContext context = new ClassPathXmlApplicationContext("pring-mybatis.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userDao");
        List<UserInfo> userInfos = userMapper.selectUser();
        System.out.println(userInfos);
    }


}
