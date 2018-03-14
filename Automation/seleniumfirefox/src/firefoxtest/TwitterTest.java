package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
		driver.findElement(By.xpath("//div[@class='clearfix field']/input[@type='text']")).sendKeys("srj.soumya@gmail.com");
		driver.findElement(By.xpath("//div[@class='clearfix field']/input[@type='password']")).sendKeys("folder2lock1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		driver.findElement(By.id("search-query")).sendKeys("potus");
		driver.findElement(By.xpath("//span[text()='Search Twitter']/..")).click();
		driver.findElement(By.xpath("//a[contains(text(),'People')]")).click();
		Thread.sleep(4000);
		//String xpath="//span[@class='username u-dir' and text()='@']/b[text()='POTUS']/../../../../../div[1]/div/div/div/span[2]/button[1]";//To follow
		String xpath="//span[@class='username u-dir' and text()='@']/b[text()='POTUS']/../../../../div[1]/div/a";//To open profile page
		
		driver.findElement(By.xpath(xpath)).click();
		
		
		
		
	}

}
