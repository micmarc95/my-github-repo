package pl.com.marcinkowski.java14.solid.open_close_principle.exc.exception;

public class UserNotFoundUncheckedExc extends RuntimeException{

    public UserNotFoundUncheckedExc(){
        //empty
    }

    public UserNotFoundUncheckedExc(String message){
        super(message);
    }

    public UserNotFoundUncheckedExc(String message, Throwable cause){
        super (message, cause);
    }

}
