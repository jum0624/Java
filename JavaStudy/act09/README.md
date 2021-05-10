# act.09

## 01 컬렉션(Collection)

Java에서 `컬렉션(Collection)`이란 데이터의 집합, 그룹을 의미하며 


`컬렉션 프레임워크(collection framework)`란 다수의 데이터를 쉽고 효과적으로 처리할 수 있는 표준화된 방법을 제공하는 클래스의 집합을 의미합니다.

즉, 데이터를 저장하는 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현해 놓은 것입니다.

 

이러한 컬렉션 프레임워크는 자바의 인터페이스(interface)를 사용하여 구현됩니다.


### 컬렉션 프레임워크 주요 인터페이스
컬렉션 프레임워크에서는 데이터를 저장하는 자료 구조에 따라 다음과 같은 핵심이 되는 주요 인터페이스를 정의하고 있습니다.

 
```
1. List 인터페이스

2. Set 인터페이스

3. Map 인터페이스
```
 
다음은 Java 컬렌션 프레임워크의 상속구조를 나타냅니다.

![Java collection Framework](https://t1.daumcdn.net/cfile/tistory/99B88F3E5AC70FB419)


이 중에서 List와 Set 인터페이스는 모두 Collection 인터페이스를 상속받지만, 구조상의 차이로 인해 Map 인터페이스는 별도로 정의됩니다.

따라서 List 인터페이스와 Set 인터페이스의 공통된 부분을 Collection 인터페이스에서 정의하고 있습니다. 

 
### 주요 인터페이스 간의 상속 관계
자바에서 컬렉션 프레임워크를 구성하고 있는 인터페이스 간의 상속 관계는 다음 그림과 같습니다.

 

![컬렉션 프레임워크 인터페이스 다이어그램](http://www.tcpschool.com/lectures/img_java_collection_interface_diagram.png)

 

위의 그림에서 <E>나 <K, V>라는 것은 컬렉션 프레임워크를 구성하는 모든 클래스가 제네릭으로 표현되어 있음을 알려줍니다.

### 주요 인터페이스의 간략한 특징
자바에서 컬렉션 프레임워크를 구성하고 있는 주요 인터페이스의 간략한 특징은 다음과 같습니다.



## 02 제네릭(Generic)

**제네릭(generic)이란?**

자바에서 `제네릭(generic)`이란 데이터의 타입(data type)을 `일반화한다(generalize)`는 것을 의미합니다.

제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법입니다.

이렇게 컴파일 시에 미리 타입 검사(type check)를 수행하면 다음과 같은 장점을 가집니다.

 
```
1. 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있습니다

2. 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.
```
 

JDK 1.5 이전에서는 여러 타입을 사용하는 대부분의 클래스나 메소드에서 인수나 반환값으로 Object 타입을 사용했습니다.

하지만 이 경우에는 반환된 Object 객체를 다시 원하는 타입으로 타입 변환해야 하며, 이때 오류가 발생할 가능성도 존재합니다.

하지만 JDK 1.5부터 도입된 제네릭을 사용하면 컴파일 시에 미리 타입이 정해지므로, 타입 검사나 타입 변환과 같은 번거로운 작업을 생략할 수 있게 됩니다.


### 제네릭의 선언 및 생성

자바에서 제네릭은 클래스와 메소드에만 다음과 같은 방법으로 선언할 수 있습니다.

**예제**

```Java
class MyArray<T> {

    T element;

    void setElement(T element) { this.element = element; }

    T getElement() { return element; }

}
```
 

위의 예제에서 사용된 'T'를 타입 변수(type variable)라고 하며, 임의의 참조형 타입을 의미합니다.

꼭 'T'뿐만 아니라 어떠한 문자를 사용해도 상관없으며, 여러 개의 타입 변수는 쉼표(,)로 구분하여 명시할 수 있습니다.

타입 변수는 클래스에서뿐만 아니라 메소드의 매개변수나 반환값으로도 사용할 수 있습니다. 

 

위와 같이 선언된 제네릭 클래스(generic class)를 생성할 때에는 타입 변수 자리에 사용할 실제 타입을 명시해야 합니다.

**예제**

```Java
MyArray<Integer> myArr = new MyArray<Integer>();
```
 

위의 예제는 MyArray 클래스에 사용된 타입 변수로 Integer 타입을 사용하는 예제입니다.

위처럼 제네릭 클래스를 생성할 때 사용할 실제 타입을 명시하면, 내부적으로는 정의된 타입 변수가 명시된 실제 타입으로 변환되어 처리됩니다.

> 자바에서 타입 변수 자리에 사용할 실제 타입을 명시할 때 기본 타입을 바로 사용할 수는 없습니다.
> 
> 이때는 위 예제의 Integer와 같이 래퍼(wrapper) 클래스를 사용해야만 합니다.


또한, Java SE 7부터 인스턴스 생성 시 타입을 추정할 수 있는 경우에는 타입을 생략할 수 있습니다.

> 예제
```Java
MyArray<Integer> myArr = new MyArray<>(); // Java SE 7부터 가능함.
```
 

다음 예제는 제네릭에서 적용되는 타입 변수의 다형성을 보여주는 예제입니다.

> 예제

```Java
import java.util.*;

 

class LandAnimal { public void crying() { System.out.println("육지동물"); } }

class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }

class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }

class Sparrow { public void crying() { System.out.println("짹짹"); } }

 

class AnimalList<T> {

    ArrayList<T> al = new ArrayList<T>();

 

    void add(T animal) { al.add(animal); }

    T get(int index) { return al.get(index); }

    boolean remove(T animal) { return al.remove(animal); }

    int size() { return al.size(); }

}

 

public class Generic01 {

    public static void main(String[] args) {

        AnimalList<LandAnimal> landAnimal = new AnimalList<>(); // Java SE 7부터 생략가능함.

 

        landAnimal.add(new LandAnimal());

        landAnimal.add(new Cat());

        landAnimal.add(new Dog());

        // landAnimal.add(new Sparrow()); // 오류가 발생함.

 

        for (int i = 0; i < landAnimal.size() ; i++) {

            landAnimal.get(i).crying();

        }

    }

}
```

> 실행 결과
```
육지동물

냐옹냐옹

멍멍
```
 

위의 예제에서 Cat과 Dog 클래스는 LandAnimal 클래스를 상속받는 자식 클래스이므로, AnimalList<LandAnimal>에 추가할 수 있습니다.

하지만 Sparrow 클래스는 타입이 다르므로 추가할 수 없습니다.

### 제네릭의 제거 시기

자바 코드에서 선언되고 사용된 제네릭 타입은 컴파일 시 컴파일러에 의해 자동으로 검사되어 타입 변환됩니다.

그리고서 코드 내의 모든 제네릭 타입은 제거되어, 컴파일된 class 파일에는 어떠한 제네릭 타입도 포함되지 않게 됩니다.

이런 식으로 동작하는 이유는 제네릭을 사용하지 않는 코드와의 호환성을 유지하기 위해서입니다.

### 제네릭 메소드(generic method)

`제네릭 메소드`란 메소드의 선언부에 타입 변수를 사용한 메소드를 의미합니다.

이때 타입 변수의 선언은 메소드 선언부에서 반환 타입 바로 앞에 위치합니다.

> 예제
```Java
public static <T> void sort( ... ) { ... }
```
 

**다음 예제의 제네릭 클래스에서 정의된 타입 변수 T와 제네릭 메소드에서 사용된 타입 변수 T는 전혀 별개의 것임을 주의해야 합니다.**

> 예제
```Java
class AnimalList<T> {

    ...

    public static <T> void sort(List<T> list, Comparator<? super T> comp) {

        ...

    }

    ...

}
```

### 와일드카드의 사용
`와일드카드(wild card)`란 이름에 제한을 두지 않음을 표현하는 데 사용되는 기호를 의미합니다.

자바의 제네릭에서는 `물음표(?)` 기호를 사용하여 이러한 와일드카드를 사용할 수 있습니다.

> 문법
```Java
<?>           // 타입 변수에 모든 타입을 사용할 수 있음.

<? extends T> // T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음.

<? super T>   // T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.
```
 

다음 예제는 클래스 메소드(static method)인 cryingAnimalList() 메소드의 매개변수의 타입을 와일드카드를 사용하여 제한하는 예제입니다.

> 예제

```Java
import java.util.*;

 

class LandAnimal { public void crying() { System.out.println("육지동물"); } }

class Cat extends LandAnimal { public void crying() { System.out.println("냐옹냐옹"); } }

class Dog extends LandAnimal { public void crying() { System.out.println("멍멍"); } }

class Sparrow { public void crying() { System.out.println("짹짹"); } }

 

class AnimalList<T> {

    ArrayList<T> al = new ArrayList<T>();

 

    public static void cryingAnimalList(AnimalList<? extends LandAnimal> al) {

        LandAnimal la = al.get(0);

        la.crying();

    }

 

    void add(T animal) { al.add(animal); }

    T get(int index) { return al.get(index); }

    boolean remove(T animal) { return al.remove(animal); }

    int size() { return al.size(); }

}

 

public class Generic03 {

    public static void main(String[] args) {

        AnimalList<Cat> catList = new AnimalList<Cat>();

        catList.add(new Cat());

        AnimalList<Dog> dogList = new AnimalList<Dog>();

        dogList.add(new Dog());

 

        AnimalList.cryingAnimalList(catList);

        AnimalList.cryingAnimalList(dogList);

    }

}
```

> 실행 결과

```
냐옹냐옹

멍멍
```

## 03 Collection Class

- 여러 개의 주소를 보관할 때 사용하는 클래스이다.

- 사용 목적 :

  배열의 문제는 인스턴스를 배열 크기 만큼만 저장할 수 있다는 것이다.

  더 추가로 저장하고 싶다면, 새 배열을 만들어야 한다.

  관리하기 너무 번거롭다.



### 자바에서 제공하는 컬렉션 클래스의 종류

 1) List 계열 

    - null 값을 저장할 수 있다.

    - 값을 중복 저장할 수 없다.

    - 값을 넣는 순서대로 저장한다.

      그래서 값을 꺼낼 때도 넣은 순서대로 꺼낼 수 있다.

    - 값을 꺼낼 때 숫자 인덱스를 사용하여 꺼낸다.

    - 예) ArrayList, LinkedList



