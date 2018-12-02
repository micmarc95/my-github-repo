package pl.com.marcinkowski.java14.scanner;

import java.util.Scanner;
import java.lang.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);


        for(int i=0; i < 3; i++) {

            System.out.println("Podaj pierwszą liczbę");
            int intValue = inputReader.nextInt();
            System.out.println("Podaj drugą liczbę");
            int thirdValue = inputReader.nextInt();
            System.out.println("Podaj trzecią liczbę");
            int secondValue = inputReader.nextInt();
            System.out.println("Wynik mnożenia tych liczb to: " + intValue * secondValue * thirdValue);
        }

        for(;inputReader.hasNext();){
            if(inputReader.hasNextInt()){
                System.out.println(inputReader.next());
            } else {inputReader.next();
            }



        }


    }
}
