
public class MestedLoop52 {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=2;i<=9;i+=2) {
			for(j=1;j<=9;j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
				System.out.println((i+1) + "*" + j + "=" + (i+1)*j);
			}
			System.out.println();
		}

	}

}
