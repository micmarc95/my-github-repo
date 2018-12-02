package pl.com.marcinkowski.java14.generic;

import pl.com.marcinkowski.java14.Vehicle.Car;
import pl.com.marcinkowski.java14.Vehicle.Plane;
import pl.com.marcinkowski.java14.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class GenericVehicleTest {
    //method takes List of Vehicle
    //method for displaying list of Cars/Planes
    //method that adds Car to List

    public static void main(String[] args) {

        List<Vehicle> pojazdy = new ArrayList<>();
        pojazdy.add(new Car());
        pojazdy.add(new Car());
        pojazdy.add(new Plane());
        pojazdy.add(new Plane());

        List<Car> samochody = new ArrayList<>();

        addCar(pojazdy);
        addCar(samochody);

        processVehicle(pojazdy);
        System.out.println('\n');
        processVehicle(samochody);

    }

    public static void processVehicle (List<? extends Vehicle> vehicles){

        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }

    public static void addCar (List<? super Car> vehicles){
        vehicles.add(new Car());

    }




}
