package pl.com.marcinkowski.java14.conditional;

public class ConditionsTest {

    public static void main(String[] args) {

        int age = 11;


        if (age >= 0 & age <= 10) {
            System.out.println("masz 0-10 lat!");
        } else if (age >= 11 & age <= 15) {
            System.out.println("masz 11-15 lat!");
        } else if (age > 15 & age <= 18) {
            System.out.println("masz 16-18 lat!");
        } else {
            System.out.println("masz więcej niż 18 lat!!");
        }


        testAge(10);
        printStringLength("ala");

        String value = "ala ma kota";
        printStringLength(value);
        String value2 = null;
        printStringLength(value2);

        testStringLength(null);
    }

        //////////////////////////////////////////////////////////////


    public static void testAge (int age1) {

        if (age1 <= 10)
            System.out.println("masz 0-10 lat!");
        if (age1 >= 11) {
            if (age1 <= 15) System.out.println("masz 11-15 lat!");
            else if (age1 <= 18) System.out.println("masz 16-18 lat!");
            else System.out.println("masz więcej niż 18 lat!");
        }

    }

    public static void printStringLength (String string) {

        if (string != null) {
            int stringLen = string.length();
            System.out.println("string Length: " + stringLen);
        } else {
            System.out.println("null is not allowed");
        }
    }

    public static void testStringLength (String string) {

        if (string != null && string.length() < 10){

            System.out.println("Quite short string");

        }

    }


}

