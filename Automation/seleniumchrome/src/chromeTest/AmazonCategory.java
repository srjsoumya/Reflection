package chromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCategory {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement category=driver.findElement(By.xpath("//span[text()='Category']"));
		Actions act=new Actions(driver);
		act.moveToElement(category);
		act.perform();
		
		WebElement menu=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(menu);
		act.perform();
		
		driver.findElement(By.xpath("//span[text()='All Mobile Phones']")).click();

}
}