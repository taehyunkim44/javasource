package extend;

public class BonusPointAccount extends Account {
	
	//보너스 포인트
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, String owner, int balance, int bounsPoint) {
		super(accountNo, owner, balance);
		this.bonusPoint=bonusPoint;
	}
	
	
	
	@Override
	int deposit(int amount) {
		//예금
		super.deposit(amount);
		//보너스포인트=예금액 * 0.1%
		bonusPoint =(int)(amount*0.001);
		return bonusPoint;
	}



	public int getBonusPoint() {
		return bonusPoint;
	}



	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
}
