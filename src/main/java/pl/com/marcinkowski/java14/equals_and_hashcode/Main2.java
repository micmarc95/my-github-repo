package pl.com.marcinkowski.java14.equals_and_hashcode;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // ArrayList for Person
        //add 4 persons
        //2 duplicates
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Michał","Marcinkowski",23));
        persons.add(new Person("Wojciech","Nowak",24));
        persons.add(new Person("Radek","Kulikowski",25));
        persons.add(new Person("Michał","Marcinkowski",23));

        //create new duplicate which exists in arraylist

        Person person1 = new Person("Michał","Marcinkowski",23);

        // check if ArrayList contains person1

        System.out.println("persons.contains(person1) : " + persons.contains(person1)); // true bo nauczyliśmy "equalsa" sprawdzać nie referencje tylko pola a są jednakowe

        //////////////////////////////////////////////////////////////////////////////////////

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(persons);

        Person personDuplicate = new Person("Michał","Marcinkowski",23);

        System.out.println('\n' + "Set size : " + personSet.size());
        System.out.println('\n' + "personSet.contains(personDuplicate) : " + personSet.contains(personDuplicate));

        ///////////////////////////////////////////////////////////////////////////////////////

        for (Person p : personSet){
            System.out.println("Person: " + p);
        }

        Set<Person> anotherSet = new LinkedHashSet<>(); // uporządkowana po kolejności dodania
        List<Person> anotherPersonList = new LinkedList<>(); //

    }
}
