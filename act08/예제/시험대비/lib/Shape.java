package lib;

public interface Shape {
    double PI = 3.14;
    void draw();
    double getArea();
    default void redraw(){
        System.out.print("---다시 그립니다.");
        draw();
    }
}
