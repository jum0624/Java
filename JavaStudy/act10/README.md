# act.10

## 01 GUI(Graphical User Interface)

> 버튼과 같이 화면을 보면서 피드백을 받고 상호작용을 하는 작업

'GUI란?'

사용자가 마우스 조작으로 명령을 내릴 수 있는 환경

여러 컴포넌트의 조합으로 보여지는 환경을 구축하는 것


'자바의 GUI'

자바의 GUI 개발에 사용되는 것은 대표적으로 AWT, Swing이 있음

일반적으로 많이 사용되지는 않음



## 02 AWT와 Swing 패키지

**(1) AWT 패키지**

자바가 처음 나왔을 때부터 배포된 GUI 패키지, 최근에는 거의 사용하지 않는다.

AWT 컴포넌트의 그리기는 운영체제에 의해 이루어지며, 운영체제의 자원을 많이 소모하고 부담을 준다.

운영체제가 직접 그리기 때문에 속도가 빠르다.

플랫폼에 의존적이다.


**(2) Swing 패키지**

AWT 기술을 기반으로 작성된 자바 라이브러리

스윙 컴포넌트는 운영체제의 도움을 받지 않고 직접 그리기 때문에 운영체제에 부담을 주지 않는다.

AWT에 비해 속도가 느리다.

플랫폼에 독립적이다.



## 03 컨테이너와 컴포넌트

(1) `컴포넌트`

> 화면을 구성하는 부품

- 컨테이너에 포함되어야 비로소 화면에 출력될 수 있는 GUI 객체

- 모든 GUI 컴포넌트의 최상위 클래스 : java.awt.Component

- 스윙 컴포넌트의 최상위 클래스 : javax.swing.Jcomponent

(2) `컨테이너`
 
- 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트

- java.awt.Container를 상속받음.

> 다른 컨테이너에 포함될 수 있다

 - AWT 컨테이너 : Panel, Frame, Applet, Dialog, Window

 - Swing 컨테이너 : JPanel, JFrame, JApplet, JDialog, JWindow

(3) ` 최상위 컨테이너`

- 다른 컨테이너에 포함되지 않고도 화면에 출력되며 독립적으로 존재 가능한 컨테이너

- 스스로 화면에 자신을 출력하는 컨테이너 : JFrame, JDialog, JApplet


**정리**

- 컨테이너는 컴포넌트로 부터 상속 받은 하나의 윈도우 영역을 의미

- 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트

- java.awt.Container를 상속받음

- 다른 컨테이너에 포함될 수 있음

- AWT 컨테이너 : Panel, Frame, Applet, Dialog, Window

- Swing 컨테이너 : 다른 컨테이너에 속하지 않고 독립적으로 존재 가능한 컨테이너

- 최상위 컨테이너 : 다른 컨테이너에 속하지 않고 독립적으로 존재 가능

- 스스로 화면에 자신을 출력하는 컨테이너 : JFrame, JDialog, JApplet


## 04 배치 관리자 

- 레이아웃에 따라 컴포넌트들을 배치하기 위한 객체

- setLayout()을 이용하고 종류로는 FlowLayout, BorderLayout, GridLayout, CardLayout등이 있다.


(1) FlowLayout 

- FlowLayout : panel의 기본으로 컴포넌트 들을 수평으로 순서대로 나열하는 레이아웃입니다.

- 수평으로 배치하다가 더 이상 공간이 없으면 다음 줄로 이동해서 배치합니다.


> FlowLayout 예제

```Java
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
 
public class FlowLayout1 extends Frame
{
    FlowLayout f = new FlowLayout();
    Button btn[] = new Button[10];
    
    public FlowLayout1(String str)
    {        
        super(str);
        // FlowLayout 
        setLayout(f);
        // 버튼 10개 생성
        for( int i = 0; i < 10; i++) 
        {
            btn[i] = new Button((i+1)+"번 버튼");
            add(btn[i]);
        }
        setBounds(100,100,200,200);
        setVisible(true);
    }
}


public class Main 
{
    public static void main(String args[])
    {
        // FlowLayout 생성자 
        new FlowLayout1("FlowLayout 테스트");
 
    }
}

```

