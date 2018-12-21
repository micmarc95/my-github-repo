package pl.com.marcinkowski.java14.stream.homework_mariusz;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // składniki
        Ingredient nuts = new Ingredient("nuts");
        Ingredient carrots = new Ingredient("carrot");
        Ingredient salt = new Ingredient("salt");
        Ingredient cocoNut = new Ingredient("coconut");
        Ingredient soya = new Ingredient("soya");
        Ingredient water = new Ingredient("water");
        Ingredient watermelon= new Ingredient("watermelon");
        // napoje
        Drink first = new Drink("first", Arrays.asList(water,soya,watermelon));
        Drink second = new Drink("second", Arrays.asList(water,cocoNut));
        Drink third = new Drink("third", Arrays.asList(nuts, water, carrots));
        Drink fourth = new Drink("fourth", Arrays.asList(water, watermelon, nuts));
        // menu
        Menu menu = new Menu();
        menu.addDrink(first, true);
        menu.addDrink(second, false);
        menu.addDrink(third, true);
        menu.addDrink(fourth, true);
        // logika
        System.out.println(getNutsFreeDrinks(menu));
        System.out.println(getFilteredDrinks(menu,nuts));
        System.out.println(getFilteredDrinksBetterVersion(menu,nuts));
    }

    private static List<Drink> getNutsFreeDrinks (Menu menu){
        Ingredient nuts = new Ingredient("nuts");
        List<Drink> result = new ArrayList<>();

        List<Drink> withoutNuts = menu.getDrinks()
                .keySet()
                .stream()
                .filter(drink -> !drink.getIngredientList().contains(nuts))
                .collect(Collectors.toList());

        Map<Drink, Boolean> drinksOverSpecialOffert = menu.getDrinks();
        drinksOverSpecialOffert.forEach((drink, aBoolean) -> {
            if (aBoolean && withoutNuts.contains(drink))
                result.add(drink);
        }

        );
        return result;
    }

    private static List<Drink> getFilteredDrinks (Menu menu, Ingredient unwanted){

        return menu.getDrinks()
                .entrySet()
                .stream()
                .filter(drinkBooleanEntry -> drinkBooleanEntry.getValue())
                .map(drinkBooleanEntry -> drinkBooleanEntry.getKey())
                .filter(drink -> !drink.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());
    }

    private static List<Drink> getFilteredDrinksBetterVersion (Menu menu, Ingredient unwanted){ ;

        return menu.getDrinks()
                .entrySet()
                .stream()
                .filter(Main::isSpecialOffer)
                .map(Main::changeIntoDrink)
                .filter(drink -> getOnlyDrinksWithoutUnwantedIngredient(drink,unwanted))
                .collect(Collectors.toList());
    }

    private static boolean isSpecialOffer(Map.Entry<Drink, Boolean> entry){
        return entry.getValue();
    }

    private static boolean getOnlyDrinksWithoutUnwantedIngredient (Drink drink, Ingredient unwanted){
        return !drink.getIngredientList().contains(unwanted);
    }

    private static Drink changeIntoDrink (Map.Entry<Drink, Boolean> entry){
        return entry.getKey();
    }


}
