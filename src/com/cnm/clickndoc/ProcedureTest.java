package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

  public class ProcedureTest {
	public static void createProcedure(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".btn:nth-child(2) > span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".row:nth-child(4) #reference")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".row:nth-child(4) #reference")).sendKeys("PRO-100");
		    Thread.sleep(2000);
		    driver.findElement(By.id("procedureLocale.name")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("procedureLocale.name")).sendKeys("Procedure 100");
		    Thread.sleep(2000);
	
		    
		    driver.findElement(By.cssSelector(".row:nth-child(6) #heading7 span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='detailed_objectives']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#procedure_modal .fa")).click();
		    Thread.sleep(2000);

			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}    
	
	public static void updateProcedure(WebDriver driver) {
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
            
			//driver.findElement(By.linkText("Fun-05 - Function 5")).click();
			//Thread.sleep(2000);
			driver.findElement(By.linkText("PRO-100 - Procedure 100")).click();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='myTab']/li/a/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#btn-edit-procedure")).click();
		    Thread.sleep(2000);
		    
			driver.findElement(By.cssSelector(".col-sm-4 > #reference")).click();
			driver.findElement(By.cssSelector(".col-sm-4 > #reference")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".col-sm-4 > #reference")).sendKeys("PRO-100");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#procedureLocaleName")).click();
		    driver.findElement(By.cssSelector("#procedureLocaleName")).clear();
		    Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#procedureLocaleName")).sendKeys("Procedure 100");
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//div[@id='heading7']/h4/a/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='description']/div/div[2]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='description']/div/div[2]")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			Thread.sleep(2000);
		 	
		 	driver.findElement(By.xpath("//form[@id='procedure_form_update']/div/div[6]/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("RBQ-Rubaet Bin Qaiyum");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.id("procedureVersion.createDate")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("procedureVersion.createDate")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("procedureVersion.createDate")).sendKeys("10/29/2021");
			Thread.sleep(2000);
			
			driver.findElement(By.name("procedureVersion.reviewDate")).clear();
			Thread.sleep(2000);
			driver.findElement(By.name("procedureVersion.reviewDate")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("procedureVersion.reviewDate")).sendKeys("10/30/2021");
			Thread.sleep(2000);
			
			driver.findElement(By.id("procedureVersion.reminderDay")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("procedureVersion.reminderDay")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("procedureVersion.reminderDay")).sendKeys("1");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='procedure_form_update']/div/div[7]/div/span/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("AK-Abul Kasem");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='procedure_form_update']/div/div[7]/div[2]/span/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("SA-Solutions Architect");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='procVersionAuthorListDiv']/div/div/div[2]/span/a/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='procedure-version-authors-form']/div/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("MU-Mayen Uddin");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//form[@id='procedure-version-authors-form']/div/div[2]/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("PSE - Principle Software Engineer");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#addVersionAuthorBtn > .fa")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#modal-procedure-version-authors-form .close")).click();
			Thread.sleep(2000);

			
		/*	driver.findElement(By.xpath("//div[@id='procVersionAuthorListDiv']/div/div/div[2]/span/a/span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//form[@id='procedure-version-authors-form']/div/div/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("AR-Abdur Razzak");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("///form[@id='procedure-version-authors-form']/div/div[2]/span[2]/span/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys("WM-WebMaster");
			Thread.sleep(2000);
			driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.cssSelector("#addVersionAuthorBtn > .fa")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#modal-procedure-version-authors-form .close")).click();
			Thread.sleep(2000);*/
			
		    
		  /*driver.findElement(By.cssSelector("#procedure_modal .fa")).click();
		    Thread.sleep(2000);
		    */
		    
			 driver.findElement(By.cssSelector("#headingCommentId span")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#commentId .trumbowyg-editor")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#commentId .trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
			 Thread.sleep(2000);
			
			 driver.findElement(By.cssSelector(".fa-save")).click();
			 Thread.sleep(2000);

		    
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}    
	
	
}
