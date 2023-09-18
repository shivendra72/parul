package vishal.VishalMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Buildcheck {
	
	@Test
	public void sum() {
		System.out.println("Sum");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}

}
