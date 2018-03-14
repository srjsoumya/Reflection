package com.actitime.testscript;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.genericlib.ExcelLib;
import com.actitime.objectrepositorylib.Login;

public class CreateUser {
	public static void main(String[] args) throws Throwable {
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
		
		//Retrieve customer name
		String expCustName = driver
				.findElement(By.xpath("//div[@class='filteredContainer']//div[contains(@class,'customerNode')]/div[3]"))
				.getText();
		System.out.println(expCustName);
		if (expCustName.contains(custName))
			System.out.println("Customer Is Verified----CUSTOMER PASS");
		else
			System.out.println("Customer Is not Verified----CUSTOMER FAIL");
		Thread.sleep(2000);
		//retrieve project name
		String expProjName = driver
				.findElement(By.xpath("//div[@class='filteredContainer']//div[contains(@class,'projectNode')]/div[2]"))
				.getText();
		System.out.println(expProjName);
		if (expProjName.contains(proName))
			System.out.println("Project created -----  PROJECT PASS");
		else
			System.out.println("Project not created ----- PROJECT FAIL");
		driver.close();

	}
}
