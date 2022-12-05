import java.util.Scanner;
import java.util.Random;
public class Up_Down_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Random r =new Random();
		
		System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요. ");
		System.out.println("0~99");
		
		int k = r.nextInt(100);
		int  i=1, n;
		String answer;
		
		do {
			System.out.print(i + ">>");
			n=sc.nextInt();
			
			if(n==k) {
				System.out.print("맞았습니다.\n 다시하시겠습니까?(y/n):");
				if(sc.next().equals("y"))
					continue;
				else
					break;
			}
			else if(n>k) {
				System.out.println("더 낮게 ");
				i++;
			}
			else {
				System.out.println("더 높게 ");
				i++;
			}
				
		
		}
	}

}
