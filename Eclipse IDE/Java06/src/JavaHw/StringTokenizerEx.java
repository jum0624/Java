package JavaHw;
import java.util.Scanner;
import java.util.Vector;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		Vector<String> v = new Vector<String>();
		
		StringTokenizer st = new StringTokenizer(s,"+-",true);
		while(st.hasMoreTokens()) {
			v.add(st.nextToken());
		}
		
		int sum = Integer.parseInt(v.elementAt(0));
		//System.out.println("+:"+sum);
		int i = 1;
		while(i < v.size()) {
			String n = v.elementAt(i);
			if(n.equals("+")) {
				sum += Integer.parseInt(v.elementAt(i+1));
				//System.out.println("+:"+sum);
			}
			else if(n.equals("-")) {
				sum -= Integer.parseInt(v.elementAt(i+1));
				//System.out.println("-:"+sum);
			}
			i += 2;
		}
		
		System.out.println(sum);
		sc.close();
		//35+40-543-42+42-23
	}
}
