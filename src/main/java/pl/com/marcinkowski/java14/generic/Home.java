package pl.com.marcinkowski.java14.generic;

//generic
//only Animals and extends
//method enterHome(xxx)
//method goOutside (xxx)
//xxx = placeholder

import pl.com.marcinkowski.java14.Animal.Animal;
import pl.com.marcinkowski.java14.Animal.Dog;

public class Home <GEN extends Animal> {

    GEN animal;

    public void enterHome(GEN animal){
        this.animal = animal;
        animal.whichAnimal();
        System.out.println("animal that enters Home: " + animal);
    }

    public GEN goOutside(GEN animal){
        System.out.println("animal that goes outside: " + animal);
        return animal;
    }
//    public GEN getAnimal(){
//        return animal;
//    }
//
//    public void setAnimal(GEN animal){
//        this.animal = animal;
//    }

    ///////////

    public void dogGoOutside(Dog animal){ //tu nie można podać niż innego niż Dog
        System.out.println("Dog that goes outside: " + animal);
    }



}
