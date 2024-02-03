package com.generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Test {
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBroswer()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void LogintoDWS()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("BDeepali@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("BDeepali");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	}
	
	@AfterMethod
	public void logoutFromDWS()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass	
	public void closeBroswer()
	{
	driver.quit();
	}
	
	

}
