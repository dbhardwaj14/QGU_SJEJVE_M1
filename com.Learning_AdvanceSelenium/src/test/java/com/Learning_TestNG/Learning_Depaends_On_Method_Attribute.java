package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Depaends_On_Method_Attribute {

	@Test(dependsOnMethods = "RegisterTest")
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test ()
	public void RegisterTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test (dependsOnMethods = {"RegisterTest", "loginTest"})
	public void SearchTest()
	{
		Reporter.log("Executing Login Test Case", true); 
	}

}