2) set계열

    - HashSet

    - null 값을 저장할 수 있다.

    - 값을 중복 저장할 수 없다.

       이유 -> 집합이기 때문

    - 값을 넣을 때 인스턴스의 해시값을 기준으로 저장하기 때문에

      순서대로 저장되지 않는다.

      그래서 값을 꺼낼 때도 순서대로 꺼낼 수 없다.

    - 값을 꺼낼 때 숫자 인덱스로 꺼낼 수 없다.

    - 예) HashSet



3) Map 계열

    - 값을 저장할 때 key 개체의 해시 값(hash value)을 사용하여 저장한다.

    - 값을 꺼낼 때도 key 객체의 해시 값을 사용하여 꺼낸다.

    - 값을 중복 저장할 수 없다.

    - 순서대로 저장하고 순서대로 꺼낼 수 없다.

    - 보통 문자열 라벨을 사용하여 값을 저장하고 꺼낼 때 주로 사용한다.

    - 예)

       HashMap :

       - key나 value로 null을 허용한다.

       - 동기화를 지원하지 않는다.

          => 여러 스레드가 동시에 접근하여 값을 변경하는 것을 막지 않는다.

          => 데이터의 입출력 속도가 빠르다.

          => 대신 여러 스레드가 동시에 값을 바꿀 수 있기 때문에 

               멀티 스레드 상황에서 사용할 때 주의해야 한다.



       Hashtable : 

       - key나 value로 null을 허용하지 않는다.

       - 동기화를 지원한다.

          => 여러 스레드가 동시에 접근하더라도 그 중 한개의 스레드만이 접근할 수 있다.

          => 데이터의 입출력 속도가 느리다.

          => 대신 여러 스레드가 동시에 값을 바꿀 수 없기 때문에

               멀티 스레드 상황에서 안전하게 사용할 수 있다.

> 참고 
- [List](http://www.tcpschool.com/java/java_collectionFramework_list)

- [stackQueue](http://www.tcpschool.com/java/java_collectionFramework_stackQueue)

- [set](http://www.tcpschool.com/java/java_collectionFramework_set)

- [Map](http://www.tcpschool.com/java/java_collectionFramework_map)

