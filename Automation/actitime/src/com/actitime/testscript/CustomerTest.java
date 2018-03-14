package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.ExcelLib;
import com.actitime.objectrepositorylib.Login;

public class CustomerTest {
	@Test
	public void CreateCustomerTest() throws Throwable {
		ExcelLib eLib = new ExcelLib();

		String url = eLib.getExcelData("commonData", 2, 0);
		String userName = eLib.getExcelData("commonData", 0, 0);
		String password = eLib.getExcelData("commonData", 1, 0);
		String custName = eLib.getExcelData("testData", 0, 0);
		String proName = eLib.getExcelData("testData", 1, 0);

			
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Login li=PageFactory.initElements(driver, Login.class);
		li.login(driver,userName, password);

		String task = "//div[text()='TASKS']";
		Thread.sleep(4000);
		driver.findElement(By.xpath(task)).click();
		driver.findElement(By.xpath("//div[@class='addNewContainer']/div")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();

		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).clear();
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys(custName);

		driver.findElement(By.xpath("//div[@id='customerLightBox_commitBtn']/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='addNewContainer']/div")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Project')]")).click();

		driver.findElement(By.xpath("//input[@id='projectPopup_projectNameField']")).sendKeys(proName);
		driver.findElement(By.xpath("//tr[contains(@class,'x-btn-with-menu')]")).click();
		String proXpath = "//ul[@class='x-menu-list']/li/a[text()=\'" + custName + "\']";
		driver.findElement(By.xpath(proXpath)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Project')]")).click();

		Thread.sleep(3000);
		//To search the customer & project
		String str = "//div[text()='Customers & Projects']/following-sibling :: div[@class='searchFieldContainer']//input";
		driver.findElement(By.xpath(str)).sendKeys(proName, Keys.ENTER);
		
		driver.close();
	}
	@Test(dependsOnMethods="CreateCustomerTest")
	public void DeleteCustomerTest() throws Throwable {
		ExcelLib eLib = new ExcelLib();

		String url = eLib.getExcelData("commonData", 2, 0);
		String userName = eLib.getExcelData("commonData", 0, 0);
		String Password = eLib.getExcelData("commonData", 1, 0);
		String custName = eLib.getExcelData("testData", 0, 0);

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(url);

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(3000);
		String str = "//div[text()='Customers & Projects']/following-sibling :: div[@class='searchFieldContainer']//input";
		driver.findElement(By.xpath(str)).sendKeys(custName, Keys.ENTER);

		Actions act = new Actions(driver);
		Thread.sleep(4000);
		WebElement object = driver
				.findElement(By.xpath("//div[@class='filteredContainer']//div[@class='itemsContainer']/div[2]/div[4]"));

		Thread.sleep(1000);
		act.moveToElement(object).click().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']/div[1]/div[4]/div/div"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='taskListBlock']/div[2]/div[4]/div/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		driver.close();

	}

}
