package SuiteA;

import org.testng.annotations.Test;

public class TestA1 {
	
	@Test
	public void testA1() throws InterruptedException {
		System.out.println("Starting A1...");
		Thread.sleep(2000);
		System.out.println("Ending A1...");
	}

}
