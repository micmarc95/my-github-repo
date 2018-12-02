package pl.com.marcinkowski.java14.interface_example;

public class Plane extends Vehicle implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane is flying....");
    }
}
