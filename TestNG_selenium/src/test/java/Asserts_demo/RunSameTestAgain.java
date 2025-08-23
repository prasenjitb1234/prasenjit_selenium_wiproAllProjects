package Asserts_demo;

import org.testng.annotations.Test;

public class RunSameTestAgain {

	@Test(invocationCount = 5)
	public void repeatTest() {
		System.out.println("Test executed 5 times");
	}
	
	

}
