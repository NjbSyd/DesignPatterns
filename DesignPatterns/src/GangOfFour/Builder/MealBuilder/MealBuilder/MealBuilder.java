package GangOfFour.Builder.MealBuilder.MealBuilder;

import GangOfFour.Builder.MealBuilder.Drinks.Coke;
import GangOfFour.Builder.MealBuilder.Drinks.Pepsi;
import GangOfFour.Builder.MealBuilder.Food.ChickenBurger;
import GangOfFour.Builder.MealBuilder.Food.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
