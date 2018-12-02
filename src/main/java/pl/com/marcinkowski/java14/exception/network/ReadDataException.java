package pl.com.marcinkowski.java14.exception.network;

public class ReadDataException extends RuntimeException {

    public ReadDataException(){

    }
    public ReadDataException(String message){
        super(message);
    }
    public ReadDataException(String message, Throwable cause){
        super(message,cause);
    }
}
