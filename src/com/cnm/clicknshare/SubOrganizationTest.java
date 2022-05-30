package com.cnm.clicknshare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SubOrganizationTest {
          
	public static void createSubOrganizationTest(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Share")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(4) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-plus-circle")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("reference")).sendKeys("CP");
			Thread.sleep(2000);
			
			driver.findElement(By.id("orgCode")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("orgCode")).sendKeys("CP");
			Thread.sleep(2000);
			
			driver.findElement(By.id("name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name")).sendKeys("Challenge Optimum");
			Thread.sleep(2000);
	
			
			driver.findElement(By.id("emailAddress")).click();
			driver.findElement(By.id("emailAddress")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("emailAddress")).sendKeys("optimum@atl.com");
			Thread.sleep(2000);
			
			driver.findElement(By.id("contactName")).click();
			driver.findElement(By.id("contactName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("contactName")).sendKeys("CP");
			Thread.sleep(2000);
						
			driver.findElement(By.id("contactNumber")).click();
			driver.findElement(By.id("contactNumber")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("contactNumber")).sendKeys("12345678");
			Thread.sleep(2000);
						
			
			driver.findElement(By.cssSelector(".pull-right > .btn-primary")).click();
			Thread.sleep(2000);

			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
	public static void updateSubOrganizationTest(WebDriver driver) {
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
		    driver.findElement(By.linkText("Click & Share")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(4) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#agency_8 span:nth-child(1)")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("tr:nth-child(2) .btn:nth-child(1)")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.id("reference")).click();
			//driver.findElement(By.id("reference")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("reference")).sendKeys("CP");
			//Thread.sleep(2000);
			
			//driver.findElement(By.id("orgCode")).click();
			//driver.findElement(By.id("orgCode")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("orgCode")).sendKeys("CP");
			//Thread.sleep(2000);
			
			//driver.findElement(By.id("name")).click();
			//driver.findElement(By.id("name")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("name")).sendKeys("Challenge Optimum");
			//Thread.sleep(2000);
	
			
			//driver.findElement(By.id("emailAddress")).click();
			//driver.findElement(By.id("emailAddress")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("emailAddress")).sendKeys("optimum@atl.com");
			//Thread.sleep(2000);
			
			//driver.findElement(By.id("contactName")).click();
			//driver.findElement(By.id("contactName")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("contactName")).sendKeys("CP");
			//Thread.sleep(2000);
						
			//driver.findElement(By.id("contactNumber")).click();
			//driver.findElement(By.id("contactNumber")).clear();
			//hread.sleep(2000);
			//driver.findElement(By.id("contactNumber")).sendKeys("12345678");
			//Thread.sleep(2000);
						
			
			//driver.findElement(By.cssSelector(".pull-right > .btn-primary")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
			//Thread.sleep(2000);
			
		    //driver.findElement(By.xpath("//div[@id='model_div']/div/div/div/div[2]/span/button/i")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//form[@id='model_form_submit']/div/select")).sendKeys("Mod-02 - Model 2");
		    //Thread.sleep(2000);
			//driver.findElement(By.cssSelector("#model_form_submit #id")).sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
		
			
			//driver.findElement(By.cssSelector("#model_form_submit .btn-primary")).click();
			//Thread.sleep(2000);

			//driver.findElement(By.cssSelector("#myTab > li:nth-child(3) > a")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#org-tab-3 .btn")).click();
			//Thread.sleep(2000);
			
		    //driver.findElement(By.cssSelector(".col-sm-7 > #id")).click();;
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".col-sm-7 > #id")).sendKeys("AK - Abul Kasem");
		    //Thread.sleep(2000);
				
			//driver.findElement(By.cssSelector(".col-sm-7 > #id")).sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".col-sm-5 > .btn-primary")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#myTab > li:nth-child(4) > a")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#myTab > li:nth-child(6) > a")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".fa-language")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".pull-right > .glyphicon")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//table[@id='table-user']/tbody/tr/td[2]/input")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".pull-right:nth-child(2) .fa")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(5) > a")).click();
			Thread.sleep(2000);
				
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Status");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("tr:nth-child(6) .glyphicon")).click();
		    Thread.sleep(2000);
				
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='level_form']/div[3]/div/div/button/i")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
	    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Emergency");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector("tr:nth-child(5) .btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='level_form']/div[3]/div/div/button/i")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Cost");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(5) .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Feasibility");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(5) .btn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-12 > .pull-right .fa")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Origin");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(5) .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-12 > .pull-right .fa")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@id='click_and_act_levels_div']/div/div/div[2]/div/div/div/span/span/span/span")).click();;
		    Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")).sendKeys("Impact");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("tr:nth-child(5) .glyphicon")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).sendKeys("#ffffff");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#colorCode")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-12 > .pull-right .fa")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
			Thread.sleep(2000);
			
			
		  }catch(Exception e) {
			e.printStackTrace();
			driver.quit();
				
			}

	}
	
}
