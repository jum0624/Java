package JavaExam;

class Rectangle implements Shape {
	private Point a;
	private Point b;
	
	public Rectangle(Point a, Point b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void draw() { 
		System.out.print("\nRectangle : "); 
		System.out.println("µÎ Á¡ÀÇ ÁÂÇ¥°ª : ("+a.getX()+","+a.getY()+")"+", " + "("+b.getX()+","+b.getY()+")");
	}
	@Override
	public double getArea() { 
		int width = Math.abs(b.getX() - a.getX());   //°¡·Î = (x2 - x1)ÀÇ Àý´ñ°ª
		int height = Math.abs(b.getY() - a.getY());   //¼¼·Î = (y2 - y1)ÀÇ Àý´ñ°ª
		return width * height; 
	}
}
