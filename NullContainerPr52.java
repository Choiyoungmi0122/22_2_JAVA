import javax.swing.*;
import java.awt.*;
import java.lang.Math.*;


public class NullContainerPr52  extends JFrame{
	
	public NullContainerPr52() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=getContentPane();
		
		for(int i=0;i<19;i++) {
			JLabel label=new JLabel(Integer.toString(i));
			int x=(int)(Math.random()*220+30);//30~250 사이 랜덤 x
			int y=(int)(Math.random()*220+30);//30~250 사이 랜덤 y
			label.setSize(20,20);
			label.setLocation(x, y);
			label.setForeground(Color.MAGENTA);
			
			container.add(label);
		}
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new NullContainerPr52();
	}

}