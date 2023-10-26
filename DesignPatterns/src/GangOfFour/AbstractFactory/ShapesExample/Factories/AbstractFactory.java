package GangOfFour.AbstractFactory.ShapesExample.Factories;

import GangOfFour.AbstractFactory.ShapesExample.Shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
