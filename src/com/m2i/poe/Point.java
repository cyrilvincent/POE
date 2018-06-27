package com.m2i.poe;

public class Point {

    // QUOI ? WHY ? Class = DATA
    double x;
    double y;

    // COMPORTEMENT
    void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.print("("+x+","+y+")\n");
    }

    void moveRelative(double x, double y) {
        this.x += x;
        this.y += y;
    }

    //Point clone() {
    //}

}
