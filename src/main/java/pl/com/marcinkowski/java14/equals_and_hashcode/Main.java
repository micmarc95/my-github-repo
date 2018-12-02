package pl.com.marcinkowski.java14.equals_and_hashcode;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("michal", "marcinkowski", 23);
        Person maniek = me;

        System.out.println("me.equals(maniek): " + me.equals(maniek)); // defaultowe działanie, że porownuje referencje
        System.out.println("me == maniek? : " + (me == maniek)); //true bo porównuje referencje


        maniek = new Person("michal","marcinkowski",23);
        System.out.println("and now, me == maniek? " + (me == maniek)); // false bo == porównuje referencje

        System.out.println("me.equals(maniek): " + me.equals(maniek));
    }
}
