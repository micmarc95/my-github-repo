package pl.com.marcinkowski.java14.Computer;

public class Mainframe extends Computer {
   @Override
    public void changeDisc() {
        System.out.println("change disc in Mainframe");
    }
    @Override
    public String toString() {
        return "Mainframe";
    }
    //@override    - to nie ma sensu bo to jest static, nie można
    public static void print(){
        System.out.println("Print from Mainframe"); //static wiec nie bedzie działać

    }
}
