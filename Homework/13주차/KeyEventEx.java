package Hw13;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionListener;

public class KeyEventEx extends JFrame {
    int choice;
    private final int FLYING_UNIT = 10;  // 한칸 이동시 10씩 이동
    private JButton btn1 = new JButton("1");  // 버튼 1추가
    private JButton btn2 = new JButton("2");  // 버튼 2추가
    public KeyEventEx() {
        setTitle("KeyEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());   // 키 리스너 생성

        btn1.setLocation(50,50);   // 버튼 초기 위치 지정
        btn1.setSize(50,20);  // 버튼 사이즈 설정
        btn1.setBackground(Color.YELLOW);  // 버튼 색상 설정
        btn1.setFocusable(false);        //
        btn1.addActionListener(new MyActionListener());

        btn2.setLocation(170,50);
        btn2.setSize(50,20);
        btn2.setBackground(Color.RED);
        btn2.setFocusable(false);
        btn2.addActionListener(new MyActionListener());

        c.add(btn1);
        c.add(btn2);

        setSize(305,300);
        setVisible(true);
        setResizable(false);   // 창크기 조절불가능하도록 설정
        c.setFocusable(true);    // 키 입력을 받을 수 있도록 포커스 주기
        c.requestFocus();
    }

    class MyActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("1")){  // 1번 버튼을 눌렀을 때
                choice = 1;
            }
            else if(b.getText().equals("2")){  // 2번 버튼을 눌렀을 때
                choice = 2;
            }
        }
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (choice == 1) {
                KeyMove(keyCode, btn1);
            }
            if (choice == 2) {
                KeyMove(keyCode, btn2);
            }
        }
    }

    public void KeyMove(int KeyCode, JButton btn) {
        int x = btn.getX();
        int y = btn.getY();
        switch (KeyCode) {
            case KeyEvent.VK_UP:  // 방향키 방향 : 위일 경우
                x = x;
                y = y - FLYING_UNIT;
                break;
            case KeyEvent.VK_DOWN:    // 방향키 방향 : 아래일 경우
                x = x;
                y = y + FLYING_UNIT;
                break;
            case KeyEvent.VK_LEFT:    // 방향키 방향 : 왼쪽일 경우
                x = x - FLYING_UNIT;
                y = y;
                break;
            case KeyEvent.VK_RIGHT:    // 방향키 방향 : 오른쪽일 경우
                x = x + FLYING_UNIT;
                y = y;
                break;
        }

        if(isFrame(x,y) == 1) {  // 프레임에서 벗어나지 않는다면
            btn.setLocation(x,y);  // 위치 움직이기
        }
    }

    public int isFrame(int x, int y){
        if(x >= 0 && x <= 240 && y >= 0 && y <= 245){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        new KeyEventEx();
    }
}
