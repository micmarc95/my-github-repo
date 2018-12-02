package pl.com.marcinkowski.java14.inner_class;

public class Vehicle {

    public String vehicleName;
    private Wheel wheels;

    public Vehicle(String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName +
                "wheels= " + wheels + '\'' +
                '}';
    }

    public static class Wheel {
        private int sizeInInches;

        public Wheel(int sizeInInches) {
            this.sizeInInches = sizeInInches;
        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "sizeInInches=" + sizeInInches +
                    '}';
        }
    }



}
