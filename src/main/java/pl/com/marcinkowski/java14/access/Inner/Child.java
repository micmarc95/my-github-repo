package pl.com.marcinkowski.java14.access.Inner;

import pl.com.marcinkowski.java14.access.Person;

public class Child extends Person {
    public void sayHello() {
       // System.out.println("My secret: " + secret);
        System.out.println("My second secret: " + secondSecret);
    }
}
