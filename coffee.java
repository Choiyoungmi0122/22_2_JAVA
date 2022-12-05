import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int espresso = 2000, americano = 2500, capucino = 3000, latte = 3500;
		double money = 0;
		
		System.out.print("커피 주문하세요>> ");
		
		String coffee = sc.next();
		int num = sc.nextInt();
		
		if(coffee.equals("에스프레소")) {
			if(num >= 10)
				money =2000-(2000*0.05);
			else
				money = 2000;
			
		}
		else if (coffee.equals("아메리카노"))
			money = 2500;
		else if(coffee.equals("카푸치노"))
			money = 3000;
		else if(coffee.equals("카페라떼"))
			money = 3500;
		
		money = money * num;
		
		System.out.print(money + "입니다. ");
		
		

	}

}
