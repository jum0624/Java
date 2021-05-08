package JavaHw;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  // 문자열 받기
		
		Vector<String> v = new Vector<String>();  // 문자열 토큰 저장을 위한 벡터 생성
		
		StringTokenizer st = new StringTokenizer(s,"+-",true); // 문자열 쪼개기
		while(st.hasMoreTokens()) {
			v.add(st.nextToken());  // 문자열 토큰 벡터에 저장
		}
		
		int sum = Integer.parseInt(v.elementAt(0)); //벡터의 첫번째 정수화 후, 연산
		int i = 1;  // 벡터의 0번쨰를 우선 계산 했기 때문에 다음 문자열부터 시작함.
		while(i < v.size()) {  // i가 벡터의 크기보다 작을 때까지 반복문 진행
			String n = v.elementAt(i); // 덧셈,뺄셈 연산자 저장
			if(n.equals("+")) {
				sum += Integer.parseInt(v.elementAt(i+1)); // 벡터의 해당 요소가 +일 때, 다음 요소 덧셈 연산
			}
			else if(n.equals("-")) {
				sum -= Integer.parseInt(v.elementAt(i+1)); // 벡터의 해당 요소가 -일 때, 다음 요소 뺄셈 연산
			}
			i += 2; // n에 연산자만 넣기 위해 2씩 증가(불필요한 연산 제거)
		}
		
		System.out.println(sum);
		sc.close();
		//35+40-543-42+42-23
	}
}
