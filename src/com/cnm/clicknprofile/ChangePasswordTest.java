package com.cnm.clicknprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordTest {
         
	public static void updateChangePassswordTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			
			driver.findElement(By.id("newPassword")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("newPassword")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
		
			driver.findElement(By.id("confirmPassword")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("confirmPassword")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
		

			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);

	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	 
	
	
}
