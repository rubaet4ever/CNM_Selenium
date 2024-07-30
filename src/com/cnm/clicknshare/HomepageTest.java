package com.cnm.clicknshare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomepageTest {
 
	public static void updateHomepageTest(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Share")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(5) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Homepage")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#hpconfig_10 span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(2) .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".radio-inline:nth-child(5) > .lbl")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='select2-document-container']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("D-ADM-01-01-Organization Chart");
		    Thread.sleep(2000);
		    
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);

			
			driver.findElement(By.cssSelector("#hpconfig_16 span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(3) .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".radio-inline:nth-child(5) > .lbl")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='documentDiv']/div/span[2]/span[1]/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("D-ADM-01-01-Organization Chart");
		    Thread.sleep(2000);
		    
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);

			
			
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
	
}
