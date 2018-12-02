package pl.com.marcinkowski.java14.continent;

public class Asia extends Continent {
    static {
        System.out.println("Asia - Static First Initialization");
    }
    {
        System.out.println("Asia - First Init block");
    }
    public Asia(){
        this(" China");
        System.out.println("Asia()");
    }
    public Asia(String country){
        System.out.println("Asia()" + country);
    }
    {
        System.out.println("Asia - Second Init block");
    }
    static {
        System.out.println("Asia - Static Second Initialization");
    }
}
