package pl.com.marcinkowski.java14.java_is_fun;

public class JavaIsFun {
    public static void main(String[] args) {

        javaIsFun();

    }

    public static void javaIsFun(){
        jLetter();
        System.out.println("");
        aLetter();
        System.out.println("");
        vLetter();
        System.out.println("");
        aLetter();
        gap();
        iLetter();
        System.out.println("");
        sLetter();
        gap();
        fLetter();
        System.out.println("");
        uLetter();
        System.out.println("");
        nLetter();
        gap();
        imperal();
        System.out.println("");
        imperal();
        System.out.println("");
        imperal();
    }
    public static void printLine(int A, int B, int C, int D, int E,int F) {

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
        System.out.println("");
    }



    public static void jLetter(){
        printLine(0,8,0,0,0,0);
        for (int x = 0; x < 4; x++) {
            printLine(6, 1, 1,0,0,0);
        }
        printLine(2,5,1,0,0,0);
    }
    public static void aLetter(){
        printLine(3,2,3,0,0,0);
        printLine(2,1,2,1,2,0);
        printLine(1,1,4,1,1,0);
        printLine(0,8,0,0,0,0);
        printLine(0,1,6,1,0,0);
        printLine(0,1,6,1,0,0);
    }
    public static void vLetter(){
        printLine(0,1,6,1,0,0);
        printLine(0,1,6,1,0,0);
        for (int i=0;i<4;i++) {
            printLine(i, 1, 6-2*i, 1, i,0);
        }
    }
    public static void gap(){
        for (int i=0;i<6;i++) {
            printLine(0, 0,8 , 0, 0,0);
        }
    }
    public static void iLetter(){
        printLine(3,2,3,0,0,0);
        printLine(0, 0,8 , 0, 0,0);
        for (int i=0;i<4;i++) {
            printLine(3,2,3,0,0,0);
        }
    }
    public static void sLetter(){
        printLine(0,8,0,0,0,0);
        printLine(0, 1,7 , 0, 0,0);
        printLine(0, 8,0 , 0, 0,0);
        printLine(7, 1,0 , 0, 0,0);
        printLine(7, 1,0 , 0, 0,0);
        printLine(0, 8,0 , 0, 0,0);
    }
    public static void fLetter(){
        printLine(0,8,0,0,0,0);
        printLine(0, 1,7 , 0, 0,0);
        printLine(0, 8,0 , 0, 0,0);
        for (int i=0;i<3;i++) {
            printLine(0, 1, 7, 0, 0,0);
        }
    }
    public static void uLetter(){
        for (int i=0;i<5;i++) {
            printLine(0, 1, 6, 1, 0,0);
        }
        printLine(0,8,0,0,0,0);
    }
    public static void nLetter(){
        printLine(0,1,6,1,0,0);
        printLine(0,1,1,1,4,1);
        printLine(0,1,2,1,3,1);
        printLine(0,1,3,1,2,1);
        printLine(0,1,4,1,1,1);
        printLine(0,1,6,1,0,0);
    }
    public static void imperal(){
        for (int i=0;i<4;i++) {
            printLine(3,2,3,0,0,0);
        }
        printLine(0, 0,8 , 0, 0,0);
        printLine(3,2,3,0,0,0);
    }
}
