package GangOfFour.Builder.MealBuilder.Drinks;

public class Tea extends HotDrink {

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public float price() {
        return 20.0f;
    }
}

