package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteClass {
	
	@BeforeSuite
	public void browserLoad() {
		System.out.println("browserLoad");
	}

	@Test
	public void openGoogle() {
		System.out.println("openGoogle");
	}
	@Test
	public void openFlipkart() {
		System.out.println("open Flipkart");
	}
	@AfterSuite
	public void browserClose() {
		System.out.println("close browser");
	}

}
