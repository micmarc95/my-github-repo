package pl.com.marcinkowski.java14.anonymous_classes.lambda.exercise;

public class MainSing {
    public static void main(String[] args) {

        Singing singing = () -> System.out.println("sing Alt"); // void singAlt i dorób "sing Alt"
        singing.singAlt();

        singing.singBass();
        singing.singSopran();

        doSthg().singAlt(); // tu się ładnie nadpisuje void singAlt i wykonuje to co w doSthg
        doSthg().singBass(); // tu i tak wywoła się bass, a nie to co napisane w doSthg, bo bass jest defaultowa i nie da sie jej nadpisać

    }

    private static Singing doSthg () {
        return () -> System.out.println("Singing in Alt");
    }
}
