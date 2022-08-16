package j17_컬렉션.List;

import java.util.ArrayList;

import j17_컬렉션.User;

public class UserArrayList {
	
	private ArrayList<User> users = new ArrayList<User>();
	
	public boolean insertUser(User user) {
		return users.add(user);
	}
	
	public ArrayList<User> getUserList() {
		return users;
	}
	
	
	public User findUserByUsername(String username) {
		for(User user : users) {
			if(user == null) {
				continue;
			}else {
				if(user.getUsername().equals(username)) {
					return user;
				}
			}
		}
		
		return null;
	}
	
	public boolean updateUser(User user, String name) {
		user.setName(name);
		return true;
	}
	
	public boolean deleteUser(User user) {
		return users.remove(user);
	}
	
	
}









