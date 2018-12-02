package pl.com.marcinkowski.java14.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.whichVehicle();

        Vehicle car = new Car();
        car.whichVehicle();
        //car.speedUp();
        //Car carForSure = car;
        ((Car) car).speedUp();
    }
}
