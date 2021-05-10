import java.util.Scanner;

class Calc{
    public int a,b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){

        return 0;
    }

}
class Add extends Calc{

    public int calculate(){

        return a+b;
    }
}
class Sub extends Calc{

    public int calculate(){

        return a-b;
    }
}

class Mul extends  Calc{

    public int calculate(){

        return a*b;
    }
}

class Div extends Calc{

    public int calculate(){

        return a/b;
    }
}
public class Exam2 {

    public static void main(String[] args){
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String t = scanner.next();


        while(true) {

            if (t.equals("+")) {
                add.setValue(a,b);
                System.out.println(add.calculate());
                break;
            }
            else if (t.equals("-")) {
                sub.setValue(a,b);
                System.out.println(sub.calculate());
                break;
            }
            else if (t.equals("*")) {
                mul.setValue(a,b);
                System.out.println(mul.calculate());
                break;
            }
            else if (t.equals("/")) {
                div.setValue(a,b);
                System.out.println(div.calculate());
                break;
            }
            else {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
