package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FucntionTest {

	public static void createFunction(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Doc")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(4) .font-weight-bold")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".btn:nth-child(1) > span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).sendKeys("Fun-05");
		    Thread.sleep(2000);
		    driver.findElement(By.id("functionLocale.name")).sendKeys("Function 5");
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//form[@id='function_form_new']/div[4]/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("TOP-TOP");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.linkText("Description")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateFunction(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Doc")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(4) .font-weight-bold")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Fun-05 - Function 5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(2) span")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".glyphicon-pencil")).click();
			Thread.sleep(2000);
			
		    driver.findElement(By.id("reference")).click();
		    driver.findElement(By.id("reference")).clear();
		    driver.findElement(By.id("reference")).sendKeys("Fun-05");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("functionLocale.name")).click();
		    driver.findElement(By.id("functionLocale.name")).clear();
		    driver.findElement(By.id("functionLocale.name")).sendKeys("Function 5");
		    Thread.sleep(2000);

		    
			Select select = new Select(driver.findElement(By.id("parent")));
			select.getFirstSelectedOption().click();
			select.selectByIndex(5);
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Description")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	

}
