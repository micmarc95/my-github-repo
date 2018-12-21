package pl.com.marcinkowski.java14.stream.homework_mariusz;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    Map<Drink, Boolean> drinks = new LinkedHashMap<>();

    public void addDrink (Drink drink, Boolean specialOfert) {

        drinks.put(drink, specialOfert);
    }

    public Map<Drink, Boolean> getDrinks() {
        return drinks;
    }
}
