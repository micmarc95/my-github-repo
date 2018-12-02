package pl.com.marcinkowski.java14.exception;

public class TestMyRuntimeException {
    public static void main(String[] args) {
        try {throw new MyRuntimeException();}
        catch (MyRuntimeException exc) {
            exc.printStackTrace();
        }


    }
}
