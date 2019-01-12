package pl.com.marcinkowski.java14.solid.open_close_principle.exc.repository;

import pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception.UnknownUser;

public interface UserDao {

    public String getUserFromDb() throws UnknownUser;

    }
