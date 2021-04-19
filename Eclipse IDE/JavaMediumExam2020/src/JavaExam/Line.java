package JavaExam;
import java.lang.Math;

class Line implements Shape { 
	private Point a; 
	private Point b;

	public Line(Point a, Point b) {
		this.a=a; 
		this.b=b;
	}
	
	@Override
	public void draw() {
		System.out.print("\nLine : ");
		System.out.println("("+a.getX()+","+a.getY()+")"+", " + "("+b.getX()+","+b.getY()+")");
		
	}
	@Override
	public double getArea() {
		double dx = (b.getX()-a.getX())*(b.getX()-a.getX());
		double dy = (b.getY()-a.getY())*(b.getY()-a.getY());
		double d=Math.sqrt(dx+dy);
		return d;
	}
}
