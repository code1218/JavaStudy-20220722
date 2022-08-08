package j09_클래스.캡슐화;

public class User {
	private String name;
	private int age;
	private String address;
	private Passbook passbook;
	
	public User(String name, int age, String address, Passbook passbook) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.passbook = passbook;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Passbook getPassbook() {
		return passbook;
	}
	public void setPassbook(Passbook passbook) {
		this.passbook = passbook;
	}
	
	
}
