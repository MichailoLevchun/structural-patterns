package main.bridge.model;

import main.bridge.service.DrawAPI;

public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing bridge.Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}