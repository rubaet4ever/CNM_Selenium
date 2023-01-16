  package com.cnm.clicknact;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.Select;

	public class NonConformanceTest {
	    
		public static void createNonConformanceTest(WebDriver driver) {
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
			    driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			    Thread.sleep(2000);
			    
			    driver.findElement(By.xpath("//div[@id='divMiddle']/div/div/div/div[3]/span/a/i")).click();
			    Thread.sleep(2000);
			   
			    driver.findElement(By.id("title")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("title")).sendKeys("Declarations - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.whatHappend")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.whatHappend")).sendKeys("WH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("location")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("location")).sendKeys("WTP - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.howHappend")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.howHappend")).sendKeys("HH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.whyHappend")).click();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.whyHappend")).sendKeys("WHH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("id-date-picker-4")).click();
				driver.findElement(By.id("id-date-picker-4")).sendKeys("26-08-2021");
			    driver.findElement(By.linkText("26")).click();
				Thread.sleep(2000);
		
			    Select first = new Select(driver.findElement(By.name("involvedEmployee")));
			    first.getFirstSelectedOption().click();
			    first.selectByIndex(0);
				Thread.sleep(2000);
				
				Select procedure = new Select(driver.findElement(By.id("procedure")));
				procedure.getFirstSelectedOption().click();
				procedure.selectByIndex(2);
				Thread.sleep(2000);
				
				Select phase = new Select(driver.findElement(By.id("phase")));
				phase.getFirstSelectedOption().click();
				phase.selectByIndex(1);
				Thread.sleep(2000);
				
				Select reportedToEmployee = new Select(driver.findElement(By.name("reportedToEmployee")));
				reportedToEmployee.getFirstSelectedOption().click();
				reportedToEmployee.selectByIndex(1);
				Thread.sleep(2000);
				
				Select immediateAction = new Select(driver.findElement(By.name("immediateAction")));
				immediateAction.getFirstSelectedOption().click();
				immediateAction.selectByIndex(1);
				Thread.sleep(2000);
				
				driver.findElement(By.id("other")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("other")).sendKeys("NA - 13");
				Thread.sleep(2000);
				
				Select immediateEmployee = new Select(driver.findElement(By.id("immediateEmployee")));
				immediateEmployee.getFirstSelectedOption().click();
				immediateEmployee.selectByIndex(13);
				Thread.sleep(2000);
				
				driver.findElement(By.id("id-date-picker-2")).click();
				driver.findElement(By.id("id-date-picker-2")).sendKeys("26-08-2021");
			    driver.findElement(By.linkText("26")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("id-date-picker-3")).click();
				driver.findElement(By.id("id-date-picker-3")).sendKeys("27-08-2021");
			    driver.findElement(By.linkText("27")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@id='nextBtn']/i")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("unitCostId")).click();
				driver.findElement(By.id("unitCostId")).clear();
				driver.findElement(By.id("unitCostId")).sendKeys("27.65");
				Thread.sleep(2000);
				
				driver.findElement(By.id("probabilityOccurrenceId")).click();
				driver.findElement(By.id("probabilityOccurrenceId")).clear();
				driver.findElement(By.id("probabilityOccurrenceId")).sendKeys("1127.5");
				Thread.sleep(2000);
				
				Select document = new Select(driver.findElement(By.id("document")));
				document.getFirstSelectedOption().click();
				document.selectByIndex(5);
				Thread.sleep(2000);
				
				
				Select emergencyLevel = new Select(driver.findElement(By.id("emergencyLevel")));
				emergencyLevel.getFirstSelectedOption().click();
				emergencyLevel.selectByIndex(2);
				Thread.sleep(2000);
				
				Select origin = new Select(driver.findElement(By.id("origin")));
				origin.getFirstSelectedOption().click();
				origin.selectByIndex(1);
				Thread.sleep(2000);
				
				Select industryStandard5S = new Select(driver.findElement(By.id("industryStandard5S")));
				industryStandard5S.getFirstSelectedOption().click();
				industryStandard5S.selectByIndex(1);
				Thread.sleep(2000);
				
				Select industryWasteType = new Select(driver.findElement(By.id("industryWasteType")));
				industryWasteType.getFirstSelectedOption().click();
				industryWasteType.selectByIndex(1);
				Thread.sleep(2000);
				
				Select treatmentType = new Select(driver.findElement(By.id("treatmentType")));
				treatmentType.getFirstSelectedOption().click();
				treatmentType.selectByIndex(1);
				Thread.sleep(2000);

			    
				driver.findElement(By.cssSelector(".fa-save")).click();
			    Thread.sleep(2000);
			    
			    }
			    catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}
	}
		
		public static void updateNonConformanceTest(WebDriver driver) {
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
			    driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			    Thread.sleep(2000);
			    
			    driver.findElement(By.cssSelector(".odd:nth-child(1) .glyphicon-pencil")).click();
			    Thread.sleep(2000);
			   
			    driver.findElement(By.id("title")).click();
			    driver.findElement(By.id("title")).clear();
			    Thread.sleep(2000);
			    driver.findElement(By.id("title")).sendKeys("Declarations - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.whatHappend")).click();
			    driver.findElement(By.id("ncDeclarationLocale.whatHappend")).clear();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.whatHappend")).sendKeys("WH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("location")).click();
			    driver.findElement(By.id("location")).clear();
			    Thread.sleep(2000);
			    driver.findElement(By.id("location")).sendKeys("WTP - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.howHappend")).click();
			    driver.findElement(By.id("ncDeclarationLocale.howHappend")).clear();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.howHappend")).sendKeys("HH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("ncDeclarationLocale.whyHappend")).click();
			    driver.findElement(By.id("ncDeclarationLocale.whyHappend")).clear();
			    Thread.sleep(2000);
			    driver.findElement(By.id("ncDeclarationLocale.whyHappend")).sendKeys("WHH - 13");
			    Thread.sleep(2000);
			    
			    driver.findElement(By.id("id-date-picker-4")).click();
				driver.findElement(By.id("id-date-picker-4")).sendKeys("16-08-2021");
			    driver.findElement(By.linkText("16")).click();
				Thread.sleep(2000);
		
			    Select first = new Select(driver.findElement(By.name("involvedEmployee")));
			    first.getFirstSelectedOption().click();
			    first.selectByIndex(0);
				Thread.sleep(2000);
				
				Select procedure = new Select(driver.findElement(By.id("procedure")));
				procedure.getFirstSelectedOption().click();
				procedure.selectByIndex(2);
				Thread.sleep(2000);
				
				Select phase = new Select(driver.findElement(By.id("phase")));
				phase.getFirstSelectedOption().click();
				phase.selectByIndex(1);
				Thread.sleep(2000);
				
				Select reportedToEmployee = new Select(driver.findElement(By.name("reportedToEmployee")));
				reportedToEmployee.getFirstSelectedOption().click();
				reportedToEmployee.selectByIndex(1);
				Thread.sleep(2000);
				
				Select immediateAction = new Select(driver.findElement(By.name("immediateAction")));
				immediateAction.getFirstSelectedOption().click();
				immediateAction.selectByIndex(1);
				Thread.sleep(2000);
				
				driver.findElement(By.id("other")).click();
				driver.findElement(By.id("other")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("other")).sendKeys("NA - 13");
				Thread.sleep(2000);
				
				Select immediateEmployee = new Select(driver.findElement(By.id("immediateEmployee")));
				immediateEmployee.getFirstSelectedOption().click();
				immediateEmployee.selectByIndex(13);
				Thread.sleep(2000);
				
				driver.findElement(By.id("id-date-picker-2")).click();
				driver.findElement(By.id("id-date-picker-2")).sendKeys("26-08-2021");
			    driver.findElement(By.linkText("26")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("id-date-picker-3")).click();
				driver.findElement(By.id("id-date-picker-3")).sendKeys("27-08-2021");
			    driver.findElement(By.linkText("27")).click();
				Thread.sleep(2000);

				driver.findElement(By.xpath("//button[@id='nextBtn']/i")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.id("unitCostId")).click();
				driver.findElement(By.id("unitCostId")).clear();
				driver.findElement(By.id("unitCostId")).sendKeys("39.86");
				Thread.sleep(2000);
				
				driver.findElement(By.id("probabilityOccurrenceId")).click();
				driver.findElement(By.id("probabilityOccurrenceId")).clear();
				driver.findElement(By.id("probabilityOccurrenceId")).sendKeys("2112.2");
				Thread.sleep(2000);
				
				Select document = new Select(driver.findElement(By.id("document")));
				document.getFirstSelectedOption().click();
				document.selectByIndex(6);
				Thread.sleep(2000);
				
				Select emergencyLevel = new Select(driver.findElement(By.id("emergencyLevel")));
				emergencyLevel.getFirstSelectedOption().click();
				emergencyLevel.selectByIndex(2);
				Thread.sleep(2000);
				
				Select origin = new Select(driver.findElement(By.id("origin")));
				origin.getFirstSelectedOption().click();
				origin.selectByIndex(2);
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

			    
				driver.findElement(By.cssSelector(".fa-save")).click();
			    Thread.sleep(2000);
			    
			    }
			    catch(Exception e) {
				e.printStackTrace();
				driver.quit();
			}
	}

		
	}



