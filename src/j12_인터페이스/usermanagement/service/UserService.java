package j12_인터페이스.usermanagement.service;

public interface UserService {
	
	public void addUser(String username, String password);
	
	public void getUser(String username);
	
	public void getUserList();

}
