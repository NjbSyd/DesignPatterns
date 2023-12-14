package GangOfFour.Memento.ShapeEditor;

import GangOfFour.Memento.ShapeEditor.Editor.Editor;
import GangOfFour.Memento.ShapeEditor.Shapes.Rectangle;
import GangOfFour.Memento.ShapeEditor.Shapes.*;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN), new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN), new Dot(360, 240, Color.GREEN)
                ),
                new CompoundShape(
                        new Line(400, 100, 400, 200, Color.BLACK),
                        new Line(400, 200, 450, 100, Color.BLACK),
                        new Line(450, 100, 450, 200, Color.BLACK),

                        new Dot(470, 210, Color.BLACK),
                        new Line(470, 210, 470, 150, Color.BLACK),
                        new Circle(470, 150, 20, Color.BLACK),

                        new Line(490, 200, 520, 200, Color.BLACK),
                        new Line(520, 200, 520, 100, Color.BLACK),
                        new Line(520, 100, 490, 100, Color.BLACK),
                        new Line(490, 100, 490, 200, Color.BLACK)
                )

        );
    }
}