package condition;

public class ForEx7 {
	public static void main(String[] args) {
		// 1. int i =1;
		// 2. i<4;
		// 3. 안쪽 for 블럭 문 실행
		// 4. int j =1
		// 5. j<4
		// 6. 안쪽 for 블럭 안으로 진입 => * 출력
		// 7. j++ (j=2)
		// 8. j<4;
		// 9. * 출력 **
		// 10. j++ (j=3)
		// 11. j<4;
		// 12. * 출력 ***
		// 13. j++ (j=4)
		// 14. j<4 => 거짓(안쪽 for문 종료)
		// 15. System.out.println();
		
		
		// 1. i++ (i=2)
		// 2. i<4;
		// 3. ~ 15. 반복
		
		// 1. i++ (i=3)
		// 2. i<4;
	    // 3. ~ 15. 반복
		
		// 1. i++ (i=4)
		// 2. i<4; 거짓(전체 for 종료)
	    
		
		
		for(int i =1;i<4;i++) {
			for (int j =1; j<4; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
}
