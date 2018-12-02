package pl.com.marcinkowski.java14.java_is_fun;

public class HorizontalJava {

    public static void main(String[] args) {

        Horizontal();
    }

    public static void printLine(int A, int B, int C, int D, int E, int F) {

        for (int i = 0; i < A; i++) {
            System.out.printf(" ");
        }
        for (int j = 0; j < B; j++) {
            System.out.printf("*");
        }
        for (int x = 0; x < C; x++) {
            System.out.printf(" ");
        }
        for (int x = 0; x < D; x++) {
            System.out.printf("*");
        }
        for (int x = 0; x < E; x++) {
            System.out.printf(" ");
        }
        for (int x = 0; x < F; x++) {
            System.out.printf("*");
        }
    }

    public static void Horizontal() {
        printLine(0, 8, 0, 0, 0, 0); //J
        printLine(3, 2, 3, 0, 0, 0); //A
        printLine(0, 1, 6, 1, 0, 0); //V
        printLine(3, 2, 3, 0, 0, 0); //A
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);//I
        printLine(0, 8,0 , 0, 0,0); //S
        printLine(0, 0,8 , 0, 0,0);
        printLine(0,8,0,0,1,0); //F
        printLine(0, 1, 6, 1, 1,0); //U
        printLine(0,1,6,1,0,0); //N
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !

        //koniec wiersz 1

        System.out.println("");

        printLine(6, 1, 1,0,0,0); //J
        printLine(2,1,2,1,2,0); //A
        printLine(0,1,6,1,0,0); //V
        printLine(2,1,2,1,2,0); //A
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0); //I
        printLine(0,1,7,0,0,0); //S
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 1,7 , 0, 1,0); //F
        printLine(0, 1, 6, 1, 1,0); //U
        printLine(0,1,1,1,4,1); //N
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !

        //koniec wiersza 2

        System.out.println("");

        printLine(6, 1, 1,0,0,0); //J
        printLine(1,1,4,1,1,0);
        printLine(0,1,6,1,0,0);
        printLine(1,1,4,1,1,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(0, 8,0 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 8,0 , 0, 1,0);
        printLine(0, 1, 6, 1, 1,0);
        printLine(0,1,2,1,3,1);
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(3,2,3,0,0,0);
        printLine(3,2,3,0,0,0);

        //koniec wiersza 3

        System.out.println("");

        printLine(6, 1, 1,0,0,0); //J
        printLine(0,8,0,0,0,0);
        printLine(1,1,4,1,1,0);
        printLine(0,8,0,0,0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(7, 1,0 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 1, 7, 0, 1,0);
        printLine(0, 1, 6, 1, 1,0); //U
        printLine(0,1,3,1,2,1);
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !
        printLine(3,2,3,0,0,0); // !

        //koniec wiersza 4

        System.out.println("");

        printLine(6, 1, 1,0,0,0); //J
        printLine(0,1,6,1,0,0); //A
        printLine(2, 1, 2, 1, 2,0);
        printLine(0,1,6,1,0,0); //A
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(7, 1,0 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 1, 7, 0, 1,0);
        printLine(0, 1, 6, 1, 1,0); //U
        printLine(0,1,4,1,1,1);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);

        //koniec wiersza 5

        System.out.println("");

        printLine(2, 5, 1,0,0,0); //J
        printLine(0,1,6,1,0,0); //A
        printLine(3, 2, 3, 0, 0,0);
        printLine(0,1,6,1,0,0); //A
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(0, 8,0 , 0, 0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(0, 1, 7, 0, 1,0);
        printLine(0, 8,0 , 0, 1,0);
        printLine(0,1,6,1,0,0);
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
        printLine(3,2,3,0,0,0);
        printLine(3,2,3,0,0,0);

        //koniec wiersza 6

    }
}
