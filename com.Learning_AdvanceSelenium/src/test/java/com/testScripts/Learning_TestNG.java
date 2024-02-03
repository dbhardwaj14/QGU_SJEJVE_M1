package com.testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_TestNG 
{
	@Test
	public void Learning_TestNg()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://hk.knowcross.com/");
		
		driver.findElement(By.id("customercode")).sendKeys("Kneu");
		driver.findElement(By.id("username")).sendKeys("eu1");
		driver.findElement(By.id("password")).sendKeys("11");
		driver.findElement(By.id("buttonsign")).click();
	}
	}
	

}
