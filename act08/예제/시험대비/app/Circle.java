package app;

import lib.Shape;
import lib.Point;

import java.util.Scanner;

class Circle implements Shape {
    Point a;
    double radius;


    @Override
    public void draw() {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.println("원의 중심좌표와 반지름을 입력하시오 :");
        x = sc.nextInt();
        y = sc.nextInt();
        this.radius = sc.nextDouble();
        a = new Point(x, y);
        System.out.println("원의 중심 좌표값 : (" + a.getX() + ", " + a.getY() + ")");
        System.out.println("원의 반지름 : " + radius);
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
}
