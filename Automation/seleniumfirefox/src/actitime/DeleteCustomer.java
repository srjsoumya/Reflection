package actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteCustomer {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://localhost/login.do");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
		Thread.sleep(3000);
		String str="//div[text()='Customers & Projects']/following-sibling :: div[@class='searchFieldContainer']//input";
		driver.findElement(By.xpath(str)).sendKeys("HDFC",Keys.ENTER);
		
		Actions act = new Actions(driver);
//		String move="//div[@class='itemsContainer']/div[2]/div[3]";
//		act.moveToElement(driver.findElement(By.xpath(move))).click().perform();
		Thread.sleep(4000);
		WebElement object = driver.findElement(By.xpath("//div[@class='filteredContainer']//div[@class='itemsContainer']/div[2]/div[4]"));
		
		Thread.sleep(1000);
		act.moveToElement(object).click().perform();
		Thread.sleep(1000);
		WebElement wb2 = driver.findElement(
				By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']/div[1]/div[4]/div/div"));
		wb2.click();
		Thread.sleep(1000);
		WebElement wb3 = driver.findElement(By.xpath("//div[@id='taskListBlock']/div[2]/div[4]/div/div[3]"));
		wb3.click();
		Thread.sleep(1000);
		WebElement wb4 = driver.findElement(By.xpath("//span[text()='Delete permanently']"));
		wb4.click();
		driver.close();
	}
}
