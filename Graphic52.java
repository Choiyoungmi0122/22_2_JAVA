import java.util.Scanner;
abstract class shape {
	 abstract void draw();	//먼저 draw라는 추상 메소드를 선언해줍니다.
}

class Editor extends shape {	//편집이라는 이름의 클래스와 이 클래스에 위 추상클래스를 확장시켜줍니다.
	Scanner sc = new Scanner(System.in);

	static int i = 0;
	private String [] Shape = new String[10]; //각 갯수를 저장할 종류를 입력할 배열ㅇ르 선언해줍니다.
	
	public void insert() {
		
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3) >> ");
		int choice = sc.nextInt();
		switch(choice) {//처음 선택에 따라 개수가 더해집니다.
		case 1:
			Shape [i] = "Line";		//각 선택되는 도형의 배열 자수가 점점 커집ㄴ다.
			i++;
			break;
		case 2:
			Shape [i] = "Rect";
			i++;
			break;
		case 3:
			Shape [i] = "Circle";
			i++;
			break;
		}
	}
	
	public void delete() {
		System.out.print("삭제할 도형의 위치 >> ");	//만약 삭제한다면 
		int Loc = sc.nextInt();
		
		if(i < Loc) {	//입력갯수보다 적은 위치를 삭제 할 수 없어 삭제 할 수 없다는 메시지를 출력합니다.
			System.out.println("삭제할 수 없습니다.");
		}
		else {	//조건에 맞다면, 실제배열은 0부터 채워지므로 입력한 수의 -1의 값을 없애줍니다.
			(Shape[Loc-1]) = null;
		}
	}
	
	public void draw() {
		for(int j = 0; j < i; j++) {
			System.out.println(Shape[j]);	//draw에서 선언한 도형들을 출력하는 역
		}
	}
}

public class Graphic52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Editor e = new Editor();	//e 객체 생
		
		boolean b = true;
		
		while(b == true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int choice = sc.nextInt();
			switch(choice) {//밑에 e를 사용해 insert를 실행하면서, 위의 메소드를 다 돌면서 main으로 다시 돌아온다.
			case 1 :
				e.insert();
				break;
			case 2 :
				e.delete();
				break;
			case 3 :
				e.draw();
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다...");
				b = false;
				break;
			}
		}
	}
}