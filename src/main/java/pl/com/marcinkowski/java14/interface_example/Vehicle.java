package pl.com.marcinkowski.java14.interface_example;

public class Vehicle implements Moveable{

    @Override
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}
