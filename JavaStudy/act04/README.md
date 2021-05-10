# Java Study act 04.

## 01 클래스와 객체

(1) 클래스(class)

자바에서 클래스(class)란 객체를 정의하는 틀 또는 설계도와 같은 의미로 사용됩니다.

자바에서는 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용하게 됩니다.

클래스는 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성됩니다.

즉, 필드(field)란 클래스에 포함된 변수(variable)를 의미합니다.

또한, 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있습니다.


(2) 객체(Object)

- 소프트웨어 세계에 구현할 대상

- 클래스에 선언된 모양 그대로 생성된 실체

- ‘클래스의 인스턴스(instance)’ 라고도 부릅니다.

- 객체는 모든 인스턴스를 대표하는 포괄적인 의미를 갖습니다.

- oop의 관점에서 클래스의 타입으로 선언되었을 때 ‘객체’라고 사용하게 됩니다.


(3) 인스턴스(instance)

자바에서 클래스를 사용하기 위해서는 우선 해당 클래스 타입의 객체(object)를 선언해야 합니다.

이렇게 클래스로부터 객체를 선언하는 과정을 클래스의 `인스턴스 화`라고 합니다.

또한, 이렇게 선언된 해당 클래스 타입의 객체를 인스턴스(instance)라고 합니다.

즉, 인스턴스란 메모리에 할당된 객체를 의미합니다.

자바에서는 하나의 클래스로부터 여러 개의 인스턴스를 생성할 수 있습니다.

이렇게 생성된 인스턴스는 독립된 메모리 공간에 저장된 자신만의 필드를 가질 수 있습니다.

하지만 해당 클래스의 모든 메소드(method)는 해당 클래스에서 생성된 모든 인스턴스가 공유하게 됩니다.

**(4) 클래스, 객체, 인스턴스의 차이**

**클래스(Class) VS 객체(Object)**

클래스는 ‘설계도’, 객체는 ‘설계도로 구현한 모든 대상’을 의미한다.

**객체(Object) VS 인스턴스(Instance)**

- 클래스의 타입으로 선언되었을 때 객체라고 부르고, 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부릅니다.

- 객체는 현실 세계에 가깝고, 인스턴스는 소프트웨어 세계에 가깝다고 볼 수 있습니다.

- 객체는 ‘실체’, 인스턴스는 ‘관계’에 초점을 맞춥니다.

- 객체를 ‘클래스의 인스턴스’라고도 부릅니다.

> ‘인스턴스화하여 레퍼런스를 할당한’ 객체를 인스턴스라고 말하지만, 
> 이는 원본(추상적인 개념)으로부터 생성되었다는 것에 의미를 부여하는 것일 뿐 엄격하게 객체와 인스턴스를 나누긴 어렵다.


> 클래스, 객체, 인스턴스
```Javascript
/* 클래스 */
public class Animal {
  ...
}
/* 객체와 인스턴스 */
public class Main {
  public static void main(String[] args) {
    Animal cat, dog; // '객체'

    // 인스턴스화
    cat = new Animal(); // cat은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
    dog = new Animal(); // dog은 Animal 클래스의 '인스턴스'(객체를 메모리에 할당)
  }
}
```
***

## 02 메소드(method)

1. 메소드

`메소드`란 하나 또는 여러가지 기능을 묶어서 독립적으로 사용 할 수 있는 프로그램 구성 단위로, 모듈이라고도 합니다.

입력값(파라미터)을 넣어주면 해당 기능을 처리하고 출력 값을 반환합니다.


2. 메소드 작성 형식

	자료형 메소드 이름(매개 변수1, 매개 변수2, ...){...}



3. 메소드 종류

- 파라미터와 반환값이 모두 존재하는 메소드

- 파라미터는 존재하나 반환값이 없는 메소드

e.g. main 메소드: 입력값은 있으나 출력값은 없는 메소드

- 파라미터는 없으나 반환값은 존재하는 메소드

- 둘다 없는 메소드

> main 메소드
>
> 유일하게 이름이 지정되어 있는 메소드
>
> 한 프로그램에 반드시 main 메소드가 존재해야하고 한 프로젝트당 반드시 하나만 존재해야한다.
> Call stack은 메소드를 호출하기 위한 계층으로 call stack에는 항상 main 메소드가 들어있다.

4. 메소드 형식

**[4-1] 파라미터 O, 반환값 O 메소드**

