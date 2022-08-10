package j12_인터페이스.usermanagement.controller;

import java.util.Scanner;

import j12_인터페이스.usermanagement.service.UserService;

public class UserController {
	private UserService userService;
	private Scanner scanner;
	
	public UserController(UserService userService) {
		this.userService = userService;
		scanner = new Scanner(System.in);
	}
	
	public void run() {
		
		while(true) {
			String select = null;
			
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 전체 조회");
			System.out.println("3. 사용자 검색");
			System.out.println("q. 프로그램 종료");
			System.out.print("메뉴를 선택하세요: ");
			select = scanner.nextLine();
			
			if(select.equals("q")) {
				System.out.println("프로그램 종료(y/n): ");
				select = scanner.nextLine();
				if(select.equals("y")) {
					break;
				}
			}else if(select.equals("1")) {
				createUser();
			}else if(select.equals("2")) {
				searchUser();
			}else if(select.equals("3")) {
				showUserList();
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	private void createUser() {
		String username = null;
		String password = null;
		
		System.out.println("[ 사용자를 추가합니다. ]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		userService.addUser(username, password);
		System.out.println();
		
	}
	
	private void searchUser() {
		String username = null;
	
		System.out.println("[ 사용자 검색 ]");
		System.out.print("사용자 아이디: ");
		username = scanner.nextLine();
		
		userService.getUser(username);
		System.out.println();
	}
	
	private void showUserList() {
		System.out.println("[ 전체 사용자 조회 ]");
		userService.getUserList();
		System.out.println();
	}
}










