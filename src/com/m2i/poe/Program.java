package com.m2i.poe;

public class Program {

    public static void main(String[] args) {
        Point p1;
        p1 = new Point(); // Instanciation
        Point p2 = new Point();
        p1.x = 3;
        p1.y = 4;
        p1.display();
        p1.moveTo(5,-2);
        p1.display();
        p1.moveRelative(-1,-1);
        p1.display();

    }
}
