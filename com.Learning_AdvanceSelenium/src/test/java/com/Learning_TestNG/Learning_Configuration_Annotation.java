package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_Configuration_Annotation {
	@BeforeSuite
	public void beforeSuite() 
	{
		Reporter.log("Executing Before Suite..");
	}
	
	@AfterSuite
	public void Aftersuite() 
	{
		Reporter.log("Executing After Suite..");
	}
	
	@BeforeTest
	public void BeforeTest() 
	{
		Reporter.log("Executing Before Test..");
	}
	
	@AfterTest
	public void AfterTest() 
	{
		Reporter.log("Executing After Test..");
	}
	
	@BeforeGroups
	public void BeforeClass() 
	{
		Reporter.log("Executing Before Class..");
	}
	
	@AfterClass
	public void AfterClass() 
	{
		Reporter.log("Executing After Class..");
	}
	
	@BeforeMethod
	public void BeforeMethod() 
	{
		Reporter.log("Executing Before Method..");
	}
	
	@BeforeSuite
	public void AfterMethod() 
	{
		Reporter.log("Executing After Method..");
	}
	@Test(priority = 2)
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	/*@Test (priority = 1)
	public void RegisterTest()
	{
		Reporter.log("Executing Login Test Case", true); 

	}
	@Test (priority = 3)
	public void SearchTest()
	{
		Reporter.log("Executing Login Test Case", true); 
	}*/

}
