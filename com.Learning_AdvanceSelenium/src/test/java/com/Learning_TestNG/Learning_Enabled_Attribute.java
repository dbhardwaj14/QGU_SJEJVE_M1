package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Enabled_Attribute {
	@Test()
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test (enabled = false)
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
