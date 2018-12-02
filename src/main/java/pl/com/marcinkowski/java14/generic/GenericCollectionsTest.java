package pl.com.marcinkowski.java14.generic;

import pl.com.marcinkowski.java14.Animal.Animal;
import pl.com.marcinkowski.java14.Animal.Cat;
import pl.com.marcinkowski.java14.Animal.Dog;

import java.util.ArrayList;
import java.util.List;

public class GenericCollectionsTest {
    //method takes list of Animals
    //send Dogs and Cats

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        processAnimal(dogs);

        //////////////////////////////////////////////////

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cat());
        processAnimal(animals);

        ///////////////////////////////////////////////////

        List<Dog> dogsList = new ArrayList<>();
        dogsList.add(new Dog());
        dogsList.add(new Dog());
        processAnimal(dogsList);

        ////////////////////////////////////////////////////

//        addDog(dogsList);
        List<Animal> animalss = new ArrayList<>();
        addDog(animalss);
    }

    public static void processAnimal(List<? extends Animal> animals){ // CO TU SIE ODJEBALO? - " ? extends " = cokolwiek co rozszerza... | przyjść może każda lista od Animal w dół czyli np. pies, buldog, ale można tylko przeglądać

        for(Animal animal : animals) {
            System.out.println(animal);
        }

//        animals.add(new Dog());

    }

    public static void processAnimal(Animal[] animals){

        for(Animal animal : animals) {
            System.out.println(animal);
        }

        animals[0] = new Cat();

    }

    public static void addDog(List<? super Animal> animals){ // przyjść może lista Pies i w górę, czyli Animal, ale dodać można tylko obiekty Pies lub niżesze czyli np. pudel
        animals.add(new Dog());

    }

}
