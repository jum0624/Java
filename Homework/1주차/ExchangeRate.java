import java.util.Scanner;

public class ExchangeRate {
	
	public static double[] money = {1.0, 1135.50, 173.4, 1349.54};
	
	public static void main(String[] args) {
		
		System.out.println("ȯ���� ����� ������ 2�� �����ϼ���.");
		System.out.println("(1:���ѹα� 2:�̱� 3:�߱� 4:��������)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 1: ");
		int name1 = scanner.nextInt();
		
		System.out.print("���� 2: ");
		int name2 = scanner.nextInt();
		
		System.out.print("�ݾ��� �Է��ϼ���: ");
		double premoney = scanner.nextDouble();
		
		double change = (premoney*money[name1-1])/money[name2-1];
		System.out.printf("���� 1: %.2f => ���� 2: %.2f ", premoney,change);		
		
		scanner.close();
	}

}
