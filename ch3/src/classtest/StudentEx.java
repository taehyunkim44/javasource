package classtest;

public class StudentEx {
	public static void main(String[] args) {
		// 객체 생성, 실행
		// Student 클래스를 사용하고 싶다면?
		// 클래스명 변수명 = new 클래스명();
		Student student = new Student(); // heap 안에 생성됨
		// 초기화 작업
		student.studentID = 20201010;
		student.studentName = "홍길동";
		student.address = " 서울시 구로구";
		student.mobile = " 010-1234-5678";
		// 메소드 실행
		student.changeAddress();
		 
		
		Student student2 = new Student();
		// 초기화 작업
		student.studentID = 20201011;
		student.studentName = "성춘향";
		student.address = " 서울시 강남구";
		student.mobile = " 010-7896-1234";
	}
}
