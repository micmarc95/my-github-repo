package pl.com.marcinkowski.java14.inner_class;

import static pl.com.marcinkowski.java14.inner_class.Vehicle.Wheel;

public class Main {
    public static void main(String[] args) {

        //Vehicle vehicle = new Vehicle("bicycle",wheel); - nie da się stworzyć, najpierw musi byc jakieś wheel

        Vehicle.Wheel wheel = new Vehicle.Wheel(17);
        Wheel wheel2 = new Wheel(17);
        Vehicle vehicle = new Vehicle("bicycle",wheel);
        //House.Apartment = new House.Apartment(); - nie można
    }
}
