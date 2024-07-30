package com.cnm.clicknprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProfileTest {
	
	public static void updateProfileTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//driver.findElement(By.id("rc-anchor-container")).click();
			//Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
			

		    driver.findElement(By.cssSelector("li:nth-child(10) > .dropdown-toggle")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) > a")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".btn-sm:nth-child(1)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#firstName")).click();
			Thread.sleep(2000); 
			driver.findElement(By.cssSelector("#firstName")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#firstName")).sendKeys("Rubaet");
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#lastName")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#lastName")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#lastName")).sendKeys("Bin Qaiyum");
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#workphone")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#workphone")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#workphone")).sendKeys("022 738 13 11");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#mobilePhonePro")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#mobilePhonePro")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#mobilePhonePro")).sendKeys("+41001112232");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#addressStreet")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#addressStreet")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#addressStreet")).sendKeys("South"); 
			Thread.sleep(2000);
			
			//(Could not commit JPA transaction; nested exception is javax.persistence.RollbackException: Error while committing the transaction)
		    // Errors Could be
			// Space Issues
			// Can Not Change The Data
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);

		   // driver.findElement(By.cssSelector(".width-35")).click();
		   //Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".user-info > span:nth-child(3)")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span")).click();
			Thread.sleep(2000);
			
			driver.quit();
	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	

}
