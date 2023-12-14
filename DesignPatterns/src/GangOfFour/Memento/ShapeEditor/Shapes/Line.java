package GangOfFour.Memento.ShapeEditor.Shapes;

import java.awt.*;

public class Line extends BaseShape {
    private final int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public int getWidth() {
        return 1;
    }

    @Override
    public int getHeight() {
        return (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(x1, y1, x2, y2);
    }
}
