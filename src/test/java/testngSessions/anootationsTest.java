package testngSessions;

import org.testng.annotations.Test;

public class anootationsTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		// driver= new ChromeDriver();
		driver.get("https://seleniumeasylearning.blogspot.com/2024/05/implicit-and-explicit-waits.html");

		System.out.println(driver.getTitle());
	}

	@Test(priority = 2)
	public void URLTest() {
		System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 3)
	public void getHeader() {
		System.out.println("Getting ---getHeader");
	}

}
