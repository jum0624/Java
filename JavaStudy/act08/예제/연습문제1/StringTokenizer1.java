import java.util.StringTokenizer;

public class StringTokenizer1 {
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("냉장고,세탁기,에어컨,TV,오디오",",");

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
