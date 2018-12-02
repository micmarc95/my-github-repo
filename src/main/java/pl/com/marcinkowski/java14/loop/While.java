package pl.com.marcinkowski.java14.loop;

public class While {

    int a = 5;

    public int getA(){
        return this.a;
    }
    public static void main(String[] args) {
        new While().a = 6;

        new While().getA();
        new While().getA();
    }

    public static void stopR(){
        char currentChar = 'a';
        while(currentChar != 'r'){
            //read char
        }

        for(;currentChar != 'r';){          // tak można polecieć for - em
            //read char
        }

        do {
            // do something
        } while (currentChar != 'r');

        //jak zasymulować pętle do while - pętlą while:

        System.out.println("eeeee");
        while(currentChar != 'r'){
            System.out.println("eeeee");
        }
    }

    public static void printNumbers(){
        //100
        for(int i=1; i<=100; i++){
            if (i<52) {
                System.out.println("i: " + i);
            } else {break;}
        }
    }


}
