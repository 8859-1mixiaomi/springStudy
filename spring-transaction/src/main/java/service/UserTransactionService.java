package service;

import entity.UserTransaction;

import java.util.List;

public interface UserTransactionService {

    public int addUser();

    public void deleteUser();


    public List<UserTransaction> selectUser();

}
