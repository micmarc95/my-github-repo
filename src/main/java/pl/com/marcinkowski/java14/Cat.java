package pl.com.marcinkowski.java14;

public class Cat {

    private String name;

    // BEZ KONSTRUKTORA = USTAWIONY JEST KONSTRUKTOR DOMYSLNY, ale jesli juz stworzysz jakikolwiek i nie podasz pozniej agumentu to przestanie kompilowac, chyba ze bedzie to pusty konstruktor


    public Cat() {
        this.name = "Leon";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Andrzej");
        System.out.println(cat);
    }
}
