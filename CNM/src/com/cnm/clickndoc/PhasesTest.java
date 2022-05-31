package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PhasesTest {

	public static void createPhases(WebDriver driver) {
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
			Thread.sleep(1000);
			
	/*		driver.findElement(By.cssSelector(".btn:nth-child(1) > span")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("reference")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("reference")).sendKeys("Fun04");
		    Thread.sleep(1000);
		    driver.findElement(By.id("functionLocale.name")).sendKeys("Function4");
		    Thread.sleep(1000);
			Select select = new Select(driver.findElement(By.id("parent")));
			select.getFirstSelectedOption().click();
			select.selectByIndex(4);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);*/
			
	/*
	 * driver.findElement(By.linkText("Fun-05 - Function 5")).click();
	 * Thread.sleep(2000);
	 * 
	 * driver.findElement(By.xpath("//li[@id='11']/i")).click(); Thread.sleep(2000);
	 */
			
			driver.findElement(By.linkText("PRO-100 - Procedure 100")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='procedure-tab-2']/div/div/div/div/div/span/button/i")).click();
			Thread.sleep(2000);
			
		    driver.findElement(By.id("phaseLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("phaseLocale.name")).sendKeys("Phase 1");
		    Thread.sleep(2000);
		  
	        Select select = new Select(driver.findElement(By.name("role")));
			select.getFirstSelectedOption().click();
			Thread.sleep(2000);
			select.selectByIndex(6);
			Thread.sleep(2000);
			
			driver.findElement(By.id("critical_phase_ck_box")).click();
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".row:nth-child(4) #heading7 span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#description .trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
			
		    driver.findElement(By.linkText("Inputs")).click();
		    Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".col-sm-12 > .pull-left > .btn-add")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='phase-input-form']/div[2]/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("D-MKT-01-16-Price list");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#modal-phase-input-form .fa")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.linkText("Inputs")).click(); 
			Thread.sleep(2000);
			  
			driver.findElement(By.cssSelector(".col-sm-12 > .pull-left > .btn-add")).click(); 
			Thread.sleep(2000);
			  
			driver.findElement(By.cssSelector("#phase-input-form > .form-group:nth-child(3) > input")).click();
			Thread.sleep(2000);
			 
			 
			driver.findElement(By.xpath("//form[@id='phase-input-form']/div[4]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("P-MKT-01-Marketing & Sales"); 
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER); 
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='phase-input-form']/div[5]/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@id='phase-input-form']/div[5]/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("1. Corporate Market Positioning"); 
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER ); 
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='phase-input-form']/div[6]/span/span/span")).click();
		    Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("D-MKT-01-01-Sales & Commercial Policy"); 
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER ); 
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@id='modal-phase-input-form']/div/div/div[3]/div/div/div/span/button/i")).click();
			  
			WebDriverWait wait = new WebDriverWait(driver, 30);
			//Thread.sleep(3000);
			 
			
			driver.findElement(By.linkText("Outputs")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='phase_outputs_div']/div/div/div/div/div/span/button")).click();
			Thread.sleep(2000);
		
			Select select1 = new Select(driver.findElement(By.name("document")));
		    select1.getFirstSelectedOption().click();
		    select1.selectByIndex(3);
			Thread.sleep(2000);
			
			Select select11 = new Select(driver.findElement(By.name("filedBy")));
		    select11.getFirstSelectedOption().click();
		    select11.selectByIndex(4);
			Thread.sleep(2000);
			
			driver.findElement(By.id("phaseOutputLocale.specificLocation")).click();
		    driver.findElement(By.id("phaseOutputLocale.specificLocation")).sendKeys("https://www.linkedin.com/");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("phaseOutputLocale.filingDuration")).click();
		    driver.findElement(By.id("phaseOutputLocale.filingDuration")).sendKeys("84");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("phaseOutputLocale.archivingInformation")).click();
		    driver.findElement(By.id("phaseOutputLocale.archivingInformation")).sendKeys("Lorem");
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".pull-right > .btn > .fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".action-buttons .glyphicon-pencil")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".glyphicon-screenshot")).click();
			Thread.sleep(2000);
			
			Select select111 = new Select(driver.findElement(By.id("controlRole")));
		    select111.getFirstSelectedOption().click();
		    select111.selectByIndex(2);
			Thread.sleep(2000);
			
			Select select1111 = new Select(driver.findElement(By.id("controlType")));
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(2);
			Thread.sleep(2000);
			
			
			Select select11111 = new Select(driver.findElement(By.id("controlResult")));
		    select11111.getFirstSelectedOption().click();
		    select11111.selectByIndex(2);
			Thread.sleep(2000);
			
			Select select111111 = new Select(driver.findElement(By.id("racidType")));
		    select111111.getFirstSelectedOption().click();
		    select111111.selectByIndex(2);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#addOutputControlBtn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#modal-phase-output-control-form .close")).click();
			Thread.sleep(2000);
	
			driver.findElement(By.cssSelector(".cnm-requirements > span")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.cssSelector("#phase_requirement_detail_panel .glyphicon")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.xpath("(//a[@id='4_anchor']/i)[2]")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("(//a[@id='4_anchor']/i)[2]")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@id='5_anchor']/i)[2]")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("(//a[@id='5_anchor']/i)[2]")).click();
			//Thread.sleep(2000);
 
			driver.findElement(By.cssSelector(".col-sm-8 > .pull-right .fa")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.linkText("Assets")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#phase_asset_detail_panel .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_3_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#assetGroup_3_anchor > .jstree-checkbox")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_4_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#assetGroup_4_anchor > .jstree-checkbox")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-8 > .pull-right .fa")).click();
			Thread.sleep(2000);
	        
			driver.findElement(By.linkText("Hazards")).click();
			Thread.sleep(2000);
	        
			driver.findElement(By.cssSelector("#accordionRisk > .panel:nth-child(1)")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#accordionRisk > .panel:nth-child(1) > .panel-heading span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("th > .btn > .fa")).click();
			Thread.sleep(2000);
             			
			
			Select select1111111 = new Select(driver.findElement(By.name("riskExId")));
		    select1111111.getFirstSelectedOption().click();
		    select1111111.selectByIndex(2);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-2 > .pull-right .fa")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".collapsed > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#accordionRisk > .panel:nth-child(2)")).click();
			Thread.sleep(2000);
			
		/*	driver.findElement(By.xpath("//div[@id='modal-phase-input-form']/div/div/div[3]/div/div/div/span/button/i")).click();
			Thread.sleep(2000);*/
		    
		    /*driver.findElement(By.xpath("//div[@id='phase_input_div']/div/div/div/div/div/span/button/i")).click();
			Thread.sleep(2000);*/
			
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updatePhases(WebDriver driver) {
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
			
			driver.findElement(By.xpath("//li[@id='11']/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("P-09 - Procedure 9")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#btn-edit-phase > .glyphicon")).click();
			Thread.sleep(2000);
		
		    driver.findElement(By.xpath("//form[@id='phase-form-view']/div/div/input[4]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//form[@id='phase-form-view']/div/div/input[4]")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//form[@id='phase-form-view']/div/div/input[4]")).sendKeys("Phase 8");
		    Thread.sleep(2000);
	
		    driver.findElement(By.xpath("//form[@id='phase-form-view']/div/div[2]/span[2]/span/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("CLT-Client");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
		    
			
			driver.findElement(By.xpath("//form[@id='phase-form-view']/div/div[3]/span/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("CS-Customer Service");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
		    
			driver.findElement(By.xpath("//div[@id='tdescription']/div/div[2]")).click();
			driver.findElement(By.xpath("//div[@id='tdescription']/div/div[2]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='tdescription']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='btn-update-phase']/i")).click();
			Thread.sleep(2000);

			driver.findElement(By.linkText("Outputs")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//tbody[@id='phaseOutputListTable']/tr/td[3]/div/a/span")).click();
			Thread.sleep(2000);
		
			Select select1 = new Select(driver.findElement(By.name("document")));
		    //select1.getFirstSelectedOption().click();
		   // select1.selectByIndex(6);
			Thread.sleep(2000);
			
			Select select11 = new Select(driver.findElement(By.name("filedBy")));
		    select11.getFirstSelectedOption().click();
		    select11.selectByIndex(6);
			Thread.sleep(2000);
			
			driver.findElement(By.id("phaseOutputLocale.specificLocation")).click();
			driver.findElement(By.id("phaseOutputLocale.specificLocation")).clear();
		    driver.findElement(By.id("phaseOutputLocale.specificLocation")).sendKeys("https://www.lorem.com/");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("phaseOutputLocale.filingDuration")).click();
		    driver.findElement(By.id("phaseOutputLocale.filingDuration")).clear();
		    driver.findElement(By.id("phaseOutputLocale.filingDuration")).sendKeys("98");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("phaseOutputLocale.archivingInformation")).click();
		    driver.findElement(By.id("phaseOutputLocale.archivingInformation")).clear();
		    driver.findElement(By.id("phaseOutputLocale.archivingInformation")).sendKeys("I AM");
		    Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".pull-right > .btn > .fa-save")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".action-buttons .glyphicon-pencil")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".glyphicon-screenshot")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".table-primary > td:nth-child(1)")).click();
			Thread.sleep(2000);
			
			Select select111 = new Select(driver.findElement(By.id("controlRole")));
		    select111.getFirstSelectedOption().click();
		    select111.selectByIndex(5);
			Thread.sleep(2000);
			
			Select select1111 = new Select(driver.findElement(By.id("controlType")));
		    select1111.getFirstSelectedOption().click();
		    select1111.selectByIndex(1);
			Thread.sleep(2000);
			
			
			Select select11111 = new Select(driver.findElement(By.id("controlResult")));
		    select11111.getFirstSelectedOption().click();
		    select11111.selectByIndex(1);
			Thread.sleep(2000);
			
			Select select111111 = new Select(driver.findElement(By.id("racidType")));
		    select111111.getFirstSelectedOption().click();
		    select111111.selectByIndex(1);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#updateOutputControlBtn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#modal-phase-output-control-form .close")).click();
			Thread.sleep(2000);

		/*	driver.findElement(By.xpath("//div[@id='modal-phase-input-form']/div/div/div[3]/div/div/div/span/button/i")).click();
			Thread.sleep(2000);*/
		    
		    /*driver.findElement(By.xpath("//div[@id='phase_input_div']/div/div/div/div/div/span/button/i")).click();
			Thread.sleep(2000);*/

			driver.findElement(By.cssSelector(".cnm-requirements > span")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.cssSelector("#phase_requirement_detail_panel .glyphicon")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.xpath("(//a[@id='4_anchor']/i)[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@id='4_anchor']/i)[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@id='5_anchor']/i)[2]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@id='5_anchor']/i)[2]")).click();
			Thread.sleep(2000);
 
			driver.findElement(By.cssSelector(".col-sm-8 > .pull-right .fa")).click();
			Thread.sleep(2000);
				    
			driver.findElement(By.linkText("Assets")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#phase_asset_detail_panel .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_3_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_3_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_4_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#assetGroup_4_anchor > .jstree-checkbox")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-8 > .pull-right .fa")).click();
			Thread.sleep(2000);
			
			
	
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
	
}
