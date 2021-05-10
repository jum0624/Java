package Java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class JIEumMi extends Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int n;
            while(true) {
                try {
                    System.out.print("사용할 객체를 입력하세요(1 : CircleSector, 2: Line, 3; Rectangle):");  //입력수행
                    n = sc.nextInt();
                    break;
                }
                catch(InputMismatchException e) {
                    System.out.println("정수가 아닙니다. 다시 입력하세요!");  //입력이 문자일 경우 예외처리
                    sc.next();  //토큰 삭제
                }
            }
            int x1, x2, y1, y2;  //좌표
            double radius;  //반지름
            double degreeX;  //각도
            if(n == 1){  // n이 1일때
                System.out.println("CircleSector 객체 생성, 중심 좌표값과 반지름 그리고 각도를 입력해주세요");
                while(true){
                    try {
                        System.out.print("중심 좌표값(x, y) : ");
                        x1 = sc.nextInt();
                        y1 = sc.nextInt();

                        System.out.print("반지름 : ");
                        radius = sc.nextDouble();

                        System.out.print("각도 : ");
                        degreeX = sc.nextDouble();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("정수가 아닙니다. 다시 입력하세요!");  // 문자 입력할 경우 예외처리
                        sc.nextLine();
                    }
                }
                Point a = new Point(x1,y1);
                CircleSector circleSector = new CircleSector(a, radius,degreeX);  //CircleSector 객체 생성
                circleSector.redraw(); //redraw 실행
            }

            else if(n==2){
                System.out.println("Line 객체 생성, 2점 좌표값 입력해주세요");
                while(true) {
                    try {
                        System.out.print("(x1, y1):");
                        x1=sc.nextInt();
                        y1=sc.nextInt();

                        System.out.print("(x2, y2):");
                        x2=sc.nextInt();
                        y2=sc.nextInt();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("정수가 아닙니다. 다시 입력하세요!");  // 문자 입력할 경우 예외처리
                        sc.nextLine();
                    }
                }

                Point a = new Point(x1, y1);
                Point b = new Point(x2, y2);
                Line line = new Line(a, b); //Line 객체 생성
                line.redraw();  //redraw 실행           
            }

            else if (n == 3){
                System.out.println("Rectangle 객체 생성, 2점 좌표값 입력해주세요");
                while(true){
                    try {
                        System.out.print("(x1, y1):");
                        x1=sc.nextInt();
                        y1=sc.nextInt();

                        System.out.print("(x2, y2):");
                        x2=sc.nextInt();
                        y2=sc.nextInt();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("정수가 아닙니다. 다시 입력하세요!");  // 문자 입력할 경우 예외처리
                        sc.nextLine();
                    }
                }

                Point a = new Point(x1, y1);
                Point b = new Point(x2, y2);
                Rectangle rectangle = new Rectangle(a, b);  // Rectangle 객체 생성
                rectangle.redraw();  //redraw 실행 
            }

            else{
                break;  //n=1,2,3이 아닐경우 프로그램 종료
            }
        }
        sc.close();
    }
}
