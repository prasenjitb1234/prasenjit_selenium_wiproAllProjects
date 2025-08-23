package Enum_Practice;

enum Day1 {
	Monday, Saturday
}

//enum Role{
//	User, Admin
//}


public class TestEnum {
	public static void main(String[] args) {

		Day1 today = Day1.Saturday;
		Day1 todaym = Day1.Monday;

		System.out.println("Today is : " + today);
		System.out.println("Day After Tomorrow is : " + todaym);
		
		
//		Role admin = Role.Admin;
//		Role user = Role.User;
//		
//		System.out.println("User is : "+user);
//		System.out.println("Admin is : "+admin);
		
	}
}
