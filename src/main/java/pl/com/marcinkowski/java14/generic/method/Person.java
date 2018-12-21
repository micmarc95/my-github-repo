package pl.com.marcinkowski.java14.generic.method;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Double income;

    public Person(String name, String surname, Integer age, Double income) {

        validate(name,surname,age);
        validate(name,age,age);

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.income = income;
    }

    private  <T,U> void validate (T name, T surname, U age){
        if (name == null || surname == null || age == null){
            throw new IllegalArgumentException("Can't be touched can't be null");
        }
    }
}
