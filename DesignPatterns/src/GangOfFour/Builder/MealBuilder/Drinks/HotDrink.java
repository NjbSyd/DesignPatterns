package GangOfFour.Builder.MealBuilder.Drinks;

import GangOfFour.Builder.MealBuilder.MealBuilder.Item;
import GangOfFour.Builder.MealBuilder.Packing.Bottle;
import GangOfFour.Builder.MealBuilder.Packing.Packing;

public abstract class HotDrink implements Item {

    @Override
    public abstract String name();

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
