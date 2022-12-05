import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx52 extends JFrame{
	public FlowLayoutEx52() {
		setTitle("FlowLayout 52 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();		//컨텐트팬 알아내기 
		
		
		//오쪽 정렬로, 수평 간격을 5, 수직 간격을 20픽셀로 배치하는 FlowLayout 생성 
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 20));
		
		contentPane.add(new JButton("버튼 1"));
		contentPane.add(new JButton("버튼 2"));
		contentPane.add(new JButton("버튼 3"));
		contentPane.add(new JButton("버튼 4"));
		contentPane.add(new JButton("버튼 5"));
		contentPane.add(new JButton("버튼 6"));
		contentPane.add(new JButton("버튼 7"));
		contentPane.add(new JButton("버튼 8"));
		contentPane.add(new JButton("버튼 9"));
		contentPane.add(new JButton("버튼 10"));
		contentPane.add(new JButton("버튼 11"));
		contentPane.add(new JButton("버튼 12"));
		contentPane.add(new JButton("버튼 13"));
		contentPane.add(new JButton("버튼 14"));
		contentPane.add(new JButton("버튼 15"));
		
		setSize(300, 300);		//프레임 크기 300x300 설정
		setVisible(true);			//화면에 프레임 출력
	}
	public static void main(String[] args) {
		new FlowLayoutEx52();
	}

}
