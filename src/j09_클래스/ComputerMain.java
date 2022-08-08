package j09_클래스;

/*
 * Student
 * 
 * 변수
 * studentCode 	>	학번
 * name 		>	이름
 * phone		>	연락처
 * address		>	주소
 * 
 * 메소드
 * showStudentInfo()
 * 	> 	학번: 20220001
 * 		이름: 김준일
 * 		연락처: 010-9988-1916
 * 		주소: 부산 동래구 사직동
 * 
 * 	> 	학번: 20220002
 * 		이름: 백우찬
 * 		연락처: 010-1234-5678
 * 		주소: 부산 부산진구 가야동
 * 
 *  > 	학번: 20220003
 * 		이름: 장한이0
 * 		연락처: 010-1111-2222
 * 		주소: 부산 남구 대연동
 * 
 * 
 * 
 */

public class ComputerMain {

	public static void main(String[] args) {
		
		/*
		 * new 생성해라라는 의미의 명령
		 * Computer() <- Computer class의 생성자
		 * 
		 */
		
		System.out.println(new Computer());
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.showInfo();
		c2.showInfo();
		
		c1.cpu = "i7";
		c1.ram = 16;
		c1.ssd = 512;
		
		c2.cpu = "i3";
		c2.ram = 8;
		c2.ssd = 256;
		
		c1.showInfo();
		c2.showInfo();
		
		c1.powerOn();
		c2.powerOn();
		
		c1.powerOff();
		c2.powerOff();
	}

}
