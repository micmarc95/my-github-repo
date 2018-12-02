package pl.com.marcinkowski.java14.exception;

public class ExceptionExample {
    public static void main(String[] args) throws MyException {
        MyExceptionThrower object = new MyExceptionThrower();
//        try {
            object.throwMyException();
            System.out.println("here");
//        } catch (MyException e){
//            e.printStackTrace();
//        }
        System.out.println("here 2");
    }
}
