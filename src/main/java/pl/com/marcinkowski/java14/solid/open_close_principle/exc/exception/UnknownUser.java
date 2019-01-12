package pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception;

public class UnknownUser extends Exception{

    public UnknownUser(){
        //empty
    }

    public UnknownUser(String message){
        super(message);
    }

    public UnknownUser(String message, Throwable cause){
        super (message, cause);
    }

}
