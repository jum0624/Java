package Java;

interface Shape {
    double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.println("---다시 그립니다. ");
        draw();
    }
}