- 두개의 값을 입력 받고 결과를 반환하는 메소드

- 이렇게 메소드 안에서 호출하게 되면 입력값을 받기위한 변수로는 사용 불가함
```Javascript
	public static int add(int a, int b) {
		int c, d;
		int result = a + b;
		return result;
	}
```
 

**[4-2] 파라미터 O, 반환값 X 메소드**
```Javascript
	public static void sub(int a, int b) {//return이 없는 경우 반환형에 void 써줌
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}
 ```

**[4-3] 파라미터 X, 반환값 O 메소드**
```Javascript
	public static int mul() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;	
	}
```

**[4-4] 파라미터 X, 반환값 X 메소드**
```Javascript
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
```

***

## 03 인자전달

- 자바에서 지원하는 타입에는 primitive type과 reference type이 있다.

- primitive type : byte, char, short, int, long, float, double, boolean 등과 같은 자바 기본 타입

- reference type : java.lang.object를 상속받는 모든 객체

 

**(1) primitive type이 인자로 전달되는 경우**

 
```Javascript
public class test1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println("a = "+a);
		add(a);
		System.out.println("a = "+a);
	}
	static void add(int x) { // a의 값을 1증가 시켜주는 함수
		x++;
	}

}
``` 

> a = 10 a = 10

값이 바뀌지 않는 것을 보아 `Call By Value`임을 알 수 있다.

 

**(2) 객체 레퍼런스가 인자로 전달되는 경우**

```Javascript 

class Point{
	int x;
	Point(int x){
		this.x = x;
	}
}
public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10);
		System.out.println("a = "+p.x);
		add(p);
		System.out.println("a = "+p.x);
	}
	static void add(Point a) { // a.x 값을 1 증가 시켜주는 함수
		a.x++;
	}

}
 
```

> a = 10 a = 11
 
값이 바뀌는 것을 보아 `Call By Reference`임을 알 수 있다.

 

**(3) 배열이 인자로 전달되는 경우**

```Javascript
public class test2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10, 20};
		System.out.println("x = "+a[0]+", y = "+a[1]);
		swap(a);
		System.out.println("x = "+a[0]+", y = "+a[1]);
		
		
	}
	static void swap(int x[]) { // x[0]와 x[y] 값을 교환하는 함수
		int temp = x[0];
		x[0] = x[1];
		x[1] = temp;
	}

}
 
```

> x = 10, y = 20 x = 20, y = 10

값이 바뀌는 것을 보아 `Call By Reference`임을 알 수 있다.

 

> [정리] primitive type은 Call By Value, reference type은 Call By Value

## 04 메소드 오버로딩

1. 메소드 오버로딩

- 한 클래스 내에 이미 **이름이 같은 메소드**가 있더라도 매개 변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있는데 이를 `메소드 오버로딩`이라고 합니다.

- 클래스 내에 같은 이름의 메소드를 여러 개 선언할 수 있습니다.

- 메소드 오버로딩이 필요한 이유는 `매개 값을 다양하게 받아 처리할 수 있도록` 하기 위해서 입니다.

2. 오버로딩의 조건

