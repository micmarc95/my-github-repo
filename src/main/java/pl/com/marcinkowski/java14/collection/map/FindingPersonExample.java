package pl.com.marcinkowski.java14.collection.map;

import pl.com.marcinkowski.java14.equals_and_hashcode.Person;

import java.util.*;

public class FindingPersonExample {

    public static void main(String[] args) {
        //map ids over Person
        //add 10 persons to map
        //find only persons younger than 25
        //add result to list

        Map<String, Person> idsOverPerson = new HashMap<>();

        idsOverPerson.put("1", new Person("Andrzej","Joz",23));
        idsOverPerson.put("2", new Person("Michał","ABC",28));
        idsOverPerson.put("3", new Person("Bartek","BCD",40));
        idsOverPerson.put("4", new Person("A","DFG",18));
        idsOverPerson.put("5", new Person("B","FGH",7));
        idsOverPerson.put("6", new Person("C","GHJ",2));
        idsOverPerson.put("7", new Person("D","HJK",67));
        idsOverPerson.put("8", new Person("E","JKL",25));
        idsOverPerson.put("9", new Person("F","KLM",21));
        idsOverPerson.put("10", new Person("G","LMN",33));

        List<String> result = new ArrayList<>();

        for(String key : idsOverPerson.keySet()) {

            if (idsOverPerson.get(key).getAge() < 25) {
                result.add(idsOverPerson.get(key).getName());
                System.out.println(idsOverPerson.get(key).getName() + " " + idsOverPerson.get(key).getSurname() + " " + idsOverPerson.get(key).getAge());
            }
        }
        System.out.println(result);

    }
}
