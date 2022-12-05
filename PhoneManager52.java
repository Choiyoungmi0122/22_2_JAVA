import java.util.Scanner;

class Phone{
	private String name, tel;
	int pno;
	public static int count = 0;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
		count++;
		this.pno=count;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTel() {
		return tel;
	}
}
	
public class PhoneManager52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수 >> ");
		int Persons = scanner.nextInt();
		
		Phone[] Array = new Phone[Persons];
		
		for(int i=0;i<Persons;i++) {
			System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
			Array[i] = new Phone(scanner.next(), scanner.next());
		}
		
		System.out.println("저장되었습니다...");
		
		 while(true) {
			System.out.print("검색할 이름 >>");
			String serchName = scanner.next();
			
				if(serchName.equals("exit")) {
					System.out.print("시스템을 종료합니다.");
					break;
				}
				for(int i=0;i<Persons;i++) {
					if(serchName.equals(Array[i].getName())) {
						System.out.println(Array[i].getName()+"의 번호는 " + Array[i].getTel() + "입니다.");
				}
					else if(!serchName.equals(Array[i].getName()) && i==(Persons-1)) {
					System.out.println(serchName + "이(가) 없습니다.");
				}
			}
			
		}
		 scanner.close();
		
	}
	

}
