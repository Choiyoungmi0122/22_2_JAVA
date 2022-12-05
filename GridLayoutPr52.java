import java.awt.*;
import javax.swing.*;
public class GridLayoutPr52 extends JFrame{
    public GridLayoutPr52(){
        super("GridLayoutPr52");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame frame = new JFrame("GridLayoutPr52");		//GridLayoutPr52이름 가진 프래임 생
        Container contentpane = frame.getContentPane();			//contentpane에 프래임 상

        contentpane.setLayout(new GridLayout(1,10));

        
        Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW,
        		Color.GREEN, Color.CYAN, Color.BLUE,
                 Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY};	//배경색 배열 
        
        JButton [] Button = new JButton[10];
		for(int i = 0; i < 10; i++) {
			Button[i] = new JButton(Integer.toString(i));
			Button[i].setOpaque(true);		//배경색이 보이게 설정 
			Button[i].setBorderPainted(false);		//자꾸 테두리만 채워져서 이부분 추가하니 색이 채워짐... 아마 os문제...?
			Button[i].setBackground(color[i]);
			frame.add(Button[i]);		//컨텐팬에 프래임  부착 
			

        }
        frame.setSize(500, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GridLayoutPr52();
    }
}
