package com.m2i.poe.geometry;

public class Rectangle {

    private double width;
    private double height;
    private Point origin = new Point(0,0); // Relation 1

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {}

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

    public double getSurface() {
        return width * height;
    }

    public double getPerimetre() {
        return 2*(getWidth() + getHeight());
    }
}
