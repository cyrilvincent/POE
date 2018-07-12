package com.m2i.poe.geometry;

public class Point {

    // QUOI ? WHY ? Class = DATA
    private double x = 0;
    private double y = 0;

    // CONSTRUCTOR
    public Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }
    public Point() {
    }

    // COMPORTEMENT
    void moveTo(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    void display() {
        System.out.print("("+ getX() +","+ getY() +")\n");
    }

    void moveRelative(double x, double y) {
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    // GETTER & SETTER
    public double getX() {
        return x;
    }

    private void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    private void setY(double y) {
        this.y = y;
    }

    //Point clone() {
    //}

    public String toString() {
        return "("+ getX() +","+ getY() +")";
    }

}
