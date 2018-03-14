package actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddNewTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();

		driver.findElement(By.xpath("//div[@class='addNewButton']/div[text()='Add New Task']")).click();
		driver.findElement(By.xpath("//div[text()='Create new tasks']")).click();

		driver.findElement(By.xpath("//div[contains(@id,'customerSelector')]//button")).click();
		driver.findElement(By.xpath("//a[text()='QSPIDER']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@id,'projectSelector')]//button")).click();
		driver.findElement(By.xpath("//a[text()='AUTOMATION TESTING']")).click();
		Thread.sleep(2000);

		String x = "//table[contains(@class,'createTasksTable')]/tbody/tr[1]/td[@class='nameCell first']/*";
		driver.findElement(By.xpath(x)).clear();
		driver.findElement(By.xpath(x)).sendKeys("REGRESSION TEST SCRIPT");

		driver.findElement(By.xpath("//table[contains(@class,'createTasksTable')]/tbody/tr[1]/td[3]/*")).click();
		driver.findElement(By.xpath("//div[contains(@class,'x-date-picker')]//button[@class='x-btn-text']")).click();
		String year = driver.findElement(By.xpath("//div[@class='x-date-mp']//tbody")).getText();
		while (true) {
			if (year.contains("2018"))
				break;
			else {
				driver.findElement(By.xpath("//a[@class='x-date-mp-next']")).click();
				Thread.sleep(2000);
				year = driver.findElement(By.xpath("//div[@class='x-date-mp']//tbody")).getText();
			}
		}
		try {
			driver.findElement(By.linkText("2018")).click();
			driver.findElement(By.linkText("Jan")).click();
			driver.findElement(By.xpath("//button[@class='x-date-mp-ok']")).click();
			driver.findElement(By.xpath("//a[@class='x-date-date']//span[text()='12']")).click();
		} catch (NoSuchElementException e) {
			System.out.println("Invalid Date Entered");
			driver.close();
		}

		driver.findElement(By.xpath("//span[text()='Create Tasks']")).click();
		driver.close();

	}

}
