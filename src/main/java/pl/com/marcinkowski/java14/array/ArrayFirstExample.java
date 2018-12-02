package pl.com.marcinkowski.java14.array;

import pl.com.marcinkowski.java14.Animal.*;


public class ArrayFirstExample {
    public static void main(String[] args) {
        int[] firstArray = new int[4];
        Object o = firstArray;
        firstArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }

        //////////////////////////////////////////
        makeAnimals();
        checkEnhancedFor();

        //////////////////////////////////////////

        Animal[] zwierzaki = new Animal[2];
        zwierzaki[0] = new Dog();
        zwierzaki[1] = new Cat();
        processAnimalArray(zwierzaki);
        addCatToArray(zwierzaki);

        Dog[] psy = new Dog[2];
        psy[0] = new Dog();
        psy[1] = new Dog();
        processAnimalArray(psy);
        addCatToArray(psy);

        Cat[] koty = new Cat[2];
        koty[0] = new Cat();
        koty[1] = new Cat();
        processAnimalArray(koty);
        addCatToArray(koty);


    }
    public static Animal[] makeAnimals(){
        Animal[] animalArray = new Animal[2];
        animalArray[0] = new Dog();
        animalArray[1] = new Cat();


       //for (int i = 0; i < animalArray.length){
           //System.out.println(animalArray[i]);
       //}        to samo da for poniżej

        for (Animal animal : animalArray) {
            System.out.println(animal);

        }

        return animalArray;

    }

    public static void checkEnhancedFor(){
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[11];
        Cat[] cats = new Cat[5];

        for (Object o : objects){
            System.out.println(o);
        }

        for (Dog dogo : dogs){
            System.out.println(dogo);
        }

        for (Cat cato : cats){
            System.out.println(cats);
        }
    }

    public static void processAnimalArray (Animal[] animals){
        for (Animal animal : animals){
            animal.whichAnimal();
        }
    }

    public static void addCatToArray (Animal[] koty) {
        if (koty instanceof Cat[]) {
            koty[0] = new Cat();
        } else {
            System.out.println("Warning !!! Cannot add cat here");
        }
    }
}
