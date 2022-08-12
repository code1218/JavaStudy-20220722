package j13_최상위클래스;

import java.util.Objects;

public class User {
	private String username;
	private String password;
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {
//			return true;
//		}
//		if(obj == null) {
//			return false;
//		}
//		if(!(obj instanceof User)) {
//			return false;
//		}
//		
//		User user = (User) obj;
//		return this.username.equals(user.username) && this.password.equals(user.password);
//	}

	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}



	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	
}
