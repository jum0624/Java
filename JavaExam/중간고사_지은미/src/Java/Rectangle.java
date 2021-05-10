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
        System.out.print("\nRectangle : ");  //Rectangle ��ü �ҷ�����
        System.out.println("(" + a.getX() + ", " + a.getY() + "), " + "(" + b.getX() + ", " + b.getY() + ")"); //�� ���� ��ǥ ���
        System.out.println("�簢���� �ѷ� : " + getArea());  //�簢���� �ѷ� ���
    }

    @Override
    public double getArea() {
        int width = Math.abs(b.getX() - a.getX());  // ������ ���� : (x2 - x1)�� ����
        int height = Math.abs(b.getY() - a.getY());  // ������ ���� : (y2 - y1)�� ����
        return 2 * (width + height);  // �簢���� �ѷ�
    }
}