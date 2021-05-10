package Java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class JIEumMi extends Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n;
            while(true) {
                try {
                    System.out.print("����� ��ü�� �Է��ϼ���(1 : CircleSector, 2: Line, 3; Rectangle):");  //�Է¼���
                    n = sc.nextInt();
                    break;
                }
                catch(InputMismatchException e) {
                    System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");  //�Է��� ������ ��� ����ó��
                    sc.next();  //��ū ����
                }
            }
            int x1, x2, y1, y2;  //��ǥ
            double radius;  //������
            double degreeX;  //����
            if(n == 1){  // n�� 1�϶�
                System.out.println("CircleSector ��ü ����, �߽� ��ǥ���� ������ �׸��� ������ �Է����ּ���");
                while(true){
                    try {
                        System.out.print("�߽� ��ǥ��(x, y) : ");
                        x1 = sc.nextInt();
                        y1 = sc.nextInt();

                        System.out.print("������ : ");
                        radius = sc.nextDouble();

                        System.out.print("���� : ");
                        degreeX = sc.nextDouble();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");  // ���� �Է��� ��� ����ó��
                        sc.nextLine();
                    }
                }
                Point a = new Point(x1,y1);
                CircleSector circleSector = new CircleSector(a, radius,degreeX);  //CircleSector ��ü ����
                circleSector.redraw(); //redraw ����
            }

            else if(n==2){
                System.out.println("Line ��ü ����, 2�� ��ǥ�� �Է����ּ���");
                while(true) {
                    try {
                        System.out.print("(x1, y1):");
                        x1=sc.nextInt();
                        y1=sc.nextInt();

                        System.out.print("(x2, y2):");
                        x2=sc.nextInt();
                        y2=sc.nextInt();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");  // ���� �Է��� ��� ����ó��
                        sc.nextLine();
                    }
                }

                Point a = new Point(x1, y1);
                Point b = new Point(x2, y2);
                Line line = new Line(a, b); //Line ��ü ����
                line.redraw();  //redraw ����           
            }

            else if (n == 3){
                System.out.println("Rectangle ��ü ����, 2�� ��ǥ�� �Է����ּ���");
                while(true){
                    try {
                        System.out.print("(x1, y1):");
                        x1=sc.nextInt();
                        y1=sc.nextInt();

                        System.out.print("(x2, y2):");
                        x2=sc.nextInt();
                        y2=sc.nextInt();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");  // ���� �Է��� ��� ����ó��
                        sc.nextLine();
                    }
                }

                Point a = new Point(x1, y1);
                Point b = new Point(x2, y2);
                Rectangle rectangle = new Rectangle(a, b);  // Rectangle ��ü ����
                rectangle.redraw();  //redraw ���� 
            }

            else{
                break;  //n=1,2,3�� �ƴҰ�� ���α׷� ����
            }
        }
        sc.close();
    }
}
