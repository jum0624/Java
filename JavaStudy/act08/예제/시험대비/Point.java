package JavaExam;
public class Point {
	int x, y;
	public Point() {//(0,0)
		this.x = 0; 
		this.y = 0;
	} 
	public Point(int x) {//(x, 0)
		this.x = x; 
		this.y = 0;
	} 
	public Point(int x, int y) { //(x,y)
		this.x=x;
		this.y=y;
	}
	public int getX() {//x ÁÂÇ¥°ª ¸®ÅÏ
		return x;
	} 
	public int getY() {//y ÁÂÇ¥°ª ¸®ÅÏ
		return y;
	} 
	public void setX(int x) {//x ÁÂÇ¥°ª ÀúÀå
		this.x=x;
	} 
	public void setY(int y) {//y ÁÂÇ¥°ª ÀúÀå
		this.y=y;
	} 
}
