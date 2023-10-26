package GangOfFour.Builder.MealBuilder.MealBuilder;

import GangOfFour.Builder.MealBuilder.Packing.Packing;

public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
