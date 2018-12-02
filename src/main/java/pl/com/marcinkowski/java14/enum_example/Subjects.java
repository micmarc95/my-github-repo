package pl.com.marcinkowski.java14.enum_example;

public enum Subjects {
    MATHS(240),
    BIOLOGY(120),
    GEOGRAPHY(60),
    ARTS(90);

    private int numberOfHours;

    private Subjects (int numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }
}
