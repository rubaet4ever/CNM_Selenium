package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EmployeeTest {

	public static void createEmployee(WebDriver driver){
		try{
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
	    driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
	    driver.findElement(By.cssSelector(".fa-plus-circle")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("reference")).sendKeys("RKN");
	    Thread.sleep(2000);
	    driver.findElement(By.id("firstName")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("firstName")).sendKeys("Raiyan");
	    Thread.sleep(2000);
	    driver.findElement(By.id("lastName")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("lastName")).sendKeys("Khan");
	    Thread.sleep(2000);
	    driver.findElement(By.id("user.email")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("user.email")).sendKeys("khan@atl.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("id-date-picker-1")).sendKeys("19-12-1997");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("workPhone")).click();
	    driver.findElement(By.id("workPhone")).sendKeys("022 738 13 11");
	    Thread.sleep(2000);
	    driver.findElement(By.id("homePhone")).click();
	    driver.findElement(By.id("homePhone")).sendKeys("022 738 13 11");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("mobilePhonePro")).click();
	    driver.findElement(By.id("mobilePhonePro")).sendKeys("+41001112232");
	    Thread.sleep(2000);
	    driver.findElement(By.id("mobilePhonePrivate")).click();
	    driver.findElement(By.id("mobilePhonePrivate")).sendKeys("+41001112232");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(".col-sm-4:nth-child(14)")).click();
	    driver.findElement(By.id("addressStreet")).click();
	    driver.findElement(By.id("addressStreet")).sendKeys("Lane-6184");
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.addressCity")).click();
	    driver.findElement(By.id("employeeLocale.addressCity")).sendKeys("CTA");
	    Thread.sleep(2000);
	    driver.findElement(By.id("addressZip")).click();
	    driver.findElement(By.id("addressZip")).sendKeys("202012");
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.addressState")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.addressState")).sendKeys("TA");
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.addressCountry")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.addressCountry")).sendKeys("DT");
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.jobTitle")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.jobTitle")).sendKeys("Employee");
	    Thread.sleep(2000);
	    driver.findElement(By.id("occupancyRate")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("occupancyRate")).sendKeys("57");
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.signatureRights")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("employeeLocale.signatureRights")).sendKeys("Raj");
	    Thread.sleep(2000);
	    Select select = new Select(driver.findElement(By.id("manager")));
	    select.getFirstSelectedOption().click();
	    select.selectByIndex(1);
	    
	    driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    
	   /* driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.findElement(By.className("bigger-110")).click();
		Thread.sleep(2000);
	    
	    driver.findElement(By.className("user-info")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Logout')]")).click();
		Thread.sleep(2000);*/
	    
		 }
		catch(Exception e){
		e.printStackTrace();
	}
	}
	
	public static void updateEmployee(WebDriver driver){
		try{
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
		    driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
		    Thread.sleep(2000);
		    
			driver.findElement(By.xpath("//td[@id='employee_46']/a/span")).click();
			Thread.sleep(2000);
			
			
		    driver.findElement(By.linkText("Roles")).click(); 
		    Thread.sleep(2000);
			  
			driver.findElement(By.cssSelector("#employee_role_block_div .glyphicon")).click(); 
			Thread.sleep(2000);
			  
			driver.findElement(By.xpath("//form[@id='role_form_submit']/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("Ct - Client"); 
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER );
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".col-sm-5 > .btn-add")).click();
			Thread.sleep(2000);
			

			driver.findElement(By.cssSelector("#myTab > li:nth-child(3) span")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//div[@id='employee_backup_block_div']/div/div/div/div/div/span/button/i")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='backup_Employee_form_submit']/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")). sendKeys("AK - Abul Kasem"); 
			Thread.sleep(2000);
		    driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER ); 
		    Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='backup_Employee_form_submit']/div[2]/span[2]/span/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("select2-search__field")). sendKeys("SA - Solutions Architect"); 
			Thread.sleep(2000);
		    driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER ); 
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//form[@id='backup_Employee_form_submit']/div[3]/button")).click();
		    Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(4) span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='controlPanels_div']/div/div/div/div/div/span/button/i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='controlPanel_form_submit']/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.className("select2-search__field")). sendKeys("NC-01 - Non-conformance management 1"); 
			Thread.sleep(2000);
		    driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER ); 
		    Thread.sleep(2000);

			driver.findElement(By.xpath("//form[@id='controlPanel_form_submit']/div[2]/button/i")).click();
		    Thread.sleep(2000);
			
		   
			
		    driver.findElement(By.xpath("//table[@id='table-employee']/tbody/tr[7]/td[2]/div/a/span")).click();
			Thread.sleep(2000);
			 
			
			driver.findElement(By.id("reference")).clear();
			driver.findElement(By.id("reference")).click();
			driver.findElement(By.id("reference")).sendKeys("RP");
		    Thread.sleep(2000);
			
			driver.findElement(By.id("firstName")).clear();
			driver.findElement(By.id("firstName")).click();
			driver.findElement(By.id("firstName")).sendKeys("Rock");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("lastName")).clear();
		    driver.findElement(By.id("lastName")).click();
		    driver.findElement(By.id("lastName")).sendKeys("Patternson");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("user.email")).clear();
		    driver.findElement(By.id("user.email")).click();
		    driver.findElement(By.id("user.email")).sendKeys("paul@atl.com");
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.id("id-date-picker-1")).clear();
			driver.findElement(By.id("id-date-picker-1")).click();
			driver.findElement(By.id("id-date-picker-1")).sendKeys("15-11-1985");
			Thread.sleep(2000);
		    
		    
		    driver.findElement(By.id("workPhone")).click();
		    driver.findElement(By.id("workPhone")).clear();
		    driver.findElement(By.id("workPhone")).sendKeys("022 738 13 11");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("homePhone")).click();
		    driver.findElement(By.id("homePhone")).clear();
		    driver.findElement(By.id("homePhone")).sendKeys("022 738 13 11");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("mobilePhonePro")).click();
		    driver.findElement(By.id("mobilePhonePro")).clear();
		    driver.findElement(By.id("mobilePhonePro")).sendKeys("+41001112232");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("mobilePhonePrivate")).click();
		    driver.findElement(By.id("mobilePhonePrivate")).clear();
		    driver.findElement(By.id("mobilePhonePrivate")).sendKeys("+41001112232");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("addressStreet")).click();
		    driver.findElement(By.id("addressStreet")).clear();
		    driver.findElement(By.id("addressStreet")).sendKeys("Road-856");
		    Thread.sleep(2000);
		    driver.findElement(By.id("employeeLocale.addressCity")).click();
		    driver.findElement(By.id("employeeLocale.addressCity")).clear();
		    driver.findElement(By.id("employeeLocale.addressCity")).sendKeys("SKD");
		    Thread.sleep(2000);
		    driver.findElement(By.id("employeeLocale.addressState")).click();
		    driver.findElement(By.id("employeeLocale.addressState")).clear();
		    driver.findElement(By.id("employeeLocale.addressState")).sendKeys("DR");
		    Thread.sleep(2000);
		    driver.findElement(By.id("addressZip")).click();
		    driver.findElement(By.id("addressZip")).clear();
		    driver.findElement(By.id("addressZip")).sendKeys("958687");
		    Thread.sleep(2000);
		    driver.findElement(By.id("employeeLocale.addressCountry")).click();
		    driver.findElement(By.id("employeeLocale.addressCountry")).clear();
		    driver.findElement(By.id("employeeLocale.addressCountry")).sendKeys("OUD");
		    Thread.sleep(2000);
		    driver.findElement(By.id("employeeLocale.jobTitle")).click();
		    driver.findElement(By.id("employeeLocale.jobTitle")).clear();
		    driver.findElement(By.id("employeeLocale.jobTitle")).sendKeys("Engineer");
		    Thread.sleep(2000);
		    driver.findElement(By.id("occupancyRate")).click();
		    driver.findElement(By.id("occupancyRate")).clear();
		    driver.findElement(By.id("occupancyRate")).sendKeys("40");
		    Thread.sleep(2000);
		    driver.findElement(By.id("employeeLocale.signatureRights")).click();
		    driver.findElement(By.id("employeeLocale.signatureRights")).clear();
		    driver.findElement(By.id("employeeLocale.signatureRights")).sendKeys("OK");
		    Thread.sleep(2000);
		    
		    Select select11 = new Select(driver.findElement(By.id("manager")));
		    select11.getFirstSelectedOption().click();
		    select11.selectByIndex(1);
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".fa-save")).click();
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
		    }
		    catch(Exception e)
		   { 
		    e.printStackTrace();
	}
	}
}
