package pl.com.marcinkowski.java14.null_avoid.Optional;

import java.util.Optional;

public class House {
    private Bathroom bathroom;

    public House(Bathroom bathroom){
        this.bathroom = bathroom;
    }

    @Override
    public String toString() {
        return "House{" +
                "bathroom=" + bathroom +
                '}';
    }

    public Optional<Bathroom> getBathroom() {
        return Optional.ofNullable(bathroom);
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }
}
