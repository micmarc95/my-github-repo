package pl.com.marcinkowski.java14.anonymous_classes.my_anonymous;

public class Flower extends Plant{
    @Override
    public void grow() {
        System.out.println("grow");
    }

    @Override
    public void smell() {
        System.out.println("smell");
    }

    @Override
    public void wilt() {
        System.out.println("wilt");
    }
}
