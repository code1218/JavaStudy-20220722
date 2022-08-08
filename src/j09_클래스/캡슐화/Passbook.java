package j09_클래스.캡슐화;

public class Passbook {
	private int money;
	
	// getter & setter
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void showMoney() {
		System.out.println("현재 은행에 저축한 금액: " + money);
		System.out.println();
	}
}
