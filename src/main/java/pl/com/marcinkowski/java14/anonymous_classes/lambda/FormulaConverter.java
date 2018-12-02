package pl.com.marcinkowski.java14.anonymous_classes.lambda;

public interface FormulaConverter {

    double fromCelsiusToFahrenheit(double celsius);
    default double fromFahrenheitToCelsius(double fahrenheit){
        return 0;
    }

}
