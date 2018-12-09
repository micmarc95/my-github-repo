package pl.com.marcinkowski.java14.null_avoid;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathrom = new House(null);

        displaySinkLabelWithNullCheck(withBathroomWithSink);
    }

    private static void displaySinkLabelWithMap (House house){
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("Label: " + s));

    }

    private static void displaySinkLabelVeryVeryNaive (House house){
        String label = house.getBathroom().getSink().getLabel();
        System.out.println(label);
    }

    private static void displaySinkLabelWithNullCheck(House house){
        String label = "default";

        if (house != null && house.getBathroom() != null && house.getBathroom().getSink() != null) {
            label = house.getBathroom().getSink().getLabel();
        }
        System.out.println(label);
    }

    private static void displaySinkLabel(House house){
        String label = "default";

        if (house != null && house.getBathroom() != null && house.getBathroom().getSink() != null) {
            label = house.getBathroom().getSink().getLabel();
        }
        System.out.println(label);
    }



    String name = "";
    //String? nameWithNull = null;     - w inych językach, co pozwala żeby był null;
}
