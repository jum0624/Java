import java.util.Scanner;

public class Fraction {
    int numerator;    // 분자 필드
    int denominator;   // 분모 필드

    public Fraction(){
        this.numerator = 1;  // 분자와 분모를 1로 지정하는 생성자
        this.denominator = 1;  
    }
    public Fraction(int d){      // 분자는 1로 지정, 분모는 d로 지정하는 생성자
        this.numerator = 1;
        this.denominator = d;
    }
    public Fraction(int n, int d){    //분자는 n, 분모는 d로 지정하는 생성자
        this.numerator = n;
        this.denominator = d;
    }
    public static Fraction addFraction(Fraction f1, Fraction f2){
        Fraction resultadd = new Fraction();    // 분수의 합을 저장할 객체 생성
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultadd.numerator = (n1 * d2) + (n2 * d1);
        resultadd.denominator = d1 * d2;

        resultadd = abbFraction(resultadd);  // 분수의 합 기약분수 형태변환

        return resultadd;
    }
    public static Fraction subFraction(Fraction f1, Fraction f2){
        Fraction resultsub = new Fraction();    // 분수의 차을 저장할 객체 생성
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultsub.numerator = (n1 * d2) - (n2 * d1);
        resultsub.denominator = d1 * d2;

        resultsub = abbFraction(resultsub);    // 분수의 차 기약분수 형태변환

        return resultsub;
    }
    public static Fraction mulFraction(Fraction f1, Fraction f2){
        Fraction resultmul = new Fraction();     // 분수의 곱을 저장할 객체 생성
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultmul.numerator = n1 * n2;
        resultmul.denominator = d1 * d2;

        resultmul = abbFraction(resultmul);    // 분수의 곱 기약분수 형태변환

        return resultmul;
    }
    public static Fraction divFraction(Fraction f1, Fraction f2){
        Fraction resultdiv = new Fraction();       // 분수의 나눗셈을 저장할 객체 생성
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultdiv.numerator = n1 * d2;
        resultdiv.denominator = d1 * n2;

        resultdiv = abbFraction(resultdiv);   // 분수의 나눗셈 기약분수 형태변환

        return resultdiv;
    }

    public static  Fraction abbFraction(Fraction fraction){
        Fraction resultabb = new Fraction();
        int a = fraction.numerator;	// 최대공약수에 활용될 분자
        int b = fraction.denominator; // 최대공약수에 활용될 분모
        
        int c = fraction.numerator;	// 분자 값
        int d = fraction.denominator; // 분모 값

        while(b != 0) {
        	int temp = a % b;
        	a = b;
        	b = temp;
        }
        a = Math.abs(a);	// 최대공약수 절대값
        resultabb.numerator = c/a;
        resultabb.denominator = d/a;
        return resultabb;
    }
    public static void printFraction(Fraction fraction){
        System.out.println(fraction.numerator + "/" + fraction.denominator);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction result = new Fraction();

        System.out.print("분수1(분자 분모) 입력: ");
        f1.numerator = sc.nextInt();
        f1.denominator = sc.nextInt();
        System.out.print("분수2(분자 분모) 입력: ");
        f2.numerator = sc.nextInt();
        f2.denominator = sc.nextInt();
        System.out.println("-----------------------------------");
        System.out.print(f1.numerator + "/" + f1.denominator + "+" + f2.numerator+ "/" + f2.denominator + "=");
        result = addFraction(f1,f2);    //분수의 합 출력
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "-" + f2.numerator+ "/" + f2.denominator + "=");
        result = subFraction(f1,f2);     //분수의 차 출력
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "*" + f2.numerator+ "/" + f2.denominator + "=");
        result = mulFraction(f1,f2);     //분수의 곱 출력
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "/" + f2.numerator+ "/" + f2.denominator + "=");
        result = divFraction(f1,f2);       //분수의 나눗셈 출력
        printFraction(result);
    }
}