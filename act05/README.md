# act.05

## 01 상속의 정의

`상속`의 사전적 의미

1. 뒤를 잇다.

2. 죽은 사람의 권리와 의무를 이어 받는 일

일반적으로는 부모가 자식에게 재산, 권리, 의무 등을 물려주는 것을 상속이라고 한다.

프로그래밍에서의 상속 또한 비슷한 역할을 한다.

물론 일반적인 재산, 권리, 의무를 물려주는 것이 아니라 "`클래스의 멤버를 물려준다.`"는 차이점이 있다.

이 때 물려주는 클래스를 "부모 클래스", 물려받는 클래스를 "자식 클래스"라고 얘기한다.


```Javascript
public class Main {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.print();
		c.print();
	}

}

// Parent 클래스 정의
class Parent {
		
	public int iInt;
	
	public void print() {
		System.out.println("Parent Class");
	}
}

// Child 클래스 정의
class Child extends Parent{

}
```

**자식 클래스(child class)**

자식 클래스(child class)란 부모 클래스의 모든 특성을 물려받아 새롭게 작성된 클래스를 의미합니다.

 

자바에서 자식 클래스는 다음과 같은 문법을 통해 선언합니다.

	class 자식클래스이름 extend 부모클래스이름 { ... }

다음 그림은 부모 클래스와 자식 클래스 간의 포함 관계를 나타낸 그림입니다.

 

![상속다이어그램](http://www.tcpschool.com/lectures/img_java_inheritance_diagram.png)

 

이처럼 부모 클래스는 자식 클래스에 포함된 것으로 볼 수 있습니다.

따라서 부모 클래스에 새로운 필드를 하나 추가하면, 자식 클래스에도 자동으로 해당 필드가 추가된 것처럼 동작합니다.

 


자식 클래스에는 부모 클래스의 필드와 메소드만이 상속되며, 생성자와 초기화 블록은 상속되지 않습니다.

또한, 부모 클래스의 접근 제어가 private이나 default로 설정된 멤버는 자식 클래스에서 상속받지만 접근할 수는 없습니다.

 

> 예제
```Javascript
class Parent {

    private int a = 10; // private 필드

    public int b = 20;  // public 필드

}

 

class Child extends Parent {

    public int c = 30;  // public 필드

    void display() {

①      // System.out.println(a); // 상속받은 private 필드 참조

②      System.out.println(b);    // 상속받은 public 필드 참조

③      System.out.println(c);    // 자식 클래스에서 선언한 public 필드 참조

    }

}

 

public class Inheritance01 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

    }

}
```


> 실행 결과

	20
	
	30

 

위 예제의 ②번 라인에서는 자식 클래스의 메소드에서 부모 클래스에서 상속받은 public 필드를 참조하고 있습니다.

이처럼 자식 클래스에서 따로 선언하지 않은 필드라도 해당 이름의 필드를 부모 클래스에서 상속받았다면 문제가 없습니다.

하지만 주석 처리된 ①번 라인처럼 해당 필드가 부모 클래스의 private 필드라면 접근할 수 없으므로, 오류를 발생시킬 것입니다.

또한, 자식 클래스에서는 ③번 라인처럼 자신만의 필드나 메소드를 선언하여 사용할 수 있습니다.



- 자식 클래스는 부모 클래스로부터 물려받은 멤버 외에 `다른 멤버를 추가로 가질 수 있습니다.`

- 자식 클래스에서 정의된 멤버는 부모클래스 객체에서는 사용할 수 없습니다.

- 자식 클래스는 객체가 생성될 때는 부모클래스의 생성자가 무조건 실행됩니다.

	실행 되는 순서는
	
	1) 부모클래스 생성자
	
	2) 자식클래스 생성자
	
	순입니다.


## 02 상속의 장점

1. 코드를 재활용함으로써 간소화된 클래스 구조

2. 클래스의 기능 테스트에 대한 생산성 및 정확성 증가

3. 클래스 수정 수정/추가에 대한 유연성 및 확장성 증가



## 03 상속의 특징

- 클래스의 다중 상속을 지원하지 않는다.

> extends 뒤에 하나만 존재할 수 있다. (부모가 두 명이면 안됨..)

- 상속의 횟수에 제한을 두지않는다.

> 자식은 여러명 존재 가능

- 계층 구조의 최상위에 있는 클래스는 java.lang.Object 클래스이다.


## 04 서브 클래스와 슈퍼 클래스의 생성자 관계

**서브 클래스 객체 생성**

서브 클래스는 슈퍼클래스의 private 멤버를 제외하고 모든 멤버를 접근할 수 있다.


**생성자**

Q. 서브 클래스의 생성자와 슈퍼 클래스의 생성자 중 누가 먼저 실행될까? (슈퍼클래스의 생성자)

Q. 서브 클래스 객체가 생성될 때 서브클래스의 생성자와 슈퍼 클래스의 생성자가 모두 실행될까? (0) 

답의 이유는 아래 그림 '슈퍼 클래스와 서브 클래스의 생성자 간 호출 및 실행 관계도' 를 보면서 이해해보자.

