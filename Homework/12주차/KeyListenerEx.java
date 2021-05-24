package hw12;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyListenerEx extends JFrame {
    private JLabel[] keyMessage;

    public KeyListenerEx(){
        setTitle("KeyListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.addKeyListener(new MyKeyListener()); //리스너 적용

        keyMessage = new JLabel[3];
        keyMessage[0] = new JLabel(" getKeyCode() ");
        keyMessage[1] = new JLabel(" getKeyChar() ");
        keyMessage[2] = new JLabel(" getkeyText() ");

        for(int i=0;i<keyMessage.length;i++){
            c.add(keyMessage[i]);
            keyMessage[i].setOpaque(true);  //true 시 배경색 설정 가능
            keyMessage[i].setBackground(Color.YELLOW); //배경색 노랑
        }

        setSize(300,150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            int keyCode = e.getKeyCode();
            char keyChar = e.getKeyChar();

            keyMessage[0].setText(Integer.toString(keyCode));
            keyMessage[1].setText(Character.toString(keyChar));
            keyMessage[2].setText(e.getKeyText(keyCode));
        }
    }

    public static void main(String[] args) {
        new KeyListenerEx();
    }
}
