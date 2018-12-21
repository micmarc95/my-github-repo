package pl.com.marcinkowski.java14.anonymous_classes.lambda.method_reference;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "aaaa";
        String b = "bbbb";

        System.out.println(BrandSorter.brandOrder(a, b));
        System.out.println(BrandSorter.brandOrder(b, a));

        System.out.println(ModelSorter.modelOrder(a, b));
        System.out.println(ModelSorter.modelOrder(b, a));

        Car saab = new Car("Saab","900",111);
        Car porsche = new Car("Porsche","911",222);

        List<Car> sortedCars = CarSorter.sortCarsByModel(saab,porsche,
                (first, second) -> first.compareTo(second));

        List<Car> sortedCars2 = CarSorter.sortCarsByModel(saab,porsche,
                (first, second) -> second.compareTo(first));

        CarSorter.sortCarsByModel(saab,porsche,((first, second) -> ModelSorter.modelOrder(first,second))); // to jest to samo co poniżej
        CarSorter.sortCarsByModel(saab,porsche,(ModelSorter::modelOrder)); // to jest to samo co powyżej

        CarPrinter carPrinter = (car -> System.out.println(car));

        //void printCar(Car car)
        CarPrinter carPrinter2 = System.out::println;

        CarPrinter carPrinter3 = car -> car.printYourself();
        CarPrinter carPrinter4 = Car::printYourself;


    }

}
