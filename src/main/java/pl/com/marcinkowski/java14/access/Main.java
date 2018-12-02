package pl.com.marcinkowski.java14.access;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Mariusz", "P",-20);
        System.out.println(me);
        me.setAge(-50);
        System.out.println(me);
      //  me.age = -50;
        System.out.println(me);
      //  me.name;
        me.secret = "me secret";
        me.secondSecret = "second secret";

    }
}
