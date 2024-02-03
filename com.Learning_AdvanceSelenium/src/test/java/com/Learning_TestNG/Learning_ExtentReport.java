package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ObjectRepository.LoginPage;
import com.ObjectRepository.WelcomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.generic_Library.WebDriver_Utility;

public class Learning_ExtentReport {
	@Test
	public void loginText() throws InterruptedException 
	{
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/reports/FirstReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("loginTest");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		/* WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		test.log(Status.INFO, "Login Demo Web Shop opened");
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("BDeepali@gmail.com");
		lp.getPasswordTextField().sendKeys("BDeepali");
		lp.getLoginButton().click();
		test.log(Status.PASS, "User Logged in successfully");
		Thread.sleep(2000);
		driver.quit();
		report.flush(); */
		
		
		try {
			Assert.assertEquals(driver.getTitle(), "DWS");
			test.log(Status.INFO,"Demo WebShop opened");
			WelcomePage wp = new WelcomePage(driver);
			wp.getLoginLink().click();
			test.log(Status.INFO, "Login Demo Web Shop opened");
			LoginPage lp = new LoginPage(driver);
			lp.getEmailTextField().sendKeys("BDeepali@gmail.com");
			lp.getPasswordTextField().sendKeys("BDeepali");
			lp.getLoginButton().click();
			test.log(Status.PASS, "User Logged in successfully");
			Thread.sleep(2000);
		}
		
		catch(Throwable e)
		{
			test.log(Status.FAIL, "fail.....");
			test.addScreenCaptureFromBase64String(WebDriver_Utility.getScreenShotPath(driver));
		}
		
		driver.quit();
		report.flush();
	}

}
