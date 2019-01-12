package pl.com.marcinkowski.java14.solid.open_close_principle.exc.controller.impl;

import pl.com.marcinkowski.java14.solid.open_close_principle.exc.controller.UserController;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception.UnknownUser;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = Objects.requireNonNull(userService);
    }

    @Override
    public String renderUserPage() {
        System.out.println("Makinh html with user data");
        String html = "";
        try {
            userService.getUser();
        } catch (UnknownUser userNotFoundCheckedExc) {
            userNotFoundCheckedExc.printStackTrace();
        }
        return null;
    }
}
