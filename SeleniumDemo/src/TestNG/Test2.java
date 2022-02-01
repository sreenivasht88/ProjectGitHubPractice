package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority=-1)
	public void pr()
	{
		Reporter.log("hello", true);
	}
	
	@Test(invocationCount = 2)
	public void pr1()
	{
		Reporter.log("hello", true);
	}
	
	@Test(invocationCount = 2)
	public void pr2()
	{
		Reporter.log("hello", false);
		
		
	}

}
