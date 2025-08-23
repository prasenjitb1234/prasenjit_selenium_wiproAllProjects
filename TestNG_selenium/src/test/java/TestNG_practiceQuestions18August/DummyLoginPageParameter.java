package TestNG_practiceQuestions18August;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

//Write test cases for a dummy login page using @Parameters in testng.xml.

public class DummyLoginPageParameter {

	   WebDriver driver;

	    @Test
	    @Parameters({"username", "password"})
	    public void loginTest(String username, String password) {
	        System.out.println("Enter username and password ");
	        System.out.println("username : " + username);
	        System.out.println("password : " + password);

	        if ("prasenjit".equals(username) && "bhosale".equals(password)) {
	            System.out.println("Successful Login.");
	        } else {
	            System.out.println("Login Failed");
	        }
	    }

}
