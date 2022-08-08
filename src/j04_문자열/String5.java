package j04_문자열;

public class String5 {

	public static void main(String[] args) {
		String phone = "010-9988-1916";
		String replacePhone = phone.replaceAll("-", " ");
		replacePhone = replacePhone.replaceAll(phone, replacePhone);
		
		System.out.println(replacePhone);
		
		/*
		 * dateTime
		 * 2022-07-27/15_00_00
		 * 
		 * 2022/07/27 15:00:00
		 */
		
		String dateTime = "2022-07-27/15_00_00"
				.replaceAll("/", " ")
				.replaceAll("-", "/")
				.replaceAll("_", ":");

		
		System.out.println(dateTime);
		
		String phoneNum = "010/9988/1916"
				.replaceAll("/", "")
				.replaceAll(" ", "")
				.replaceAll("-", "");
		
		System.out.println(phoneNum);
		
		
		
		

	}

}







