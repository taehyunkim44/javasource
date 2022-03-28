package basic;

//형변환
//1. 자동형변환(Promotion) : 개발자가 신경쓰지 않아도 됨
//              큰 크기 타입 = 작은 크기 타입

//2. 강제형변환(Casting) : 컴파일 오류와 관련있기 때문에 신경을 써야함
//              작은 크기 타입 = (작은 크기 타입)큰 크기 타입

public class CastingEX1 {

	public static void main(String[] args) {
		int intValue = 1034;
		// byte byteValue = intValue; // cannot convert from int to byte
		System.out.println("intValue = "+intValue); // 1034
		
		// 강제 형변환
		byte byteValue = (byte)intValue;
		System.out.println("byteValue = "+byteValue); // 10
		
		int num1 = 123456780;
		// 자동 형변환
		double num2 = num1;
		System.out.println("num2 = "+num2);
		// 강제 형변환
		int num3 = (int)num2;
		System.out.println("num3 = "+num3);
	}
}
