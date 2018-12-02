package pl.com.marcinkowski.java14.exception;

public class ThrowLevel2 {

    public void doIt() throws MyException{
        System.out.println("I'm dangerous :)");

        MyExceptionThrower thrower = new MyExceptionThrower();
        thrower.throwMyException();
    }
}
