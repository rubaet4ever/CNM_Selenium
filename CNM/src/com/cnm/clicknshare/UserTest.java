package com.cnm.clicknshare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class UserTest {
	
	
	public static void createUserTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".btn-add")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.reference")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.reference")).sendKeys("RJ");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.firstName")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.firstName")).sendKeys("Raj");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.lastName")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.lastName")).sendKeys("Khan");
			Thread.sleep(2000);
	
			
			driver.findElement(By.id("email")).click();
			driver.findElement(By.id("email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("raj@atl.com");
			Thread.sleep(2000);
			
			driver.findElement(By.id("password")).click();
			driver.findElement(By.id("password")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
						
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
		/*	driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    Thread.sleep(2000);*/
			
		/*	
		    
		    driver.findElement(By.cssSelector("#cnm_role_user_div .glyphicon")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//*[@id='user_form_submit']/div[1]/span[2]/span[1]/span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("AK - Abul Kasem");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-5 .fa")).click();
			Thread.sleep(2000);
			*/
			
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	
	public static void updateUserTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(2) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#user_51 span:nth-child(2)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//table[@id='table-user']/tbody/tr[10]/td[2]/div/a/span")).click();
		    Thread.sleep(2000);
			
			driver.findElement(By.id("employee.reference")).click();
			driver.findElement(By.id("employee.reference")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.reference")).sendKeys("Okay");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.firstName")).click();
			driver.findElement(By.id("employee.firstName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.firstName")).sendKeys("Hasan");
			Thread.sleep(2000);
			
			driver.findElement(By.id("employee.lastName")).click();
			driver.findElement(By.id("employee.lastName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("employee.lastName")).sendKeys("Imtiaz");
			Thread.sleep(2000);
	
			
			driver.findElement(By.id("email")).click();
			driver.findElement(By.id("email")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("hasan@atl.com");
			Thread.sleep(2000);
						
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector("#user_51 span:nth-child(2)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//table[@id='table-user']/tbody/tr[10]/td[2]/div/a/span")).click();
		    Thread.sleep(2000);  
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    Thread.sleep(2000);
		    
		 
		    
		    driver.findElement(By.id("newPassword")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("newPassword")).sendKeys("ruabet1@R");
			Thread.sleep(2000);
			
			driver.findElement(By.id("confirmPassword")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("confirmPassword")).sendKeys("ruabet1@R");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#change_password_form_submit > div.row.panel-footer > div > div > button")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector("#user_51 span:nth-child(2)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//table[@id='table-user']/tbody/tr[10]/td[2]/div/a/span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(3) > a")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.xpath("//form[@id='role_form_submit']/div/span[2]/span/span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("Manager");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-5 .fa")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#user_51 span:nth-child(2)")).click();
			Thread.sleep(2000);
			    
			driver.findElement(By.xpath("//table[@id='table-user']/tbody/tr[10]/td[2]/div/a/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(4) > a")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector(".btn-add > .glyphicon")).click();
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.xpath("//form[@id='controlPanel_form_submit']/div/span[2]/span/span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.className("select2-search__field")).sendKeys("AM-01 - Action Management 1");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".col-sm-4 > .btn > .fa")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='controlPanel_form_submit']/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("NC-01 - Non-conformance Management 1");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			    
			driver.findElement(By.cssSelector(".col-sm-4 > .btn > .fa")).click();
			Thread.sleep(2000);
			
		    
			driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
		    Thread.sleep(4000);
			
			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}

}
