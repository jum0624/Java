import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int Array[]=new int[5];
		int sum=0;
		
		System.out.print(Array.length+"�� �� ������ �Է��ϼ���>> ");
		for(int i=0;i<Array.length;i++) {
			Array[i]=scanner.nextInt();
			sum+=Array[i];
		}
		System.out.print("����� "+(double)sum/Array.length);
		scanner.close();

	}

}
