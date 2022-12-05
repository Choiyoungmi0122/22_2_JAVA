import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요.");
		
		int i, n;
		double sum=0;
		
		for(i=0;i<5;i++) {
			n=scanner.nextInt();
			sum += n;
		}
		
		System.out.println("평균은 " + sum/5);
	}

}
