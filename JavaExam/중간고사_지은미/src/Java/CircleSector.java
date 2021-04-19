package Java;

public class CircleSector  implements Shape {
    private Point a;
    private double radius;
    private double degreeX;

    public CircleSector(Point a, double radius, double degreeX) {
        this.a = a;
        this.radius = radius;
        this.degreeX = degreeX;
    }

    @Override
    public void draw() {
        System.out.print("\nCircleSector : ");  //CircleSector ��ü �ҷ�����
        System.out.println("�߽� ��ǥ�� (" + a.getX() + ", " + a.getY() + ")"); //�߽� ��ǥ�� ���
        System.out.println("������ : " + radius); //�� ���� ��ǥ ���
        System.out.println("���� : " + degreeX); //�� ���� ��ǥ ���
        System.out.println("��ä���� ���� : " + getArea());  // ��ä�� ���� ���
    }
    
    
    @Override
    public double getArea() {
    	return PI * radius * radius * degreeX / 360; // ��ä�� ���� ����
    }
}
