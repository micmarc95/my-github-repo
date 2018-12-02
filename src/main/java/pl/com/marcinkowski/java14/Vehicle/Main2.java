package pl.com.marcinkowski.java14.Vehicle;

public class Main2 {
    //TODO: virtual method
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();

        vehicle.move();
        car.move();
        boat.move();
        plane.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        plane.increaseSpeed();

        increaseSpeed(vehicle);
        increaseSpeed(car);
        increaseSpeed(boat);
        increaseSpeed(plane);

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(plane);



    }

    public static void processVehicle (Vehicle a){

        System.out.println(a);

    }

    public static void increaseSpeed (Vehicle a){
        System.out.println("from method increaseSpeed(Vehicle)");
        a.increaseSpeed();
        System.out.println();

    }


}
