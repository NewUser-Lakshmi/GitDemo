package testNg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void PersonalLoan()
	{
		System.out.println("Personal Loan features are executed");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method is executed");
	}
	
	@Test(dataProvider="getArrayData")
	public void Homeloan(String uname, String password)
	{
		System.out.println(uname);
		System.out.println(password);
		System.out.println("Home loan features are executed");
	}
	
	
	@Test(groups = {"Smoke"})
	public void CarLaon()
	{
		System.out.println("Car Loan features are executed");
	}
	
	@Parameters({"URL","HomeLoginPage"})
	@Test
	public void InsuranceLoan(String urlName, String HomeLoginPage)
	{
		System.out.println(urlName);
		System.out.println(HomeLoginPage);
		System.out.println("Insurance loan features are executed");
	}

	
	@DataProvider
	public Object[][] getArrayData()
	{
		//1st combination - username password - good credit history= row
		//2nd - username password  - no credit history
		// 3rd - fraudlent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}

}
