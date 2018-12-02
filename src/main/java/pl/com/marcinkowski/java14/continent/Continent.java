package pl.com.marcinkowski.java14.continent;

public class Continent {
    private String country;
    static {
        System.out.println("Continent - Static First Initialization");
    }
    {
        System.out.println("Continent - First Init block");
    }
    public Continent(){
        System.out.println("Continent");
    }
    {
        System.out.println("Continent - Second Init block");
    }
    static {
        System.out.println("Continent - Static Second Initialization");
    }

    public Continent(String country){
        System.out.println("Conitinent" + country);
    }
}
