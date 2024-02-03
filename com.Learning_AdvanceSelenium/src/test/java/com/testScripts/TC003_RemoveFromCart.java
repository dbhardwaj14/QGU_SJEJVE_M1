package com.testScripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_Library.WebDriver_Utility;

public class TC003_RemoveFromCart extends TC002_AddtoCard
{

	@Test
	public void removeFromCartTest() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//a[text()='Casual Golf Belt'])[2]/ancestor::tr[@class='cart-item-row']/descendant::input[@type='checkbox']")).click();
		driver.findElement(By.cssSelector("[name='updatecart']")).click();
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		
		try
		{
			Reporter.log("Element is present....", true);
			WebDriver_Utility.takesScreenShotofWebPage(driver, "shoppingCart");
		}
		catch (Exception e)
		{
			Reporter.log("Element is not present....", true);
		}
		Thread.sleep(2000);
	}
}
