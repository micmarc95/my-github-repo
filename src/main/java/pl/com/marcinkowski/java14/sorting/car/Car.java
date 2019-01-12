package pl.com.marcinkowski.java14.sorting.car;

import java.time.LocalDate;

public class Car implements Comparable <Car>{

    private String brand;
    private String model;
    private String colour;
    private LocalDate productionYear;
    private int power;

    public Car(String brand, String model, String colour, LocalDate productionYear, int power) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.productionYear = productionYear;
        this.power = power;

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        //return o.productionYear.getYear()- productionYear.getYear();   - to tylko po roku nam posortuje
        return productionYear.compareTo(o.productionYear);  // to posortuje po roku, później miesiącu itd.
    }

    public void maybeCompare (Comparable<Car> carComparable){
        carComparable.compareTo(this);
    }

}
