public class Circle1 {
	int radius;
	public Circle1(int radius) {
		this.radius=radius;
	}
	public void set(int radius) {
		this.radius=radius;
	}

	public static void main(String[] args) {
		Circle1 ob1=new Circle1(1);
		Circle1 ob2=new Circle1(2);
		Circle1 s;
		
		s=ob1;
		ob1=ob2;
		System.out.println("ob1.radius="+ob1.radius);
		System.out.println("ob2.radius="+ob2.radius);
	}

}
