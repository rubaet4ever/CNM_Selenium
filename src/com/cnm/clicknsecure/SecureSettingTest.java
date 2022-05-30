package com.cnm.clicknsecure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SecureSettingTest {
	
	public static void createSecureSettingTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-plus-circle")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("S-5");
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Settings 5");
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//form[@id='res_form_submit']/div/div[2]/div/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("smiley");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		     
			driver.findElement(By.linkText("Description")).click();
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
       
	public static void updateSecureSettingTest(WebDriver driver) {
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
			 driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//td[@id='res_5']/a/span[2]")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//table[@id='table-res']/tbody/tr[5]/td[2]/div/a/span")).click();
			 Thread.sleep(2000);
			
			/*driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("S5");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Settings-5");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='res_form_submit']/div/div[2]/div/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("traffic_lights");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
		     
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
            
			 driver.findElement(By.cssSelector(".col-sm-12 > .pull-right > .btn-primary")).click();
		     Thread.sleep(2000);*/
		     
		     driver.findElement(By.cssSelector("li:nth-child(2) .tab-icon-color")).click();
		     Thread.sleep(2000);
		    
		/*   driver.findElement(By.cssSelector("#accordionSetting > .panel:nth-child(1) > .panel-heading span")).click();
		     Thread.sleep(2000);
		    
		     driver.findElement(By.cssSelector("#severity .panel-heading .glyphicon")).click();
		     Thread.sleep(2000);
		    
			 driver.findElement(By.id("sessionLocale.name")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Act");
			 Thread.sleep(2000);
		    
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".fa-save")).click();
		     Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("#table-severity tr:nth-child(1) .hidden-sm > .btn:nth-child(1) > .glyphicon")).click();
			 Thread.sleep(2000);
			
			  
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Minor");
			 Thread.sleep(2000);
		    
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		     Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".fa-save")).click();
		     Thread.sleep(2000);*/
	    
		    
		    /*driver.findElement(By.cssSelector("#accordionSetting > .panel:nth-child(2) > .panel-heading span")).click();
		     Thread.sleep(2000);
		    
		     driver.findElement(By.cssSelector("#likelihood .panel-heading .glyphicon")).click();
		     Thread.sleep(2000);
		    
		     driver.findElement(By.xpath("//form[@id='likelihood_form_submit']/div/div/div[2]/input")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//form[@id='likelihood_form_submit']/div/div/div[2]/input")).sendKeys("Act");
			 Thread.sleep(2000);
			
		
			
			 driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) .panel-heading span")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//div[@id='descLikelihoodEdit']/div/div[2]")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='descLikelihoodEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".row:nth-child(2) > .col-sm-12 .fa")).click();
		     Thread.sleep(2000);
		    
		     driver.findElement(By.cssSelector("#table-likelihood tr:nth-child(1) .hidden-sm > .btn:nth-child(1) > .glyphicon")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='likelihood_form_submit']/div/div/div[2]/input")).click();
			 driver.findElement(By.xpath("//form[@id='likelihood_form_submit']/div/div/div[2]/input")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//form[@id='likelihood_form_submit']/div/div/div[2]/input")).sendKeys("Rare");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) .panel-heading span")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//div[@id='descLikelihoodEdit']/div/div[2]")).clear();
		     Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='descLikelihoodEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".row:nth-child(2) > .col-sm-12 .fa")).click();
		     Thread.sleep(2000);*/
			
		/*	 driver.findElement(By.cssSelector("#accordionSetting > .panel:nth-child(3) > .panel-heading span")).click();
			 Thread.sleep(2000);
			    
			 driver.findElement(By.cssSelector(".pull-right .glyphicon-pencil")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("asset")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#controlfactor_form_submit .btn")).click();
			 Thread.sleep(2000);*/
			 
		/*	 driver.findElement(By.cssSelector("#accordionSetting > .panel:nth-child(4) > .panel-heading span")).click();
			 Thread.sleep(2000);
			    
			 driver.findElement(By.cssSelector("#category .glyphicon")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div/input")).click();
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div/input")).sendKeys("C-3");
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div[2]/input")).click();
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div[2]/input")).sendKeys("Cat 3");
			 Thread.sleep(2000);
			
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//div[@id='descCategoryEdit']/div/div[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//div[@id='descCategoryEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div[2]/div/div/button/i")).click();
		     Thread.sleep(2000);
		    
		     driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3) .glyphicon-pencil")).click();
		     Thread.sleep(2000);
		     
		     driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div/input")).click();
		     driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div/input")).clear();
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div/input")).sendKeys("C-2");
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div[2]/input")).click();
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div[2]/input")).clear();
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div/div/div[2]/input")).sendKeys("Cat 2");
			 Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("Description")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath(".//div[@id='descCategoryEdit']/div/div[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//div[@id='descCategoryEdit']/div/div[2]")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//div[@id='descCategoryEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
		    
			 driver.findElement(By.xpath("//form[@id='category_form_submit']/div[2]/div/div/button/i")).click();
		     Thread.sleep(2000);*/
		    
		     driver.findElement(By.cssSelector("#accordionSetting > .panel:nth-child(5) > .panel-heading span")).click();
			 Thread.sleep(2000);
			    
			 driver.findElement(By.cssSelector("#risktype .panel-heading .btn")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div/div/div[2]/input")).click();
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div/div/div[2]/input")).sendKeys("Fine");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) .panel-heading span")).click();
			 Thread.sleep(2000);
			
		     driver.findElement(By.xpath("//div[@id='descRisktypeEdit']/div/div[2]")).click();
		     Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='descRisktypeEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		     Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div[2]/div/div/button/i")).click();
			 Thread.sleep(2000);
		    
		     driver.findElement(By.cssSelector("#table-risktype tr:nth-child(1) .hidden-sm > .btn:nth-child(1) > .glyphicon")).click();
			 Thread.sleep(2000);
			
		     driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div/div/div[2]/input")).click();
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div/div/div[2]/input")).clear();
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div/div/div[2]/input")).sendKeys("Risk");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".col-sm-12:nth-child(1) .panel-heading span")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//div[@id='descRisktypeEdit']/div/div[2]")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//div[@id='descRisktypeEdit']/div/div[2]")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@id='descRisktypeEdit']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
	        
			 driver.findElement(By.xpath("//form[@id='risktype_form_submit']/div[2]/div/div/button/i")).click();
			 Thread.sleep(2000);

	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
}
