package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Priority_Attribute {
	
	@Test(priority = 2)
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test (priority = 1)
	public void RegisterTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test (priority = 3)
	public void SearchTest()
	{
		Reporter.log("Executing Login Test Case", true); 
	}
}
