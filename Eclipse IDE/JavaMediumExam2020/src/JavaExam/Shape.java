package JavaExam;
public interface Shape {
	double PI=3.14;
	void draw();		//도형의 종류와 정보 출력
	double getArea();	//도형의 면적 및 길이 계산
	default public void redraw() {
		System.out.print("---다시 그립니다. ");
		draw();
	}
}
