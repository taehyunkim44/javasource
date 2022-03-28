package classtest;

public class Calculator {
	
	// 오버로딩 - 생성자, 메소드
	
	//메소드 오버로딩 - (인자)의 타입,
	//  정사각형 넓아
	double areaReactangle(double width) {
		return width * width;
	}
	double areaReactangle(double width, double height) {
		return width * height;
	}

}
