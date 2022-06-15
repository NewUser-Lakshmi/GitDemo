package testNg;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeClass
	public void BeforeMethod() 
	{
		System.out.println("Before class will be executed");
	}

	@Test
	public void Selenium()
	{
		System.out.println("Learned Selenium");
	}
	
	@Test(groups = {"Smoke"})
	public void MobileApp()
	{
		System.out.println("Learned Mobile App");
	}
	
	//depends on Methods ---> depends on Mutliple methods
	@Test(dependsOnMethods= {"Selenium", "Java"})
	public void RestAPI() 
	{
		System.out.println("Learned RestAPI");
	}
	
	@Test
	public void Java()
	{
		System.out.println("Learned Java");
	}

}
