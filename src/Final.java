/*
 * 이 프로그램은 swing을 이용하여 스크롤 윈도우 패널에 
 * 구구단을 출력하는 간단한 프로그램입니다.
 */

// [문제1] swing 프로그램을 위해 필요한 컴포넌트 클래스 및 그래픽을 위한 클래스 import 해주세요.
import javax.swing.*;
import java.awt.*;;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        setTitle("구구단 출력기"); // [문제2] 타이틀에 '구구단 출력기'라고 나오도록 작성해 주세요.
        setSize(500, 400); // [문제3] 윈도우의 크기를 정의 하세요. 크기는 500 x 400입니다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // [문제4] 윈도우 우측 상당의 X아이콘을 클릭하면 프로그램이 종료되도록 합니다.
        setLocationRelativeTo(null);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역,
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
        for(int i=2; i < 10; i++){
            for(int j=1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Final().setVisible(true); // [문제6] 결과 화면의 윈도우를 출력해 주세요.
            } 
        });
    }
}