![오버로딩 조건](https://t1.daumcdn.net/cfile/tistory/25679B475790995603)

(1) 메소드 이름이 같아야 한다.

(2) 매개 변수의 개수 또는 타입이 달라야 한다.

(3) 매개 변수는 같고 리턴 타입이 다른 경우는 오버로딩이 성립되지 않는다.

(4) 오버로딩 된 메소드들은 매개 변수에 의해서만 구별될 수 있다.

> 즉 매개변수의 타입, 개수, 순서 중 하나가 달라야한다.

> 쉽게 생각하면, 오버로딩은 다양한 개성을 불어넣는 것이다.
>
> 리턴타입이 뒤죽박죽이여도 되고, 다양한 매개변수를 통해 개성을 준다.
>
> 하지만 "메서드의 이름"은 같아야 한다.

3. 오버로딩의 예

(1)
```Javascript
int add(int a, int b) {return a+b;}
int add(int x, int y) {return x+y;}
```

- 두 메서드의 매개변수 이름이 다르지만(a,b 와 x,y) 매개변수 타입이 같아 오버로딩이 불가능하다. 

- 결론 : 매개변수 이름은 오버로딩에 영향을 주지 못한다. ( a ↔ x, b ↔ y )

- 매개변수 타입이 달랴야 함. ( int 와 int ) or 매개변수 개수가 달라야 함

(2)
```Javascript
int add(int a, int b) {return a+b;}
long add(int a, int b) {return (long)(a+b);}
```

- 매개변수는 같지만, 리턴타입이 다르다. (int와 long)

- 결론 : 리턴타입은 오버로딩에 영향을 주지 못한다!

(3)
```Javascript
int add(int a, long b) {return a+b;}
int add(long a, int b) {return a+b;}
```
- 위 예제는 매개변수 개수와 타입이 같지만, 순서가 다르게 되어있어서 오버로딩으로 간주한다.



- 결론 : 매개변수 이름과 리턴타입은 오버로딩과 상관이 없고 신경써야 하는 부분은 매개변수 타입 or 매개변수 개수가 달라야 한다.

***

## 05 접근 지정자

자바도 클래스의 멤버 각각에 외부에서 접근할 수 있는 범위를 지정하는 접근 지정자(access modifier)를 둘 수 있다. 다음과 같은 네 가지가 있다.


| <center>접근 지정자</center> | <center>접근 범위</center> | <center>동일 클래스</center> | <center>동일 패키지</center> | <center>다른 패키지의 클래스</center> | <center>다른 패키지</center> |
|:---:|:---:|:---:|:---:|:---:|:---:|
| **public** | 접근 제한 없음 | O | O | O | O |	
| **protected** | 동일 패키지와 상속 받은 클래스 내부 | O | O | O |   |
| **default** | 동일 패키지 내에서만 | O | O |   |   |
| **private** | 동일 클래스 내에서만 | O |   |   |   |

**(1) public**
  
공개 정도가 가장 높고 어디에서든 자유롭게 접근할 수 있다.

**(2) protected**
  
같은 패키지 내에서 접근이 가능하고 다른 패키지에서도 상속을 받은 클래스 내부에서는 사용 가능하다. public과 다른 점은 다른 패키지의 자식 클래스 외부에서는 접근할 수 없다는 것이다.

**(3) default (package private)**
  
같은 패키지 내에서만 접근이 가능하다. 아무런 접근 지정자도 없을 경우 이 옵션이 자동으로 적용된다.

**(4) private**
  
동일 클래스 내에서만 접근이 가능한 가장 낮은 단계의 자유도를 갖는다.

## 06 static

**정적(Static)이란?**

`정적(static)`은 고정된이란 의미를 가지고 있습니다.
Static이라는 키워드를 사용하여 Static변수와 Static메소드를 만들 수 있는데 다른말로 정적필드와 정적 메소드라고도 하며 이 둘을 합쳐 정적 멤버라고 합니다. (클래스 멤버라고도 합니다.) 
정적 필드와 정적 메소드는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버입니다. 
그렇기에 클래스 로더가 클래스를 로딩해서 메소드 메모리 영역에 적재할때 클래스별로 관리됩니다. 
따라서 클래스의 로딩이 끝나는 즉시 바로 사용할 수 있습니다.

**정적(Static) 멤버 생성**

![정적 멤버 생성](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fefeoz2%2FbtqDsOt6are%2F0masSctPvO9gk0PkTY7tSK%2Fimg.png)

Static 키워드를 통해 생성된 정적멤버들은 Heap영역이 아닌 Static영역에 할당됩니다. 
Static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있는 장점을 가지지만 Garbage Collector의 관리 영역 밖에 존재하기에 Static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재하게 됩니다. 
그렇기에 Static을 너무 남발하게 되면 만들고자 하는 시스템 성능에 악영향을 줄 수 있습니다.


**정적(Static) 멤버 선언**

필드나 메소드를 생성 시 인스턴스로 생성할것인지 정적으로 생성할것인지에 대한 판단 기준은 공용으로 사용하느냐 아니냐로 내리면 됩니다. 그냥 생성한다면 자동으로 인스턴스로 생성되며 정적으로 생성하려면 필드와 메소드 선언 시 static이라는 키워들를 추가적으로 붙이면 됩니다. 

```Javascript
static int num = 0; //타입 필드 = 초기값
public static void static_method(){} //static 리턴 타입 메소드 {}
```

> 정적(Static) 필드 사용 예시
```Javascript
class Number{
    static int num = 0; //클래스 필드
    int num2 = 0; //인스턴스 필드
}

public class Static_ex {
	
    public static void main(String[] args) {
    	Number number1 = new Number(); //첫번째 number
    	Number number2 = new Number(); //두번쨰 number
    	
    	number1.num++; //클래스 필드 num을 1증가시킴
    	number1.num2++; //인스턴스 필드 num을 1증가시킴
    	System.out.println(number2.num); //두번째 number의 클래스 필드 출력
    	System.out.println(number2.num2); //두번째 number의 인스턴스 필드 출력
    }
}
```
> 실행결과

	1
	0

- 인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 인스턴스마다 각기 다른 값을 가지지만 정적 변수는 모든 인스턴스가 하나의 저장공간을 공유하기에 항상 같은 값을 가지기에 나타난 현상입니다.

**정적(Static) 메서드 사용 예시**
```Javascript
class Name{
    static void print() { //클래스 메소드
	System.out.println("내 이름은 홍길동입니다.");
    }

    void print2() { //인스턴스 메소드
	System.out.println("내 이름은 이순신입니다.");
    }
}

public class Static_ex {
	
    public static void main(String[] args) {
        Name.print(); //인스턴스를 생성하지 않아도 호출이 가능
    	
        Name name = new Name(); //인스턴스 생성
        name.print2(); //인스턴스를 생성하여야만 호출이 가능
    }
}
```
> 실행결과

	내 이름은 홍길동입니다.
	내 이름은 이순신입니다.

- 정적 메소드는 클래스가 메모리에 올라갈 때 정적 메소드가 자동적으로 생성됩니다. 
그렇기에 정적 메소드는 인스턴스를 생성하지 않아도 호출을 할 수 있습니다. 
정적 메소드는 유틸리티 함수를 만드는데 유용하게 사용됩니다.


**non-static 멤버와 static 멤버의 특징**

1. 눈은 각 사람마다 하나씩 있고, 공기는 오직 하나만 있어서 모든 사람이 공유한다는 차이점이 있다. 여기서 눈은 사람이라는 객체의 non-static 멤버(=인스턴스 멤버)이며, 공기는 static 멤버(클래스 멤버) 이다.

2. static 멤버는 클래스당 하나씩 생긴다고 해서 클래스 멤버라고도 부르며, non-static멤버는 각 객체마다 하나식 생긴다고 해서 인스턴스 멤버라고도 불부른다.

3. static 메소드는 객체가 생성되지 않은 상황에서도 사용이 가능하므로 객체를 생성하지 않고서는 직접 인스턴스 변수, 인스턴스 메소드 등을 사용할 수 없다. 그러나, 인스턴스 메소드는 static멤버들을 모두 사용할 수 있다.

4. public static void main(String args[]) 인 main 메소드도 static 메소드이고 객체를 생성해야만 사용할 수 있는 인스턴스 변수 및 인스턴스 메소드의 특성 때문에 객체를 생성되지 않은 상황에서 클래스 이름을 이용하여  인스턴스 변수 및 인스턴스 메소드를 사용할 수 없다고 하겠다. 사용하려면, 객체를 우선 생성한 후 인스턴스 변수와 인스턴스 메소드를 사용하여야 한다. 따라서 main 메소드에서 인스턴스 변수와 인스턴스 메소드 사용은 객체 생성이 필수적이다.

5. static 메소드에서는 this 키워드를 사용할 수 없다. static 메소드는 객체가 생성되지 않은 상황에서도 클래스 이름을 이용하여 호출이 가능하기 때문에 호출 당시 실행 중인 객체를 가리키는 this 연산자를 사용할 수 없다. 따라서, public static void main(String args[]) 인 main 메소드도 this 연산자 사용이 불가능 하다.


## 07 final
 
**final 필드**

	final int number = 1; //final 타입 필드 [= 초기값];

final 필드는 위와 같이 선언하며 final 필드의 초기값을 줄 수 있는 방법은 딱 두가지 방법밖에 없습니다. 
첫번째는 필드 선언시에 주는 방법이 있고, 두번째는 생성자를 통해서 주는 방법이 있습니다. 
단순 값이라면 필드 선언시에 주는 것이 가장 간단하지만 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부 데이터로 초기화를 시켜야한다면 생성자를 통해서 초기값을 부여하는 방법을 써야 합니다. 생성자는 final 필드의 최종 초기화를 마쳐야 하는데 만약 초기화가 되지 않은 final 필드가 있다면 컴파일 에러가 발생합니다.