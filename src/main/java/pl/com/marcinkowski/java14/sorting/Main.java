package pl.com.marcinkowski.java14.sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>(Arrays.asList( // teraz będzie można dodawać bo Arrays.asList trafia jako argument
                new Person("Andrzej","Kaban",23,120,4700,185,43),
                new Person("Maciej","Dziedzic",43,150,10700,178,45),
                new Person("Roman","Baniak",53,99,8300,190,50),
                new Person("Robert","Mańkowski",28,122,3000,168,44),
                new Person("Michał","Baranowski",18,180,2000,183,46)
        ));

       // persons.sort(Comparator.comparing(person -> person.getAge()));    - to sam wymyśliłeś ( jeśli dodasz minus przed person.getAge to posortuje odwrotnie

        Collections.sort(persons); // sortuje naturalnie po tym, co wpisales w metodzie compareTo w klasie - w tym przypadku jest to iq
        System.out.println(persons);

        Collections.sort(persons, new ShoeComparator());
        System.out.println(persons);

        Collections.sort(persons, new SalaryComparator());
        System.out.println(persons);

        Collections.sort(persons, ((o1, o2) -> (int) (o1.getHeight() - o2.getHeight())));
        System.out.println(persons);

        Collections.sort(persons, (o1, o2) -> (int) (o1.getShoeSize() - o2.getShoeSize()));
        System.out.println(persons);

        Collections.sort(persons, (Comparator.comparing(Person::getName))); //to robi to samo co poniżej, ale napisaliśmy klasę i przy czytaniu
        Collections.sort(persons,(NameComparing::comparePersonsByName));

        System.out.println(persons);


    }
}
