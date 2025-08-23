package Pass_Value_Reference;

public class TestPass {
	
	public static void changePassword(String password) {
		password = "NewPassword";
	}
	
	public static void main(String[] args) {
		
		String password = "OldPassword";
		
		changePassword(password); // pass reference
		 
		System.out.println("Password Method : "+password); // pass value
		
		
		
		
		
		
	}
}
