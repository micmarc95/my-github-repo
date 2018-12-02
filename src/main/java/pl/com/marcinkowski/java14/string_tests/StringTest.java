package pl.com.marcinkowski.java14.string_tests;

public class StringTest {

    public static void main(String[] args) {

        String name = "Mariusz"; // to jest skrót na  String secondName = new String ("Jakub");
        String anotherMariusz = "Mariusz";
        String theSame = name;
        String secondName = new String ("Jakub"); // tu się tworzy nowy obiekt, a wcześniej tylko referencje do przetrzymywanego literału "Mariusz"
        String surname = "Marcinkowski";

        System.out.println("My name: " + name);
        System.out.println("My surname: " + surname);

        System.out.println("Name, number of letter: " + name.length());
        System.out.println("Surname, number of letter: " + surname.length());

        System.out.println("Char at index 6: " + name.charAt(6));
      //  System.out.println("Char at index 7: " + name.charAt(7));    - nie można, wyjebie błąd i przestanie dalej pracować bo nie ma takiego indeksu
        System.out.println("Char at index 1: " + name.charAt(1));
      //  System.out.println("My new surname: " + surname.substring(2));
        System.out.println("My new surname: " + surname.substring(0,10));   //    ta metoda wypluwa znaki w formie <x,y), tj. włącznie zaczyna i wyłącznie kończy

        System.out.println("My surname: " + surname);
        System.out.println("Replace: " + theSame.replace("a","o"));
        System.out.println("My name: " + name);
        System.out.println("My same name: " + theSame);       // wniosek - String nigdy sie nie zmienia !!

        String hello = "hello";
        System.out.println(hello + " java");
        System.out.println(hello.concat (" java"));
        hello = hello + " java";
        System.out.println(hello);

        System.out.println("5 + 6: " + 5 + 6);              // 5 + 6: 56
        System.out.println(5 + 6 + ": to jest 5 + 6");      // 11: to jest 5 +6
        System.out.println(5 + 6);                          // 11
        System.out.println("5 + 6: " + (5 + 6));            // 5 + 6: 11
        System.out.println("J" + 7);                        // J7
        System.out.println('J' + 7);                        // 81
        System.out.println('J');                            // J
        System.out.println((int)'J');                       // 74



    }
}
