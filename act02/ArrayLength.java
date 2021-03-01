import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int Array[]=new int[5];
		int sum=0;
		
		System.out.print(Array.length+"개 의 정수를 입력하세요>> ");
		for(int i=0;i<Array.length;i++) {
			Array[i]=scanner.nextInt();
			sum+=Array[i];
		}
		System.out.print("평균은 "+(double)sum/Array.length);
		scanner.close();

	}

}
