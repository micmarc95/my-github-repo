package pl.com.marcinkowski.java14.max;

import java.util.Scanner;
import java.lang.*;

public class SearchMax {
        public static void main(String[] args) {
            Scanner inputReader = new Scanner(System.in);

                System.out.println("Podaj pierwszą liczbę");
                int a = inputReader.nextInt();
                System.out.println("Podaj drugą liczbę");
                int b = inputReader.nextInt();
                System.out.println("Podaj trzecią liczbę");
                int c = inputReader.nextInt();

                int max = findMax(a, b, c);
                System.out.println("Found max: " + max);

                System.out.println("Podaj pierwszą liczbę");
                int x = inputReader.nextInt();
                System.out.println("Podaj drugą liczbę");
                int y = inputReader.nextInt();
                System.out.println("Podaj trzecią liczbę");
                int z = inputReader.nextInt();
                System.out.println("Podaj czwartą liczbę");
                int z1 = inputReader.nextInt();

                int min = findMin(x, y, z, z1);
                System.out.println("Found min: " + min);
                
        }

        public static int findMax (int d, int e, int f){
            int max = d;
            if (e > max) max = e;
            if (f > max) max = f;
            return max;
        }

        public static int findMin (int d, int e, int f, int g){
        int min = d;
        if (e < min) min = e;
        if (f < min) min = f;
        if (g < min) min = g;
        return min;
    }

}
