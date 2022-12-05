import java.util.Scanner;
public class Game369 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("1~99사이의 정수를 입력하세요>>");
		int num = sc.nextInt();
		
		int first = num/10;
		int second = num%10;
		
		if(first!=0) {
			if(first%3 ==0 && second%3 ==0 )
				System.out.println("박수짝짝");
			else if(first%3 ==0  || second %3 ==0 )
				System.out.println("박수짝");
			else
				System.out.println("박수없음");
		}
		else if(first == 0) {
			if (second %3==0)
				System.out.println("박수짝");
			else
				System.out.println("박수없음");
		}
		
	}

}
