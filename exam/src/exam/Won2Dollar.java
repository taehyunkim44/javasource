package exam;

public class Won2Dollar extends Converter {

	@Override
	protected double convert(double src) {
		return 0;
	}

	@Override
	protected String getSrcStrong() {
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}

}
