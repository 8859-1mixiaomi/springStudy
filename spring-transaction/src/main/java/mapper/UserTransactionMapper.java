package mapper;

import entity.UserTransaction;

import java.util.List;

public interface UserTransactionMapper {
    int addUser(UserTransaction userTransaction);

    int deleteUser(int id);

    List<UserTransaction> selectUser();

}
