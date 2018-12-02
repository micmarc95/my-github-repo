package pl.com.marcinkowski.java14.enum_example;

public enum Months {
    JANUARY(31),
    FEBRUARY(28){
        @Override
        public int getNumberOfDaysInMonth() {
            return super.getNumberOfDaysInMonth();
        }
    },
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    NOVEMBER(31),
    OCTOBER(30),
    DECEMBER(31);

    private int numberOfDaysInMonth;

    private Months (int numberOfDaysInMonth){

        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }
    public int getNumberOfDaysInMonth(){
        return numberOfDaysInMonth;
    }

}
