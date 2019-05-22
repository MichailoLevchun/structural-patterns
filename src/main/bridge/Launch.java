package main.bridge;

import main.bridge.model.Circle;
import main.bridge.model.GreenCircle;
import main.bridge.model.RedCircle;
import main.bridge.model.Shape;

public class Launch {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(345, 666, 1488, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}