package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class Learning_Data_Provider 
{
	@Test(dataProvider = "loginData")
	public void loginTest(String username, String password) throws InterruptedException 
	{
	WebDriver driver = new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("BDeepali@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("BDeepali");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

	@DataProvider(name = "loginData")
	public Object [][] loginData()
{
	Object [][] data = new Object [3][2];
	data [0][0] = "harpreet@gmail.com";
	data [0][1] = "harpreet";
	
	data [1][0] = "anjali@gmail.com";
	data [1][1] = "anjali";
	
	data [1][0] = "BDeepali@gmail.com";
	data [1][1] = "BDeepali";
	
	return data;
	}


}
