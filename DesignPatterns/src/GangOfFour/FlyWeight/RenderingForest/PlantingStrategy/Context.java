package GangOfFour.FlyWeight.RenderingForest.PlantingStrategy;

import GangOfFour.FlyWeight.RenderingForest.Forest.Forest;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Context {
    private Planting planting;
    private int canvas;
    private Forest forest;

    public Context(Planting planting, int canvas) {
        this.planting = planting;
        this.canvas = canvas;
        this.forest = Forest.getInstance();
    }

    public void plant(int x, int y, String name, Color color, String otherTreeData) {
        decideStrategy(x, y);
        planting.plant(x, y, name, color, otherTreeData);
    }

    public void decideStrategy(int xPos, int yPos) {
        if (yPos < canvas / 3)
            planting = NorthPlanting.getInstance();
        else if (yPos > canvas / 3 && yPos < canvas * 2 / 3)
            planting = MiddlePlanting.getInstance();
        else
            planting = SouthPlanting.getInstance();
    }

    public void setForestUI() {
        forest.setResizable(false);
        forest.setSize(canvas, canvas);
        forest.setDefaultCloseOperation(EXIT_ON_CLOSE);
        forest.setVisible(true);
    }
}
