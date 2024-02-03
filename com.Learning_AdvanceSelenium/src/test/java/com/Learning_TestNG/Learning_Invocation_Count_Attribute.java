package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Invocation_Count_Attribute {
	@Test(invocationCount = 10)
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test ()
	public void RegisterTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test ()
	public void SearchTest()
	{
		Reporter.log("Executing Login Test Case", true); 
	}

}
