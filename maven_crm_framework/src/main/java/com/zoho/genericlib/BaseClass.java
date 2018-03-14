package com.zoho.genericlib;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.zoho.objectrepository.CommonLib;
import com.zoho.objectrepository.LoginLib;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	/*@BeforeSuite
	public void configBS() {
		// Report Configuration before generating extent log
		extent = new ExtentReports("test-output/adv_report.html");
		extent.loadConfig(new File("src/main/resources/extent-config.xml"));
	}*/

	@Parameters("browser")
	@BeforeClass
	public void configBeforeClass(String browser) throws Throwable {
		ExcelLib elib = new ExcelLib();
		if (browser.equals("firefox")) {
			Reporter.log("Open The Browser");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\resource\\chromedriver.exe");
			Reporter.log("Open The Browser");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		String url = elib.getExcelData("commondata", 0, 1);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@BeforeMethod
	public void configBm() throws Throwable {
		ExcelLib elib = new ExcelLib();
		String userName = elib.getExcelData("commondata", 1, 1);
		String password = elib.getExcelData("commondata", 2, 1);
		Reporter.log("Login To The Application");
		LoginLib lp = PageFactory.initElements(driver, LoginLib.class);
		lp.login(userName, password);
	}

	@AfterMethod
	public void configAM() {
		// logout
		Reporter.log("Logout From The Application");
		CommonLib cp = PageFactory.initElements(driver, CommonLib.class);
		cp.logout();
	}

	@AfterClass
	public void configAc() {
		Reporter.log("Close The Browser");
		driver.close();
	}

	/*@AfterSuite
	public void configAS() {
		extent.flush();
		extent.close();
	}*/

}
