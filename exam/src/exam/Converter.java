package exam;

import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcStrong();
	abstract protected String getDestString();
	protected double ratio;
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcStrong()+"을"+getDestString()+"로 바꿉니다.");
		System.out.println(getSrcStrong()+"을 입력하세요>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과 : "+res+getDestString()+"입니다");
		scanner.close();
	}
	
}
