package pl.com.marcinkowski.java14.exception;

public class MyException extends Exception {

    public MyException(){
        //
    }
    public MyException(String message){
        super(message);
    }
    public MyException(String message, Throwable cause){
        super(message, cause);
    }
}
