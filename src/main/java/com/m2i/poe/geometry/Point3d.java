package com.m2i.poe.geometry;

public class Point3d extends Point {

    private double z;

    public Point3d(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+ getX() +","+ getY() + "," + getZ() +")";
    }
}
