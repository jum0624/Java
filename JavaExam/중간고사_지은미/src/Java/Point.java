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
    }  // xÁÂÇ¥°ª ¸®ÅÏ
    public int getY(){
        return y;
    }  // yÁÂÇ¥°ª ¸®ÅÏ
    public void setX(int x){
        this.x = x;
    }  // xÁÂÇ¥°ª ÀúÀå
    public void setY(int y) {
        this.y = y;
    }  //yÁÂÇ¥°ª ÀúÀå
}

