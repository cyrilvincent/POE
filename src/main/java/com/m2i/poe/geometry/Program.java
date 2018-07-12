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
        TriangleRectangle tr = new TriangleRectangle(2,3);
        System.out.println(tr.getHypothenuse());
        System.out.println(tr.getPerimetre());
        Rectangle r1 = new Rectangle();
        Carre c1 = new Carre(2);
        Rectangle r2 = new Carre(2);
        //Carre c2 = new Rectangle(2,2);



    }
}
