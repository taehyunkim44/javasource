package extend;

public class ManuCAR extends Car2 {
	@Override
	public void startCar() {
		super.startCar();
	}
	// turnOff()가 final 인 상태이므로 오버라이딩 금지
}
