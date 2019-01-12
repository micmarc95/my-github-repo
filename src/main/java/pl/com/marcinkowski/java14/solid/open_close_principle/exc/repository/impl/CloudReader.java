package pl.com.marcinkowski.java14.solid.open_close_principle.exc.repository.impl;

import pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception.UnknownUser;
import pl.com.marcinkowski.java14.solid.open_close_principle.exc.repository.UserDao;

public class CloudReader implements UserDao {

    @Override
    public String getUserFromDb() throws UnknownUser {
        return "";
    }
}
