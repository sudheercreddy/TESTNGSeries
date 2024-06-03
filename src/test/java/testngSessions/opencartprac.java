package testngSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class opencartprac {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
}
