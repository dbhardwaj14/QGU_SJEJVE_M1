package com.testScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test;
import com.generic_Library.WebDriver_Utility;

public class TC002_AddtoCard extends Base_Test
{
	
@Test
public void addToCardTest() throws InterruptedException
{
Thread.sleep(2000);
driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/ancestor::div[@class='details']/descendant::div[@class='buttons']")).click();
driver.findElement(By.partialLinkText("Shopping cart")).click();
WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));

try
{
	Reporter.log("Element is present.....", true);
	WebDriver_Utility.takesScreenShotofWebPage(driver, "shoppingCart");
}
catch (Exception e)
{
	Reporter.log("Element is not present.....", true);
	}
	Thread.sleep(2000);
}
}
