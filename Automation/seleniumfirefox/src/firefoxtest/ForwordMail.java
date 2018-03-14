package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ForwordMail {
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		
		//Enter into Gmail App
		driver.findElement(By.id("identifierId")).sendKeys("automation.selenium2017", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		//Open first Email in Inbox
		// driver.findElement(By.xpath("//div[text()='Promotions']")).click();//To choose Promotion Tab delete comment line
		driver.findElement(By.xpath("//table[@class='F cf zt']/tbody/tr[1]/td[4]/div[2]/span")).click();
		Thread.sleep(5000);
		
		//Click on forward Button
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//table[@class='cf gJ']//img[@role='menu']")).click();
		Thread.sleep(2000);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		//Give Email address to send
		driver.findElement(By.xpath("//table[@class='GS']//textarea")).sendKeys("automation.selenium2017@gmail.com");
		driver.findElement(By.xpath("//table[@class='IZ']//div[text()='Send']")).click();
		Thread.sleep(2000);
		
		//Go back to Inbox
		act.moveToElement(driver.findElement(By.xpath("//div[@class='aim ain']//a[contains(text(),'Inbox')]"))).click().build().perform();;
		
		//Logout
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

		 driver.close();
	}

}
