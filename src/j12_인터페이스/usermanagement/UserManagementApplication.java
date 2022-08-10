package j12_인터페이스.usermanagement;

import j12_인터페이스.usermanagement.controller.UserController;
import j12_인터페이스.usermanagement.repository.DataRepository;
import j12_인터페이스.usermanagement.service.UserService;
import j12_인터페이스.usermanagement.service.UserServiceImpl;

public class UserManagementApplication {
	
	public static void main(String[] args) {
		DataRepository dataRepository = new DataRepository();
		UserService service = new UserServiceImpl(dataRepository);
		UserController controller = new UserController(service);
		controller.run();
		System.out.println("프로그램 종료");
	}

}
