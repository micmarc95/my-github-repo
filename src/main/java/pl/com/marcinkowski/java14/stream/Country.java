package pl.com.marcinkowski.java14.stream;

public class Country {

    private long numberOFPeople;
    private String name;
    private double area;
    private double averageSalary;

    public Country(long numberOFPeople, String name, double area, double averageSalary) {
        this.numberOFPeople = numberOFPeople;
        this.name = name;
        this.area = area;
        this.averageSalary = averageSalary;
    }

    public long getNumberOFPeople() {
        return numberOFPeople;
    }

    public void setNumberOFPeople(long numberOFPeople) {
        this.numberOFPeople = numberOFPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(double averageSalary) {
        this.averageSalary = averageSalary;
    }

    @Override
    public String toString() {
        return "Country{" +
                "numberOFPeople=" + numberOFPeople +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", averageSalary=" + averageSalary +
                '}';
    }
}
