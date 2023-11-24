//package GangOfFour.Builder.MealBuilder;
//
//import GangOfFour.Builder.MealBuilder.Drinks.*;
//import GangOfFour.Builder.MealBuilder.MealBuilder.Item;
//import GangOfFour.Builder.MealBuilder.MealBuilder.Meal;
//import GangOfFour.Builder.MealBuilder.MealBuilder.MealBuilder;
//
//import java.util.Scanner;
//
//public class BuilderPatternDemo {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to the Meal Builder!");
//        System.out.println("Choose your meal type (1 for Vegetarian, 2 for Non-Vegetarian):");
//        int mealType = scanner.nextInt();
//
//        MealBuilder mealBuilder = new MealBuilder();
//        Meal customMeal;
//
//        if (mealType == 1) {
//            customMeal = mealBuilder.prepareVegMeal();
//        } else if (mealType == 2) {
//            customMeal = mealBuilder.prepareNonVegMeal();
//        } else {
//            System.out.println("Invalid choice. Exiting...");
//            return;
//        }
//
//        System.out.println("Choose your drink (1 for Coke, 2 for Pepsi, 3 for Diet Coke, 4 for Diet Pepsi, 5 for Tea):");
//        int drinkChoice = scanner.nextInt();
//
//        Item chosenDrink;
//        switch (drinkChoice) {
//            case 1:
//                chosenDrink = new Coke();
//                break;
//            case 2:
//                chosenDrink = new Pepsi();
//                break;
//            case 3:
//                chosenDrink = new DietCoke();
//                break;
//            case 4:
//                chosenDrink = new DietPepsi();
//                break;
//            case 5:
//                HotDrink tea = new Tea();
//                System.out.println("Choose your tea decoration (1 for Cream, 2 for Sugar, 3 for Cream and Sugar):");
//                int decorationChoice = scanner.nextInt();
//                break;
//            default:
//                System.out.println("Invalid choice. Exiting...");
//                return;
//        }
//
//        customMeal.addItem(chosenDrink);
//
//        System.out.println("Your custom meal:");
//        customMeal.showItems();
//        System.out.println("Total Cost: " + customMeal.getCost());
//
//        if (chosenDrink instanceof Decorator) {
//            ((Decorator) chosenDrink).showDecorations();
//        }
//    }
//}
