package pl.com.marcinkowski.java14.interface_example;

public interface Constants {
    int numberOfWheels = 4;
    final int numberOfWheels1 = 4; // bo jest zawsze i tak
    public final int numberOfWheels2 = 4; // bo jest zawsze i tak
    public static int numberOfWhels3 = 4; // bo jest zawsze i tak

    public abstract int doIt(); // nie trzeba pisać abstract bo jest zawsze
}
