package interfacetest;

public class ActionExample {
	public static void main(String[] args) {
		Action act =new Action() {
			
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		act.work();
	}
}
