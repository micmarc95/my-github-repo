package pl.com.marcinkowski.java14.Vehicle;

public class Vehicle {
    public void whichVehicle(){
        System.out.println("whichVehicle()");
    }
    public void move(){
        System.out.println("move");
    }

    public void increaseSpeed(){
        System.out.println("increase speed from Vehicle");
    }

    @Override
    public String toString() {
        return "Vehicle";
    }
}
