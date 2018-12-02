package pl.com.marcinkowski.java14.string_tests;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder("Mariusz");  // w sytuacji gdy chcemy podnieść performance

        String ala = "ala" + " ma" + " kota";

        StringBuilder name1 = new StringBuilder();
        name1.append("ala");
        name1.append(" ma");
        name1.append(" kota");
        //
        name1.append(" ala")
                .append(" ma")
                .append(" kota");

        String name1String = name1.toString();

        System.out.println(name1);

        name1.replace(7,11,"psa");
        System.out.println(name1);

    }
}
