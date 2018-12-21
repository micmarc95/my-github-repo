package pl.com.marcinkowski.java14.anonymous_classes.lambda.exercise;


// chcemy lambdy
@FunctionalInterface
public interface Exercise {

    void swim();    // lambda zawsze bedzie dzialac na tej metodzie ktora nie ma ciala, dzieki zapisowi FunctionalInterface wiemy ze mozemy miec tylko jedna taka metode w interfejsie zeby lambdy dzialaly

    default void jogging() {}   // ta metode zawsze bedzie mozna nadpisac
}
