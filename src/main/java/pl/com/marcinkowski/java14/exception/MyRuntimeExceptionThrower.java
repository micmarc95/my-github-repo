package pl.com.marcinkowski.java14.exception;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException(){
        System.out.println("throwMyException()");
        throw new MyRuntimeException("hahahahhah");
    }
}
