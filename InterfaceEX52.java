interface PhoneInterface{			//인터페이스 선언
	final int TIMEOUT = 10000;		//상수 필드 선언 
	void sendCall();				//추상 메소드  
	void receiveCall();				//추상 메소드  
	default void printLogo(){		//default 메소드 
		System.out.println("** Phone **");
	}
}

class Calc{	//클래스 작성  
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends Calc implements PhoneInterface{
	//추상메소드구현  
	@Override
	public void sendCall() {System.out.println("따르릉따르릉~~");}
	
	@Override
	public void receiveCall() {System.out.println("전화왔어요 ");}
	
	public void schedule() {System.out.println("일정 관리합니다.");}
}
	
public class InterfaceEX52{
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3,5));
		phone.schedule();
	}

}
