package Hw13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComponentEx extends JFrame {
    private JCheckBox [] hobby = new JCheckBox[5];
    private String [] names = {"컬러링북","베이킹","블로그쓰기","프랑스자수","보드게임"};
    private JTextArea show = new JTextArea(10,35);
    private ButtonGroup g = new ButtonGroup();
    private JRadioButton non = new JRadioButton();
    private JRadioButton man = new JRadioButton("남자");
    private JRadioButton woman = new JRadioButton("여자");
    private JButton reset = new JButton("초기화");
    private JButton printShow = new JButton("출력");
    private String genderStr = "<성별을 선택하세요>";
    private String hobbyStr = " <취미를 선택하세요>";
    private boolean [] isHobby = {false, false, false, false, false};

    public JComponentEx() {
        setTitle("JComponent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        show.setEditable(false);  // show에 수정 방지
        c.add(new JScrollPane(show));  // 스크롤바 생성

        g.add(non);  // 성별을 선택하지 않았을 경우 체크
        g.add(man);
        g.add(woman);

        jp1.setLayout(new FlowLayout());
        jp1.add(man);
        jp1.add(woman);

        jp2.setLayout(new FlowLayout());
        c.add(jp1);

        man.addItemListener(new MyGenderListener());  // 남자 체크박스 리스너 생성
        woman.addItemListener(new MyGenderListener());  // 여자 체크박스 리스너 생성


        for(int i=0;i<hobby.length;i++){
            hobby[i] = new JCheckBox(names[i]);  // 취미의 개수만큼 체크박스 생성
            hobby[i].setBorderPainted(true);
            jp2.add(hobby[i]);
            hobby[i].addItemListener(new MyHobbyListener()); // 취미 체크박스를 체크했을 때 리스너 생성
        }

        printShow.addActionListener(new MyPrintListener());  // 화면 출력 리스너 생성
        reset.addActionListener(new MyResetListener());  // 초기화 리스너 생성


        c.add(jp2);
        c.add(printShow);  // 출력버튼
        c.add(reset);  // 초기화버튼
        setSize(450,500);
        setVisible(true);
    }

    class MyPrintListener implements ActionListener {  // 화면출력 리스너
        @Override
        public void actionPerformed(ActionEvent e) {
            show.append(genderStr + hobbyStr + "\n");  // 화면에 성별과 취미 출력 후 줄바꿈
        }
    }

    class MyResetListener implements ActionListener {  // 초기화 리스너
        @Override
        public void actionPerformed(ActionEvent e) {
            show.setText("");  // 이전 화면의 내용 모두 공백으로 초기화
            for(int i=0;i<hobby.length;i++){
                hobby[i].setSelected(false);  // 체크박스 전체 초기화
            }
            non.setSelected(true);  //성별 초기화
            hobbyStr = " <취미를 선택하세요>";
            genderStr = "<성별을 선택하세요>";
        }
    }

    class MyGenderListener implements ItemListener {  // 성별선택 리스너
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource().equals(man)){  //남자 체크박스 선택 시
                genderStr = "남자";
            }
            else if(e.getSource().equals(woman)) {  // 여자 체크박스 선택 시
                genderStr = "여자";
            }
        }
    }

    class MyHobbyListener implements ItemListener {  // 취미선택 리스너
        @Override
        public void itemStateChanged(ItemEvent e) {
            String newString = "";  // show에 출력할 빈 문자열 생성
            for(int i=0;i<hobby.length;i++){
                isHobby[i] = hobby[i].isSelected();  // 선택한 취미 저장
            }
            for(int i=0;i<hobby.length;i++){
                if(isHobby[i]){     // 선택된 취미일 시
                    newString += " ";
                    newString += names[i];  // 해당 취미 문자열에 추가
                }
            }
            hobbyStr = newString; // 합쳐진 취미 문자열
        }
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}
