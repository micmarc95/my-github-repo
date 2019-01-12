package pl.com.marcinkowski.java14.solid.single_object_responsibility;

public class Vet {
    private String name;
    public void firstAid (Dog dog){
        System.out.println(String.format("Dog [%s] is being healed by : [%s]", dog.getName(),name));
    }
}
