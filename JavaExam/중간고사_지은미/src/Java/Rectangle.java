package Java;

public class Rectangle implements Shape {
    private Point a;
    private Point b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.print("\nRectangle : ");  //Rectangle 객체 불러오기
        System.out.println("(" + a.getX() + ", " + a.getY() + "), " + "(" + b.getX() + ", " + b.getY() + ")"); //두 점의 좌표 출력
        System.out.println("사각형의 둘레 : " + getArea());  //사각형의 둘레 출력
    }

    @Override
    public double getArea() {
        int width = Math.abs(b.getX() - a.getX());  // 가로의 길이 : (x2 - x1)의 절댓값
        int height = Math.abs(b.getY() - a.getY());  // 세로의 길이 : (y2 - y1)의 절댓값
        return 2 * (width + height);  // 사각형의 둘레
    }
}