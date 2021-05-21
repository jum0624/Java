package hw12;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCodeEx extends JFrame {
    private JLabel la = new JLabel();

    public KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, %키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener());
        c.add(la);

        setSize(300,150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e){
            Container containerPane = (Container)e.getSource();
            la.setText(e.getKeyText(e.getKeyCode()));

            if(e.getKeyChar() == '%') {
                containerPane.setBackground(Color.YELLOW);
            }
            else if(e.getKeyCode() == KeyEvent.VK_F1){
                containerPane.setBackground(Color.GREEN);
            }
        }
    }

    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
