
public class IngeritanceMain extends FountainPen {

	public static void main(String[] args) {
		 SharpPencil sp = new SharpPencil();
	     sp.setAmount(4); //���� ��

	     BallPen bp = new BallPen();
	     bp.setAmount(7);
	     bp.setColor("yellow"); //������ ��

	     FountainPen fp = new FountainPen();
	     fp.setAmount(9);
	     fp.setColor("red");
	     fp.refill(3);

	     System.out.println("�����潽�� ���� �� : "+ sp.getAmount());
	     System.out.println();
	     System.out.println("������ ���� �� : "+ bp.getAmount());
	     System.out.println("������ �� : "+ bp.getColor());
	     System.out.println();
	     System.out.println("�������� ���� �� : "+ fp.getAmount());
	     System.out.println("�������� �� : "+ fp.getColor());
	     System.out.println("�������� ������ ���� : "+fp.getAmount());
	}

}
