# Java Study act 02.


## 01 자료형(DataType)

자료형은 크게 기본형과 참조형이 있습니다.   

![Java DataType](https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F2244BE435640882F0D)
   


### [1-1] 자료형 - 기본형(Primitive Type)

1. Integral Type : 정수 형태로 사용할 수 있는 자료형 (byte, short, int, long)

2. Floating point Type : 실수 형태로 사용할 수 있는 자료형 (float, double)

3. character Type : 문자 형태로 사용할 수 있는 자료형 (char)

4. Boolean Type : 참/거짓 형태로 사용할 수 있는 자료형 (boolean)   
   
   
이제 자료형에 대해 좀 더 자세히 알아보겠습니다.
   
   
   

#### Integral Type(정수형)

Integral Type은 정수형을 저장할 수 있는 자료형입니다.

integer, short, long을 사용할 수 있는 정수 자료형은 다음과 같습니다.

| <center>타입</center> | <center>integer</center> | <center>short</center> | <center>long</center> |	
|:---:|:---:|:---:|:---:|
| **표현 내용** | 정수 | 정수 | 정수 |	
| **데이터 길이** | 4byte(32bit) | 2byte(16bit) | 8byte(64bit) |
| **사용법** | int X | short X | long X |


long, short는 모두 정수형을 저장할 수 있다는 점에서는 동일하지만, 선언 시 Memory에 할당되는 공간의 크기가 각각 다릅니다.

#### Floating point Type(실수형)

float와 double을 사용할 수 있는 실수와 관련된 자료형입니다.

| <center>타입</center> | <center>float</center> | <center>double</center> |
|:---:|:---:|:---:|
| **표현 내용** | 실수 | 실수 |
| **데이터 길이** | 4byte(32bit) | 8byte(64bit) |
| **사용법** | float X | double X |

실수형은 정수형과 마찬가지로 각 자료형은 Memory에 할당되는 공간의 크기가 다르고, 이에 따라 각 자료형이 표현할 수 있는 숫자의 범위가 달라집니다.

수학적으로도 실수는 정수를 포함하는 개념이기에 실수형 자료형에는 정수데이터를 저장할 수 있습니다.

자바에서 일반적인 실수는 기본적으로 double형입니다. float형에 실수를 저장할 시에는 숫자 뒤에 f를 붙임으로써 실수가 float형태라는 것을 명시해주어야 합니다.

#### Boolean Type(참/거짓형)

Boolean Type은 참/거짓(true/false)을 저장하는 자료형으로, boolean을 사용할 수 있습니다.

| <center>타입</center> | <center>boolean</center> | <center>char</center> |
|:---:|:---:|:---:|
| **표현 내용** | 참/거짓 | 문자 |
| **데이터 길이** | 1bit | 2byte(16bit) |
| **사용법** | boolean X | char X |



	import java.io.*;

	class Main {

		public static void main(String[] args) {

			boolean varTrue = true;

			boolean varFalse = false;

			System.out.println(varTrue);

			System.out.println(varFalse);

		}

	}


   
   
각 변수에 저장된 **boolean 값은 선택문(조건문)에서 유용하게 사용**할 수 있습니다.
   
   


#### Character Type(문자형)

Character Type은 문자형을 저장하는 자료형으로 char을 사용할 수 있습니다.

**한 개의 문자만 저장**이 가능하므로 단어 혹은 문장을 넣지 않도록 해야합니다.

> 여러 개의 문자를 저장하는 자료형은 참조형의 String 타입이 있다.   


