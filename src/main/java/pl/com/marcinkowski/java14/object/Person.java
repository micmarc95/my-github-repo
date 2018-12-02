package pl.com.marcinkowski.java14.object;

public class Person {
    public static int numberOfPersons = 0;
    private String name;
    private String surname;
    private int age;

    public Person (){
    numberOfPersons++;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPersons++;

    }

    public Person(String name, int age){
        this.name = name;
        this.surname = "Kowalski";
        this.age = age;
        numberOfPersons++;

    }


    public void introduce(){
        System.out.println("Hi, my name is " + name + ", my surname is " + surname + ", I'm " + age + " years old!");
    }

    public static void somethingAboutPersons(){
        System.out.println("All people like math!!!");
    }
    public static void introduceFromStatic(){
       // System.out.println("Hi, my name is " + name + ", my surname is " + surname + ", I'm " + age + " years old!");         nie zadziała
    }
    public static void printNumberOfPersons(){
        System.out.println("Number of persons so far: " + numberOfPersons);
    }

}
