package testngSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTest2 extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		
		driver.get("https://orangehrm.com/");
		Assert.assertEquals(driver.getTitle(), "Human Resources Management Software | OrangeHRM",
				"The title Validation is failed: __");
	}

	@Test(priority = 2)
	public void URLTest() {
		String url = driver.getCurrentUrl();
		// Assert.assertEquals(driver.getCurrentUrl(),
		// "https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html","URL
		// is not same");

		System.out.println(url + "<===URL");

		Assert.assertTrue(url.contains("orangehrm"));
	}

}
