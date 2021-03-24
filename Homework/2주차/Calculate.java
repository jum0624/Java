import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int number1 = 0, number2 = 0; // number1, number2 = ������ ����
		String Calc = ""; // ������ ���ڿ�
		
		while(true) {
			while(true) {
				try {
					System.out.println("������ ������ ���ڿ��� �Է��ϼ���.");
					number1 = sc.nextInt();
					Calc = sc.next();
					number2 = sc.nextInt();
					break;
				}
				catch(InputMismatchException e){
					System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���.");  // number1, number2�� ������ �ƴ� ��� ����
					sc.next(); // �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū ����.
				}
			}
			if(Calc.equals("+")) {
				System.out.println("���: " + (number1+number2)); // ���ڿ� "+"�� ��� ����
			}
			
			else if(Calc.equals("-")) {
				System.out.println("���: " + (number1-number2)); // ���ڿ� "-"�� ��� ����
			}
			
			else if(Calc.equals("*")) {
				System.out.println("���: " + (number1*number2)); // ���ڿ� "*"�� ��� ����
			}
			
			else if(Calc.equals("/")) {
				try {
					System.out.println("���: " + (number1/number2)); // ���ڿ� "/"�� ��� ������
				}
				catch(ArithmeticException e){
					System.out.println("0���� ���� �� �����ϴ�. �ٽ��Է��ϼ���.");
					// ������ �����ڿ��� 0���� ������� ����
				}
			}
			
			else if(Calc.equals("%")) {
				System.out.println("���: " + (number1%number2)); // ���ڿ� "&"�� ��� ����������
			}
			else if(Calc.equals("=")) {
				break; //"=" �� ������ while�� ���
			}
		}
		sc.close();
	}
}

