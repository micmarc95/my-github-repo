package pl.com.marcinkowski.java14.Computer;

public class Computer {

    public void changeDisc() {
        System.out.println("change disc in Computer");
    }
    @Override
    public String toString() {
        return "Computer";
    }
    //@override    - to nie ma sensu bo to jest static, nie można
    public static void print(){
        System.out.println("Print from Computer");

    }
}
