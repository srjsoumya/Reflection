package firefoxtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteAllInboxMsg {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("email", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//div[text()='Promotions']")).click();
		String x = "//table[@class='F cf zt']/tbody/tr/td[2]/div";
		List<WebElement> lst = driver.findElements(By.xpath(x));

		while (lst.size() != 0) {
			for (int i = 0; i < lst.size(); i++) {
				lst.get(i).click();
			}
			driver.findElement(By.xpath("//div[@class='G-tF']/div[2]/div[3]/div")).click();
			Thread.sleep(5000);
			lst = driver.findElements(By.xpath(x));
		}
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();

		driver.close();
	}

}
