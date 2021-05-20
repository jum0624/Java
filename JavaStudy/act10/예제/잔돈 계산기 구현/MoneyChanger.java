package act10;

//import swing.frame.Calculator;

import javax.swing.*;
import java.awt.*;

public class MoneyChanger extends JFrame {
    public MoneyChanger(){
        setTitle("Money Changer");
        setSize(400, 320);
        setLocation(800, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();

        this.add(jp1);
        jp1.setLayout(new FlowLayout());
        jp1.setPreferredSize(new Dimension(400,320));

        jp3.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel a1 = new JLabel("금액      ", JLabel.LEFT);
        jp3.add(a1);

        JTextField f1 = new JTextField(15);
        jp3.add(f1);

        JButton button = new JButton("계산");
        jp3.add(button);

        jp2.setLayout(new GridLayout(8,3));
        jp2.setPreferredSize(new Dimension(400,200));

        JLabel b1 = new JLabel("오만원  ",JLabel.RIGHT);
        jp2.add(b1);

        JTextField t1 = new JTextField(10);
        jp2.add(t1);

        JLabel k1 = new JLabel("");
        jp2.add(k1);

        JLabel b2 = new JLabel("만원  ",JLabel.RIGHT);
        jp2.add(b2);

        JTextField t2 = new JTextField(10);
        jp2.add(t2);

        JLabel k2 = new JLabel("");
        jp2.add(k2);

        JLabel b3 = new JLabel("천원  ",JLabel.RIGHT);
        jp2.add(b3);

        JTextField t3 = new JTextField(10);
        jp2.add(t3);

        JLabel k3 =new JLabel("");
        jp2.add(k3);

        JLabel b4 = new JLabel("500원  ",JLabel.RIGHT);
        jp2.add(b4);

        JTextField t4 = new JTextField(10);
        jp2.add(t4);

        JLabel k4 = new JLabel("");
        jp2.add(k4);

        JLabel b5 = new JLabel("100원  ",JLabel.RIGHT);
        jp2.add(b5);

        JTextField t5 = new JTextField(10);
        jp2.add(t5);

        JLabel k5 = new JLabel("");
        jp2.add(k5);

        JLabel b6 = new JLabel("50원  ",JLabel.RIGHT);
        jp2.add(b6);

        JTextField t6 = new JTextField(10);
        jp2.add(t6);

        JLabel k6 = new JLabel("");
        jp2.add(k6);

        JLabel b7 = new JLabel("10원  ",JLabel.RIGHT);
        jp2.add(b7);

        JTextField t7 = new JTextField(10);
        jp2.add(t7);

        JLabel k7 = new JLabel("");
        jp2.add(k7);

        JLabel b8 = new JLabel("1원  ",JLabel.RIGHT);
        jp2.add(b8);

        JTextField t8 = new JTextField(10);
        jp2.add(t8);

        JLabel k8 = new JLabel("");
        jp2.add(k8);

        jp1.add(jp3);
        jp1.add(jp2);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MoneyChanger();
    }
}
