package pl.com.marcinkowski.java14.null_avoid.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);
        House withBathroomWithSink = new House(withSink);
        House withBathroomWithoutSink = new House(withoutSink);
        House withoutBathrom = new House(null);

        /////////////////////////////////////////////////////////////////////////////////////////

        // never ever!!
        Optional<String> maybeString = Optional.empty();
        Optional<String> stringForSure = Optional.of("Michał");
        if (stringForSure.isPresent()) {
            System.out.println(stringForSure.get());
        }
        String maybeNull = null;
        Optional<String> absentString = Optional.ofNullable(maybeNull);
        absentString.ifPresent(x -> System.out.println(x));    // zmienione 2 razy alt + enter, żeby była lambda

        ///////////////////////////////////////////////////////////////////////////////////////

        printLabelWithLambda(withBathroomWithoutSink);
        printLabelWithLambda(withBathroomWithSink);

    }

    private static void printLabelWithLambdaMap (House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("Label: " + s));

    }


    private  static void printLabelWithLambda(House house){

        Optional.ofNullable(house)
                .ifPresent(house1 -> house1.getBathroom()
                        .ifPresent(bathroom -> bathroom.getSink()
                                .ifPresent(sink -> System.out.println(sink.getLabel()))));
    }

    private static void printLabelSlowMode (House house){
        String label = "empty";
        Optional<House> maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()){
            Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();

            if (maybeBathroom.isPresent()){
                Optional<Sink> maybeSink = maybeBathroom.get().getSink();

                if (maybeSink.isPresent()){
                    label = maybeSink.get().getLabel();
                }
            }
        }
    }

    String name = "";
    //String? nameWithNull = null;     - w inych językach, co pozwala żeby był null;
}
