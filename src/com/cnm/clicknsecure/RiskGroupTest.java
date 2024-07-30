package com.cnm.clicknsecure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RiskGroupTest {
	
	public static void createRiskGroupTest(WebDriver driver) {
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
		     driver.findElement(By.linkText("click_n_secure")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("#add_new_group > span")).click();
			 Thread.sleep(2000);
			
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("Risk-1");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk 1");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div[2]/div[3]/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("TOP - TOP");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
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
	
	public static void updateRiskGroupTest(WebDriver driver) {
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
		     driver.findElement(By.linkText("click_n_secure")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("riskGroup_14_anchor")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".glyphicon-pencil")).click();
			 Thread.sleep(2000);
		
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("Risk-1");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk 1");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div[2]/div[3]/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("TOP - TOP");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
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
