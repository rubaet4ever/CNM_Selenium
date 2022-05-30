package com.cnm.clicknprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfileTest {
	
	public static void updateProfileTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.firstName")).click();
			driver.findElement(By.id("employee.firstName")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.firstName")).sendKeys("Rubaet");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("employee.lastName")).click();
			driver.findElement(By.id("employee.lastName")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.lastName")).sendKeys("Bin Qaiyum");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("workphone")).click();
			driver.findElement(By.id("workphone")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("workphone")).sendKeys("022 738 13 11");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.mobilePhonePro")).click();
			driver.findElement(By.id("employee.mobilePhonePro")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.mobilePhonePro")).sendKeys("+41001112232");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.addressStreet")).click();
			driver.findElement(By.id("employee.addressStreet")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.addressStreet")).sendKeys("R-125");
			Thread.sleep(2000);
			
			
			
		    
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);

	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	

}
