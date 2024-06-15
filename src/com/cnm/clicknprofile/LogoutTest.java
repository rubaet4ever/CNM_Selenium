package com.cnm.clicknprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutTest {
	
	public static void clickLogoutTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Click & Profile")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
			Thread.sleep(2000);
			
		

	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}

}
