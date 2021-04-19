package Java;

public class Line implements Shape {
    private Point a;
    private Point b;

    public Line(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.print("\nLine : ");  //Line 객체 불러오기
        System.out.println("(" + a.getX() + ", " + a.getY() + "), " + "(" + b.getX() + ", " + b.getY() + ")"); //두 점의 좌표 출력
        System.out.println("선의 길이 : " + getArea());  // 선의 길이 출력
    }

    @Override
    public double getArea() {
        double dx = (b.getX() - a.getX()) * (b.getX() - a.getX());  // (x2 -x1)의 제곱
        double dy = (b.getY() - a.getY()) * (b.getY() - a.getY());  //(y2 -y1)의 제곱
        double d = Math.sqrt(dx + dy);  //두점 사이의 거리
        return d;
    }
}