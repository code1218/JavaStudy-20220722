package j17_컬렉션;

import java.util.Scanner;

import j17_컬렉션.List.UserArrayList;
import lombok.Data;

@Data
public class UserManagementApplication {
	
	private Scanner scanner = new Scanner(System.in);
	private Object repository;
	
	public UserManagementApplication(Object repository) {
		this.repository = repository;
	}
	
	public void addUser() {
		String username = null; 
		String name = null;
		System.out.println("사용자 추가");
		
		System.out.print("아이디: ");
		username = scanner.nextLine();
				
		System.out.print("이름: ");
		name = scanner.nextLine();
		
		User user = new User(username, name);
		
		if(repository.getClass() == UserArrayList.class) {
			((UserArrayList) repository).insertUser(user);
		}
		
	}
	
	public void showUserAll() {
		System.out.println("[ 사용자 전체 조회 ]");
		if(repository.getClass() == UserArrayList.class) {
			
			((UserArrayList) repository).getUserList().forEach(user -> {
				System.out.println("아이디: " + user.getUsername());
				System.out.println("이름: " + user.getName());
				System.out.println();
				
			});
		}
		
	}
	
	public void modifyUser() {
		String username = null;
		String name = null;
		System.out.println("[ 사용자 정보 수정 ]");
		System.out.print("수정 할 아이디를 입력하세요: ");
		username = scanner.nextLine();
		
		if(repository.getClass() == UserArrayList.class) {
			User user = ((UserArrayList) repository).findUserByUsername(username);
			if(user == null) {
				System.out.println("해당 아이디는 존재하지 않는 아이디입니다.");
				
			}else {
				System.out.print("수정 할 이름을 입력하세요: ");
				name = scanner.nextLine();
				
				if(((UserArrayList) repository).updateUser(user, name)) {
					System.out.println("수정 완료.");
				}else {
					System.out.println("수정 실패");
				}
			}
		}
		
	}
	
	public void removeUser() {
		String username = null;
		String name = null;
		System.out.println("[ 사용자 정보 삭제 ]");
		System.out.print("삭제 할 아이디를 입력하세요: ");
		username = scanner.nextLine();
		
		if(repository.getClass() == UserArrayList.class) {
			User user = ((UserArrayList) repository).findUserByUsername(username);
			if(user == null) {
				System.out.println("해당 아이디는 존재하지 않는 아이디입니다.");
				
			}else {
				System.out.print("정말로 사용자를 삭제하시겠습니까(y/n): ");
				if(scanner.nextLine().equals("y")) {
					
					if(((UserArrayList) repository).deleteUser(user)) {
						System.out.println("삭제 완료.");
					}else {
						System.out.println("삭제 실패");
					}
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		UserArrayList userList = new UserArrayList();
		
		UserManagementApplication application = new UserManagementApplication(userList);
		
		Scanner scanner = application.getScanner();
		
		while(true) {
			String select = null;
			
			System.out.println("[ 사용자 관리 프로그램 ]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 전체 조회");
			System.out.println("3. 사용자 수정");
			System.out.println("4. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("선택: ");
			select = scanner.nextLine();
			
			if(select.equals("1")) {
				application.addUser();
				
			}else if(select.equals("2")) {
				application.showUserAll();
				
			}else if(select.equals("3")) {
				application.modifyUser();
				
			}else if(select.equals("4")) {
				application.removeUser();
				
			}else if(select.equals("q")) {
				System.out.print("프로그램을 종료하시겠습니까? (y/n): ");
				
				if(scanner.nextLine().equals("y")) {
					System.out.println("프로그램 종료중...");
					break;					
				}
				
			}else {
				System.out.println("다시 입력");
			}
		}
	}

}







