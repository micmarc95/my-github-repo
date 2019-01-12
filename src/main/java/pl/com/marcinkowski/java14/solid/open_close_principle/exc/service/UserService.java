package pl.com.marcinkowski.java14.solid.open_close_principle.exc.service;

import pl.com.marcinkowski.java14.solid.open_close_principle.exc.domain.User;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception.UnknownUser;

public interface UserService {

    User getUser() throws UnknownUser;

}
