package pl.com.marcinkowski.java14.null_avoid.football;

public class Chair {
    private Numberr numberr;

    public Chair(Numberr numberr) {
        this.numberr = numberr;
    }

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = numberr;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "numberr=" + numberr +
                '}';
    }
}
