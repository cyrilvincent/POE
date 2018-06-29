package com.m2i.poe.geometry;

public class TriangleRectangle extends Rectangle {

    public TriangleRectangle(double width, double height) {
        super(width, height);
    }
    public TriangleRectangle() {
    }

    @Override
    public double getSurface() {
        return super.getSurface() / 2;
    }

    public double getHypothenuse() {
        return Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
    }

    @Override
    public double getPerimetre() {
        return getWidth() + getHeight() + getHypothenuse();
    }
}
