package firefoxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String args[]) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("automation.selenium2017");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("selenium");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='COMPOSE']")).click();
		Thread.sleep(10000);

		driver.findElement(By.className("vO")).sendKeys("automation.selenium2017@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("testing mail");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("HELLO HELLO HELLO");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='gb_b gb_fb gb_R']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		Thread.sleep(10000);
		//driver.close();
	}

}
