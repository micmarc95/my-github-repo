package pl.com.marcinkowski.java14.stream.drinks;

public class Drink {
    private String brand;
    private double volume;
    private boolean containsPeanut;
    private boolean onPromotion;

    public Drink(String brand, double volume, boolean containsPeanut, boolean onPromotion) {
        this.brand = brand;
        this.volume = volume;
        this.containsPeanut = containsPeanut;
        this.onPromotion = onPromotion;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isContainsPeanut() {
        return containsPeanut;
    }

    public void setContainsPeanut(boolean containsPeanut) {
        this.containsPeanut = containsPeanut;
    }

    public boolean isOnPromotion() {
        return onPromotion;
    }

    public void setOnPromotion(boolean onPromotion) {
        this.onPromotion = onPromotion;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", containsPeanut=" + containsPeanut +
                ", onPromotion=" + onPromotion +
                '}';
    }
}
