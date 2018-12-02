package pl.com.marcinkowski.java14.Computer;

public class Laptop extends Computer {
    @Override
    public void changeDisc() {
        System.out.println("change disc in Laptop");
    }
    @Override
    public String toString() {
        return "Laptop";
    }
    //@override    - to nie ma sensu bo to jest static, nie można
    public static void print(){
        System.out.println("Print from Laptop"); //static wiec nie bedzie działać

    }
}
