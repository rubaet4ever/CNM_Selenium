package com.cnm.clicknsecure;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RiskTest {
	
	public static void createRiskTest(WebDriver driver) {
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
			 
			 /*driver.findElement(By.id("riskGroup_14_anchor")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("#add_new_risk > span")).click();
			 Thread.sleep(2000);
			
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("Risk-2");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk 2");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='risk_form_submit']/div/div/div[4]/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("RBQ - Rubaet Bin Qaiyum");
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
		     Thread.sleep(2000);*/
		     
/*		     driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(3) span")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".panel:nth-child(2) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#phases-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(2) > button")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#select2-procedure-container")).click();
			 Thread.sleep(2000);		 
			 driver.findElement(By.className("select2-search__field")).sendKeys("P-MKT-01 - Marketing & Sales");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 Select select111 = new Select(driver.findElement(By.id("phase")));
			 Thread.sleep(2000);
			 select111.getFirstSelectedOption().click();
			 select111.selectByIndex(1);
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//*[@id='risk_phase_form_div']/div/div/div/div/div/div/div[3]/span/button[1]")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#asset-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(3) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select1111 = new Select(driver.findElement(By.id("asset")));
			 Thread.sleep(2000);
			 select1111.getFirstSelectedOption().click();
			 select1111.selectByIndex(1);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_asset_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
	    	 driver.findElement(By.cssSelector(".panel:nth-child(4) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#action-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(2) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select11111 = new Select(driver.findElement(By.id("action")));
			 Thread.sleep(2000);
			 select11111.getFirstSelectedOption().click();
			 select11111.selectByIndex(1);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_action_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(5) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#nc-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(2) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select2 = new Select(driver.findElement(By.id("nc")));
			 Thread.sleep(2000);
			 select2.getFirstSelectedOption().click();
			 select2.selectByIndex(1);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_nc_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(6) > #heading1 .h5")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector("#requirement-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(2) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select3 = new Select(driver.findElement(By.id("requirement")));
			 Thread.sleep(2000);
			 select3.getFirstSelectedOption().click();
			 select3.selectByIndex(7);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_requirement_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(8) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#effect-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(3) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select4 = new Select(driver.findElement(By.name("effectRisk")));
			 Thread.sleep(2000);
			 select4.getFirstSelectedOption().click();
			 select4.selectByIndex(5);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_effect_form_submit > div > div.col-sm-2 > div > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".panel:nth-child(9) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#cause-div > div:nth-child(2) > div > div > div > div > table > thead > tr > th:nth-child(3) > button")).click();
			 Thread.sleep(2000);
			 
			 Select select5 = new Select(driver.findElement(By.name("causeRisk")));
			 Thread.sleep(2000);
			 select5.getFirstSelectedOption().click();
			 select5.selectByIndex(5);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_cause_form_submit > div > div > div.col-sm-2 > div > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 
			 
			 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(4) span")).click();
			 Thread.sleep(2000);*/
			 
			 
			/* 
			 driver.findElement(By.xpath("//form[@id='evaluation_form_submit']/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 Select select = new Select(driver.findElement(By.id("resId")));
			 select.getFirstSelectedOption().click();
			 select.selectByIndex(1);
			
			 
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).click();
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).clear();
		
			 Thread.sleep(2000);
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).sendKeys("17-09-2021");
			 driver.findElement(By.linkText("17")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".glyphicon-plus")).click();
			 Thread.sleep(2000);
			 */

			 
/*			 driver.findElement(By.cssSelector("#accordionEvaluation > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right > .btn > .glyphicon-pencil")).click();
			 Thread.sleep(2000);
			 
	
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("2/4 Likely");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div[2]/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("2/4 Major");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("Strengths");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right:nth-child(1) > .btn-sm")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaluation > .panel:nth-child(2) > .panel-heading .btn > span")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".panel:nth-child(2) .glyphicon-plus")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='controlfactor_form_submit']/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("P-MKT-01 - Marketing & Sales");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='controlfactor_form_submit']/div/div[2]/span[3]/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("8. Feasibility pre-study");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-left > .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("List")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".collapsed > span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("List")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector("tr:nth-child(1) .glyphicon-pencil")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#inputdocument .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#inputdocument .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(2) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.xpath("//div[@id='outputdocument']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//div[@id='outputdocument']/div/div/div[2]/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-2 .fa")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(3) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#phaseasset .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(3) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#phaseasset .btn")).click();
			 Thread.sleep(2000);

			 
			 driver.findElement(By.cssSelector(".collapsed > span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) > .panel-heading .btn > span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) .pull-right > .btn:nth-child(1)")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.xpath(".//form[@id='category_form_submit']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(4)")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) .pull-right > .btn:nth-child(1)")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.xpath(".//form[@id='category_form_submit']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(4)")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(4) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("tr:nth-child(1) .fa")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".close > span")).click();
			 Thread.sleep(2000);
		
			 
			 driver.findElement(By.cssSelector("tr:nth-child(2) .hidden-sm .fa")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".close > span")).click();
			 Thread.sleep(2000);*/
			 
			 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(5) span")).click();
			 Thread.sleep(2000);
		
			 Select select6 = new Select(driver.findElement(By.id("trResId")));
			 Thread.sleep(2000);
			 select6.getFirstSelectedOption().click();
			 select6.selectByIndex(1);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector("#accordionTreatment > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(2) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("th > .btn")).click();
			 Thread.sleep(2000);
			 
			 Select select7 = new Select(driver.findElement(By.id("action")));
			 Thread.sleep(2000);
			 select7.getFirstSelectedOption().click();
			 select7.selectByIndex(0);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector(".pull-left > .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(4) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right > .btn-primary > .glyphicon")).click();
			 Thread.sleep(2000);
			 
			 Select select8 = new Select(driver.findElement(By.name("likelihood")));
			 Thread.sleep(2000);
			 select8.getFirstSelectedOption().click();
			 select8.selectByIndex(2);
			 Thread.sleep(2000); 
			 
			 Select select9 = new Select(driver.findElement(By.name("severity")));
			 Thread.sleep(2000);
			 select9.getFirstSelectedOption().click();
			 select9.selectByIndex(1);
			 Thread.sleep(2000); 
			 
			 Select select10 = new Select(driver.findElement(By.name("controlLevel")));
			 Thread.sleep(2000);
			 select10.getFirstSelectedOption().click();
			 select10.selectByIndex(5);
			 Thread.sleep(2000); 
			
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(5) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#evaluatedlevel_form_submit .glyphicon")).click();
			 Thread.sleep(2000);
			 
			 Select select11 = new Select(driver.findElement(By.id("likelihood")));
			 Thread.sleep(2000);
			 select11.getFirstSelectedOption().click();
			 select11.selectByIndex(1);
			 Thread.sleep(2000); 
			 
			 Select select12 = new Select(driver.findElement(By.id("severity")));
			 Thread.sleep(2000);
			 select12.getFirstSelectedOption().click();
			 select12.selectByIndex(3);
			 Thread.sleep(2000); 
			 
			 Select select13 = new Select(driver.findElement(By.id("controlLevel")));
			 Thread.sleep(2000);
			 select13.getFirstSelectedOption().click();
			 select13.selectByIndex(4);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector("#evaluatedlevel_form_submit .fa")).click();
			 Thread.sleep(2000);
		     
		     
		     
	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateRiskTest(WebDriver driver) {
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
			
/*			 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("span > .pull-right")).click();
			 Thread.sleep(2000);
			 
		
			
			 driver.findElement(By.id("reference")).click();
			 driver.findElement(By.id("reference")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("reference")).sendKeys("Risk-2");
			 Thread.sleep(2000);
			
			 driver.findElement(By.id("sessionLocale.name")).click();
			 driver.findElement(By.id("sessionLocale.name")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.id("sessionLocale.name")).sendKeys("Risk 2");
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//form[@id='risk_form_submit']/div/div/div[4]/span[2]/span/span/span")).click();;
		     Thread.sleep(2000);
			
			 driver.findElement(By.className("select2-search__field")).sendKeys("RBQ - Rubaet Bin Qaiyum");
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
		     
		     driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("span > .pull-right")).click();
			 Thread.sleep(2000);
		     		     
			 driver.findElement(By.cssSelector(".row:nth-child(2) .h5")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".btn-sm > .fa-plus-circle")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.xpath("//div[@id='risk_matrix_form_div']/div/div/div/div/div/div/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("RM-2 - Risk Matrix 2");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".col-sm-2 .btn-primary")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector("span > .pull-right")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".row:nth-child(2) .h5")).click();
			 Thread.sleep(2000);
		     
			 driver.findElement(By.cssSelector("tr:nth-child(2) .btn-primary > .glyphicon")).click();
			 Thread.sleep(2000);
		     
			 driver.findElement(By.xpath("//div[@id='risk_matrix_form_div']/div/div/div/div/div/div/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("RM-3 - Risk Matrix 3");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-2 .btn-primary")).click();
			 Thread.sleep(2000);
	*/
			 
			 
			 
		/*	 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(4) span")).click();
			 Thread.sleep(2000);
			 */
			 
			/* 
			 driver.findElement(By.xpath("//form[@id='evaluation_form_submit']/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 Select select = new Select(driver.findElement(By.id("resId")));
			 select.getFirstSelectedOption().click();
			 select.selectByIndex(1);
			
			 
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).click();
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).clear();
		
			 Thread.sleep(2000);
			 driver.findElement(By.id("//form[@id='evaluation_form_submit']/div[2]/input")).sendKeys("17-09-2021");
			 driver.findElement(By.linkText("17")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".glyphicon-plus")).click();
			 Thread.sleep(2000);
			 */

			 
			/* driver.findElement(By.cssSelector("#accordionEvaluation > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right > .btn > .glyphicon-pencil")).click();
			 Thread.sleep(2000);
			 
	
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("2/4 Likely");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div[2]/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("2/4 Major");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='risklevel_form_submit']/div/div/div[3]/span[2]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("Strengths");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right:nth-child(1) > .btn-sm")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaluation > .panel:nth-child(2) > .panel-heading .btn > span")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".panel:nth-child(2) .glyphicon-plus")).click();
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//form[@id='controlfactor_form_submit']/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("P-MKT-01 - Marketing & Sales");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//form[@id='controlfactor_form_submit']/div/div[2]/span[3]/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.className("select2-search__field")).sendKeys("8. Feasibility pre-study");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-left > .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("List")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".collapsed > span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.linkText("List")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector("tr:nth-child(1) .glyphicon-pencil")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#inputdocument .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#inputdocument .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(2) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.xpath("//div[@id='outputdocument']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//div[@id='outputdocument']/div/div/div[2]/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".col-sm-2 .fa")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(3) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#phaseasset .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#accordionEvaPhase > .panel:nth-child(3) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector("#phaseasset .btn")).click();
			 Thread.sleep(2000);

			 
			 driver.findElement(By.cssSelector(".collapsed > span")).click();
			 Thread.sleep(2000);
			 			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) > .panel-heading .btn > span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) .pull-right > .btn:nth-child(1)")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.xpath(".//form[@id='category_form_submit']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(4)")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) .pull-right > .btn:nth-child(1)")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.xpath(".//form[@id='category_form_submit']/div/div/div/span[3]/span/span/span")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".col-sm-4:nth-child(4)")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(4) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("tr:nth-child(1) .fa")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".close > span")).click();
			 Thread.sleep(2000);
		
			 
			 driver.findElement(By.cssSelector("tr:nth-child(2) .hidden-sm .fa")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".close > span")).click();
			 Thread.sleep(2000);*/
			 

			 
		   /*driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(3) span")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".panel:nth-child(2) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#phases-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(2) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#select2-procedure-container")).click();
			 Thread.sleep(2000);		 
			 driver.findElement(By.className("select2-search__field")).sendKeys("P-MKT-01 - Marketing & Sales");
			 Thread.sleep(2000);
			 driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			 Thread.sleep(2000);
			 
			 Select select111 = new Select(driver.findElement(By.id("phase")));
			 Thread.sleep(2000);
			 select111.getFirstSelectedOption().click();
			 select111.selectByIndex(3);
			 Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//*[@id='risk_phase_form_div']/div/div/div/div/div/div/div[3]/span/button[1]")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#asset-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(3) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select1111 = new Select(driver.findElement(By.id("asset")));
			 Thread.sleep(2000);
			 select1111.getFirstSelectedOption().click();
			 select1111.selectByIndex(3);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_asset_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
	    	 driver.findElement(By.cssSelector(".panel:nth-child(4) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#action-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(2) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select11111 = new Select(driver.findElement(By.id("action")));
			 Thread.sleep(2000);
			 select11111.getFirstSelectedOption().click();
			 select11111.selectByIndex(3);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_action_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(5) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#nc-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(2) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select2 = new Select(driver.findElement(By.id("nc")));
			 Thread.sleep(2000);
			 select2.getFirstSelectedOption().click();
			 select2.selectByIndex(1);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_nc_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(6) > #heading1 .h5")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector("#requirement-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(2) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select3 = new Select(driver.findElement(By.id("requirement")));
			 Thread.sleep(2000);
			 select3.getFirstSelectedOption().click();
			 select3.selectByIndex(4);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_requirement_form_div > div > div > div > div > div > div > div.col-sm-2 > span > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(8) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#effect-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(3) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select4 = new Select(driver.findElement(By.name("effectRisk")));
			 Thread.sleep(2000);
			 select4.getFirstSelectedOption().click();
			 select4.selectByIndex(3);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_effect_form_submit > div > div.col-sm-2 > div > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);
		
			 driver.findElement(By.cssSelector(".panel:nth-child(9) > #heading1 .h5")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#cause-div > div:nth-child(2) > div > div > div > div > table > tbody > tr > td:nth-child(3) > div > a.btn.btn-primary.btn-sm")).click();
			 Thread.sleep(2000);
			 
			 Select select5 = new Select(driver.findElement(By.name("causeRisk")));
			 Thread.sleep(2000);
			 select5.getFirstSelectedOption().click();
			 select5.selectByIndex(3);
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#risk_cause_form_submit > div > div > div.col-sm-2 > div > button.btn.btn-sm.btn-primary")).click();
			 Thread.sleep(2000);*/
			 
			 driver.findElement(By.id("risk_14_31_anchor")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#myTab > li:nth-child(5) span")).click();
			 Thread.sleep(2000);
		
			 Select select6 = new Select(driver.findElement(By.id("trResId")));
			 Thread.sleep(2000);
			 select6.getFirstSelectedOption().click();
			 select6.selectByIndex(1);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector("#accordionTreatment > .panel:nth-child(1) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(2) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(3) span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("th > .btn")).click();
			 Thread.sleep(2000);
			 
			 Select select7 = new Select(driver.findElement(By.id("action")));
			 Thread.sleep(2000);
			 select7.getFirstSelectedOption().click();
			 select7.selectByIndex(0);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector(".pull-left > .btn")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(4) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".pull-right > .btn-primary > .glyphicon")).click();
			 Thread.sleep(2000);
			 
			 Select select8 = new Select(driver.findElement(By.name("likelihood")));
			 Thread.sleep(2000);
			 select8.getFirstSelectedOption().click();
			 select8.selectByIndex(3);
			 Thread.sleep(2000); 
			 
			 Select select9 = new Select(driver.findElement(By.name("severity")));
			 Thread.sleep(2000);
			 select9.getFirstSelectedOption().click();
			 select9.selectByIndex(3);
			 Thread.sleep(2000); 
			 
			 Select select10 = new Select(driver.findElement(By.name("controlLevel")));
			 Thread.sleep(2000);
			 select10.getFirstSelectedOption().click();
			 select10.selectByIndex(6);
			 Thread.sleep(2000); 
			
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector(".panel:nth-child(5) > .panel-heading span")).click();
			 Thread.sleep(2000);
			 
			 driver.findElement(By.cssSelector("#evaluatedlevel_form_submit .glyphicon")).click();
			 Thread.sleep(2000);
			 
			 Select select11 = new Select(driver.findElement(By.id("likelihood")));
			 Thread.sleep(2000);
			 select11.getFirstSelectedOption().click();
			 select11.selectByIndex(3);
			 Thread.sleep(2000); 
			 
			 Select select12 = new Select(driver.findElement(By.id("severity")));
			 Thread.sleep(2000);
			 select12.getFirstSelectedOption().click();
			 select12.selectByIndex(2);
			 Thread.sleep(2000); 
			 
			 Select select13 = new Select(driver.findElement(By.id("controlLevel")));
			 Thread.sleep(2000);
			 select13.getFirstSelectedOption().click();
			 select13.selectByIndex(6);
			 Thread.sleep(2000); 
			 
			 driver.findElement(By.cssSelector("#evaluatedlevel_form_submit .fa")).click();
			 Thread.sleep(2000);
			 
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	

}
