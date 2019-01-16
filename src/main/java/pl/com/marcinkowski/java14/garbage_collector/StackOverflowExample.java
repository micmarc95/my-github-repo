package pl.com.marcinkowski.java14.garbage_collector;

public class StackOverflowExample {

    public static void main(String[] args) {

        one();
    }

    public static void recurent(){
        recurent();
    }

    public static void one(){
        two();
    }

    private static void two(){
        one();
    }
}
