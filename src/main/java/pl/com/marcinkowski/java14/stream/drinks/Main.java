package pl.com.marcinkowski.java14.stream.drinks;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink("CocaCola",0.5,true,false);
        Drink drink2 = new Drink("Fanta",1.0,true,false);
        Drink drink3 = new Drink("Ice Tea",0.5,false,true);
        Drink drink4 = new Drink("Water",1.0,false,true);
        Drink drink5 = new Drink("Beer",0.33,true,true);

        List<Drink> drinks = Arrays.asList(drink1,drink2,drink3,drink4,drink5);

        List <Drink> result = FindPromotionNoPeanut(drinks,drink -> !drink.isContainsPeanut() && drink.isOnPromotion());

        result.forEach(drink -> System.out.println(drink));

        //drinks.forEach(drink -> drink.setOnPromotion(false));   - szybka zmiana dla wszystkich
        

    }

    private static List<Drink> FindPromotionNoPeanut(List <Drink> drinks, Predicate <Drink> predicate){
        return drinks.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