> 실행결과

![FlowLayout 실행결과](https://t1.daumcdn.net/cfile/tistory/249F3F33596C483125)



(2) BorderLayout 

- 5개의 영역으로 구분하여 보여줌

- 프레임은 기본적으로 BorderLayout

> BorderLayout 예제

```Java

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
 
public class BorderLayout1 extends Frame
{
    public BorderLayout1(String str) 
    {
        super(str);
        // BorderLayout 생성
        setLayout(new BorderLayout());
        // 배치에 맞게 
        add("North", new Button("북쪽"));
        add("West", new Button("서쪽"));
        add("East", new Button("동쪽"));
        add("Center", new Button("중앙"));
        add("South", new Button("남쪽"));
 
        setSize(200,200);
        setVisible(true);
    }
}


public class Main
{
    public static void main(String[] args) 
    {
        // BorderLayout 생성자 
        new BorderLayout1("BorderLayout 테스트");
    }
}

```

> 실행결과

!BorderLayout 실행결과](https://t1.daumcdn.net/cfile/tistory/25FDD733596C4D5201)

(3) GridLayout

- 격자 모양으로 배치

- 행과 열의 수를 지정해서 배치

- 행과 열 수보다 컴포넌트의 수가 많으면 자동적으로 늘어남


> GridLayout 예제


```Java 
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout1 extends Frame
{
    // 버튼 6개 선언
    Button btn[] = new Button[6];
    public GridLayout1(String str) 
    {
        super(str);
        // GridLayout 생성(3 x 2)
        setLayout(new GridLayout(3,2) );
        // 버튼 6개 
        for(int i = 0; i <  6; i++) 
        {
            btn[i] = new Button(i+1 + "번 버튼");
            add(btn[i]);
        }
        setSize(200,200);
        setVisible(true);
    }
}
 
public class Main 
{
    public static void main(String args[])
    {
        // GridLayout 생성자 호출
        new GridLayout1("GridLayout Test");
    }
}
 
```

> 실행결과

![GridLayout 실행결과](https://t1.daumcdn.net/cfile/tistory/25A01333596C553211)


(4) CardLayout

- 여러 개의 카드를 쌓은 것처럼 보여주는 레이아웃으로 한번에 하나만 보여줍니다.

- next 메소드를 이용해서 다음 화면을 출력합니다.

- Layout에 null을 설정하면 좌표와 크기를 직접 설정해서 배치합니다.

```Java
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class CardLayout1 extends Frame
{
    // CardLayout 선언
    CardLayout card = new CardLayout();
    // 패널 선언
    Panel panel[] = new Panel[5];
    // 색상 선언
    Color color[] = {Color.red, Color.blue, Color.yellow, Color.green,Color.cyan};
    
    // CardLayout 생성자
    public CardLayout1(String str) 
    {
        super(str);
        // CardLayout 생성
        setLayout(card);
        // 마우스 핸들러 선언
        MouseHandle mouse = new MouseHandle();
        
        // 패널과 색상 변경을 위한 반복문
        for(int i = 0; i < 5; i++) 
        {
            panel[i] = new Panel();
            panel[i].setBackground(color[i]);
            panel[i].addMouseListener(mouse);
            add(""+ (i+1), panel[i]);
        }        
        setSize(200,200);
        setVisible(true);
    }
    
    // 마우스 핸들러를 위한 클래스
    public class MouseHandle extends MouseAdapter     
    {
        public void mouseClicked(MouseEvent e)     {
            card.next(CardLayout1.this);
        }
    }
 
}

public class Main 
{
    public static void main(String args[])
    {
        // CardLayout 생성자 호출
        new CardLayout1("CardLayout Test");
    }
}

```

> 실행결과

![CardLayout 예제 실행결과](https://t1.daumcdn.net/cfile/tistory/264AB63E596C587203)

- 클릭시 패널이 변화하므로 색상도 변함
