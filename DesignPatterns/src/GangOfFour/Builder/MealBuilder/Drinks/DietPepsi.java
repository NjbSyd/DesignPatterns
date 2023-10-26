package GangOfFour.Builder.MealBuilder.Drinks;

public class DietPepsi extends ColdDrink {

    @Override
    public float price() {
        return 40.0f;
    }

    @Override
    public String name() {
        return "Diet Pepsi";
    }
}
