package com.cnm.clickndoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DocumentGroupTest {

	
	public static void createDocumentGroup(WebDriver driver) {
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
		driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//button[@id='add_new_group']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("reference")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("reference")).sendKeys("D-Doc");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("documentGroupLocale.name")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("documentGroupLocale.name")).sendKeys("Document");
	    Thread.sleep(2000);
		
		
		Select select = new Select(driver.findElement(By.name("parent")));
	    select.getFirstSelectedOption().click();
	    select.selectByIndex(4);
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Description")).click();
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

	public static void updateDocumentGroup(WebDriver driver) {
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
		driver.findElement(By.cssSelector(".nav-show > li:nth-child(3) .font-weight-bold")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("D-Doc - Document")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='group-tab-2']/div/div/div/div/div/div/div[2]/span/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("reference")).clear();
		driver.findElement(By.id("reference")).click();
		driver.findElement(By.id("reference")).sendKeys("D-Doc");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("documentGroupLocale.name")).clear();
		driver.findElement(By.id("documentGroupLocale.name")).click();
	    driver.findElement(By.id("documentGroupLocale.name")).sendKeys("Document");
	    Thread.sleep(2000);
		
		
		Select select = new Select(driver.findElement(By.name("parent")));
	    select.getFirstSelectedOption().click();
	    select.selectByIndex(4);
	    
	    driver.findElement(By.linkText("Description")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).clear();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".trumbowyg-editor")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		Thread.sleep(2000);
	    
		driver.findElement(By.cssSelector(".fa-save")).click();
	    Thread.sleep(2000);
	    
		
		/*
		 * driver.findElement(By.xpath("//li[@id='document_11_24']/a")).click();
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document-tab-1']/div/div/div/div/div/div/div[2]/span/button/i")).
		 * click(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("reference")).clear();
		 * driver.findElement(By.id("reference")).click();
		 * driver.findElement(By.id("reference")).sendKeys("D-Doc01");
		 * Thread.sleep(2000); driver.findElement(By.id("name")).clear();
		 * driver.findElement(By.id("name")).click();
		 * driver.findElement(By.id("name")).sendKeys("Documents-01");
		 * Thread.sleep(1000); driver.findElement(By.id("keywords")).clear();
		 * driver.findElement(By.id("keywords")).click();
		 * driver.findElement(By.id("keywords")).sendKeys("Hi Earth");
		 * Thread.sleep(1000); driver.findElement(By.id("location")).clear();
		 * driver.findElement(By.id("location")).click();
		 * driver.findElement(By.id("location")).sendKeys("https://www.youtube.com/");
		 * Thread.sleep(1000); driver.findElement(By.id("standardLocation")).clear();
		 * driver.findElement(By.id("standardLocation")).click();
		 * driver.findElement(By.id("standardLocation")).sendKeys(
		 * "https://www.facebook.com/"); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.linkText("Description")).click(); Thread.sleep(1000);
		 * driver.findElement(By.cssSelector(".trumbowyg-editor")).
		 * sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
		 * ); Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document_info_edit_Div']/div/div[7]/div[2]/div/div/div/span[2]/span/span"
		 * )).click(); Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document_info_edit_Div']/div/div[7]/div[2]/div/div/div[2]/span[2]/span/span/span"
		 * )).click(); Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document_info_edit_Div']/div/div[7]/div[2]/div/div/div[2]/span[2]/span/span/span"
		 * )).click(); Thread.sleep(1000);
		 * driver.findElement(By.id("newVersion")).clear();
		 * driver.findElement(By.id("newVersion")).click();
		 * driver.findElement(By.id("newVersion")).sendKeys("0.1"); Thread.sleep(1000);
		 * driver.findElement(By.id("dpCreateDate")).clear();
		 * driver.findElement(By.id("dpCreateDate")).click();
		 * driver.findElement(By.id("dpCreateDate")).sendKeys("11/10/2021");
		 * Thread.sleep(1000); driver.findElement(By.id("dpApproveDate")).clear();
		 * driver.findElement(By.id("dpApproveDate")).click();
		 * driver.findElement(By.id("dpApproveDate")).sendKeys("12/11/2021");
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document_info_edit_Div']/div/div[7]/div[2]/div/div[3]/div[2]/span[2]/span/span/span"
		 * )).click(); Thread.sleep(1000); driver.findElement(By.xpath(
		 * "//div[@id='document_info_edit_Div']/div/div[7]/div[2]/div/div[3]/div[3]/span[2]/span/span"
		 * )).click(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("dpStartDate")).clear();
		 * driver.findElement(By.id("dpStartDate")).click();
		 * driver.findElement(By.id("dpStartDate")).sendKeys("13/09/2021");
		 * Thread.sleep(1000); driver.findElement(By.id("dpNextReviewDate")).clear();
		 * driver.findElement(By.id("dpNextReviewDate")).click();
		 * driver.findElement(By.id("dpNextReviewDate")).sendKeys("14/11/2021");
		 * Thread.sleep(1000);
		 * driver.findElement(By.id("documentVersion.reminderDay")).clear();
		 * driver.findElement(By.id("documentVersion.reminderDay")).click();
		 * driver.findElement(By.id("documentVersion.reminderDay")).sendKeys("5");
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("#comment7 span")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.cssSelector("#comment .trumbowyg-editor")).
		 * sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
		 * ); Thread.sleep(1000);
		 * driver.findElement(By.cssSelector(".fa-save")).click(); Thread.sleep(2000);
		 */
		
		
		/*driver.findElement(By.xpath("//div[@id='docVersionAuthorListDiv']/div/div/div[2]/span/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='docVersionAuthorListDiv']/div/div/div[2]/span/a/span")).click();
		Thread.sleep(1000);
		Select select = new Select(driver.findElement(By.name("authoringEmployee")));
	    select.getFirstSelectedOption().click();
	    select.selectByIndex(10);
	    Select select1 = new Select(driver.findElement(By.name("authoringRole")));
	    select1.getFirstSelectedOption().click();
	    select1.selectByIndex(15);*/
		
		/*driver.findElement(By.cssSelector("#addVersionAuthorBtn > .fa")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#modal-document-version-authors-form .close")).click();
		Thread.sleep(1000);*/
		
		
	   
	    }
		catch(Exception e) {
			e.printStackTrace();
			driver.quit();
			
		}
	}
}
