package pl.com.marcinkowski.java14.collection.list;

import pl.com.marcinkowski.java14.roslinki.Cactus;
import pl.com.marcinkowski.java14.roslinki.Opuncja;
import pl.com.marcinkowski.java14.roslinki.Plant;
import pl.com.marcinkowski.java14.roslinki.Rose;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {
    public static void main(String[] args) {
        //String []
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");
        strings.size();

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        for(String s : strings){
            System.out.println(s);
        }

        List<Plant> plants = new ArrayList<>();
        plants.add(new Cactus(2,4,2));
        plants.add(new Opuncja(2,4,2));
        plants.add(new Rose(2,4,2));

        plants.set(1, new Rose(2,4,2));

        plants.remove(2);


    }
}
