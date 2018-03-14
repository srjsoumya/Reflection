package com.actitime.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.genericlib.ExcelLib;

public class DeleteCustomer {
	public static void main(String[] args) throws Throwable {
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
