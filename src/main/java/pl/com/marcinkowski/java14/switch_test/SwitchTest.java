package pl.com.marcinkowski.java14.switch_test;

import pl.com.marcinkowski.java14.enum_example.Months;

public class SwitchTest {
    public static void main(String[] args) {
        checkMark(5);
        checkMarkSwitch(3);
        final int a= 5; // tutaj wartość jest finalem, w typach nieprostych referencja jest final
        changeInt(a);
        System.out.println("a after method: " + a);
        //a = 6;
        final  StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append(2);
        //builder = new StringBuilder(); // nie przestawisz referencji bo w przypadku obiektów to właśnie ona jest final

        DaysOfMonth(Months.AUGUST);

        stringSwitch("Radek");
    }

    public static void checkMark(int mark){
        if (mark ==6 || mark == 5)
            System.out.println("Bardzo dobrze");
        else if(mark ==4 || mark ==3)
            System.out.println("Nieźle");
        else if(mark ==2)
            System.out.println("Trochę lipa");
        else
            System.out.println("LIPA");
    }

    public static void checkMarkSwitch (final int mark){

        switch (mark){
            case 6:
            case 5:
                System.out.println("Bardzo dobrze");
                break;
            case 4:
            case 3:
                System.out.println("Nieźle");
                break;
            case 2:
                System.out.println("Trochę lipa");
                break;
            default:
                System.out.println("Lipa");
        }
    }
    public static void changeInt (int a){
        a = 6;
        System.out.println("a inside method: " + a);
    }

    public static void DaysOfMonth (Months month){
        switch (month) {
            case JANUARY:
                System.out.println(month.getNumberOfDaysInMonth()); // tutaj bez potrzeby funkcja - przy jej wykorzystaniu niepotrzebny jest stwitch. Powinno być SOUT ("31") itd. ale dla wygody zrobiono tak
                break;
            case FEBRUARY:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case MARCH:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case APRIL:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case MAY:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case JUNE:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case JULY:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case AUGUST:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case SEPTEMBER:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case OCTOBER:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case NOVEMBER:
                System.out.println(month.getNumberOfDaysInMonth());
                break;
            case DECEMBER:
                System.out.println(month.getNumberOfDaysInMonth());
        }
    }
    public static void stringSwitch(String text){
        switch (text){
            case "Radek":
                System.out.println("Wybrane imię to Radek");
                break;
            case "Michał":
                System.out.println("Wybrane imię to Michał");
                break;
            default:
                System.out.println("Wpisz imię Radek lub Michał");

        }
    }
}
