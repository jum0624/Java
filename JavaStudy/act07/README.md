# act.07

## 01 추상 클래스

### [1-1] 추상 메소드(abstract method)

`추상 메소드(abstract method)`란 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드를 의미합니다.

자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함입니다.

 

예를 들면 모듈처럼 중복되는 부분이나 공통적인 부분은 미리 다 만들어진 것을 사용하고, 이를 받아 사용하는 쪽에서는 자신에게 필요한 부분만을 재정의하여 사용함으로써 생산성이 향상되고 배포 등이 쉬워지기 때문입니다.

 

이러한 추상 메소드는 선언부만이 존재하며, 구현부는 작성되어 있지 않습니다.

바로 이 작성되어 있지 않은 구현부를 자식 클래스에서 오버라이딩하여 사용하는 것입니다.

 

자바에서 추상 메소드는 다음과 같은 문법으로 선언합니다.

**문법**
```
abstract 반환타입 메소드이름();
``` 

위와 같이 선언부만 있고 구현부가 없다는 의미로 선언부 끝에 바로 세미콜론(;)을 추가합니다.

### [1-2] 추상 클래스(abstract class)

자바에서는 하나 이상의 추상 메소드를 포함하는 클래스를 가리켜 `추상 클래스(abstract class)`라고 합니다.

이러한 추상 클래스는 객체 지향 프로그래밍에서 중요한 특징인 다형성을 가지는 메소드의 집합을 정의할 수 있도록 해줍니다.

즉, 반드시 사용되어야 하는 메소드를 추상 클래스에 추상 메소드로 선언해 놓으면, 이 클래스를 상속받는 모든 클래스에서는 이 추상 메소드를 반드시 재정의해야 합니다.

 

자바에서 추상 클래스는 다음과 같은 문법으로 선언합니다.

**문법**
```
abstract class 클래스이름 {

    ...

    abstract 반환타입 메소드이름();

    ...

}
```
 

이러한 추상 클래스는 동작이 정의되어 있지 않은 추상 메소드를 포함하고 있으므로, 인스턴스를 생성할 수 없습니다.

추상 클래스는 먼저 상속을 통해 자식 클래스를 만들고, 만든 자식 클래스에서 추상 클래스의 모든 추상 메소드를 오버라이딩하고 나서야 비로소 자식 클래스의 인스턴스를 생성할 수 있게 됩니다.

 

> 추상 클래스는 추상 메소드를 포함하고 있다는 점을 제외하면, 일반 클래스와 모든 점이 같습니다.
> 
> 즉, 생성자와 필드, 일반 메소드도 포함할 수 있습니다.
 

> 예제
```Java
abstract class Animal { abstract void cry(); }

class Cat extends Animal { void cry() { System.out.println("냐옹냐옹!"); } }

class Dog extends Animal { void cry() { System.out.println("멍멍!"); } }

 

public class Polymorphism02 {

    public static void main(String[] args) {

        // Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없음.

        Cat c = new Cat();

        Dog d = new Dog();

 

        c.cry();

        d.cry();

    }

}
```

> 실행 결과
```
냐옹냐옹!

멍멍!
```
 

위의 예제에서 추상 클래스인 Animal 클래스는 추상 메소드인 cry() 메소드를 가지고 있습니다.

Animal 클래스를 상속받는 자식 클래스인 Dog 클래스와 Cat 클래스는 cry() 메소드를 오버라이딩해야만 비로소 인스턴스를 생성할 수 있습니다.

### [1-3] 추상 메소드의 사용 목적

자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함입니다.

만약 일반 메소드로 구현한다면 사용자에 따라 해당 메소드를 구현할 수도 있고, 안 할 수도 있습니다.

하지만 추상 메소드가 포함된 추상 클래스를 상속받은 모든 자식 클래스는 추상 메소드를 구현해야만 인스턴스를 생성할 수 있으므로, 반드시 구현하게 됩니다.

## 02 인터페이스

`인터페이스(interface)`란?

자식 클래스가 여러 부모 클래스를 상속받을 수 있다면, 다양한 동작을 수행할 수 있다는 장점을 가지게 될 것입니다.

하지만 클래스를 이용하여 다중 상속을 할 경우 메소드 출처의 모호성 등 여러 가지 문제가 발생할 수 있어 자바에서는 클래스를 통한 다중 상속은 지원하지 않습니다.

 

하지만 다중 상속의 이점을 버릴 수는 없기에 자바에서는 인터페이스라는 것을 통해 다중 상속을 지원하고 있습니다.

