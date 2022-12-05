import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException52 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 3개를 입력하세요.");
		int i, sum=0, n=0;
		for(i=0;i<3;i++) {
			System.out.print(i+">>");
			try {
				n=scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
		scanner.close();

	}

}
