package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartTest {
	
	
	//before annotations-- preconditions to test cases
	
	@BeforeSuite
	//1.
	public void dbConnections() {
		System.out.println("BS--dbConnections");
	}
	
	@BeforeTest
	//2.
	public void createUser() {
		System.out.println("BT ---createUser");
	}
	
	@BeforeClass
	//3.
	public void launchBrowser() {
		System.out.println("BC ---launchBrowser");
	}
	
	@BeforeMethod
	//it will start before each and every method
	public void login() {
		System.out.println("BM ---Login to the app");
	}
	//Alphabatically it will run @Test -- abcd
	@Test
	public void titleTest() {
		System.out.println("T --title Test");
	}
	
	@Test
	public void headerTest() {
		System.out.println("T --header Test");
	}
	
	@Test
	public void URLTest() {
		System.out.println("T --URL Test");
	}
	
	@AfterMethod
	//After each and every method 
	public void logout() {
		System.out.println("AM --logout");
	}
	
	@AfterClass
	
	public void closeBrowser() {
		System.out.println("AC --closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT --deleteUser");
	}
	
	@AfterSuite
	public void disconnectwithDB() {
		System.out.println("AS --disconnectwithDB");
	}
	
	


}


/*
BSuite--dbConnections
BTest ---createUser
BClass ---launchBrowser

BMethod ---Login to the app
Test --URL Test---1
AMethod --logout

BMethod ---Login to the app
Test --header Test---2
AMethod --logout

BMethod ---Login to the app
Test --title Test---3
AMethod --logout

AClass --closeBrowser
ATest --deleteUser
ASuite--disconnectwithDB
*/
/*
 * Before annotations
 * Test Annotations
 * After Annitations
 * 
 */