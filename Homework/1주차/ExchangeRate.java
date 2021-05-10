import java.util.Scanner;

public class ExchangeRate {
	
	public static double[] money = {1.0, 1135.50, 173.4, 1349.54};
	
	public static void main(String[] args) {
		
		System.out.println("환율을 계산할 국가를 2개 선택하세요.");
		System.out.println("(1:대한민국 2:미국 3:중국 4:유럽연합)");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국가 1: ");
		int name1 = scanner.nextInt();
		
		System.out.print("국가 2: ");
		int name2 = scanner.nextInt();
		
		System.out.print("금액을 입력하세요: ");
		double premoney = scanner.nextDouble();
		
		double change = (premoney*money[name1-1])/money[name2-1];
		System.out.printf("국가 1: %.2f => 국가 2: %.2f ", premoney,change);		
		
		scanner.close();
	}

}
