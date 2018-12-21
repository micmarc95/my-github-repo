package pl.com.marcinkowski.java14.anonymous_classes.lambda.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSorter {

    public static List<Car> sortCarsByModel (Car first, Car second, Sorter sorter){
        List<Car> result = new ArrayList<>();

        int order = sorter.sort(first.getModel(),second.getModel());

        if (order < 0){
            result.add(first);
            result.add(second);
        } else {
            result.add(second);
            result.add(first);
        }
        return result;
    }
}
