package pl.com.marcinkowski.java14.exception;

public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException(){
        //
    }
    public MyRuntimeException(String message){
        super(message);
    }
    public MyRuntimeException(String message, Throwable cause){
        super(message,cause);
    }
}
