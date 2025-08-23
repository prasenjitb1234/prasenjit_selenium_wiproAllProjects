package Encapsulation_Practice;

public class User {

	public String username = "prasenjit";
	public String password;

	public void getUsername() {
		System.out.println("Username is : "+username);
	}


	public void getPassword(String password) {
		System.out.println("Password is : "+password);
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static void main(String[] args) {
		User u = new User();
		u.getUsername();
		u.getPassword("prasen@123");
	}
}