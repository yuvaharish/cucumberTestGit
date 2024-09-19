package execuationPack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnn {
	
	@BeforeClass
	public static void beforClass() {
		System.out.println("beforeClass");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@Test
	public void Yuvaraj() {
		String name ="Ziffity";
		Assert.assertEquals(name, "Ziffity");
		System.out.println("Yuvaraj");
		
	}
	@Test
	public void Karthick() {
		System.out.println("Karthick");
	}
	@After
	public void afterTest() {
		System.out.println("afterTest");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

}
