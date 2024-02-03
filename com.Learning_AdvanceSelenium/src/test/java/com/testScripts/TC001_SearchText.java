package com.testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC001_SearchText extends Base_Test
{
@Test
public void searchTest() throws InterruptedException 
{
	driver.findElement(By.name("q")).sendKeys("mobile");
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	Thread.sleep(2000);
	WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Search']")));
	WebDriver_Utility.takesScreenShotofWebPage(driver, "mobileSearch");
	}
}
