package lib;

public class Point {
    int x, y;
    public Point(){
        this.x = 0;
        this.y = 0;
    };
    public Point(int x){
        this.x = x;
        this.y = 0;
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(){
       this.x = x;
    }
    public void setY(){
        this.y = y;
    }
}
