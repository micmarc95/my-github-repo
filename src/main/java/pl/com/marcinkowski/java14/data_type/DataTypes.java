package pl.com.marcinkowski.java14.data_type;

public class DataTypes {
    public static void main(String[] args) {

        int bb =100;
        byte d = 5 + 6;
        Byte dByte = 0; // 1 bajt

        System.out.println("d: " + d) ;
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Min byte: " + Byte.MIN_VALUE);

        short c = 0;
        short cShort = 0; // 2 bajty

        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Min short: " + Short.MIN_VALUE);


        int a = 5 + 8;  // 4 bajty
        Integer aInteger = 5 + 8;

        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Min int: " + Integer.MIN_VALUE);

        long b = 5 + 8; // 8 bajtów
        long bLong = 5L + 8L;

        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Min long: " + Long.MIN_VALUE);

        float f = 3.11f; // 4 bajty

        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Min float: " + Float.MIN_VALUE);

        double db = 3.11; // 8 bajtów
        double dDouble = 3;

        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Min double: " + Double.MIN_VALUE);

        boolean trueOrFalse = false;
        trueOrFalse = true;

        Boolean aBoolean = true;
        Boolean bBoolean = false;
        Boolean cBoolean = null;

        char littelChar = '#';
        Character lCharacter = 'd';

        System.out.println("Max char: " + (int)Character.MAX_VALUE);
        System.out.println("Min char: " + (int)Character.MIN_VALUE);


    }
}
