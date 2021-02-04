# Java Concept 01.


## 01 자료형(DataType)

자료형은 크게 기본형과 참조형이 있습니다.   
   


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
