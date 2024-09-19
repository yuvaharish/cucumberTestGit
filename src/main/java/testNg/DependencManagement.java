package testNg;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependencManagement {
	
	@Test(enabled = true)
	public void browser() {
		System.out.println("browser opend");
	}
	
	@Test(dependsOnMethods = "browser")
	public void flipkart() {
		System.out.println("Flipkart");
	}

}
