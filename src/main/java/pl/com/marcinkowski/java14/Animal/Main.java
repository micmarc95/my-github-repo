package pl.com.marcinkowski.java14.Animal;

public class Main {
    public static void main(String[] args) {
        Dog szarik = new Dog();
        szarik.whichAnimal();
        szarik.makeSound();

        Animal maybeDog = new Dog();
        maybeDog.whichAnimal();
        //maybeDog.makeSound();
        Animal maybeCat = new Cat();
        Animal maybeMonkey = new Monkey();
        Object Monkey = new Monkey();
    }
}
