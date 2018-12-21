package pl.com.marcinkowski.java14.stream.homework_mariusz;

import java.util.ArrayList;
import java.util.List;

public class Drink {

    private List<Ingredient> ingredientList = new ArrayList<>();
    private String drinkName = "";

    public Drink (String drinkName, List<Ingredient> ingredients){
        this.drinkName = drinkName;
        this.ingredientList.addAll(ingredients);

    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredientList=" + ingredientList +
                ", drinkName='" + drinkName + '\'' +
                '}';
    }
}
