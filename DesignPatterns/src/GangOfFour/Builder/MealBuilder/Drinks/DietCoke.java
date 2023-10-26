package GangOfFour.Builder.MealBuilder.Drinks;

// Add Diet versions of Cold Drinks
public class DietCoke extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Diet Coke";
    }
}
