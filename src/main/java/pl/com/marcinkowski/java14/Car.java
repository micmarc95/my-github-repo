package pl.com.marcinkowski.java14;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfProduction;

    //constructor
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public static void main(String[] args) {

        //Furka to jest referencja
        Car Furka = new Car ("Mercedes","C63","red",2016);
        System.out.println("Moja furka" + " marki " + Furka.getBrand() + ", model " + Furka.model +
                " koloru " + Furka.color + " z roku " + Furka.getYearOfProduction());

        //Furka2 to jest referencja
        Car Furka2 = new Car("Porsche","Carrera","white",2008);
        System.out.println(Furka2);

        Car autoMarcina = Furka2;
        System.out.println("Furka2 = " + Furka2.toString());   // toString zawsze sie wywołuje z automatu sam - tu jest niepotrzebny skoro na górze zdefiniowalismy zmodyfikowany toString
        System.out.println("autoMarcina = " + autoMarcina);

        autoMarcina.setColor("szary");
        System.out.println("autoMarcina = " + autoMarcina);

        // JEDEN SAMOCHÓD DWÓCH WŁASCICIELI - jeden przemaluje to dla drugiego tez sie zmienia kolor
        System.out.println("Furka2 = " + Furka2);

        Car autoMarka = null;
        System.out.println("autoMarka: " + autoMarka);

        System.out.println("Kolor auta Marcina: " + autoMarcina.getColor());
    }

}
