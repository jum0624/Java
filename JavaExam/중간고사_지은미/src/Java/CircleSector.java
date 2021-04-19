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
        System.out.print("\nCircleSector : ");  //CircleSector 객체 불러오기
        System.out.println("중심 좌표값 (" + a.getX() + ", " + a.getY() + ")"); //중심 좌표값 출력
        System.out.println("반지름 : " + radius); //두 점의 좌표 출력
        System.out.println("각도 : " + degreeX); //두 점의 좌표 출력
        System.out.println("부채꼴의 면적 : " + getArea());  // 부채꼴 면적 출력
    }
    
    
    @Override
    public double getArea() {
    	return PI * radius * radius * degreeX / 360; // 부채꼴 면적 리턴
    }
}