인터페이스(interface)란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미합니다.

 

자바에서 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있습니다.

하지만 인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함할 수 있습니다.

### [2-1] 인터페이스 선언

자바에서 인터페이스를 선언하는 방법은 클래스를 작성하는 방법과 같습니다.

인터페이스를 선언할 때에는 접근 제어자와 함께` interface 키워드`를 사용하면 됩니다.

 

자바에서 인터페이스는 다음과 같이 선언합니다.

**문법**
```
접근제어자 interface 인터페이스이름 {

    public static final 타입 상수이름 = 값;

    ...

    public abstract 메소드이름(매개변수목록);

    ...

}
```
 

단, 클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 합니다.

이 부분은 모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있습니다.

이렇게 생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해 줍니다.

### [2-2] 인터페이스의 구현

인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수는 없습니다.

따라서 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 작성해야만 합니다.

 

자바에서 인터페이스는 다음과 같은 문법을 통해 구현합니다.

**문법**
```
class 클래스이름 implements 인터페이스이름 { ... }
```
 

만약 모든 추상 메소드를 구현하지 않는다면, abstract 키워드를 사용하여 추상 클래스로 선언해야 합니다.

 

다음 예제는 인터페이스를 구현하는 예제입니다.

> 예제
```Java
interface Animal { public abstract void cry(); }

 

class Cat implements Animal {

    public void cry() {

        System.out.println("냐옹냐옹!");

    }

}

 

class Dog implements Animal {

    public void cry() {

        System.out.println("멍멍!");

    }

}

 

public class Polymorphism03 {

    public static void main(String[] args) {

        Cat c = new Cat();

        Dog d = new Dog();

 

        c.cry();

        d.cry();

    }

}
```


> 실행 결과
```
냐옹냐옹!

멍멍!
```
 

자바에서는 다음과 같이 상속과 구현을 동시에 할 수 있습니다.

**문법**
```
class 클래스이름 extend 상위클래스이름 implements 인터페이스이름 { ... }
```
 

> 인터페이스는 인터페이스로부터만 상속을 받을 수 있으며, 여러 인터페이스를 상속받을 수 있습니다.
 

다음 예제는 인터페이스를 사용한 다중 상속의 예제입니다.

> 예제
```Java
interface Animal { public abstract void cry(); }

interface Pet { public abstract void play(); }

 

class Cat implements Animal, Pet {

    public void cry() {

        System.out.println("냐옹냐옹!");

    }

    public void play() {

        System.out.println("쥐 잡기 놀이하자~!");

    }

}

 

class Dog implements Animal, Pet {

    public void cry() {

        System.out.println("멍멍!");

    }

    public void play() {

        System.out.println("산책가자~!");

    }

}

 

public class Polymorphism04 {

    public static void main(String[] args) {

        Cat c = new Cat();

        Dog d = new Dog();

 

        c.cry();

        c.play();

        d.cry();

        d.play();

    }

}
```

> 실행 결과
```
냐옹냐옹!

나비야~ 쥐 잡기 놀이하자~!

멍멍!

바둑아~ 산책가자~!
```
 

위의 예제에서 Cat 클래스와 Dog 클래스는 각각 Animal과 Pet이라는 두 개의 인터페이스를 동시에 구현하고 있습니다.

### [2-3] 클래스를 이용한 다중 상속의 문제점

클래스를 이용하여 다중 상속을 하면 다음 예제와 같은 메소드 출처의 모호성 등의 문제가 발생할 수 있습니다.

 

> 예제
```Java
class Animal { 

    public void cry() {

        System.out.println("짖기!");

    }

}

 

class Cat extends Animal {

    public void cry() {

        System.out.println("냐옹냐옹!");

    }

}

 

class Dog extends Animal {

    public void cry() {

        System.out.println("멍멍!");

    }

}

 

① class MyPet extends Cat, Dog {}

 

public class Polymorphism {

    public static void main(String[] args) {

        MyPet p = new MyPet();

②      p.cry();

    }

}
```
 

위의 예제에서 Cat 클래스와 Dog 클래스는 각각 Animal 클래스를 상속받아 cry() 메소드를 오버라이딩하고 있습니다.

여기까지는 문제가 없지만, ①번 라인에서 MyPet 클래스가 Cat 클래스와 Dog 클래스를 동시에 상속받게 되면 문제가 발생합니다.

