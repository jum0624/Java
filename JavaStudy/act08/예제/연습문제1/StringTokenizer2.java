import java.util.StringTokenizer;

public class StringTokenizer2 {
    public static void main(String[] args) {
        int sum = 0;
        StringTokenizer st = new StringTokenizer("2+3+5+66+88+323","+");
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
