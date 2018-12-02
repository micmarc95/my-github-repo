package pl.com.marcinkowski.java14.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Computer pc = new PC();
        Computer laptop = new Laptop();
        Computer mainframe = new Mainframe();


        showComputer(computer);
        showComputer(pc);
        showComputer(laptop);
        showComputer(mainframe);

        System.out.println();

        changeDiscYo(computer);
        changeDiscYo(pc);
        changeDiscYo(laptop);
        changeDiscYo(mainframe);

    }
    public static void showComputer (Computer a){
        System.out.println(a);      //wystarczy bo zawsze jest używany toString
        a.print();      // nie wywołuje właściwie tylko cały czas typ tj. Computer bo użyliśmy statica gdzie nie działa polimorfizm ( info o złym wywołaniu - static wiec powinieneś wołąć do klasy jak niżej)
        Computer.print();   //tu wypisze się komputer, spójrz na uwagi powyzej


    }
    public static void changeDiscYo (Computer a){
        a.changeDisc();
        System.out.println("You changed disc in " + a);
        System.out.println();

    }

}
