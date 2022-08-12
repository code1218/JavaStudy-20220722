package j12_인터페이스.usermanagement.repository;

/**
 * 
 * DataRepository -> 데이터를 저장하는 저장소
 * 1. 데이터 추가
 * 2. 사용자 이름을가지고 사용자를 찾아주는 기능
 * 3. 가지고 있는 모든 데이터를 보여줄 수 있어야한다.
 *
 */
public class DataRepository {
	private User[] userArray;
	
	/*
	 * DataRepository 클래스(객체)가 생성 되는 시점에 User[] 배열을 생성한다.
	 */
	public DataRepository() {
		userArray = new User[3];
	}
	
	/*
	 * 사용자 객체(User)를 매개변수로 받으면 UserArray에 추가해줘야한다.
	 * 유저 배열의 비어있는 공간에 유저를 추가해줘야 하기때문에 빈공간 체크로직이 필요하다.
	 * 
	 */
	public void addUser(User user) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] == null) {
				userArray[i] = user;
				user.showUserInfo();
				System.out.println("사용자 추가 완료");
				return;
			}
		}
		System.out.println("더 이상 사용자를 추가 할 수 없습니다.");
	}
	
	/*
	 * 매개변수로 받은 아이디를 가지고 배열의 유저중 
	 * 같은 아이디를 가지고 있는 객체를 찾아 반환
	 */
	public User findUserByUsername(String username) {
		for(User user : userArray) {
			if(user != null) {
				if(user.getUsername().equals(username)) {
					return user;
				}
			}
		}
		return null;
	}
	
	/*
	 * 단순 배열 반환
	 */
	public User[] getUserArray() {
		return userArray;
	}
}










