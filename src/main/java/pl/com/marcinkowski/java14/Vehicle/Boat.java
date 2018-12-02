package pl.com.marcinkowski.java14.Vehicle;

public class Boat extends Vehicle {

    @Override
    public void move() {
      //  super.move();
        System.out.println("Boat is swimming");
    }

    public void swim(){
        System.out.println("swim()");
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increase speed from Boat");
    }

    @Override
    public String toString() {
        return "Boat";
    }
}
