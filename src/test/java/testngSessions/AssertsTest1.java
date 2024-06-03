package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsTest1 extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {

		driver.get("https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html");

		Assert.assertEquals(driver.getTitle(), "Implicit and Explicit Waits,FluentWait,PageLoadTimeOut",
				"The title Validation is failed: __");

	}

	@Test(priority = 2)
	public void URLTest() {
		String urla = driver.getCurrentUrl();
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html",
				"URL is not same");

		Assert.assertTrue(urla.contains("seleniumeasylearning"));
	}

}
