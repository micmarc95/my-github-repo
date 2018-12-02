package pl.com.marcinkowski.java14.continent;

public class Europa extends Continent {
    static {
        System.out.println("Europa - Static First Initialization");
    }
    static {
        System.out.println("Europa - Static Second Initialization");
    }
    {
        System.out.println("Europa - First init block");
    }
    public Europa(){
        this(" England");
        System.out.println("Europa()");
    }
    public Europa(String country){
        //super(Continent)
        System.out.println("Europa()" + country);
    }
    {
        System.out.println("Europa - Second init block");
    }
}
