package testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class runningTestcases {

	@Test
	public void  demo()
	{
		System.out.println("HELLO");
	}
	
	
	@Test
	public void getData()
	{
		System.out.println("retrieve the data");
	}
	
	@AfterSuite
	@Test
	public void AfterSuite()
	{
		System.out.println("After Suite will execute last");
	}
	
	@Test(groups = {"Smoke"})
	public void String()
	{
		System.out.println("retrieve the String");
	}

}
