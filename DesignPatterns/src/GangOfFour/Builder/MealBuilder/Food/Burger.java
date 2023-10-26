package GangOfFour.Builder.MealBuilder.Food;

import GangOfFour.Builder.MealBuilder.MealBuilder.Item;
import GangOfFour.Builder.MealBuilder.Packing.Packing;
import GangOfFour.Builder.MealBuilder.Packing.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
