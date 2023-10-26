package GangOfFour.AbstractFactory.ShapesExample;

import GangOfFour.AbstractFactory.ShapesExample.Factories.AbstractFactory;
import GangOfFour.AbstractFactory.ShapesExample.Factories.FactoryProducer;
import GangOfFour.AbstractFactory.ShapesExample.Factories.TYPES;
import GangOfFour.AbstractFactory.ShapesExample.Shapes.Shape;

import javax.swing.*;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //Normal Shape Factory
        AbstractFactory normalShapeFactory = FactoryProducer.getFactory(TYPES.NORMAL);
        assert normalShapeFactory!=null;
        Shape rectangle = normalShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = normalShapeFactory.getShape("SQUARE");
        square.draw();
        Shape triangle = normalShapeFactory.getShape("TRIANGLE");
        triangle.draw();

        //Rounded Shape Factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(TYPES.ROUNDED);
        assert roundedShapeFactory != null;
        Shape rRectangle = roundedShapeFactory.getShape("RECTANGLE");
        rRectangle.draw();
        Shape rSquare = roundedShapeFactory.getShape("SQUARE");
        rSquare.draw();
        Shape rTriangle = roundedShapeFactory.getShape("TRIANGLE");
        rTriangle.draw();

        // Double Bordered Shape Factory
        AbstractFactory doubleBorderFactory=FactoryProducer.getFactory(TYPES.DOUBLED);
        assert doubleBorderFactory!=null;
        Shape dRectangle=doubleBorderFactory.getShape("RECTANGLE");
        dRectangle.draw();
        Shape dSquare=doubleBorderFactory.getShape("SQUARE");
        dSquare.draw();
        Shape dTriangle=doubleBorderFactory.getShape("TRIANGLE");
        dTriangle.draw();
    }
}
