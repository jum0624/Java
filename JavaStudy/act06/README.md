# act.06

## 01 업캐스팅과 다운캐스팅

`캐스팅(Casting)`이란?

우선, 캐스팅이란 타입 변환을 말한다. 

자바에서 클래스에 대한 캐스팅은 업캐스팅과 다운캐스팅으로 나뉜다.

### [1-1] 업캐스팅(Upcasting)

자바에서 서브 클래스는 슈퍼 클래스의 속성을 받기 때문에, 서브 클래스의 객체는 슈퍼 클래스의 멤버를 모드 가진다.

**서브 클래스는 슈퍼 클래스의 모든 특성을 상속받는다는 말이다.** 따라서, 서브 클래스는 슈퍼 클래스로 취급될 수 있다.

이 때, 업캐스팅(Upcasting)이란, 서브 클래스의 객체가 슈퍼 클래스 타입으로 형변환한다는 것을 말한다.

다시 말하자면, 슈퍼 클래스의 레퍼런스 변수가 서브 클래스로 객체화된 인스턴스를 가리킬 수 있게 되는 것이다.

> "사람은 동물이다" 정도로 생각하면 된다.

```Java
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    String check;
    Student(String name){
        super(name);
    }
}
public class Practices {
    public static void main(String[] args){
        Student stu = new Student("홍길동");
        Person per = stu; //업캐스팅
        per.check = "이름입니다"; //컴파일에러 발생
        System.out.println(per.name);
    }

}
```

위 코드에서 슈퍼클래스 타입의 래퍼런스 per이 서브클래스 객체 stu를 가리키도록 되는 것이 업캐스팅이다.

업캐스팅을 통하여 Person타입의 per은 Student 객체를 가치키지만, per은 Person 타입이기 때문에 per로는 Person클래스의 멤버에만 접근이 가능하다.

그렇기 때문에 per.check에서 컴퍼일 에러가 발생하게 된다.

### [1-2] 다운캐스팅(Downcasting)

업캐스팅과 반대로 캐스팅하는 것을 다운캐스팅(Downcasting)이라고 한다.

자신의 고유한 특성을 잃은 서브클래스의 객체를 다시 복구시켜주는 것을 말하는데, 다시 말하자면 업캐스팅 된 것을 다시 원상태로 돌리는 것을 말한다.

```Java
class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class Student extends Person{
    String check;
    Student(String name){
        super(name);
    }
}
public class Practices {
    public static void main(String[] args){
        Person per = new Student("홍길동");

        Student stu = (Student)per; //Downcasting
        stu.name = "김가나";
        stu.check = "확인용";

        System.out.println(stu.name);
        System.out.println(stu.check);
    }

}
```

우선 업캐스팅과의 차이점은 명시적으로 타입을 지정해야 한다는 것이다.

그리고 업캐스팅이 선행되어야 한다.

```Java
Person per = new Student("홍길동");
```

우선 이 코드에서 업캐스팅이 실행되었다.

```Java
Student stu = (Student)per;
```
에서 다운캐스팅을 하였는데 보면 (Student)로 형변환을 해주었다.

다운캐스팅은 이와같이 명시적으로 타입 변환을 해주어야 한다.

***

## 02 instanceof

`instanceof 연산자` : 객체의 타입이 맞는지 확인한다.

객체의 클래스를 알아내는 연산자 입니다.

 

추상클래스를 사용하다 보면 많은 양의 서브 클래스를 다뤄야 하는 경우가 있습니다.

이럴 때 instanceof 연산자를 사용하여 어떤 서브클래스 객체를 사용하는지 알아낼 수 있습니다.

 

instanceof 연산자를 사용하면 좌변의 변수가 가리키는 객체의 클래스가

오른쪽과 같은 클래스인지 여부를 확인할 수 있습니다.

```Java
class Parent{}

class Child extends Parent{}

 

public class InstanceofTest {

    

    public static void main(String[] args){

        Parent parent = new Parent();

        Child child = new Child();

        

        System.out.println( parent instanceof Parent );  // true

        System.out.println( child instanceof Parent );   // true

        System.out.println( parent instanceof Child );   // false

        System.out.println( child instanceof Child );   // true

 

    }

 

}
```

왜 세번째는 false가 반환되었을까?

instanceof를 위에서 "객체타입 확인","형변환 가능한지 여부 확인" 이라 말했는데 어렵게 느껴진다면

쉽게 말해 " instancof는 해당 클래스가 자기집이 맞는지 확인해 주는것 " 이라고 생각하면 될것이다.

 > 정리

1. 부모가 본인집을 찾았으니 true

2. 자식이 상속받은 부모집을 찾았으니 true (상속을 받았으니 자기집이라해도 무방하죠?)

3. 부모가 자식집을 찾았으니 false (자식집은 자식집이지 부모집은 아니니까요)

4. 자식이 본인집을 찾았으니 true 

***

## 03 오버라이딩

`메소드 오버라이딩(method overriding)`

앞서 배운 `오버로딩(overloading)`이란 서로 다른 시그니처를 갖는 **여러 메소드를 하나의 이름으로 정의하는 것**이었습니다.

`오버라이딩(overriding)`이란 상속 관계에 있는 부모 클래스에서 **이미 정의된 메소드를 자식 클래스에서 같은 시그니쳐를 갖는 메소드로 다시 정의하는 것**이라고 할 수 있습니다.

 

자바에서 자식 클래스는 부모 클래스의 private 멤버를 제외한 모든 메소드를 상속받습니다.

이렇게 상속받은 메소드는 그대로 사용해도 되고, 필요한 동작을 위해 재정의하여 사용할 수도 있습니다.

