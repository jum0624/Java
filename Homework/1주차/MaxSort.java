import java.util.Scanner;

public class MaxSort {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] s;
		s = new int[3];
		
		System.out.println("3개의 정수를 입력하세요 : ");
		
		for(int i=0;i<3;i++) {
			s[i] = scanner.nextInt();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=i+1;j<3;j++) {
				if(s[i]>=s[j]) {
					int tmp;
					tmp = s[i];
					s[i] = s[j];
					s[j] = tmp;
				}
			}
		}
		
		for(int i=0;i<3;i++) {
			System.out.print(s[i] + " ");
		}
		
		scanner.close();

	}

}
