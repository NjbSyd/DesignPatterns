package Decorator;
public class Rectangle implements Shape {
int rectanglePrice= 20;
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
        System.out.println("Price: " + rectanglePrice);
    }
@Override
public int getPrice(){
        return rectanglePrice;
    }
}