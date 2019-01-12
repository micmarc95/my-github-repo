package pl.com.marcinkowski.java14.sorting.car;

@FunctionalInterface
public interface CarActions {

    default void move(Car car) {}
    void fly(Car car); // car -> {}
}
