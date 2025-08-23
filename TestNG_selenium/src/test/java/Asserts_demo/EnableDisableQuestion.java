package Asserts_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnableDisableQuestion {

	@Test
	public void activeTest() {
		System.out.println("Active Test is running ");
		Assert.assertTrue(true);
	}

	@Test(enabled = false)
	public void disabledTest() {
		System.out.println("This test is disabled so doesnt run");
	}

}
