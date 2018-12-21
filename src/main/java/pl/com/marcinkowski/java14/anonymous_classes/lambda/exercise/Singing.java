package pl.com.marcinkowski.java14.anonymous_classes.lambda.exercise;

@FunctionalInterface
public interface Singing {

    void singAlt ();

    default void singBass () {
        System.out.println("bass");
    }
    default void singSopran () {
        System.out.println("sopran");
    }

}
