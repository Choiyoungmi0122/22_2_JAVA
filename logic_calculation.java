import java.util.Scanner;
public class logic_calculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산을 입력하세요>>");
		
		Boolean a,b;
		String s;
		
		a=sc.nextBoolean();
		s=sc.next();
		b=sc.nextBoolean();
		
		switch(s) {
		case "AND":
			System.out.println(a&b);
			break;
		case "OR":
			System.out.println(a|b);
			break;
		default:
			System.out.println("잘못된 입력입니다. ");
			break;
		}

	}

}
