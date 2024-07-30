package com.cnm.main;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import org.testng.Assert;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.cnm.clicknact.ActionTest;
import com.cnm.clicknact.NonConformanceTest;
import com.cnm.clickncheck.RequirementsTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.cnm.clicknact.ActSettingTest;
import com.cnm.clickndoc.DocumentGroupTest;
import com.cnm.clickndoc.DocumentTest;
import com.cnm.clickndoc.EmployeeTest;
import com.cnm.clickndoc.FucntionTest;
import com.cnm.clickndoc.PhasesTest;
import com.cnm.clickndoc.ProcedureTest;
import com.cnm.clickndoc.RoleTest;
import com.cnm.clickndoc.TitleTest;
import com.cnm.clicknmaintain.AssetTest;
import com.cnm.clicknmaintain.MaintainSettingTest;
import com.cnm.clicknprofile.ChangePasswordTest;
import com.cnm.clicknprofile.LogoutTest;
import com.cnm.clicknprofile.ProfileTest;
import com.cnm.clicknsecure.RiskGroupTest;
import com.cnm.clicknsecure.RiskMatrixTest;
import com.cnm.clicknsecure.RiskTest;
import com.cnm.clicknsecure.SecureSettingTest;
import com.cnm.clicknshare.AccessRolesTest;
import com.cnm.clicknshare.HomepageTest;
import com.cnm.clicknshare.ModelTest;
import com.cnm.clicknshare.SubOrganizationTest;
import com.cnm.clicknshare.UserTest;
import com.cnm.home.HistoryTest;
import com.cnm.home.HomeTest;
import com.cnm.report.ExtentReportsWithTestNG;

    public class SeleniumTestManager {
    	
    	ExtentReports extent = new ExtentReports();
    	ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
    	//	static WebDriver driver;
    	//	static ExtentReports report;
    	//	static ExtentTest test;
    	//static WebDriver driver = null;
    	WebDriver driver; 
    	
    @BeforeTest 
	public static void main(String[] args) throws InterruptedException{
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
    	
    WebDriver driver = new ChromeDriver();		
	final String SERVER_URL = "http://localhost:8080/";
	driver.get(SERVER_URL); 
	 
	//WebDriver driver = getChromeDriver(SERVER_URL); 
	
	// WebDriver webDriverManager;
	// webDriverManager = WebDriverManager.chromedriver();
	// webDriverManager.config().setCachePath("F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32");
         
    // webDriverManager.setup();
	
	//WebDriver driver = getFirefoxDriver(SERVER_URL); 
     
	//HistoryTest.updateHistoryTest(driver);
	//HomeTest.updateHomeTest(driver);
	//EmployeeTest.createEmployee(driver);
	//EmployeeTest.updateEmployee(driver);
	//TitleTest.createTitle(driver);
	//RoleTest.createRole(driver);
	//TitleTest.updateTitle(driver);
	//RoleTest.updateRole(driver);
	//DocumentGroupTest.createDocumentGroup(driver);
	//DocumentGroupTest.updateDocumentGroup(driver);
	//DocumentTest.createDocument(driver);
	//DocumentTest.updateDocument(driver);
	//FucntionTest.createFunction(driver);
	//FucntionTest.updateFunction(driver);
    //ProcedureTest.createProcedure(driver);
	//ProcedureTest.updateProcedure(driver);
	//PhasesTest.createPhases(driver);
	//PhasesTest.updatePhases(driver);
	//RequirementsTest.createRequirements(driver);
	//RequirementsTest.updateRequirements(driver);
	//ActSettingTest.createActSettingTest(driver);
	//ActSettingTest.updateActSettingTest(driver);
	//NonConformanceTest.createNonConformanceTest(driver);
	//NonConformanceTest.updateNonConformanceTest(driver);
	//ActionTest.createActionsTest(driver);
	//ActionTest.updateActionsTest(driver);
	//AccessRolesTest.createAcessRolesTest(driver);
	//AccessRolesTest.updateAcessRolesTest(driver);
	//UserTest.createUserTest(driver);
	//UserTest.updateUserTest(driver);
	//ModelTest.createModelTest(driver);
    //ModelTest.updateModelTest(driver);
	//HomepageTest.updateHomepageTest(driver);
	//SubOrganizationTest.createSubOrganizationTest(driver);
	//SubOrganizationTest.updateSubOrganizationTest(driver);
	//MaintainSettingTest.createMaintainSettingTest(driver);
	//MaintainSettingTest.updateMaintainSettingTest(driver);
	//AssetTest.createAssetTest(driver);
    //AssetTest.updateAssetTest(driver);
	//ProfileTest.updateProfileTest(driver);
	//LogoutTest.clickLogoutTest(driver); 
	//ChangePasswordTest.updateChangePassswordTest(driver);
	//SecureSettingTest.createSecureSettingTest(driver);
	//SecureSettingTest.updateSecureSettingTest(driver);
	//RiskMatrixTest.createRiskMatrixTest(driver);
	//RiskMatrixTest.updateRiskMatrixTest(driver);
    //RiskGroupTest.createRiskGroupTest(driver);
    //RiskGroupTest.updateRiskGroupTest(driver);
	//RiskTest.createRiskTest(driver);
    //RiskTest.updateRiskTest(driver);
	//logout(driver);
	//ExtentReportsWithTestNG.createExtentReportsWithTestNG(driver);
  
	}

	private static void logout(WebDriver driver) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("rubaet1@R");
			Thread.sleep(2000);
			
			//driver.findElement(By.id("rc-anchor-container")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.className("bigger-110")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("user-info")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[contains(.,'Logout')]")).click();
			Thread.sleep(2000);
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
	
	@Test
	private static WebDriver getChromeDriver(String serverUrl) throws InterruptedException {
		
			final String DRIVER_NAME = "webdriver.chrome.driver";
			System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			//final String DRIVER_URL =  "F:\\My Work\\Work Tools\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
			
			//System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);
		    
			System.out.println("Chrome driver found");
		    return driver;
	}
	
    private static WebDriver getFirefoxDriver(String serverUrl) {
		
			final String DRIVER_NAME = "webdriver.gecko.driver";
			//System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
			//final String DRIVER_URL = "F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\geckodriver.exe";
			
			//System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);
		
		return driver;		
		
	}
    
    @AfterTest
	public void tearDownTest() {
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}
	
}

    