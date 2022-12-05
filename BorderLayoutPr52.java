import java.awt.*;
import javax.swing.*;

public class BorderLayoutPr52 extends JFrame  {

	public BorderLayoutPr52() {
		this.setTitle("BorderLayout Pr52");		//이름 설정  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();			//container 객체 설정 
		
		c.setLayout(new BorderLayout(50, 20));			//보드 픽셀 설정  
		
		c.add(new JButton("North"), BorderLayout.NORTH);		//button 생성 
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		this.setSize(400, 200);		//프레임 사이
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutPr52();
	}

}
