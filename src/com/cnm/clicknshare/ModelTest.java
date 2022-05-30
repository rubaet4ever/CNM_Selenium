package com.cnm.clicknshare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModelTest {
       
	public static void createModelTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-plus-circle")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("Mod-02");
			Thread.sleep(2000);
			
			driver.findElement(By.id("modelLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("modelLocale.name")).sendKeys("Model 2");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='heading7']/h4/a/span")).click();
			driver.findElement(By.cssSelector(".trumbowyg-editor")).click();
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
	
	public static void updateModelTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Models")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#model_1 span:nth-child(1)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".hidden-sm .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			driver.findElement(By.id("reference")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("Mod-02");
			Thread.sleep(2000);
			
			driver.findElement(By.id("modelLocale.name")).click();
			driver.findElement(By.id("modelLocale.name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("modelLocale.name")).sendKeys("Model 2");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='heading7']/h4/a/span")).click();
			driver.findElement(By.cssSelector(".trumbowyg-editor")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);

			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#model_procedure_detail_panel .btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='4_anchor']/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='4_anchor']/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='4_anchor']/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".btn-sm-text > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
			Thread.sleep(4000);


			
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
}
