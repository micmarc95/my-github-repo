package pl.com.marcinkowski.java14.exception;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) throws WrongParameter{
        if (name == null || "".equals(name)){     //bo gdyby były warunki w odwrotnej kolejnosci to mogłoby wywalić nullpointer exc przy zapisie: name.equals("")
            throw new WrongParameter("Imię nie może być puste: " + name);
        }
        if (surname == null || "".equals(surname)){
            throw new WrongParameter("Nazwisko nie może być puste: " + surname);
        }
        if (age > 121 || age <= 0){
            throw new WrongParameter("Wiek nie może być mniejszy równy zero ani większy niż 120: " + age);
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
