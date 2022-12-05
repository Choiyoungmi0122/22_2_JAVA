import java.util.*;
public class height_Vector52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력 ");
		System.out.print(">>");
		
		Vector<Integer> v = new Vector<Integer>();		//vector 를 int형만 받는 v라는 이름을 가진 벡터로 선언 
		double max =0;		//비교할 가장 큰
		int max_index = 0;		//가장 차이가 많이날 인덱스를 저장할 변수
		
		for(int i =0;i<10;i++) {
				v.add(sc.nextInt());			//vector에 int형 삽입 총 10
		}
		
		
		Integer[] arr = new Integer[v.size()];		// 백터로 넣은 값들을 넣을 배열 선언 
		v.copyInto(arr);	//벡터에 있는 것들 배열로 복사 
 		
		for(int i=0;i<9;i++) {
			if(max<arr[i+1]-arr[i]) {		//차이가 가장 큰 cm  찾는
				max=(double)(arr[i+1]-arr[i]);
				max_index = i;		//해당 년도 변수에 대
			}
		}
		
		System.out.println("가장 키가 많이 자란 년도는 200" + max_index + "년 " + max + "cm");
		
	}

}
