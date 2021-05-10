package JavaHw;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();  // ���ڿ� �ޱ�
		
		Vector<String> v = new Vector<String>();  // ���ڿ� ��ū ������ ���� ���� ����
		
		StringTokenizer st = new StringTokenizer(s,"+-",true); // ���ڿ� �ɰ���
		while(st.hasMoreTokens()) {
			v.add(st.nextToken());  // ���ڿ� ��ū ���Ϳ� ����
		}
		
		int sum = Integer.parseInt(v.elementAt(0)); //������ ù��° ����ȭ ��, ����
		int i = 1;  // ������ 0������ �켱 ��� �߱� ������ ���� ���ڿ����� ������.
		while(i < v.size()) {  // i�� ������ ũ�⺸�� ���� ������ �ݺ��� ����
			String n = v.elementAt(i); // ����,���� ������ ����
			if(n.equals("+")) {
				sum += Integer.parseInt(v.elementAt(i+1)); // ������ �ش� ��Ұ� +�� ��, ���� ��� ���� ����
			}
			else if(n.equals("-")) {
				sum -= Integer.parseInt(v.elementAt(i+1)); // ������ �ش� ��Ұ� -�� ��, ���� ��� ���� ����
			}
			i += 2; // n�� �����ڸ� �ֱ� ���� 2�� ����(���ʿ��� ���� ����)
		}
		
		System.out.println(sum);
		sc.close();
		//35+40-543-42+42-23
	}
}
