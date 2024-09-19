package testNg;

import org.testng.annotations.Test;

public class PriorityClass {
	
	
	@Test(priority = 0)
	public void startCar() {
		System.out.println("startCar");
	}

	@Test(priority = 1)
	public void firstGear() {
		System.out.println("firstGear");
	}
	
	@Test(priority = 2)
	public void secondGear() {
		System.out.println("secondGear");
	}
	
	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("thirdGear");
	}

}
