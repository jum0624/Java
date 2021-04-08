
public class IngeritanceMain extends FountainPen {

	public static void main(String[] args) {
		 SharpPencil sp = new SharpPencil();
	     sp.setAmount(4); //남은 량

	     BallPen bp = new BallPen();
	     bp.setAmount(7);
	     bp.setColor("yellow"); //볼펜의 색

	     FountainPen fp = new FountainPen();
	     fp.setAmount(9);
	     fp.setColor("red");
	     fp.refill(3);

	     System.out.println("샤프펜슬의 남은 량 : "+ sp.getAmount());
	     System.out.println();
	     System.out.println("볼펜의 남은 량 : "+ bp.getAmount());
	     System.out.println("볼펜의 색 : "+ bp.getColor());
	     System.out.println();
	     System.out.println("만년필의 남은 량 : "+ fp.getAmount());
	     System.out.println("만년필의 색 : "+ fp.getColor());
	     System.out.println("만년필의 남은량 보충 : "+fp.getAmount());
	}

}
