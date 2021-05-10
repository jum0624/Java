import java.util.Scanner;

public class Fraction {
    int numerator;    // ���� �ʵ�
    int denominator;   // �и� �ʵ�

    public Fraction(){
        this.numerator = 1;  // ���ڿ� �и� 1�� �����ϴ� ������
        this.denominator = 1;  
    }
    public Fraction(int d){      // ���ڴ� 1�� ����, �и�� d�� �����ϴ� ������
        this.numerator = 1;
        this.denominator = d;
    }
    public Fraction(int n, int d){    //���ڴ� n, �и�� d�� �����ϴ� ������
        this.numerator = n;
        this.denominator = d;
    }
    public static Fraction addFraction(Fraction f1, Fraction f2){
        Fraction resultadd = new Fraction();    // �м��� ���� ������ ��ü ����
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultadd.numerator = (n1 * d2) + (n2 * d1);
        resultadd.denominator = d1 * d2;

        resultadd = abbFraction(resultadd);  // �м��� �� ���м� ���º�ȯ

        return resultadd;
    }
    public static Fraction subFraction(Fraction f1, Fraction f2){
        Fraction resultsub = new Fraction();    // �м��� ���� ������ ��ü ����
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultsub.numerator = (n1 * d2) - (n2 * d1);
        resultsub.denominator = d1 * d2;

        resultsub = abbFraction(resultsub);    // �м��� �� ���м� ���º�ȯ

        return resultsub;
    }
    public static Fraction mulFraction(Fraction f1, Fraction f2){
        Fraction resultmul = new Fraction();     // �м��� ���� ������ ��ü ����
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultmul.numerator = n1 * n2;
        resultmul.denominator = d1 * d2;

        resultmul = abbFraction(resultmul);    // �м��� �� ���м� ���º�ȯ

        return resultmul;
    }
    public static Fraction divFraction(Fraction f1, Fraction f2){
        Fraction resultdiv = new Fraction();       // �м��� �������� ������ ��ü ����
        int n1 = f1.numerator;
        int n2 = f2.numerator;
        int d1 = f1.denominator;
        int d2 = f2.denominator;

        resultdiv.numerator = n1 * d2;
        resultdiv.denominator = d1 * n2;

        resultdiv = abbFraction(resultdiv);   // �м��� ������ ���м� ���º�ȯ

        return resultdiv;
    }

    public static  Fraction abbFraction(Fraction fraction){
        Fraction resultabb = new Fraction();
        int a = fraction.numerator;	// �ִ������� Ȱ��� ����
        int b = fraction.denominator; // �ִ������� Ȱ��� �и�
        
        int c = fraction.numerator;	// ���� ��
        int d = fraction.denominator; // �и� ��

        while(b != 0) {
        	int temp = a % b;
        	a = b;
        	b = temp;
        }
        a = Math.abs(a);	// �ִ����� ���밪
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

        System.out.print("�м�1(���� �и�) �Է�: ");
        f1.numerator = sc.nextInt();
        f1.denominator = sc.nextInt();
        System.out.print("�м�2(���� �и�) �Է�: ");
        f2.numerator = sc.nextInt();
        f2.denominator = sc.nextInt();
        System.out.println("-----------------------------------");
        System.out.print(f1.numerator + "/" + f1.denominator + "+" + f2.numerator+ "/" + f2.denominator + "=");
        result = addFraction(f1,f2);    //�м��� �� ���
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "-" + f2.numerator+ "/" + f2.denominator + "=");
        result = subFraction(f1,f2);     //�м��� �� ���
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "*" + f2.numerator+ "/" + f2.denominator + "=");
        result = mulFraction(f1,f2);     //�м��� �� ���
        printFraction(result);

        System.out.print(f1.numerator + "/" + f1.denominator + "/" + f2.numerator+ "/" + f2.denominator + "=");
        result = divFraction(f1,f2);       //�м��� ������ ���
        printFraction(result);
    }
}