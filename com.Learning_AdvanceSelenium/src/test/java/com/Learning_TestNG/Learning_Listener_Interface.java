package com.Learning_TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic_Library.Base_Test_2;

public class Learning_Listener_Interface extends Base_Test_2
{

	@Test
	public void searchTest() throws InterruptedException
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop");
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
	}

}
