package condition;

public class ForEx5 {

	public static void main(String[] args) {
		// 구구단
		// 3 * 1 = 3    3 * 2 = 6    3 * 3= 9 .......
		
		// 3 * 1 = 3
		// 3 * 2 = 6
		//   ...
		
		// 3단(아래로)
		for(int i=1;i < 10;i++) {
			System.out.printf("3 * %d = %d\n",i,(3*i));
		}
		
		System.out.println();
		
		// 2단(옆으로)
		for(int i=1;i < 10;i++) {
			System.out.printf("2 * %d = %d\t",i,(2*i));
		}
		
		
		
		
	}
}
