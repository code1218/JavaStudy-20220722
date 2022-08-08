package j09_클래스.캡슐화;

public class BankMain {

	public static void main(String[] args) {
		Passbook passbook1 = new Passbook();
		Passbook passbook2 = new Passbook();
		
		User j = new User("김준일", 29, "부산 동래구", passbook1);
		User d = new User("김동윤", 22, "부산 부산진구", passbook2);
		
		j.getPassbook().showMoney();
		d.getPassbook().showMoney();
		
		Bank shinhanBank = new Bank("신한은행");
		Bank wooriBank = new Bank("우리은행");
		
		shinhanBank.deposit(j.getPassbook(), 100000);
		
		j.getPassbook().showMoney();
		
		shinhanBank.deposit(d.getPassbook(), 50000);
		
		d.getPassbook().showMoney();
		
		wooriBank.withdrawal(d.getPassbook(), 30000);
		
		shinhanBank.withdrawal(d.getPassbook(), 30000);
		
		d.getPassbook().showMoney();
		

	}

}
