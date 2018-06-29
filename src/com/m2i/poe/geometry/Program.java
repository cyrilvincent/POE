package com.m2i.poe.geometry;

import com.m2i.poe.geometry.Point;

public class Program {

    public static void main(String[] args) {
        Point p1;
        p1 = new Point(3,2); // Instanciation
        Point p2 = new Point(4,5);
        p1.display();
        p1.moveTo(5,-2);
        p1.display();
        p1.moveRelative(-1,-1);
        p1.display();

    }
}
