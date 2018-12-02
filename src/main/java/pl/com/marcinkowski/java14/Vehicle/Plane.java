package pl.com.marcinkowski.java14.Vehicle;

public class Plane extends Vehicle {

    @Override
    public void move() {
        //  super.move();
        System.out.println("Plane is flying");
    }

    public void swim(){
        System.out.println("fly()");
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increase speed from Plane");
    }

    @Override
    public String toString() {
        return "Plane";
    }
}
