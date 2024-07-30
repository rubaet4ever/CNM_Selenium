package com.cnm.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeTest {

	public static void updateHomeTest(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			
			driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector(".bigger-110")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div/div/div[3]/div[2]/a/li")).click();  // Click-N-Check Requirements
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div/div/div[4]/div[2]/a/li")).click();  // Click-N-Secure Risk Matrix
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a/span")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div[2]/a/li")).click();  // Click-N-Doc Functions & Procedures
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div[4]/div[2]/a/li")).click();  // Click-N-Doc Functions & Procedures
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a/span")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/a/li")).click();  // Click-N-Doc Documents
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a/span")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/a/li")).click();  // Click-N-Doc Employees
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[2]/div[2]/a/li")).click();  // Click-N-Act Indicators
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[3]/div[2]/a/li")).click();  // Click-N-Act Actions
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a/span")).click();  // Home
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='main-container']/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div[5]/div[2]/a/li")).click();  // Click-N-Maitain Assets
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='sidebar']/div/div/ul/li/a/span")).click();  // Home
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector(".user-info > span:nth-child(3)")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span")).click();  // Logout
			Thread.sleep(2000);
			
		    driver.quit();
	
			}catch(Exception e) {
				e.printStackTrace();
				driver.quit();
				
			}

	}
}
