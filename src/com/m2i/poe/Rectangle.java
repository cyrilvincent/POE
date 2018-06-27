package com.m2i.poe;

public class Rectangle {

    private double width;
    private double height;
    private Point origin = new Point(0,0); // Relation 1




    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }
}
