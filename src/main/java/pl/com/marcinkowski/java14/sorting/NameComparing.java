package pl.com.marcinkowski.java14.sorting;

public class NameComparing {

    public static int comparePersonsByName (Person first, Person second){
        return first.getName().compareTo(second.getName());
    }
}
