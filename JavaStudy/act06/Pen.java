class Common{
    private int amount;

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }
}
class SharpPencil extends Common{
    private int width;
}

class BallPen extends Common{
    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}

class FountainPen extends BallPen{
    public void refill(int n){
        setAmount(n);
    }
}
public class Pen {

    public static void main (String[] args){

        SharpPencil sp = new SharpPencil();
        sp.setAmount(4);

        BallPen bp = new BallPen();
        bp.setAmount(7);
        bp.setColor("yellow");

        FountainPen fp = new FountainPen();
        fp.setAmount(9);
        fp.setColor("red");

        System.out.println("샤프펜슬의 남은 량 : "+ sp.getAmount());
        System.out.println();
        System.out.println("볼펜의 남은 량 : "+ bp.getAmount());
        System.out.println("볼펜의 색 : "+ bp.getColor());
        System.out.println();
        System.out.println("만년필의 남은 량 : "+ fp.getAmount());
        System.out.println("만년필의 색 : "+ fp.getColor());
    }
}
