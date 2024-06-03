package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngClass3 extends BaseTest {
	
	@Test
	public void titleTest() {

		

		Assert.assertEquals(driver.getTitle(), "Your Store",
				"The title Validation is failed: __");

	}
	
	@Test(priority=2)
	public void getcurrentURL() {
		
		System.out.println(driver.getCurrentUrl());
	}

}
