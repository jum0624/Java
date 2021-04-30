package JavaStudy;
import java.util.StringTokenizer;

public class StringTokenizer3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("2+3-5-66+88-323","+-",true);

        int sum = Integer.parseInt(st.nextToken());

        while(st.hasMoreTokens()){
            String t=st.nextToken();
            if(t.equals("+")){
                sum += Integer.parseInt(st.nextToken());
            }
            if(t.equals("-")){
                sum -= Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(sum);
    }
}