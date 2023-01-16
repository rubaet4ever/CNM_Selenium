package com.cnm.clicknact;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionTest {
     
	
	public static void createActionsTest(WebDriver driver) {
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
		    driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='divMiddle']/div/div/div/div[2]/span/a/i")).click();
		    Thread.sleep(2000);
		   
		    driver.findElement(By.id("cpaLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("cpaLocale.name")).sendKeys("NA - 15");
		    Thread.sleep(2000);
			
			Select emergencyLevel = new Select(driver.findElement(By.id("emergencyLevel")));
			emergencyLevel.getFirstSelectedOption().click();
			emergencyLevel.selectByIndex(2);
			Thread.sleep(2000);
			
			Select originEvaluationLevel = new Select(driver.findElement(By.id("originEvaluationLevel")));
			originEvaluationLevel.getFirstSelectedOption().click();
			originEvaluationLevel.selectByIndex(2);
			Thread.sleep(2000);
			
			Select industryStandard5S = new Select(driver.findElement(By.id("industryStandard5S")));
			industryStandard5S.getFirstSelectedOption().click();
			industryStandard5S.selectByIndex(2);
			Thread.sleep(2000);
			
			Select industryWasteType = new Select(driver.findElement(By.id("industryWasteType")));
			industryWasteType.getFirstSelectedOption().click();
			industryWasteType.selectByIndex(2);
			Thread.sleep(2000);
			
			Select treatmentType = new Select(driver.findElement(By.id("treatmentType")));
			treatmentType.getFirstSelectedOption().click();
			treatmentType.selectByIndex(2);
			Thread.sleep(2000);
			
			Select feasibilityEvaluationLevel = new Select(driver.findElement(By.id("feasibilityEvaluationLevel")));
			feasibilityEvaluationLevel.getFirstSelectedOption().click();
			feasibilityEvaluationLevel.selectByIndex(2);
			Thread.sleep(2000);
			
			Select impactEvaluationLevel = new Select(driver.findElement(By.id("impactEvaluationLevel")));
			impactEvaluationLevel.getFirstSelectedOption().click();
			impactEvaluationLevel.selectByIndex(2);
			Thread.sleep(2000);
			
			Select costEvaluationLevel = new Select(driver.findElement(By.id("costEvaluationLevel")));
			costEvaluationLevel.getFirstSelectedOption().click();
			costEvaluationLevel.selectByIndex(2);
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("cpaLocale.costImplDesc")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("cpaLocale.costImplDesc")).sendKeys("65");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("cpaLocale.roiMeasurement")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("cpaLocale.roiMeasurement")).sendKeys("58");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("costImplementation")).click();
		    driver.findElement(By.id("costImplementation")).clear();
		    driver.findElement(By.id("costImplementation")).sendKeys("78.90");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("roi")).click();
		    driver.findElement(By.id("roi")).clear();
		    driver.findElement(By.id("roi")).sendKeys("80.96");
		    Thread.sleep(2000);

		    driver.findElement(By.id("id-date-picker-1")).click();
			driver.findElement(By.id("id-date-picker-1")).sendKeys("19-08-2021");
		    driver.findElement(By.linkText("19")).click();
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("id-date-picker-2")).click();
			driver.findElement(By.id("id-date-picker-2")).sendKeys("20-08-2021");
		    driver.findElement(By.linkText("20")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("id-date-picker-3")).click();
			driver.findElement(By.id("id-date-picker-3")).sendKeys("29-08-2021");
		    driver.findElement(By.linkText("29")).click();
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("reminderBeforeEndDate")).click();
		    driver.findElement(By.id("reminderBeforeEndDate")).clear();
		    driver.findElement(By.id("reminderBeforeEndDate")).sendKeys("24");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("reminderBeforeCriticalDate")).click();
		    driver.findElement(By.id("reminderBeforeCriticalDate")).clear();
		    driver.findElement(By.id("reminderBeforeCriticalDate")).sendKeys("56");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("percentageImpl")).click();
		    driver.findElement(By.id("percentageImpl")).clear();
		    driver.findElement(By.id("percentageImpl")).sendKeys("84");
		    Thread.sleep(2000);
	
		    
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
	    
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    }
		    catch(Exception exp) {
			exp.printStackTrace();
			driver.quit();
		}
}
	
	public static void updateActionsTest(WebDriver driver) {
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
		    driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
		    Thread.sleep(2000);

		    driver.findElement(By.xpath("//table[@id='table-action']/tbody/tr/td[5]/div/a/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("li:nth-child(1) .tab-icon-color")).click();
			Thread.sleep(2000);
		   
		    driver.findElement(By.id("cpaLocale.name")).click();
		    driver.findElement(By.id("cpaLocale.name")).clear();
		    driver.findElement(By.id("cpaLocale.name")).sendKeys("NA - 14");
		    Thread.sleep(2000);
		    
		    Select statusLevel = new Select(driver.findElement(By.id("statusLevel")));
		    statusLevel.getFirstSelectedOption().click();
		    statusLevel.selectByIndex(1);
			Thread.sleep(2000);
			
			Select emergencyLevel = new Select(driver.findElement(By.id("emergencyLevel")));
			emergencyLevel.getFirstSelectedOption().click();
			emergencyLevel.selectByIndex(3);
			Thread.sleep(2000);
			
			Select originEvaluationLevel = new Select(driver.findElement(By.id("originEvaluationLevel")));
			originEvaluationLevel.getFirstSelectedOption().click();
			originEvaluationLevel.selectByIndex(3);
			Thread.sleep(2000);
			
			Select industryStandard5S = new Select(driver.findElement(By.id("industryStandard5S")));
			industryStandard5S.getFirstSelectedOption().click();
			industryStandard5S.selectByIndex(3);
			Thread.sleep(2000);
			
			Select industryWasteType = new Select(driver.findElement(By.id("industryWasteType")));
			industryWasteType.getFirstSelectedOption().click();
			industryWasteType.selectByIndex(3);
			Thread.sleep(2000);
			
			Select treatmentType = new Select(driver.findElement(By.id("treatmentType")));
			treatmentType.getFirstSelectedOption().click();
			treatmentType.selectByIndex(3);
			Thread.sleep(2000);
			
			Select feasibilityEvaluationLevel = new Select(driver.findElement(By.id("feasibilityEvaluationLevel")));
			feasibilityEvaluationLevel.getFirstSelectedOption().click();
			feasibilityEvaluationLevel.selectByIndex(3);
			Thread.sleep(2000);
			
			Select impactEvaluationLevel = new Select(driver.findElement(By.id("impactEvaluationLevel")));
			impactEvaluationLevel.getFirstSelectedOption().click();
			impactEvaluationLevel.selectByIndex(3);
			Thread.sleep(2000);
			
			Select costEvaluationLevel = new Select(driver.findElement(By.id("costEvaluationLevel")));
			costEvaluationLevel.getFirstSelectedOption().click();
			costEvaluationLevel.selectByIndex(3);
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("cpaLocale.costImplDesc")).click();
		    driver.findElement(By.id("cpaLocale.costImplDesc")).clear();
		    driver.findElement(By.id("cpaLocale.costImplDesc")).sendKeys("48");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("cpaLocale.roiMeasurement")).click();
		    driver.findElement(By.id("cpaLocale.roiMeasurement")).clear();
		    driver.findElement(By.id("cpaLocale.roiMeasurement")).sendKeys("51");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("costImplementation")).click();
		    driver.findElement(By.id("costImplementation")).clear();
		    driver.findElement(By.id("costImplementation")).sendKeys("86.21");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("roi")).click();
		    driver.findElement(By.id("roi")).clear();
		    driver.findElement(By.id("roi")).sendKeys("80.96");
		    Thread.sleep(2000);

		    driver.findElement(By.id("id-date-picker-1")).click();
		    driver.findElement(By.id("id-date-picker-1")).clear();
		    Thread.sleep(2000);
			driver.findElement(By.id("id-date-picker-1")).sendKeys("17-08-2021");
		    driver.findElement(By.linkText("17")).click();
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("id-date-picker-2")).click();
		    driver.findElement(By.id("id-date-picker-2")).clear();
		    Thread.sleep(2000);
			driver.findElement(By.id("id-date-picker-2")).sendKeys("22-08-2021");
		    driver.findElement(By.linkText("22")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("id-date-picker-3")).click();
			driver.findElement(By.id("id-date-picker-3")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("id-date-picker-3")).sendKeys("25-08-2021");
		    driver.findElement(By.linkText("25")).click();
			Thread.sleep(2000);
		    
		    driver.findElement(By.id("reminderBeforeEndDate")).click();
		    driver.findElement(By.id("reminderBeforeEndDate")).clear();
		    driver.findElement(By.id("reminderBeforeEndDate")).sendKeys("23");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("reminderBeforeCriticalDate")).click();
		    driver.findElement(By.id("reminderBeforeCriticalDate")).clear();
		    driver.findElement(By.id("reminderBeforeCriticalDate")).sendKeys("56");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("percentageImpl")).click();
		    driver.findElement(By.id("percentageImpl")).clear();
		    driver.findElement(By.id("percentageImpl")).sendKeys("73");
		    Thread.sleep(2000);
	
			driver.findElement(By.cssSelector(".trumbowyg-editor")).click();
	        Thread.sleep(2000);
			
	        driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
	        
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//table[@id='table-action']/tbody/tr/td[5]/div/a/span")).click();
			Thread.sleep(4000);

		    driver.findElement(By.cssSelector("li:nth-child(2) .tab-icon-color")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.cssSelector("th > .btn > .fa")).click();
			Thread.sleep(4000);
			
			Select procedure = new Select(driver.findElement(By.id("procedure")));
			procedure.getFirstSelectedOption().click();
			procedure.selectByIndex(1);
			Thread.sleep(2000);
			
			Select phase = new Select(driver.findElement(By.id("phase")));
			phase.getFirstSelectedOption().click();
			phase.selectByIndex(2);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='pahse_form_div']/div/div/div/div/div/div/div[3]/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(3) > a")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("th > .btn")).click();
			Thread.sleep(2000);
			
			Select controbutorListId = new Select(driver.findElement(By.id("controbutorListId")));
			controbutorListId.getFirstSelectedOption().click();
			controbutorListId.selectByIndex(2);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='contributor_form_div']/div/div/div/div/div/div/div[2]/button")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(4) > a")).click();
			Thread.sleep(2000);
	
			driver.findElement(By.xpath("//form[@id='submit_form']/div/div/div/span[2]/span/span/span")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//form[@id='submit_form']/div/div/div[2]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("MU - Mayan Uddin");
			Thread.sleep(4000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			driver.findElement(By.cssSelector("#select2-user-container")).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//form[@id='submit_form']/div[2]/div[2]/div/button")).click();
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(5) > a")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//form[@id='submit_form1']/div/div/div/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='submit_form1']/div/div/div[2]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("RBQ - Rubaet Bin Qaiyum");
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
            
			driver.findElement(By.xpath("//form[@id='submit_form1']/div[2]/div/button/i")).click();
		    Thread.sleep(2000);
		
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(8) > a")).click();
		    Thread.sleep(5000);		
		
		    driver.findElement(By.cssSelector("a:nth-child(1) > .fa-info-circle")).click();
		    Thread.sleep(5000);		
		
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
}


}
