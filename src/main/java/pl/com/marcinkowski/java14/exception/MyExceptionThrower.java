package pl.com.marcinkowski.java14.exception;

public class MyExceptionThrower {

    public void throwMyException() throws MyException{
        System.out.println("ThrowMyException()");
        throw new MyException("hahahahah");
      //  System.out.println("eeeee");   // nie zadziała bo po wyrzuceniu błędu
    }
}
