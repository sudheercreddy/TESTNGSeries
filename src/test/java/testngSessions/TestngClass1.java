package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClass1 extends BaseTest {
	
	@Test
	public void titleTest() {

		Assert.assertEquals(driver.getTitle(), "Implicit and Explicit Waits,FluentWait,PageLoadTimeOut",
				"The title Validation is failed: __");

	}
	
	@Test(priority=2)
	public void getcurrentURL() {
		
		System.out.println(driver.getCurrentUrl());
	}

}
