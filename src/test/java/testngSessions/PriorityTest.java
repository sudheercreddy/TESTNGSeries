package testngSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 4)
	public void aTest() {
		System.out.println("a test");
	}

	@Test(priority = 5)
	public void bTest() {
		System.out.println("b test");
	}

	@Test(priority = 3)
	public void cTest() {
		System.out.println("c test");
	}

	@Test(priority = 2)
	public void dTest() {
		System.out.println("d test");

	}

	@Test(priority = 1)
	public void eTest() {
		System.out.println("e test");
	}
	
	@Test(priority = 999)
	public void fTest() {
		System.out.println("f test");
	}
	
	@Test
	public void zTest() {
		System.out.println("z test");
	}
	
	@Test
	public void yTest() {
		System.out.println("y test");
	}
}
