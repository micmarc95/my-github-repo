package pl.com.marcinkowski.java14.solid.open_close_principle.exc.application;

import pl.com.marcinkowski.java14.solid.open_close_principle.exc.controller.UserController;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.controller.impl.UserControllerImpl;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.repository.UserDao;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.repository.impl.DbReader;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.service.UserService;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleApp {

    public static void main(String[] args) {

        UserDao dbDao = new DbReader();
        UserService userService = new UserServiceImpl(dbDao);
        UserController userController = new UserControllerImpl(userService);

        userController.renderUserPage();
    }

}
