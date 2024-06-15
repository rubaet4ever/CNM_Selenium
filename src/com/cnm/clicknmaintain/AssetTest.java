package com.cnm.clicknmaintain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AssetTest {
              
	public static void createAssetTest(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Maintain")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			Thread.sleep(2000);
			
		
			driver.findElement(By.cssSelector("#add_new_group > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("ATG-04");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Asset Type");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div[2]/div[3]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			Select select = new Select(driver.findElement(By.name("parent")));
		    select.getFirstSelectedOption().click();
		    select.selectByIndex(4);

		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
			
	/*		driver.findElement(By.cssSelector(".lbl")).click();
		    Thread.sleep(2000);*/
			
			
		    
		    driver.findElement(By.linkText("ATG-04 - Asset Type")).click();
			Thread.sleep(2000);
		    
		    
			driver.findElement(By.xpath("//button[@id='add_new_asset']/span")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("AT-9");
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Food");
			Thread.sleep(2000);
			
			
			Select select1111 = new Select(driver.findElement(By.id("assetType")));
			Thread.sleep(3000);
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(1);
		    Thread.sleep(3000);
			
			driver.findElement(By.xpath("//form[@id='asset_form_submit']/div/div/div[5]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("RBQ - Rubaet Bin Qaiyum");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			Select select111 = new Select(driver.findElement(By.id("assetLocation")));
			Thread.sleep(3000);
		    select111.getFirstSelectedOption().click();
		    select111.selectByIndex(1);
		    Thread.sleep(3000);

			
		    Select select11 = new Select(driver.findElement(By.name("assetTypeLevel")));
			Thread.sleep(3000);
		    select11.getFirstSelectedOption().click();
		    select11.selectByIndex(1);
		    Thread.sleep(3000);
		    
		    

			driver.findElement(By.id("phoneEmergency")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("phoneEmergency")).sendKeys("022 738 13 11");
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).sendKeys("145");
			Thread.sleep(2000);
			
		    driver.findElement(By.id("dpStartDate")).click();
			driver.findElement(By.id("dpStartDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("dpNextReviewDate")).click();
			driver.findElement(By.id("dpNextReviewDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("dpEndDate")).click();
			driver.findElement(By.id("dpEndDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("reminderDay")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reminderDay")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reminderDay")).sendKeys("5");
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).sendKeys("5");
			Thread.sleep(2000);
			
			/*JavascriptExecutor Scrool = (JavascriptExecutor) driver;
			Scrool.executeScript("window.scrollBy(0,300)", "");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			
		/*	driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);*/
			    
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
		

			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateAssetTest(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Maintain")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("ATG-04 - Asset Type")).click();
		    Thread.sleep(2000);
		
			driver.findElement(By.cssSelector(".glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("ATG-04");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Asset Type");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div[2]/div[3]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			Select select = new Select(driver.findElement(By.name("parent")));
		    select.getFirstSelectedOption().click();
		    select.selectByIndex(4);

		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
			
	/*		driver.findElement(By.cssSelector(".lbl")).click();
		    Thread.sleep(2000);*/
			
			
		    
		    driver.findElement(By.linkText("AT-9 - Food")).click();
			Thread.sleep(2000);
		    
		    
			driver.findElement(By.cssSelector(".glyphicon-pencil")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("AT-9");
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Food");
			Thread.sleep(2000);
			
			
			Select select1111 = new Select(driver.findElement(By.id("assetType")));
			Thread.sleep(3000);
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(1);
		    Thread.sleep(3000);
			
			driver.findElement(By.xpath("//form[@id='asset_form_submit']/div/div/div[5]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("RBQ - Rubaet Bin Qaiyum");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			Select select111 = new Select(driver.findElement(By.id("assetLocation")));
			Thread.sleep(3000);
		    select111.getFirstSelectedOption().click();
		    select111.selectByIndex(1);
		    Thread.sleep(3000);

			
		    Select select11 = new Select(driver.findElement(By.name("assetTypeLevel")));
			Thread.sleep(3000);
		    select11.getFirstSelectedOption().click();
		    select11.selectByIndex(1);
		    Thread.sleep(3000);
		    
		    

			driver.findElement(By.id("phoneEmergency")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("phoneEmergency")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("phoneEmergency")).sendKeys("022 738 13 11");
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacity")).sendKeys("145");
			Thread.sleep(2000);
			
		    driver.findElement(By.id("dpStartDate")).click();
			driver.findElement(By.id("dpStartDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("dpNextReviewDate")).click();
			driver.findElement(By.id("dpNextReviewDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("dpEndDate")).click();
			driver.findElement(By.id("dpEndDate")).sendKeys("9-09-2021");
			driver.findElement(By.linkText("9")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("reminderDay")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reminderDay")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reminderDay")).sendKeys("5");
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("capacityRequired")).sendKeys("5");
			Thread.sleep(2000);
			
			/*JavascriptExecutor Scrool = (JavascriptExecutor) driver;
			Scrool.executeScript("window.scrollBy(0,300)", "");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
			
		/*	driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);*/
			    
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
		

			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
}
