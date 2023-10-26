package GangOfFour.AbstractFactory.ShapesExample;

import GangOfFour.AbstractFactory.ShapesExample.Factories.*;
import GangOfFour.AbstractFactory.ShapesExample.Shapes.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //Normal Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        //Rounded Shape Factory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();

    }
}
