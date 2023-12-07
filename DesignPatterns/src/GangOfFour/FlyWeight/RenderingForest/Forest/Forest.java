package GangOfFour.FlyWeight.RenderingForest.Forest;

import GangOfFour.FlyWeight.RenderingForest.Trees.IMyTreeType;
import GangOfFour.FlyWeight.RenderingForest.Trees.Tree;
import GangOfFour.FlyWeight.RenderingForest.Trees.TreeFactory;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();
    private static Forest instance;

    public static Forest getInstance() {
        if (instance == null) {
            instance = new Forest();
        }
        return instance;
    }

    private Forest() {
        super("Forest");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void plantTree(int x, int y, int size, String name, Color color, String otherTreeData) {
        IMyTreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, size, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }

}

