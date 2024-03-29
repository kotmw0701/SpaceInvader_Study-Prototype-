package com.kotmw.invader.entity;

import javafx.scene.paint.Color;

public class UFO extends Enemy {

    private boolean rightSpawn = false;

    public UFO(double x, double y, double w, double h, Color color) {
        super(Math.random() > 0.5 ? x : 0, y, w, h, EntityType.UFO, color);
        rightSpawn = getX() == x;
    }

    public void move() {
        setX(getX() + (rightSpawn ? -2 : 2));
    }

}
