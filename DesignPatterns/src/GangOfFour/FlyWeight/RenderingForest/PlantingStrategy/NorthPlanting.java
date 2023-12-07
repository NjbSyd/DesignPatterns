package GangOfFour.FlyWeight.RenderingForest.PlantingStrategy;

import GangOfFour.FlyWeight.RenderingForest.Forest.Forest;

import java.awt.*;

public class NorthPlanting implements Planting {
    private static NorthPlanting instance;
    private Forest forest;
    private int sizeFactor = 1;

    private NorthPlanting() {
        forest = Forest.getInstance();
    }

    public static NorthPlanting getInstance() {
        if (instance == null) {
            instance = new NorthPlanting();
        }
        return instance;
    }

    @Override
    public void plant(int xPos, int yPos, String name, Color color, String otherData) {
        forest.plantTree(xPos, yPos,sizeFactor, name, color, otherData);
    }
}
