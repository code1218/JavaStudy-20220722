package j12_인터페이스.usermanagement.service;

import j12_인터페이스.usermanagement.repository.DataRepository;
import j12_인터페이스.usermanagement.repository.User;

public class UserServiceImpl implements UserService {
	
	private DataRepository dataRepository;
	
	public UserServiceImpl(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	/*
	 * 매개변수로 전달받은 username, password 값을 User 객체로 변환을 하고
	 * DataRepository에 해당 User객체를 저장(추가)해달라고 요청
	 */
	@Override
	public void addUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		dataRepository.addUser(user);
	}
	
	/*
	 * 해당 username으로 DataRepository에서 사용자(User)를 조회하고
	 * 그결과 null인지 아닌지에 따라 결과를 출력.
	 */
	@Override
	public void getUser(String username) {
		User user = dataRepository.findUserByUsername(username);
		
		if(user != null) {
			user.showUserInfo();			
		}else {
			System.out.println("해당 아이디로 사용자를 찾을 수 없습니다.");
		}
	}

	/*
	 * DataRepository에서 모든 유저배열을 받아서
	 * 정보 전체 출력
	 */
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






