package j12_인터페이스.usermanagement.service;

import j12_인터페이스.usermanagement.repository.DataRepository;
import j12_인터페이스.usermanagement.repository.User;

public class UserServiceImpl implements UserService {
	
	private DataRepository dataRepository;
	
	public UserServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	@Override
	public void addUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		dataRepository.addUser(user);
	}

	@Override
	public void getUser(String username) {
		User user = dataRepository.findUserByUsername(username);
		user.showUserInfo();
	}

	@Override
	public void getUserList() {
		User[] userArray = dataRepository.getUserArray();
		for(User user : userArray) {
			if(user != null) {
				user.showUserInfo();
			}
		}
	}
	
}






