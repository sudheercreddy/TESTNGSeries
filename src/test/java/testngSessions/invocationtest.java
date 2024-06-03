package testngSessions;

import org.testng.annotations.Test;

public class invocationtest {
	
	@Test(invocationCount=100)
	public void welcome() throws InterruptedException {
		System.out.println("Welcome to the world");
		Thread.sleep(500);
	}

}
