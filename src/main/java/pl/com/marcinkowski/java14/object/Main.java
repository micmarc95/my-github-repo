package pl.com.marcinkowski.java14.object;

public class Main {
    public static void main(String[] args) {
        Person me = new Person();
        Person fullMe = new Person("Michał", "Marcinkowski", 23);
        Person partMe = new Person("Michał",23);
        Person nullPerson = null;
        me.introduce();
        fullMe.introduce();
        partMe.introduce();
        //Person.introduce(); nie zadziałą bo nie ma static i nie może odnosić się do klasy, tylko do obiektów
        me.somethingAboutPersons();
        Person.somethingAboutPersons(); // tu zadziała bo ma static i nawet jak nie ma obiektów, to odnosi się do klasy
        //nullPerson.introduce(); // NullPointerException;
        nullPerson.somethingAboutPersons();
        Person.printNumberOfPersons();
    }
}
