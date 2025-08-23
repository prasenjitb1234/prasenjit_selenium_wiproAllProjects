package TestNG_practiceQuestions18August;

import org.testng.annotations.Test;

//Write a test to run the same test multiple times.

public class RunSameTestMultipleTimes {

	@Test(invocationCount = 5)
	public void runSameTestMultipleTimes() {
		System.out.println(" Hello World ");
	}

}
