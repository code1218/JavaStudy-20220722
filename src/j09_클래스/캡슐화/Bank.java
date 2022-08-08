package j09_클래스.캡슐화;

public class Bank {
	private String bankName;
	
	public Bank(String bankName) {
		this.bankName = bankName;
	}
	
	//입금
	public void deposit(Passbook passbook, int money) {
		System.out.println("[ " + bankName + " ]");
		passbook.setMoney(passbook.getMoney() + money);
		System.out.println(money + "원 <입금 성공>");
	}
	
	//출금
	public int withdrawal(Passbook passbook, int money) {
		System.out.println("[ " + bankName + " ]");
		// 기존의 통장의 잔액에서 출금하고자하는 금액을 뺀 상태를 저장.
		int tempMoney = passbook.getMoney() - money;
		
		// tempMoney가 만약 0보다 작으면 출금을 막아야함.
		if(tempMoney < 0) {
			System.out.println("현재 잔액은 " + passbook.getMoney() + "원 입니다");
			System.out.println("<출금 실패>");
			System.out.println();
			return 0;
		}
		
		deduct(passbook, money);
		
		System.out.println("찾으신 금액: " + money);
		System.out.println("현재 잔액은 " + passbook.getMoney() + "입니다");
		System.out.println();
		
		return money;
	}
	
	
	/**
	 * 
	 * @param passbook
	 * @param money
	 * 
	 * 원래 금액에서 @param money를 차감하는 메소드
	 */
	private void deduct(Passbook passbook, int money) {
		passbook.setMoney(passbook.getMoney() - money - 500);
	}
}





