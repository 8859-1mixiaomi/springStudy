package service.impl;

import entity.UserTransaction;
import mapper.UserMapper;
import mapper.UserTransactionMapper;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import service.UserTransactionService;

import java.util.List;

public class UserTransactionServiceImpl extends SqlSessionDaoSupport implements UserTransactionService {

    private UserMapper userMapper;


    public int addUser() {
        UserTransaction userTransaction = new UserTransaction();
        userTransaction.setName("小六");
        userTransaction.setPwd("1111111118");
        UserTransactionMapper mapper = getSqlSession().getMapper(UserTransactionMapper.class);
        int i1 = mapper.addUser(userTransaction);
        System.out.println(i1);
        int i = mapper.deleteUser(17);
        System.out.println(i);
        List<UserTransaction> userTransactions = mapper.selectUser();
        for (UserTransaction transaction : userTransactions) {
            System.out.println(transaction);
        }
        return userTransactions.size();
    }

    public void deleteUser() {
        UserTransaction userTransaction = new UserTransaction();
        UserTransactionMapper mapper = getSqlSession().getMapper(UserTransactionMapper.class);
        mapper.deleteUser(1);

    }

    public List<UserTransaction> selectUser() {
        UserTransactionMapper mapper = getSqlSession().getMapper(UserTransactionMapper.class);
        List<UserTransaction> userTransactions1 = mapper.selectUser();
        for (UserTransaction userTransaction : userTransactions1) {
            System.out.println(userTransaction);
        }
        return userTransactions1;
    }
}
