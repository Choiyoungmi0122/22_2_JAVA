import java.util.Scanner;
import java.util.StringTokenizer;


public class Add52 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();		// 입력을문자열로 입력받는다.
		
		StringTokenizer st = new StringTokenizer(s1, "+");		//+ 를 기준으로 분리한다. 앞에 입력받은 문자열
		
		int sum = 0;
		while(st.hasMoreTokens()) {	//토큰이 없을때 까지 계속 반
			String n = st.nextToken();	//토큰을 따로 얻음(+기준으로 분리한)
			String s = n.trim();		//공백제
			sum += Integer.parseInt(s);	//공백제거한 토큰을 sum에 더해준다.
		}
		System.out.println("합은 " + sum);

	}

}
