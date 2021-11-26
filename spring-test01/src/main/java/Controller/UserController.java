package Controller;

import Service.UserService;
import Service.impl.UserServiceImpl;

/**
 * @author xiaomi
 */
public class UserController {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.gitUser();
    }



}
