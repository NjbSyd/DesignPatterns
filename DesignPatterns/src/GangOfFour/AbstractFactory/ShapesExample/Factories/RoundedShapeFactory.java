package GangOfFour.AbstractFactory.ShapesExample.Factories;

import GangOfFour.AbstractFactory.ShapesExample.Shapes.RoundedRectangle;
import GangOfFour.AbstractFactory.ShapesExample.Shapes.RoundedSquare;
import GangOfFour.AbstractFactory.ShapesExample.Shapes.RoundedTriangle;
import GangOfFour.AbstractFactory.ShapesExample.Shapes.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new RoundedTriangle();
        }
        return null;
    }
}
