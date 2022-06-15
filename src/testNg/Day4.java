package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void getData1()
	{
		System.out.println("Get data1 details");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite is executed first");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method has been executed");
	}
	@Test
	public void getData2()
	{
		System.out.println("Get data2 details");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("after class method has been executed");
	}
	
	//enabled = false - skips the method, i.e it wont execute, and this can be used - when you that the test case is failed and you want 
	//execute another test cases at that time you will use enabled = false.
	//if you 50 test cases and you know that this test case fails, you know that the test case will fail,at that time you have to use
	//49 test cases will be executed
	
	@Test(enabled=false)
	public void getData3() 
	{
		System.out.println("Get data3 details");
	}
	
	//timeouts are used when  you know that the functionality is taking lot of time to open, then you can use timeouts it will wait
	//until how many seconds you want to wait and throws an exception, pass or fail.
	
	@Test(timeOut=4000)
	public  void timeOuts()
	{
		System.out.println("It will for 40 seconds and if it throw an exception");
	}
	
	@Test(groups = {"Smoke"})
	public void getData4()
	{
		System.out.println("Get Data4 details");
	}

}
