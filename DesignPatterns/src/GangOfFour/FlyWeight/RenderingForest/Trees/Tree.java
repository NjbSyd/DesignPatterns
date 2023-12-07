package GangOfFour.FlyWeight.RenderingForest.Trees;

import java.awt.*;

public class Tree {
    private int x;
    private int y;
    private int size;
    private IMyTreeType type;

    public Tree(int x, int y, int size, IMyTreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.size = size;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.scale(size, size);
        type.draw(g2d, x/size, y/size);
        g2d.dispose();
    }
}
