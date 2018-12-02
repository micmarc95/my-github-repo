package pl.com.marcinkowski.java14.Computer;

public class PC extends Computer {
    @Override
    public void changeDisc() {
        System.out.println("change disc in PC");
    }
    @Override
    public String toString() {
        return "PC";
    }
    //@override    - to nie ma sensu bo to jest static, nie można
    public static void print(){
        System.out.println("Print from PC"); //static wiec nie bedzie działać

    }
}
