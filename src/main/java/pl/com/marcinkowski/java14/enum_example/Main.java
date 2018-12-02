package pl.com.marcinkowski.java14.enum_example;

public class Main {
    public static void main(String[] args) {
        Seasons maybeSummer = Seasons.SUMMER;
        System.out.println(maybeSummer.name());
        maybeSummer = Seasons.WINTER;
        System.out.println(maybeSummer.name());
        System.out.println(maybeSummer.ordinal());

        Week maybeMonday = Week.MONDAY;
        Months maybeAugust = Months.AUGUST;



    }
}
