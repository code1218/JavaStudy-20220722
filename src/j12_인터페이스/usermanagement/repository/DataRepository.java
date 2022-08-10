package j12_인터페이스.usermanagement.repository;

public class DataRepository {
	private User[] userArray;
	
	public DataRepository() {
		userArray = new User[3];
	}
	
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
	
	public User[] getUserArray() {
		return userArray;
	}
}










