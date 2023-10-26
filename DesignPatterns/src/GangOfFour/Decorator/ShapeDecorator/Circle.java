package GangOfFour.Decorator.ShapeDecorator;

public class Circle implements Shape {
    int circlePrice = 10;

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
        System.out.println("Price: " + circlePrice);
    }

    @Override
    public int getPrice() {
        return circlePrice;
    }
}
