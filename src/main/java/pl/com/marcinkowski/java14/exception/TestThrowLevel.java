package pl.com.marcinkowski.java14.exception;

public class TestThrowLevel {
    public static void main(String[] args) {
        ThrowLevel2 l2 = new ThrowLevel2();
        try {
            l2.doIt();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
