package app;
import lib.Point;
import lib.Shape;

import java.util.Scanner;

class Line implements Shape {
    Point a, b;

    public void draw(){
        Scanner sc = new Scanner(System.in);

        int x1, x2;
        int y1, y2;
        System.out.println("Line 객체 생성, 2점 좌표값 입력해주세요");

        System.out.print("(x1, y1):");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        a = new Point(x1, y1);
        a.setX();
        a.setY();


        System.out.print("(x2, y2):");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        b = new Point(x2, y2);
        b.setX();
        b.setY();

    }
    public double getArea(){
        double d;
        int xd, yd;
        xd = (int) Math.pow((b.getX() - a.getX()),2);
        yd = (int) Math.pow((b.getY() - a.getY()),2);
        d = Math.sqrt(xd + yd);
        return d;
    }
}
