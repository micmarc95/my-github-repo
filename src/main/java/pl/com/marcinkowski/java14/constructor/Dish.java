package pl.com.marcinkowski.java14.constructor;

public class Dish {
    private String kind;
    {
        System.out.println("Dish - First init block");
    }
    static {
        System.out.println("Dish - Static First Initialization");
    }

    {
        System.out.println("Dish - Second init block");
    }
    public Dish(){
        this("pasta");
        // o tu się wstawiają bloki kodu niestatyczne
        System.out.println("Dish");
    }
    //overloading
    public Dish(String kind){
        super();
        System.out.println("Dish() " + kind);
        this.kind = kind;
    }
    public Dish(int hmm){
        System.out.println("Dish() " + hmm);

    }
    static {
        System.out.println("Dish - Static Dish class initialization");

    }
}
