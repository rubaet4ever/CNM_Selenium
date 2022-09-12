package com.cnm.clicknshare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessRolesTest {
            
	public static void createAcessRolesTest(WebDriver driver) {
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
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-plus-circle")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("name")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("name")).sendKeys("Salesforce Developer");
			Thread.sleep(2000);
			driver.findElement(By.id("roleDesc")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("roleDesc")).sendKeys("Salesforce Developer");
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".fa-save")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    Thread.sleep(2000);
		    
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
			
			//driver.findElement(By.cssSelector("#cnmRole_15 span")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.linkText("Permissions")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".panel:nth-child(1) .h5")).click();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("tr:nth-child(2) .col-sm-12 .glyphicon")).click();
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.id("dashboard_menu")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_dashboard > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(2) > td > div > button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".panel:nth-child(2) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    Thread.sleep(2000);
		   
		    driver.findElement(By.id("clickAndDoc")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    Thread.sleep(2000);
		    
		    
		    /*driver.findElement(By.cssSelector(".panel:nth-child(3) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#click_secure_form .glyphicon:nth-child(1")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndAct")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    Thread.sleep(2000);*/
		    
		    
		    driver.findElement(By.cssSelector(".panel:nth-child(4) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc tr:nth-child(4) .glyphicon:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndAct")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(4) > td > div > button")).click();
		    Thread.sleep(2000);

		  
		    driver.findElement(By.cssSelector(".panel:nth-child(5) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_maintain .glyphicon:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndMaintain")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_maintain .col-sm-12:nth-child(1) .fa:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".panel:nth-child(6) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_secure .glyphicon:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndSecure")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_secure .col-sm-12:nth-child(1) .fa:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".panel:nth-child(7) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc tr:nth-child(3) .glyphicon:nth-child(1)")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndProfile")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(3) > td > div > button")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
		    Thread.sleep(2000);

			
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
	public static void updateAcessRolesTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			driver.findElement(By.id("email")).sendKeys("rubaet@cnm.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Click & Share")).click();
		    Thread.sleep(2000);
			driver.findElement(By.cssSelector(".nav-show > li:nth-child(1) .font-weight-bold")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#cnmRole_31 span")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > .panel:nth-child(1) > .panel-heading:nth-child(1) .glyphicon:nth-child(1)")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.id("name")).click();
			//driver.findElement(By.id("name")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("name")).sendKeys("Salesforce Developer");
			//Thread.sleep(2000);
			//driver.findElement(By.id("roleDesc")).click();
			//driver.findElement(By.id("roleDesc")).clear();
			//Thread.sleep(2000);
			//driver.findElement(By.id("roleDesc")).sendKeys("Salesforce Developer");
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector(".fa-save")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.cssSelector("#myTab > li:nth-child(2) > a")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#cnm_role_user_div .glyphicon")).click();
		    //Thread.sleep(2000);
			
		    //driver.findElement(By.xpath("//*[@id='user_form_submit']/div[1]/span[2]/span[1]/span")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.className("select2-search__field")).sendKeys("AR - Abdur Razzak");
			//Thread.sleep(2000);
			//driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
			
		    //driver.findElement(By.cssSelector(".col-sm-5 .fa")).click();
		    //Thread.sleep(2000);
		    
			//driver.findElement(By.linkText("Permissions")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".panel:nth-child(1) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("tr:nth-child(2) .col-sm-12 .glyphicon")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.id("dashboard_menu")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_dashboard > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(2) > td > div > button")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".panel:nth-child(2) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    //Thread.sleep(2000);
		   
		    //driver.findElement(By.id("clickAndDoc")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    //Thread.sleep(2000);
		    
		    
		    /*driver.findElement(By.cssSelector(".panel:nth-child(3) .h5")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#click_secure_form .glyphicon:nth-child(1")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("clickAndAct")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(6) > td > div > button")).click();
		    Thread.sleep(2000);*/
		    
		    
		    //driver.findElement(By.cssSelector(".panel:nth-child(4) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc tr:nth-child(4) .glyphicon:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.id("clickAndAct")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(4) > td > div > button")).click();
		    //Thread.sleep(2000);

		  
		    //driver.findElement(By.cssSelector(".panel:nth-child(5) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_maintain .glyphicon:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.id("clickAndMaintain")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_maintain .col-sm-12:nth-child(1) .fa:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".panel:nth-child(6) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_secure .glyphicon:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.id("clickAndSecure")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_secure .col-sm-12:nth-child(1) .fa:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector(".panel:nth-child(7) .h5")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc tr:nth-child(3) .glyphicon:nth-child(1)")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.id("clickAndProfile")).click();
		    //Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#table_click_doc > tbody > tr:nth-child(1) > td:nth-child(1) > table > tbody > tr:nth-child(3) > td > div > button")).click();
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(4) span")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r1-2-8 .tg_datagrid-cell-c1-permission")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".textbox-icon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("_easyui_combobox_i1_0")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r1-2-8 .btn > .fa")).click();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#tg_datagrid-row-r1-2-8 .btn")).click();
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnCancelEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r2-2-8 .tg_datagrid-cell-c2-permission")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector(".textbox-icon")).click();
		    Thread.sleep(2000);
			
		    
		    driver.findElement(By.id("_easyui_combobox_i2_2")).click();
		    Thread.sleep(2000);
			
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r2-2-8 .btn > .fa")).click();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#tg_datagrid-row-r2-2-8 .btn")).click();
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnCancelEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    
		    driver.findElement(By.cssSelector("#btnEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r3-2-10-8 .tg_datagrid-cell-c3-permission")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".textbox-icon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("_easyui_combobox_i3_2")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r3-2-10-8 .btn > .fa")).click();
		    Thread.sleep(2000);
		    
		    //driver.findElement(By.cssSelector("#tg_datagrid-row-r3-2-10-8 .btn")).click();
		    //Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnCancelEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r4-2-11-8 .tg_datagrid-cell-c4-permission")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".textbox-icon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("_easyui_combobox_i4_2")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r4-2-11-8 .btn > .fa")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnCancelEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#btnEditFunction > .glyphicon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r5-2-12-8 .tg_datagrid-cell-c5-permission")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector(".textbox-icon")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.id("_easyui_combobox_i5_2")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#tg_datagrid-row-r5-2-12-8 .btn > .fa")).click();
		    Thread.sleep(2000);
		    
		    driver.findElement(By.cssSelector("#myTab > li:nth-child(1) > a")).click();
		    Thread.sleep(2000);
	
		
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
	
}
