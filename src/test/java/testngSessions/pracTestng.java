package testngSessions;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pracTestng extends BaseTest{
	
	
	@BeforeTest
	public void preSetup() {
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	}
	
	@Test
	public void gettitle() {
		System.out.println(driver.getTitle());
	}
	
	
	@Test
	public void getCurrentURL() {
		System.out.println(driver.getCurrentUrl());
		
	}
	@AfterTest
	public void closeAll() {
		driver.close();
	}

}