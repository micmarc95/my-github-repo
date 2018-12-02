package pl.com.marcinkowski.java14.abstract_class;

public abstract class Vehicle {
    private int numberOfWheels;

    public int getNumberOfWheels(){
        return numberOfWheels;
    }
    public abstract void speedUp();
}
