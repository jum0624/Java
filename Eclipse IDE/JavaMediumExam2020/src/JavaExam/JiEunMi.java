package JavaExam;
import java.util.Scanner;
import java.util.InputMismatchException;

class JiEunMi {
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n;
			while(true) {
				try {
					System.out.print("사용할 객체를 입력하세요(1 : Line, 2: Rectangle, 3; Circle):");
					n = sc.nextInt();
					break;
				}
				catch(InputMismatchException e) {
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					sc.next();
				}
			}
			int x1, y1, x2, y2;
			
			//Line 객체
			if(n==1) {
				System.out.println("Line 객체 생성, 2점 좌표값 입력해주세요");
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
						System.out.println("정수가 아닙니다. 다시 입력하세요!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Point b = new Point(x2, y2);
				Line line = new Line(a, b);
				line.redraw();
				System.out.println("선의 길이 : " + line.getArea());
			}
			
			//Rectangle 객체
			if(n==2) {			
				System.out.println("Rectangle 객체 생성, 2점 좌표값 입력해주세요");
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
						System.out.println("정수가 아닙니다. 다시 입력하세요!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Point b = new Point(x2, y2);
				Rectangle rectangle = new Rectangle(a, b);
				rectangle.redraw();
				System.out.println("사각형의 면적 : " + rectangle.getArea());
			}
			
			//Circle 객체
			if(n==3) {
				double radius;
				System.out.println("Circle 객체 생성, 좌표값 입력해주세요");
				while(true) {
					try {
						System.out.print("중심 좌표값 (x, y) : ");
						x1=sc.nextInt();
						y1=sc.nextInt();
						
						System.out.print("반지름 값을 입력해주세요 : ");
						radius = sc.nextDouble();
						break;
					}
					catch(InputMismatchException e) {
						System.out.println("정수가 아닙니다. 다시 입력하세요!");
						sc.nextLine();
					}
				}
				
				Point a = new Point(x1, y1);
				Circle circle = new Circle(a, radius);
				circle.redraw();
				System.out.println("원의 면적: " + circle.getArea());
			}
			
			else {
				break;
			}
		}
		
		sc.close();
	}
}
