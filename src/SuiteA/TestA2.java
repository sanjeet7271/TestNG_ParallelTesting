package SuiteA;

import org.testng.annotations.Test;

public class TestA2 {
	@Test
	public void testA2() throws InterruptedException {
		System.out.println("Starting A2...");
		Thread.sleep(2000);
		System.out.println("Ending A2...");
	}
}
