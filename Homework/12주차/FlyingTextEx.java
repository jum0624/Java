package hw12;

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FlyingTextEx extends JFrame {
    private final int FLYING_UNIT = 10;
    private JLabel la = new JLabel("HELLO");
    public FlyingTextEx(){
        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.addKeyListener(new MyKeyListener());

        la.setLocation(50,50);
        la.setSize(100,20);
        c.add(la);
        setSize(300,300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();

        c.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Component com = (Component) e.getSource();
                com.setFocusable(true);
                com.requestFocus();
            }
        });
    }

    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            int KeyCode = e.getKeyCode();

            switch (KeyCode){
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY()-FLYING_UNIT);
                    break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY()+FLYING_UNIT);
                    break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX()-FLYING_UNIT, la.getY());
                    break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX()+FLYING_UNIT, la.getY());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
