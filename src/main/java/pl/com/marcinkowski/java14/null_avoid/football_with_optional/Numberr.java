package pl.com.marcinkowski.java14.null_avoid.football_with_optional;

public class Numberr {

    private int number;

    public Numberr(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Numberr{" +
                "number=" + number +
                '}';
    }
}