②번 라인에서 MyPet 인스턴스인 p가 cry() 메소드를 호출하면, 이 메소드가 Cat 클래스에서 상속받은 cry() 메소드인지 Dog 클래스에서 상속받은 cry() 메소드인지를 구분할 수 없는 모호성을 지니게 됩니다.

이와 같은 이유로 자바에서는 클래스를 이용한 다중 상속을 지원하지 않는 것입니다.

 

하지만 다음 예제처럼 인터페이스를 이용하여 다중 상속을 하게되면, 위와 같은 메소드 호출의 모호성을 방지할 수 있습니다.

> 예제
```Java
interface Animal { public abstract void cry(); }

 

interface Cat extends Animal { public abstract void cry(); }

interface Dog extends Animal { public abstract void cry(); }

 

class MyPet implements Cat, Dog {

    public void cry() {

        System.out.println("멍멍! 냐옹냐옹!");

    }

}

 

public class Polymorphism05 {

    public static void main(String[] args) {

        MyPet p = new MyPet();

        p.cry();

    }

}
```

> 실행 결과
```
멍멍! 냐옹냐옹!
```
 

위의 예제에서는 Cat 인터페이스와 Dog 인터페이스를 동시에 구현한 MyPet 클래스에서만 cry() 메소드를 정의하므로, 앞선 예제에서 발생한 메소드 호출의 모호성이 없습니다.

### [2-4] 인터페이스의 장점

인터페이스를 사용하면 다중 상속이 가능할 뿐만 아니라 다음과 같은 장점을 가질 수 있습니다.

 

1. 대규모 프로젝트 개발 시 일관되고 정형화된 개발을 위한 표준화가 가능합니다.

2. 클래스의 작성과 인터페이스의 구현을 동시에 진행할 수 있으므로, 개발 시간을 단축할 수 있습니다.

3. 클래스와 클래스 간의 관계를 인터페이스로 연결하면, 클래스마다 독립적인 프로그래밍이 가능합니다.

## 03 추상클래스 VS 인터페이스

추상클래스와 인터페이스의 공통점은 추상메서드를 사용할 수 있다는 것입니다. 

그럼 왜 굳이 2가지로 나눠서 사용할까요?

추상클래스와 인터페이스의 기능들을 살펴보면 추상클래스가 인터페이스의 역할을 다 할 수 있는데 왜 굳이 인터페이스라는게 있는 걸까요?

이론적인 차이점을 다 제외하고 두개로 나눠서 사용하는 가장 큰 차이점은 사용용도라고 생각합니다.

 

### [3-1] 사용의도 차이점

추상클래스는 IS - A "~이다".

인터페이스는 HAS - A "~을 할 수 있는".

이렇게 구분하는 이유는 다중상속의 가능 여부에 따라 용도를 정한 것 같습니다. 자바의 특성상 한개의 클래스만 상속이 가능하여 해당 클래스의 구분을 추상클래스 상속을 통해 해결하고, 할 수 있는 기능들을 인터페이스로 구현합니다.

 

### [3-2] 공통된 기능 사용 여부
만약 모든 클래스가 인터페이스를 사용해서 기본 틀을 구성한다면 공통으로 필요한 기능들도 모든 클래스에서 오버라이딩 하여 재정의 해야하는 번거로움이 있습니다. 

이렇게 공통된 기능이 필요하다면 추상클래스를 이용해서 일반 메서드를 작성하여 자식 클래스에서 사용할 수 있도록 하면 된다. 

어!? 그러면 그냥 추상클래스만 사용하면 되는 거 아닌가요? 위에서 얘기 했듯이 자바는 하나의 클래스만 상속이 가능합니다. 

만약 각각 다른 추상클래스를 상속하는데 공통된 기능이 필요하다면? 해당 기능을 인터페이스로 작성해서 구현하는게 편하겠죠?



**추상클래스 인터페이스 예제 (생명체)**

![추상클래스 인터페이스](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbstzKQ%2FbtqBSPHUrzK%2FKpjOscUdnrMyOyJrWilSH1%2Fimg.png)

인간과 동물은 생명체를 상속하고 각 생명체들은 구분에 따라 인간과 동물을 상속합니다.

**정리**

- 추상클래스 사용 시기 : 상속 관계를 쭉 타고 올라갔을때 같은 조상클래스를 상속하는데 기능까지 완변히 똑같은 기능이 필요한 경우

(ex. attack, printInfo)

- 인터페이스 사용 시기 : 상속 관계를 쭉 타고 올라갔을때 다른 조상클래스를 상속하는데 같은 기능이 필요할 경우 인터페이스 사용

(ex. Swimable)

 