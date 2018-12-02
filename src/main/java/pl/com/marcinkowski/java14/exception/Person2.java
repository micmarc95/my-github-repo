package pl.com.marcinkowski.java14.exception;

public class Person2 {

    private String name;
    private String surname;
    private int age;

    public Person2(String name, String surname, int age) throws IllegalArgumentException{
        if (name == null || "".equals(name)){     //bo gdyby były warunki w odwrotnej kolejnosci to mogłoby wywalić nullpointer exception przy zapisie: name.equals("")
            throw new IllegalArgumentException("Imię nie może być puste: " + name);
        }
        if (surname == null || "".equals(surname)){
            throw new IllegalArgumentException("Nazwisko nie może być puste: " + surname);
        }
        if (age > 121 || age <= 0){
            throw new IllegalArgumentException("Wiek nie może być mniejszy równy zero ani większy niż 120: " + age);
        }

        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
