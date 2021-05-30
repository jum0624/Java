package Hw13;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureEx extends JFrame {
    private String [] temp = {"섭씨", "화씨", "켈빈", "란씨"};
    private String [] change = {"섭씨", "화씨", "켈빈", "란씨"};
    private JComboBox<String> tempCombo = new JComboBox<String>(temp);
    private JComboBox<String> changeCombo = new JComboBox<String>(change);
    private JTextField inputTemp = new JTextField(15);  // 처음 입력할 온도표시
    private JTextField outputTemp = new JTextField(15);  //변환 된 온도표시
    private JLabel input = new JLabel("온도를 입력하세요");
    private JLabel output = new JLabel("             변환 후 온도            ");
    private double inputT = 0.0f;
    private int index1 = 0;
    private int index2 = 0;

    public TemperatureEx() {
        setTitle("Temperature 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        tempCombo.addActionListener(new MyComboListener());  // 변화하기 전 온도계 종류
        c.add(tempCombo);

        changeCombo.addActionListener(new MyComboListener());  // 변환할 온도계 종류
        c.add(changeCombo);

        c.add(input);

        inputTemp.addActionListener(new MyInputListener());  //
        c.add(inputTemp);

        c.add(output);

        outputTemp.setEditable(false);
        c.add(outputTemp);


        setSize(200,220);
        setResizable(false);
        setVisible(true);
    }


    class MyInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JTextField t = (JTextField) e.getSource();  // 입력한 온도정보 가져오기
            try{
                inputT = Double.parseDouble(t.getText());  // 입력받은 온도 더블로 형변환
                outputTemp.setText(String.format("%.3f", ExChangeTemp(index1, index2, inputT))); // 변환된 온도 출력(소수점 3번째까지)
            }
            catch (IllegalArgumentException error){
                inputTemp.setText("숫자를 입력하세요.");    // 예외 처리 : 문자 입력시 예외처리
            }
        }
    }

    class MyComboListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JComboBox<String> combo = (JComboBox<String>) e.getSource();
            if(combo.equals(tempCombo)){  // 변환하기 전 온도계 설정 시
                index1 = combo.getSelectedIndex(); // 선택한 인덱스 반환
            }
            else if(combo.equals(changeCombo)){  // 변환할 온도계 설정 시
                index2 = combo.getSelectedIndex();  // 선택한 인덱스 반환
            }
        }
    }

    public static double CeltoF(double t) {  //섭씨를 화씨로
        return t * (9.0f/5.0f) + 32;
    }

    public static double CeltoK(double t) {  //섭씨를 켈빈으로
        return t + 273.15f;
    }

    public static double CeltoR(double t) {  //섭씨를 란씨로
        return (t + 273.15f) * (9.0f / 5.0f);
    }

    public static double FahtoC(double t) {  //화씨를 섭씨로
        return (t - 32) * (5.0f / 9.0f);
    }

    public static double KeltoC(double t) { //켈빈을 섭씨로
        return t - 273.15f;
    }

    public static double RantoC(double t) {  //란씨를 섭씨로
        return (t - 491.67f) * (5.0f / 9.0f);
    }

    public double Celto(double t, int index) {   // 섭시를 ~로
        if(index == 0){
            return t;
        }
        else if(index == 1){
            return CeltoF(t);
        }
        else if(index == 2){
            return CeltoK(t);
        }
        else {
            return CeltoR(t);
        }
    }

    public double Fahto(double t, int index){   // 화씨를 ~로
        if(index == 0){
            return FahtoC(t);
        }
        else if(index == 1){
            return t;
        }
        else if(index == 2){
            return CeltoK(FahtoC(t));
        }
        else {
            return CeltoR(FahtoC(t));
        }
    }

    public double Kelto(double t, int index){    // 켈빈을 ~로
        if(index == 0){
            return KeltoC(t);
        }
        else if(index == 1){
            return CeltoF(KeltoC(t));
        }
        else if(index == 2){
            return t;
        }
        else {
            return CeltoR(KeltoC(t));
        }
    }

    public double Ranto(double t, int index){  // 란씨를 ~로
        if(index == 0){
            return RantoC(t);
        }
        else if(index == 1){
            return CeltoF(RantoC(t));
        }
        else if(index == 2){
            return CeltoK(RantoC(t));
        }
        else {
            return t;
        }
    }

    public double ExChangeTemp(int index1, int index2, double t){
        if(index1 == 0){     // 변환하기 전 온도계가 섭씨일 때, 섭씨에서 ~
            return Celto(t, index2);
        }
        else if(index1 == 1){  // 변환하기전 온도계가 화씨일 때, 화씨에서~
            return Fahto(t, index2);
        }
        else if(index1 == 2){  //변환하기 전 온도계가 켈빈일 때, 켈빈에서 ~
            return Kelto(t, index2);
        }
        else {  // 변환하기 전 온도계가 란씨일 때, 란씨에서 ~
            return Ranto(t, index2);
        }
    }

    public static void main(String[] args) {
        new TemperatureEx();
    }
}
