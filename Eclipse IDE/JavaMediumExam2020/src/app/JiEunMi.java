package app;
import java.util.Scanner;
import java.util.InputMismatchException;

class JiEunMi {
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n;
			while(true) {
				try {
					System.out.print("����� ��ü�� �Է��ϼ���(1 : Line, 2: Rectangle, 3; Circle):");
					n = sc.nextInt();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
					sc.next();
				}
			}
			int x1, y1, x2, y2;
			
			//Line ��ü
			if(n==1) {
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
						System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Point b = new Point(x2, y2);
				Line line = new Line(a, b);
				line.redraw();
				System.out.println("���� ���� : " + line.getArea());
			}
			
			//Rectangle ��ü
			if(n==2) {			
				System.out.println("Rectangle ��ü ����, 2�� ��ǥ�� �Է����ּ���");
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
						System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Point b = new Point(x2, y2);
				Rectangle rectangle = new Rectangle(a, b);
				rectangle.redraw();
				System.out.println("�簢���� ���� : " + rectangle.getArea());
			}
			
			//Circle ��ü
			if(n==3) {
				double radius;
				System.out.println("Circle ��ü ����, ��ǥ�� �Է����ּ���");
				while(true) {
					try {
						System.out.print("�߽� ��ǥ�� (x, y) : ");
						x1=sc.nextInt();
						y1=sc.nextInt();
						
						System.out.print("������ ���� �Է����ּ��� : ");
						radius = sc.nextDouble();
						break;
					}
					catch(InputMismatchException e) {
						System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Circle circle = new Circle(a, radius);
				circle.redraw();
				System.out.println("���� ����: " + circle.getArea());
			}
			
			else {
				break;
			}
		}
		
		sc.close();
	}
}
