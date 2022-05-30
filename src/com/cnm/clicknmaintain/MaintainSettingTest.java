package com.cnm.clicknmaintain;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MaintainSettingTest {
          
	public static void createMaintainSettingTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);
			
		
			driver.findElement(By.cssSelector("#asset_type .panel-heading .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("Ast-12");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Asset Type 12");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Circle");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div/div[4]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Solid");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
			
			
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("color")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).click();
			Thread.sleep(2000);
			
			 
		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".lbl")).click();
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".paginate_button:nth-child(3) > a")).click();
			Thread.sleep(2000);
		    
		    
			driver.findElement(By.cssSelector(".glyphicon-option-vertical")).click();
			Thread.sleep(2000);
		
			
			driver.findElement(By.cssSelector(".panel:nth-child(1) > .panel-heading .glyphicon")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Level 2");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='form_submit']/div/div/div[3]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			Select select = new Select(driver.findElement(By.id("shape")));
		    select.getFirstSelectedOption().click();
		    select.selectByIndex(2);
			
			driver.findElement(By.xpath("//form[@id='form_submit']/div/div/div[4]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			Select select1 = new Select(driver.findElement(By.id("border")));
		    select1.getFirstSelectedOption().click();
		    select1.selectByIndex(2);
			

			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("color")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.cssSelector(".panel-body:nth-child(1)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#level_modal > #modal-dialog-div .modal-header span")).click();
			Thread.sleep(2000);
		
			
			driver.findElement(By.linkText("Dependency type")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#dependency_type .panel-heading .btn")).click();
			Thread.sleep(2000);
			
			
		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("DT-04");
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).sendKeys("DL 4");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='dependencyType_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Dot");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='dependencyType_form_submit']/div/div/div[5]/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Ast-09 - Asset Type 9");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
			
			
			
			driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			    
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#table-dependency-type .even:nth-child(4) > .sorting_1")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(5) .glyphicon-option-vertical")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".panel:nth-child(1) > .panel-heading .glyphicon")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Level 2");
			Thread.sleep(2000);
		    
			Select select1111 = new Select(driver.findElement(By.id("arrowType")));
			Thread.sleep(3000);
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(1);
		    Thread.sleep(3000);
		    
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("(//div[@id='modal-dialog-div']/div/div/button/span)[2]")).click();
			Thread.sleep(3000);

			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateMaintainSettingTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);

			driver.findElement(By.cssSelector(".even:nth-child(10) > .sorting_1 > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".even:nth-child(10) .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			driver.findElement(By.id("reference")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).sendKeys("Ast-10");
			Thread.sleep(2000);
			
			
			driver.findElement(By.id("sessionLocale.name")).click();
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Asset Type 10");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Circle");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='group_form_submit']/div/div/div[4]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Dotted");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000); 
			
			
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#0abf53");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).sendKeys("#ff4c4c");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("color")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).sendKeys("#00a98f");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).click();
			Thread.sleep(2000);
			
			 
		    driver.findElement(By.linkText("Description")).click();
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
			Thread.sleep(2000);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".lbl")).click();
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".paginate_button:nth-child(3) > a")).click();
			//Thread.sleep(2000);
		    
		    
			//driver.findElement(By.cssSelector(".glyphicon-option-vertical")).click();
			//Thread.sleep(2000);
		
			//driver.findElement(By.cssSelector(".panel:nth-child(1) > .panel-heading .glyphicon")).click();
			//Thread.sleep(2000);
		   
		    driver.findElement(By.cssSelector(".even:nth-child(10) > .sorting_1 > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".even:nth-child(10) .btn:nth-child(3)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("td:nth-child(4) .btn:nth-child(1)")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Level 1");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='form_submit']/div/div/div[3]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			Select select = new Select(driver.findElement(By.id("shape")));
		    select.getFirstSelectedOption().click();
		    select.selectByIndex(3);
			
			driver.findElement(By.xpath("//form[@id='form_submit']/div/div/div[4]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			Select select1 = new Select(driver.findElement(By.id("border")));
		    select1.getFirstSelectedOption().click();
		    select1.selectByIndex(4);
			

			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#6a737b");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).sendKeys("#ffdd00");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#borderColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("color")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).sendKeys("#00112c");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#color")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.cssSelector(".panel-body:nth-child(1)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#level_modal > #modal-dialog-div .modal-header span")).click();
			Thread.sleep(2000);
		
			
			driver.findElement(By.linkText("Dependency type")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(5) .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			
		    driver.findElement(By.id("reference")).click();
		    driver.findElement(By.id("reference")).clear();
		    Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("DT-04");
			Thread.sleep(2000);
			
			driver.findElement(By.id("sessionLocale.name")).click();
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).sendKeys("DL 4");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='dependencyType_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Box");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#be0027");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='dependencyType_form_submit']/div/div/div[5]/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Ast-10 - Asset Type 10");
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
			
		/*	driver.findElement(By.cssSelector("#table-dependency-type .even:nth-child(4) > .sorting_1")).click();
			Thread.sleep(3000);*/
			
			
			
			driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(2) > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(5) .glyphicon-option-vertical")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//table[@id='table-emergency-level']/tbody/tr/td[5]/div/a/span")).click();
			Thread.sleep(2000);

			driver.findElement(By.id("sessionLocale.name")).click();
			driver.findElement(By.id("sessionLocale.name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("sessionLocale.name")).sendKeys("Level 1");
			Thread.sleep(2000);
		    
			Select select1111 = new Select(driver.findElement(By.id("arrowType")));
			Thread.sleep(3000);
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(3);
		    Thread.sleep(3000);
		    
			driver.findElement(By.id("bgColor")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#bgColor")).sendKeys("#2c9f45");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("(//div[@id='modal-dialog-div']/div/div/button/span)[2]")).click();
			Thread.sleep(3000);
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
	
}
