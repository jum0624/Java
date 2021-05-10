# 5주차 - 상속

## 문제 01

	상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하라.

	class SharpPencil { // 샤프펜슬
	
	   private int width; // 펜의 굵기
	
	   private int amount; // 남은 량
	
	   public int getAmount() { return amount; }
	
	   public void setAmount (int amount) { this.amount = amount; }
	
	}
	
	
	class Ballpen  { // 볼펜
	
	   private int amount; // 남은 량
	
	   private String color; // 볼펜의 색
	
	   public int getAmount() { return amount; }
	
	   public void setAmount (int amount) { this.amount = amount; }
	
	   public String getColor() { return color; }
	
	   public void setColor(String color) { this.color = color; }
	
	}
	
	
	class FountainPen { // 만년필
	
	   private int amount; // 남은 량
	
	   private String color; // 볼펜의 색
	
	   public int getAmount() { return amount; }
	
	   public void setAmount (int amount) { this.amount = amount; }
	
	   public String getColor() { return color; }
	
	   public void setColor(String color) { this.color = color; }
	
	   public void refill (int n) { setAmount(n); }

***
## 풀이

	class AmountPoint{
	
	   private int amount;
	
	   public int getAmount() {return amount;}
	
	   public void setAmount(int amount) {this.amount=amount;}   
	
	}
	
	class SharpPencil extends AmountPoint{
	
   	private int width;
	
	}
	
	class Ballpen extends AmountPoint{
	
	   private String color;
	
	   public String getColor() {return color;}
	
	   public void setColor(String color) {this.color=color;}
	
	}
	
	class FountainPen extends Ballpen{
	
	   public void refill (int n) { setAmount(n);}
	
	}

***

## 문제 02

	상속에 관련된 접근 지정자에 대한 설명이다. 틀린 것은?
	
	1. 슈퍼 클래스의 private 멤버는 서브 클래스에서 접근할 수 없다.
	
	2. 슈퍼 클래스의 protected 멤버는 같은 패키지에 있는 서브 클래스에서만 접근할 수 있다.
	
	3. 슈퍼 클래스의 public 멤버는 모든 다른 클래스에서 접근할 수 있다.
	
	4. 슈퍼 클래스의 디폴트 멤버는 같은 패키지에 있는 모든 다른 클래스에서 접근 가능하다.

***
## 풀이

> (2)

> 슈퍼 클래스의 protected멤버는 같은 패키지 내 모든 클래스 접근 허용

> 다른 패키지에 이써도 서브 클래스는 슈퍼 클래스의 protected 멤버 접근 가능

***

	상속에 있어 생성자에 대해 묻는 문제이다. 실행될 때 출력되는 내용은 무엇인가?
	
	class A {
	
	   public A() { System.out.println("A"); }
	
	   public A(int x) { System.out.println("A: " + x); }
	
	}
	class B extends A {
	
	   public B() { super(100); }
	
	   public B(int x) { System.out.println("B: " + x); }
	
	}
	public class Example {
	
	   public static void main(String[] args) {
	
	      B b = new B(11);
	
	   }
	
	}


***
## 풀이

	A
	
	B: 11

***