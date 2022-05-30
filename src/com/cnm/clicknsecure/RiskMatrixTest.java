package com.cnm.clicknsecure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RiskMatrixTest {
       
	public static void createRiskMatrixTest(WebDriver driver) {
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
			 driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".fa-plus-circle")).click();
			 Thread.sleep(2000);
			
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("RM-5");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk Matrix 5");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='matrix_form_submit']/div/div[2]/div/span/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("S1 - Settings-1");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			   
			 driver.findElement(By.id("dpStartDate")).click();
			 driver.findElement(By.id("dpStartDate")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("dpStartDate")).sendKeys("17-08-2021");
			 driver.findElement(By.linkText("14")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("dpEndDate")).click();
			 driver.findElement(By.id("dpEndDate")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("dpEndDate")).sendKeys("17-08-2021");
			 driver.findElement(By.linkText("17")).click();
			 Thread.sleep(2000);
			 
		     
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
            
			 driver.findElement(By.cssSelector(".col-sm-12 > .pull-right > .btn-primary")).click();
		     Thread.sleep(2000);
		     
		     
	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateRiskMatrixTest(WebDriver driver) {
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
			 driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("#matrix_6 span:nth-child(3)")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".odd:nth-child(5) .btn:nth-child(1)")).click();
			 Thread.sleep(2000);
		
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk Matrix 5");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='matrix_form_submit']/div/div[2]/div/span/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("S1 - Settings-1");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);

			 driver.findElement(By.id("dpStartDate")).click();
			 driver.findElement(By.id("dpStartDate")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("dpStartDate")).sendKeys("17-08-2021");
			 driver.findElement(By.linkText("14")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("dpEndDate")).click();
			 driver.findElement(By.id("dpEndDate")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("dpEndDate")).sendKeys("17-08-2021");
			 driver.findElement(By.linkText("17")).click();
			 Thread.sleep(2000);
			 
		     
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
            
		
			 
			 driver.findElement(By.cssSelector(".row:nth-child(2) .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("th .fa")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//div[@id='matrix_requirement_form_div']/div/div/div/div/div/div/div/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("05 - Leadership");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-2 .fa")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".row:nth-child(2) .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".table:nth-child(1) tr:nth-child(2) .hidden-sm > .btn:nth-child(1) > .glyphicon")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("RM-5");
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//div[@id='matrix_requirement_form_div']/div/div/div/div/div/div/div/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("03 - Terms and definitions");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-2 .fa")).click();
			 Thread.sleep(2000);
			 
			 
			 
			 driver.findElement(By.cssSelector(".col-sm-12 > .pull-right > .btn-primary")).click();
		     Thread.sleep(2000);
		     
		     
		     
	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
}
