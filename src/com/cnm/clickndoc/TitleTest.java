package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TitleTest {

	public static void createTitle(WebDriver driver) {
		try {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.findElement(By.className("bigger-110")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains(.,'Click & Doc')]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/ul/li[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#add_new_title > span")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("reference")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("reference")).sendKeys("Tit05");
	    Thread.sleep(2000);
	    driver.findElement(By.id("titleLocale.name")).sendKeys("Title-5");
	    Thread.sleep(2000);
	    
		Select select = new Select(driver.findElement(By.name("parent")));
		select.getFirstSelectedOption().click();
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Description")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".fa-save")).click();
		Thread.sleep(2000);
		
	  /*  driver.findElement(By.linkText("Tit05 - Title-5")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("add_new_role")).click();
	    Thread.sleep(2000);
		
	    driver.findElement(By.id("reference")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("reference")).sendKeys("MM");
	    Thread.sleep(2000);
	    driver.findElement(By.id("roleLocale.name")).sendKeys("Marketing Manager");
	    Thread.sleep(2000);
	    
		
	    driver.findElement(By.linkText("Description")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    */
		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
	
	public static void updateTitle(WebDriver driver) {
		try {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.findElement(By.className("bigger-110")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Click & Doc")).click();
	    Thread.sleep(2000);
		driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='title_23']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@id='myTab']/li[2]/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='title-tab-2']/div/div/div/div/div/div/div[2]/span/button/i")).click();
		Thread.sleep(2000);
	    
		driver.findElement(By.id("reference")).clear();
	    driver.findElement(By.id("reference")).click();
	    driver.findElement(By.id("reference")).sendKeys("Tit06");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("titleLocale.name")).clear();
	    driver.findElement(By.id("titleLocale.name")).click();
	    driver.findElement(By.id("titleLocale.name")).sendKeys("Title-6");
	    Thread.sleep(2000);
	    
		Select select = new Select(driver.findElement(By.name("parent")));
		select.getFirstSelectedOption().click();
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Description")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".fa-save")).click();
		Thread.sleep(2000);
		
	/*	driver.findElement(By.xpath("//li[@id='role_16_28']/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='role-tab-1']/div/div/div/div/div/div/div[2]/span/button/i")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.id("reference")).clear();
	    driver.findElement(By.id("reference")).click();
	    driver.findElement(By.id("reference")).sendKeys("CFO");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("roleLocale.name")).clear();
	    driver.findElement(By.id("roleLocale.name")).click();
	    driver.findElement(By.id("roleLocale.name")).sendKeys("Chief Financial Officer");
	    Thread.sleep(2000);
	    
		
	    driver.findElement(By.linkText("Description")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".fa-save")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@id='role_16_28']/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#myTab > li:nth-child(2) span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='reole_employee_block_div']/div/div/div/div/div/span/button/i")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//form[@id='role_employee_form_submit']/div/span[2]/span/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("roleEmployeeId")).sendKeys("AK - Abul Kasem");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".btn-add > .fa-save")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form[@id='role_employee_form_submit']/div/span[2]/span/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("roleEmployeeId")).sendKeys("AR - Abdur Razzak");
		Thread.sleep(2000);
	
		driver.findElement(By.cssSelector(".btn-add > .fa-save")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
		Thread.sleep(2000);*/
		
	    
	    /*driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/a/span/span[2]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span')]")).click();
	    Thread.sleep(1000);
	    */

		}catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
}
