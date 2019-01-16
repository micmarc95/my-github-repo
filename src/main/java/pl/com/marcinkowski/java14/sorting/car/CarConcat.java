package pl.com.marcinkowski.java14.sorting.car;

@FunctionalInterface
public interface CarConcat<T> {

    void concatTwoBrands(T object);
    //concat this and other brand
}
