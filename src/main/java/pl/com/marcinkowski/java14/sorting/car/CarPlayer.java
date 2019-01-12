package pl.com.marcinkowski.java14.sorting.car;

public class CarPlayer {
    public void playWithCarAction (Car car, CarActions ca){

        System.out.println("Inside playWithCarActions");
        ca.fly(car);
        ca.move(car);
    }
}