![슈퍼클래스, 서브클래스 호출 실행관계도](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FRmJU5%2FbtqvUx8WO73%2FJKaisDO2lUnPPkl9ATBbWk%2Fimg.png)

 
**서브 클래스에서 슈퍼 클래스 생성자 선택**

슈퍼 클래스에 여러 생성자가 있을 때 서브 클래스의 생성자와 함께 실행될 슈퍼클래스의 생성자는 원칙적으로 서브 클래스의 개발자가 각 생성자에 대해 함께 실행될 슈퍼클래스의 생성자를 지정한다. 
그러나 명시하지 않았을 경우 **컴파일러가 자동으로 슈퍼클래스의 기본 생성자를 호출**하도록 자바 컴파일러가 작동한다.

 
슈퍼 클래스에 기본 생성자가 없을 경우 컴파일 오류 메세지를 출력한다. 

(Implicit super constructor A() is undefined. Must explicitly invoke another constructor)


서브클래스의 생성자에서 super()를 이용하면 서브클래스에서 명시적으로 슈퍼클래스의 생성자를 선택할 수 있다. 괄호 안에 인자를 넣을 수도 있다. 
요점은 super()가 반드시 생성자의 첫 줄에 사용되어야 한다는 것!


> | 예제 5-3 | super()를 활용한 Colorpoint 작성


	blue(5,6)

 
```Javascript
package Luxuryjava05;

class Point {
	private int x, y;

	public Point() {
		this.x = this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 6, "blue");
		cp.showColorPoint();

	}
}
``` 


## 05 super와 super()

### super 키워드

`super` 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 데 사용하는 참조 변수입니다.

인스턴스 변수의 이름과 지역 변수의 이름이 같을 경우 인스턴스 변수 앞에 this 키워드를 사용하여 구분할 수 있었습니다.

이와 마찬가지로 부모 클래스의 멤버와 자식 클래스의 멤버 이름이 같을 경우 super 키워드를 사용하여 구별할 수 있습니다.

이렇게 자바에서는 super 참조 변수를 사용하여 부모 클래스의 멤버에 접근할 수 있습니다.

this와 마찬가지로 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메소드뿐이며, 클래스 메소드에서는 사용할 수 없습니다.

> 예제
```Javascript
class Parent { int a = 10; }

 

class Child extends Parent {

    void display() {

        System.out.println(a);

        System.out.println(this.a);

        System.out.println(super.a);

    }

}

 

public class Inheritance02 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

    }

}
```

> 실행 결과

	10
	
	10
	
	10

### super() 키워드

this() 메소드가 같은 클래스의 다른 생성자를 호출할 때 사용된다면, super() 메소드는 부모 클래스의 생성자를 호출할 때 사용됩니다.

자식 클래스의 인스턴스를 생성하면, 해당 인스턴스에는 자식 클래스의 고유 멤버뿐만 아니라 부모 클래스의 모든 멤버까지도 포함되어 있습니다.

따라서 부모 클래스의 멤버를 초기화하기 위해서는 자식 클래스의 생성자에서 부모 클래스의 생성자까지 호출해야만 합니다.

이러한 부모 클래스의 생성자 호출은 모든 클래스의 부모 클래스인 Object 클래스의 생성자까지 계속 거슬러 올라가며 수행됩니다.

따라서 자바 컴파일러는 부모 클래스의 생성자를 명시적으로 호출하지 않는 모든 자식 클래스의 생성자 첫 줄에 자동으로 다음과 같은 명령문을 추가하여, 부모 클래스의 멤버를 초기화할 수 있도록 해줍니다.

	super();


#### super() 예제

> 예제1 (잘못된 예시)

```Javascript
class Parent {

    int a;

    Parent(int n) { a = n; }

}

 

class Child extends Parent {

    int b;

    Child() {

        super();

        b = 20;

    }
```
 
부모 클래스인 Parent 클래스에는 기본 생성자가 추가되어 있지 않기 때문에 오류가 발생합니다.

따라서 매개변수를 가지는 생성자를 선언해야 할 경우에는 되도록이면 다음 예제처럼 기본 생성자까지 명시적으로 선언하는 것이 좋습니다.


> 예제2

```Javascript

class Parent {

    int a;

    Parent() { a = 10; }

    Parent(int n) { a = n; }

}

 

class Child extends Parent {

    int b;

    Child() {

①      //super(40);

        b = 20;

    }

    void display() {

        System.out.println(a);

        System.out.println(b);

    }

}

 

public class Inheritance04 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

    }

}

```

> 실행 결과

	10
	
	20

위의 예제를 그냥 실행하면, 자바 컴파일러는 주석 처리된 ①번 라인에 자동으로 super(); 구문을 삽입할 것입니다.

따라서 변수 a는 10으로 초기화됩니다.

 

하지만 ①번 라인의 주석 처리를 해제하고 실행하면, 부모 클래스인 Parent 클래스는 두 번째 생성자에 의해 초기화될 것입니다.

따라서 변수 a는 40으로 초기화됩니다.


