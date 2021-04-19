package Java;

public class Point {
    private int x;
    private int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }  // (0,0)
    public Point(int x){
        this.x = x;
        this.y = 0;
    }  //(x, 0)
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }  //(x,y)
    public int getX(){
        return x;
    }  // x��ǥ�� ����
    public int getY(){
        return y;
    }  // y��ǥ�� ����
    public void setX(int x){
        this.x = x;
    }  // x��ǥ�� ����
    public void setY(int y) {
        this.y = y;
    }  //y��ǥ�� ����
}

