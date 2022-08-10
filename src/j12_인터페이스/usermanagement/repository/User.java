package j12_인터페이스.usermanagement.repository;

public class User {
	private String username;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void showUserInfo() {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println();
	}
	
	
}











