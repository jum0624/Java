import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int number1 = 0, number2 = 0; // number1, number2 = 연산할 정수
		String Calc = ""; // 연산할 문자열
		
		while(true) {
			while(true) {
				try {
					System.out.println("연산할 정수와 문자열을 입력하세요.");
					number1 = sc.nextInt();
					Calc = sc.next();
					number2 = sc.nextInt();
					break;
				}
				catch(InputMismatchException e){
					System.out.println("정수가 아닙니다. 다시입력하세요.");  // number1, number2가 정수가 아닐 경우 에외
					sc.next(); // 입력 스트림에 있는 정수가 아닌 토큰 버림.
				}
			}
			if(Calc.equals("+")) {
				System.out.println("결과: " + (number1+number2)); // 문자열 "+"일 경우 덧셈
			}
			
			else if(Calc.equals("-")) {
				System.out.println("결과: " + (number1-number2)); // 문자열 "-"일 경우 뺄셈
			}
			
			else if(Calc.equals("*")) {
				System.out.println("결과: " + (number1*number2)); // 문자열 "*"일 경우 곱셈
			}
			
			else if(Calc.equals("/")) {
				try {
					System.out.println("결과: " + (number1/number2)); // 문자열 "/"일 경우 나눗셈
				}
				catch(ArithmeticException e){
					System.out.println("0으로 나눌 수 없습니다. 다시입력하세요.");
					// 나누기 연산자에서 0으로 나눌경우 예외
				}
			}
			
			else if(Calc.equals("%")) {
				System.out.println("결과: " + (number1%number2)); // 문자열 "&"일 경우 나머지연산
			}
			else if(Calc.equals("=")) {
				break; //"=" 을 만나면 while문 벗어남
			}
		}
		sc.close();
	}
}

