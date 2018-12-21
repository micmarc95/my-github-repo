package pl.com.marcinkowski.java14.null_avoid.football_with_optional;

public class Chair {
    private Numberr numberr;

    public Chair(Numberr numberr) {
        this.numberr = validate(numberr);
    }

    public Numberr getNumberr() {
        return numberr;
    }

    public void setNumberr(Numberr numberr) {
        this.numberr = validate(numberr);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "numberr=" + numberr +
                '}';
    }

    private Numberr validate (Numberr numberr){
        if (numberr == null){
            throw new IllegalArgumentException("Number cannot be null");
        }
        return numberr;
    }
}
