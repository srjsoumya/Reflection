package actitime;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateUser {
	public static void main(String[] args) throws Throwable {
		String path = "E:\\excel\\LoginActitime.xlsx";
		//
		FileInputStream fis = new FileInputStream(path);
		//
		Workbook wb = WorkbookFactory.create(fis);
		//
		Sheet sh = wb.getSheet("Sheet1");
		//
		Row row = sh.getRow(1);
		//
		String url = row.getCell(1).getStringCellValue();
		String userName = row.getCell(2).getStringCellValue();
		String Password = row.getCell(3).getStringCellValue();
		String custName = row.getCell(4).getStringCellValue();
		String proName = row.getCell(5).getStringCellValue();

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

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
		String str = "//div[text()='Customers & Projects']/following-sibling :: div[@class='searchFieldContainer']//input";
		driver.findElement(By.xpath(str)).sendKeys(proName, Keys.ENTER);

		String expCustName = driver.findElement(By.xpath("//div[@class='filteredContainer']//div[contains(@class,'customerNode')]/div[3]")).getText();
		System.out.println(expCustName);
		if (expCustName.contains(custName))
			System.out.println("Customer Is Verified----CUSTOMER PASS");
		else
			System.out.println("Customer Is not Verified----CUSTOMER FAIL");
		Thread.sleep(2000);
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
