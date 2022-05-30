package com.cnm.clickncheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RequirementsTest {

	public static void createRequirements(WebDriver driver) {
		try {
		driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".bigger-110")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Click & Check")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".fa-plus-circle")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("reference")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("reference")).sendKeys("RQ05");
	    Thread.sleep(2000);
	    driver.findElement(By.id("requirementLocale.name")).sendKeys("REQ-5");
	    Thread.sleep(2000);
	    
		Select select = new Select(driver.findElement(By.name("parent")));
		select.getFirstSelectedOption().click();
		select.selectByIndex(40);
		Thread.sleep(2000);
		
		 driver.findElement(By.linkText("Description")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		 Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(4000);
	    
	    
		driver.findElement(By.linkText("RQ05 - REQ-5")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".fa-plus-circle")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("reference")).sendKeys("RQ04");
	    Thread.sleep(2000);
	    driver.findElement(By.id("requirementLocale.name")).sendKeys("REQ-4");
	    Thread.sleep(1000);
	    
	    Select select1 = new Select(driver.findElement(By.name("parent")));
		select1.getFirstSelectedOption().click();
		select1.selectByIndex(40);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Description")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    }
		catch(Exception e) {
			e.printStackTrace();
			driver.quit();
			
		}
	}
	
	public static void updateRequirements(WebDriver driver) {
		try {
		driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".bigger-110")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Click & Doc")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".nav-show > li:nth-child(5) .font-weight-bold")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("RQ05 - REQ-5")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='requirement-tab-1']/div/div/div/div/div/div/div[2]/span/button/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("reference")).clear();
		driver.findElement(By.id("reference")).click();  
	    driver.findElement(By.id("reference")).sendKeys("RQ05");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("requirementLocale.name")).clear();
		driver.findElement(By.id("requirementLocale.name")).click();  
	    driver.findElement(By.id("requirementLocale.name")).sendKeys("REQ-5");
	    Thread.sleep(2000);
	    
		Select select = new Select(driver.findElement(By.name("parent")));
		select.getFirstSelectedOption().click();
		select.selectByIndex(40);
		Thread.sleep(2000);
		
		
		driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.linkText("RQ04 - REQ-4")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='requirement-tab-1']/div/div/div/div/div/div/div[2]/span/button/i")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("reference")).clear();
		driver.findElement(By.id("reference")).click();  
	    driver.findElement(By.id("reference")).sendKeys("RQ04");
	    Thread.sleep(2000);
	    driver.findElement(By.id("requirementLocale.name")).clear();
		driver.findElement(By.id("requirementLocale.name")).click();  
	    driver.findElement(By.id("requirementLocale.name")).sendKeys("REQ-4");
	    Thread.sleep(2000);
	    
	    Select select1 = new Select(driver.findElement(By.name("parent")));
		select1.getFirstSelectedOption().click();
		select1.selectByIndex(40);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    }
		catch(Exception e) {
			e.printStackTrace();
			driver.quit();
			
		}
	}
}
