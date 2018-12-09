package pl.com.marcinkowski.java14.anonymous_classes.lambda;

public class Main {

    public static void main(String[] args) {

        Flyable bird = new Bird();

        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Plane can fly");
            }
        };

        Flyable kula = () -> System.out.println( "Kula daje fula with lambda");

        Moveable moveable = new Moveable() {
            @Override
            public void run() {
                System.out.println("runs fast");            }
        };

        Moveable biegacz = () -> System.out.println("runs fust");

        Swimable swimable = new Swimable() {
            @Override
            public void swim(long distance, double speed) {
                System.out.println("My distance is: " + distance + ", My speed is: " + speed);
            }
        };

        Swimable swimable1 = (distance, speed) -> System.out.println("My distance is: " + distance + ", My speed is: " + speed);

        swimable1.swim(10,10);

        FormulaConverter formulaConverter = new FormulaConverter() {
            @Override
            public double fromCelsiusToFahrenheit(double celsius) {
                return celsius*(9.0/5.0) + 32;
            }

            @Override
            public double fromFahrenheitToCelsius(double fahrenheit) {
                return (fahrenheit - 32)*(5.0/9.0);
            }
        };

        FormulaConverter converter = celsius -> celsius*(9.0/5.0) + 32;

        System.out.println(converter.fromCelsiusToFahrenheit(35));
        System.out.println(formulaConverter.fromFahrenheitToCelsius(95));

        MyLambda myLambda = n -> {
            String text = "";
            for(int i=0; i < n ; i++)
            {
                text += "Java";
            }
            return text;
        };
        System.out.println(myLambda.test(5));

        FlyableCleaner flyableCleaner = new FlyableCleaner();

        flyableCleaner.clean(() -> System.out.println("Cleaning flyable"));

        Swimable swimable2 = (distance, speed) -> {

            System.out.println("time = " + distance/speed);};

        swimable2.swim(25,25);


    }
}
