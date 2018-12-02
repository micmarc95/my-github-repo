package pl.com.marcinkowski.java14.generic;

import pl.com.marcinkowski.java14.Animal.Animal;
import pl.com.marcinkowski.java14.Animal.Cat;
import pl.com.marcinkowski.java14.Animal.Dog;

public class HomeTest {
    public static void main(String[] args) {

        Home<Animal> AnimalHome = new Home<>();
        Home<Dog> DogHome = new Home<>();
        Home<Cat> CatHome = new Home<>();

        AnimalHome.enterHome(new Dog());
        AnimalHome.enterHome(new Animal());
        AnimalHome.enterHome(new Cat());

        AnimalHome.goOutside(new Dog());
        AnimalHome.goOutside(new Animal());
        AnimalHome.goOutside(new Cat());

        AnimalHome.dogGoOutside(new Dog());

        DogHome.goOutside(new Dog());
        //DogHome.goOutside(new Animal());     nie będzie działać




    }

}
