package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG {
	@Test
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case", true); // true will print the data on console
		//Reporter.log("Executing Login Test Case"); // will store the data in test_output emailable report

	}
}
