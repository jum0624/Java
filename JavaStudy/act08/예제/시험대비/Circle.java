package JavaExam;

public class Circle implements Shape {
	private Point a;
	private double radius;
	
	public Circle(Point a, double radius) {
		this.a = a;
		this.radius = radius;
	}
	
	@Override
	public void draw() { 
		System.out.print("\nCircle : "); 
		System.out.println("중심 좌표값 : ("+a.getX()+","+a.getY()+")");
		System.out.println("반지름 : " + radius);
	}
	@Override
	public double getArea() { 
		return PI * radius * radius;
	}
	
	

}
