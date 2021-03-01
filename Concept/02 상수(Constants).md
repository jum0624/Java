# Java Concept 02.


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
