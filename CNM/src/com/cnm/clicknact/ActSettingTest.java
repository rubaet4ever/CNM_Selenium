package com.cnm.clicknact;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ActSettingTest {

	public static void createActSettingTest(WebDriver driver) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("Click & Act")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
		    Thread.sleep(2000);
		   
		    driver.findElement(By.xpath("//div[@id='divMiddle']/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//li[contains(.,'Group')]")).click();
		    Thread.sleep(2000);

		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).sendKeys("Set-15");
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).sendKeys("Settings 15");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncControlPanelLocale.origin")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.origin")).sendKeys("SO 15");
		    Thread.sleep(2000);
		    
		    Select select = new Select(driver.findElement(By.name("currency")));
			select.getFirstSelectedOption().click();
			select.selectByIndex(2);
		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.linkText("Set-15 - Settings 15")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='divMiddle']/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".context-menu-item:nth-child(2) > span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).sendKeys("NCM-20");
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).sendKeys("Non-Conformance Management 20");
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.origin")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.origin")).sendKeys("NCMO 20");
		    Thread.sleep(2000);
		    
		    
		    Select select1 = new Select(driver.findElement(By.name("currency")));
			select1.getFirstSelectedOption().click();
			select1.selectByIndex(2);
			
		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("Set-15 - Settings 15")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='divMiddle']/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".context-menu-item:nth-child(3) > span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).sendKeys("AM-20");
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).sendKeys("Action Management 20");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncControlPanelLocale.origin")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.origin")).sendKeys("AMO 20");
		    Thread.sleep(2000);
		    
		    Select select11 = new Select(driver.findElement(By.name("currency")));
			select11.getFirstSelectedOption().click();
			select11.selectByIndex(2);
			
		    driver.findElement(By.linkText("Description")).click();
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
	
	public static void updateActSettingTest(WebDriver driver) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("Click & Act")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("Set-15 - Settings 15")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".glyphicon-pencil")).click();
		    Thread.sleep(2000);

		    driver.findElement(By.id("reference")).click();
		    driver.findElement(By.id("reference")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.id("reference")).sendKeys("Set-15");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncControlPanelLocale.name")).click();
		    driver.findElement(By.id("ncControlPanelLocale.name")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.name")).sendKeys("Settings 15");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncControlPanelLocale.origin")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncControlPanelLocale.origin")).sendKeys("SO 15");
		    Thread.sleep(2000);
		    
		    Select select = new Select(driver.findElement(By.name("currency")));
			select.getFirstSelectedOption().click();
			select.selectByIndex(2);
			
		    driver.findElement(By.linkText("Description")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
			driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("Set-15 - Settings 15")).click();
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#actionpriority_block_div .panel-heading .btn:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Declaration 1");
		    Thread.sleep(2000);
		    
		    Select select1 = new Select(driver.findElement(By.name("decisionType")));
		    select1.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select1.selectByIndex(1);
		    Thread.sleep(2000);
			
	        Select select11 = new Select(driver.findElement(By.name("role")));
			select11.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select11.selectByIndex(3);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#actionpriority_block_div .panel-heading .btn:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Declaration 2");
		    Thread.sleep(2000);
		    
		    Select select111 = new Select(driver.findElement(By.name("decisionType")));
		    select111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select111.selectByIndex(2);
		    Thread.sleep(2000);
			
	        Select select1111 = new Select(driver.findElement(By.name("role")));
			select1111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select1111.selectByIndex(2);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#actionpriority_block_div .panel-heading .btn:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Declaration 3");
		    Thread.sleep(2000);
		    
		    Select select11111 = new Select(driver.findElement(By.name("decisionType")));
		    select11111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select11111.selectByIndex(3);
		    Thread.sleep(2000);
			
	        Select select111111 = new Select(driver.findElement(By.name("role")));
			select111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select111111.selectByIndex(4);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#actionpriority_block_div .panel-heading .btn:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Declaration 4");
		    Thread.sleep(2000);
		    
		    Select select1111111 = new Select(driver.findElement(By.name("decisionType")));
		    select1111111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select1111111.selectByIndex(4);
		    Thread.sleep(2000);
			
	        Select select11111111 = new Select(driver.findElement(By.name("role")));
			select11111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select11111111.selectByIndex(1);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		   
		    driver.findElement(By.linkText("Set-15 - Settings 15")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(3) > a")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='links_div']/div/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='links_div']/div/div/div[2]/div/div/div/div/div/div/div/div/div/div/span[2]/span/span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("ACT-05-Action management - 5");
			Thread.sleep(4000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector(".pull-right:nth-child(2) > .btn-primary")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Level 1");
		    Thread.sleep(2000);
		    
		    Select select111111111 = new Select(driver.findElement(By.name("decisionType")));
		    select111111111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select111111111.selectByIndex(1);
		    Thread.sleep(2000);
			
	        Select select1111111111 = new Select(driver.findElement(By.name("role")));
			select1111111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select1111111111.selectByIndex(3);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Level 2");
		    Thread.sleep(2000);
		    
		    Select select11111111111 = new Select(driver.findElement(By.name("decisionType")));
		    select11111111111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select11111111111.selectByIndex(1);
		    Thread.sleep(2000);
			
	        Select select111111111111 = new Select(driver.findElement(By.name("role")));
			select111111111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select111111111111.selectByIndex(3);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Level 3");
		    Thread.sleep(2000);
		    
		    Select select1111111111111 = new Select(driver.findElement(By.name("decisionType")));
		    select1111111111111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select1111111111111.selectByIndex(1);
		    Thread.sleep(2000);
			
	        Select select11111111111111 = new Select(driver.findElement(By.name("role")));
			select11111111111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select11111111111111.selectByIndex(4);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button/i")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='actionpriority_block_div']/div/div/div/div/div/span/button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("ncPriorityManagementLevelLocal.name")).sendKeys("Level 4");
		    Thread.sleep(2000);
		    
		    Select select111111111111111 = new Select(driver.findElement(By.name("decisionType")));
		    select111111111111111.getFirstSelectedOption().click();
		    Thread.sleep(2000);
		    select111111111111111.selectByIndex(1);
		    Thread.sleep(2000);
			
	        Select select1111111111111111 = new Select(driver.findElement(By.name("role")));
			select1111111111111111.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select1111111111111111.selectByIndex(1);
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