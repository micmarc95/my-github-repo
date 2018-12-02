package pl.com.marcinkowski.java14.constructor;

public class Pizza extends Dish{
    {
        System.out.println("Pizza - instance block");
    }

    static {
        System.out.println("Pizza - static block");
    }
    public Pizza(){
        this("tiuna");
        System.out.println("Pizza()");
    }
    public Pizza(String additions){
        super(5);
        System.out.println("Pizza with additions..." + additions);
    }
}
