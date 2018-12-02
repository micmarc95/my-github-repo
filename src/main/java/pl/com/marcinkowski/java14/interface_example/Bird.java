package pl.com.marcinkowski.java14.interface_example;

public class Bird implements Flyable, Moveable {
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving...");
    }
}