즉, 메소드 오버라이딩이란 상속받은 부모 클래스의 메소드를 재정의하여 사용하는 것을 의미합니다.

### 오버라이딩의 조건

자바에서 메소드를 오버라이딩하기 위한 조건은 다음과 같습니다.

 
1. 오버라이딩이란 메소드의 동작만을 재정의하는 것이므로, 메소드의 선언부는 기존 메소드와 완전히 같아야 합니다.

    하지만 메소드의 반환 타입은 부모 클래스의 반환 타입으로 타입 변환할 수 있는 타입이라면 변경할 수 있습니다.

2. 부모 클래스의 메소드보다 접근 제어자를 더 좁은 범위로 변경할 수 없습니다

3. 부모 클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없습니다.

### [3-1] 메소드 오버라이딩

자바에서는 메소드 오버라이딩을 통해 상속받은 부모 클래스의 메소드를 자식 클래스에서 직접 재정의할 수 있습니다.

 

다음 예제는 부모 클래스인 Parent 클래스의 display() 메소드를 자식 클래스인 Child 클래스에서 오버라이딩하는 예제입니다.

```Java
class Parent {

    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }

}

class Child extends Parent {

    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }

}

 

public class Inheritance05 {

    public static void main(String[] args) {

        Parent pa = new Parent();

        pa.display();

        Child ch = new Child();

        ch.display();

        Parent pc = new Child();

        pc.display(); // Child cp = new Parent();

    }

}
```


> 실행 결과
```
부모 클래스의 display() 메소드입니다.

자식 클래스의 display() 메소드입니다.

자식 클래스의 display() 메소드입니다.
```
 

위의 예제에서 세 번째와 같은 인스턴스의 참조가 허용되는 이유는 바로 자바에서의 `다형성(polymorphism)` 때문입니다.


### [3-2] 오버로딩과 오버라이딩

오버로딩과 오버라이딩은 그 단어의 유사함으로 인해 혼동하기 쉽습니다.

하지만 그 개념은 확실히 다르며, 그 차이점을 아는 것이 중요합니다.

 

간단히 정의하면 오버로딩(overloading)은 새로운 메소드를 정의하는 것입니다.

하지만 오버라이딩(overriding)은 상속받은 기존의 메소드를 재정의하는 것입니다.

 

다음 예제는 부모 클래스인 Parent 클래스의 display() 메소드를 자식 클래스인 Child 클래스에서 오버라이딩과 오버로딩을 둘 다 수행하는 예제입니다.

```Java
class Parent {

    void display() { System.out.println("부모 클래스의 display() 메소드입니다."); }

}

class Child extends Parent {

    // 오버라이딩된 display() 메소드

    void display() { System.out.println("자식 클래스의 display() 메소드입니다."); }

    void display(String str) { System.out.println(str); } // 오버로딩된 display() 메소드

}

 

public class Inheritance06 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

        ch.display("오버로딩된 display() 메소드입니다.");

    }

}
```


> 실행 결과
```
자식 클래스의 display() 메소드입니다.

오버로딩된 display() 메소드입니다.
```

## 04 동적바인딩, 정적바인딩

`동적 바인딩(Dynamic Binding)`

- 다형성을 사용하여 메소드를 호출할 때, 발생하는 현상이다.

- 실행 시간(Runtime) 즉, 파일을 실행하는 시점에 성격이 결정된다.

- 실제 참조하는 객체는 서브 클래스이니 서브 클래스의 메소드를 호출한다.

`정적 바인딩(Static Binding)`

- 컴파일(Compile) 시간에 성격이 결정된다.

- 변수의 타입이 수퍼 클래스이니 수퍼 클래스의 메소드를 호출한다.


```Java
public class PolymorphismTest {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.methodA();
        superClass.methodB();


        SuperClass subClass = new SubClass();
        subClass.methodA();
        subClass.methodB();
    }
}


class SuperClass {
    void methodA() {
        System.out.println("SuperClass A ");
    }

    static void methodB() {
        System.out.println("SuperClass B");
    }
}

class SubClass extends SuperClass {
    @Override
    void methodA() {
        System.out.println("SubClass A");
    }

    static void methodB() {
        System.out.println("SubClass B");
    }
}
```

```Java
// 예상 결과
SuperClass A 
SuperClass B
SubClass A
SubClass B

// 실제 결과
SuperClass A 
SuperClass B
SubClass A
SuperClass B
```

> static은 정적, 그렇기 때문에 동적으로 따라가지 않고 정적바인딩으로 슈퍼클래스의 메소드가 출력됨.

SubClass는 SuperClass의 methodA()를 상속받아 오버라이딩했다.

methodA()가 어떤 클래스의 메소드인지 Runtime 즉, 클래스 파일이 실행되는 시점에 결정된다.

다시 말해, 동적 바인딩은 Runtime 시점에 해당 메소드를 구현하고 있는 실제 객체 타입을 기준으로 찾아가서 실행될 함수를 호출한다.

subClass 참조 변수로 접근 가능한 것은 부모 클래스의 멤버이지만, 자식 클래스에서 메소드를 오버라이딩했으므로 자식 클래스의 메소드를 호출한다.

subClass 참조 변수는 런타임시에 SubClass의 methodA() 호출

subClass 참조 변수는 컴파일시에 SuperClass의 static 메소드인 methodB() 호출

> 결론

모든 인스턴스 메소드는 Runtime에 결정된다.

클래스(static) 메소드와 인스턴스 변수는 Compile 시에 결정된다.

따라서 instance인지, statice인지에 따라서 달라진다.
