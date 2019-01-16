package pl.com.marcinkowski.java14.sorting.car;


import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 7 aut
        // do kolekcji
        // naturalny porządek
        //
        List<Car> cars = Arrays.asList(

                new Car("BMW","e36","black", LocalDate.of(1999,1,2), 115),
                new Car("Audi","a3","blue",LocalDate.of(2008,2,16), 120),
                new Car("Alfa","146","gold",LocalDate.of(2008,4,3), 110),
                new Car("Pagani","zonda","white",LocalDate.of(2018,6,2), 400),
                new Car("Renault","traffic","red",LocalDate.of(2004,8,2), 90),
                new Car("Opel","vectra","black",LocalDate.of(2005,12,5), 75),
                new Car("Citroen","picasso","green",LocalDate.of(2012,4,22), 80)
        );


        System.out.println("Before sorting");
        System.out.println(cars);
        System.out.println("After sorting");
        Collections.sort(cars);
        System.out.println(cars);

        System.out.println("///////////////////////////////////");

        // poniżej to wszystko to samo: 1 - z wykorzystaniem komparatora, 2 - z wykorzystaniem lambd, 3 - zwykorzystaniem referencji do metod

        System.out.println("After sorting with comparator");
        Collections.sort(cars, new BrandComparator());
        System.out.println(cars);
        // i odwrotne sortowanie
        Collections.sort(cars, new BrandComparator().reversed());
        System.out.println(cars);

        Collections.sort(cars, (o1, o2) -> o1.getBrand().compareTo(o2.getBrand()));
        System.out.println(cars);

        Collections.sort(cars, Comparator.comparing(Car::getBrand));
        System.out.println(cars);

        System.out.println("///////////////////////////////////");

        // odwrócone sortowanie po kolorach. Odwrócone bo zamiana kolejności -> (o2, o1)
        Collections.sort(cars, (o2, o1) -> o1.getColour().compareTo(o2.getColour()));
        System.out.println(cars);

        // CarPlayer
        // użyć playWithCarAction - wysłać cara do niego
        // wysłać lambda x2

        //Car car1 = new Car("BMW","e36","black", LocalDate.of(1999,1,2), 115); - nie trzeba tworzyć nowego, wołamy z listy

        CarPlayer carPlayer = new CarPlayer();
        carPlayer.playWithCarAction(cars.get(0),
                car -> System.out.println("Car is flying" + car));
        //carPlayer.playWithCarAction(cars.get(0),car -> );

        cars.get(0).compareTo(cars.get(1));
        cars.get(0).maybeCompare((Car o) -> o.getPower());

        cars.get(0).concatTwoBrands(cars.get(1));
        cars.get(0).doSomething(object -> System.out.println(object.getBrand() + " - "));


    }
}
