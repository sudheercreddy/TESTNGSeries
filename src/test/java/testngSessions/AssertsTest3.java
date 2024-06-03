package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsTest3 extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {

		driver.get("https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html");

		Assert.assertEquals(driver.getTitle(), "Implicit and Explicit Waits,FluentWait,PageLoadTimeOut",
				"The title Validation is failed: __");
System.out.println(driver.getTitle());
	}

	@Test(priority = 2)
	public void URLTest() {
		String urla = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html",
				"URL is not same");
		
		System.out.println(driver.getCurrentUrl());

		Assert.assertTrue(urla.contains("seleniumeasylearning"));
	}

}