문자는 작은 따옴표( ' )에 감싸서 표현하며 char 타입의 자료형에는 문자 1개를 저장할 수 있습니다.



### [1-2] 자료형 - 참조형(Reference Type)

기본형이 아닌 자료형은 모두 참조형입니다. 

참조형은 값이 저장된 주소를 저장하는 자료형으로, 자바에서는 모두 **객체의 주소**를 의미합니다.

> pointer 개념과 같다.

   

   

참조형은 크게 네 가지 종류가 존재합니다.



1. 클래스(Class Type)

2. 인터페이스(Interface Type)

3. 배열(Array Type)

4. Enum Type

***

## 02 상수(Constants)

상수란 **값이 변하지 않는 데이터 공간**이며, 변수 앞에 **final**을 붙여서 사용합니다.

> 상수 선언

	import java.io.*;
	
	class Main {
	
		public static void main(String[] args) {
	
			final int a = 2;
	
			System.out.println(a);
		
		}
	
	}


상수로 선언된 자료형은 **내부의 값을 변화시킬 수 없습니다.** 따라서 위 예제와 같이 선언과 동시에 초기화되어야 합니다.


***

## 03 main() method

메소드(method)는 프로그래밍 과정에서 코드의 간결성을 높여주기 윈한 기법으로 사용됩니다. 메소드를 활용하여 반복된 작업을 묶어주어 전체적인 소스코드를 간결하게 만들고 가독성을 개선할 수 있지만 이는 반복문과 차이가 있습니다.

> 메소드는 C++에서 함수(Function)라고 부르며 함수와 비슷한 역할을 한다.

> 프로그래밍을 하는데 강력한 필수도구

### [3-1] 메소드의 기본

- **메소드**에는 입력과 출력이 존재합니다.

- **입력**은 매개변수 혹은 파라미터(Parameter)라고 부릅니다. 이때, 매개변수로 선언된 변수들은 메소드 내에서 지역변수(지정된 범위 안에서만 사용할 수 이쓴 변수)처럼 사용할 수 있습니다.

- **출력**은 return value(리턴 값)이라고 부르며, 메소드가 종료된 뒤 최종으로 남는 결과 값을 뜻합니다.

  
  
  
### [3-2] main 메소드

메소드는 main 메소드와 사용자 정의 메소드 두 개로 나누어집니다. 사용자 정의 메소드는 프로그래머가 정의하여 사용하는 메소드이며 main 메소드는 특별한 용도로 사용됩니다.

main 메소드는 모든 프로그램에서 오직 하나만 존재하는 메소드입니다. 자바 프로그램은 main 메소드로부터 시작되어 main 메소드의 끝과 함께 종료됩니다.

	import java.io.*;
	
	class Test {
	
			public static void main(String[] args) {
	
				for(int i = 1 ; i <= 3 ; i++) {
	
					System.out.println(i + "번째 반복");
	
				}
	
			}
	
	}

> 즉, 프로그램이 실행되면 main 함수가 가장 먼저 실행되고 main 메소드 내용이 완료되었을 때 프로그램이 종료되는 것을 확인할 수 있다.

### [3-3] main() method 원형

	 public static void main(String[] args){ }

- **public** : 다른 클래스에서 메소드 접근 허용

- **static** : 객체 생성 전부터 호출 가능

main 메소드에 static이 붙어야 하는 이유는 main 메소드가 프로그램이 처음 시작되는 메소드이기 때문입니다. main 메소드보다 빨리 실행될 수 있는 코드가 없기 때문에 static을 사용하지 않으면 main 메소드의 메모리를 할당해줄 부분이 존재하지 않습니다. 때문에 프로그램 시작과 함께 main 메소드의 메모리를 할당해야 합니다.

> **static**
>
> static은 메소드 혹은 변수에 붙여 사용할 수 있다. 만약 클래스 안의 멤버에 static이 붙으면 그 멤버는 클래스의 객체를 선언하지 않고 바로 콜해서 사용할 수 있다. 	
> 즉, static이 붙은 멤버들은 프로그램이 시작될 때 우선 메모리에 할당되기 때문에 new를 통한 객체 초기화가 필요없다.	
> static을 사용할 때 클래스 내에서 static을 사용하는 메소드는 멤버변수 사용 시 static 멤버변수만 사용가능하다는 점을 주의해야한다.

> 관련 코드

	class ClassExample {
		
		public int mInt;
		
		public static void Print() {
	
			System.out.println( mInt );
	
		}
		
	}

> 앞에서 mInt에 static을 제거하면 컴파일 진행시 오류가 발생한다. 이는 Print 메소드에 static이 사용되었지만 mInt 변수에는 static이 사용되지 않았기 때문에 발생하는 오류이다.

- **void** : 리턴 값 없음

- **String[]** : 문자열 배열

- **args** : 매개변수