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
        System.out.print("\nLine : ");  //Line ��ü �ҷ�����
        System.out.println("(" + a.getX() + ", " + a.getY() + "), " + "(" + b.getX() + ", " + b.getY() + ")"); //�� ���� ��ǥ ���
        System.out.println("���� ���� : " + getArea());  // ���� ���� ���
    }

    @Override
    public double getArea() {
        double dx = (b.getX() - a.getX()) * (b.getX() - a.getX());  // (x2 -x1)�� ����
        double dy = (b.getY() - a.getY()) * (b.getY() - a.getY());  //(y2 -y1)�� ����
        double d = Math.sqrt(dx + dy);  //���� ������ �Ÿ�
        return d;
    }
}