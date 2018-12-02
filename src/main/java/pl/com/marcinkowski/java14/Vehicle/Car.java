package pl.com.marcinkowski.java14.Vehicle;

public class Car extends Vehicle{
    @Override
    public void move() {
       // super.move();
        System.out.println("Car is driving");
    }

    public void speedUp() {
        System.out.println("Speed Up()");
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increase speed from Car");
    }

    @Override
    public String toString() {
        return "Car";
    }
}
