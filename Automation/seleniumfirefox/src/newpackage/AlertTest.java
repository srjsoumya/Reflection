package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement wb = null;
		try {
			wb = driver.findElement(By.xpath("//a[contains(@class,'close-modal')]"));
			wb.click();
		} catch (Exception e) {
			Thread.sleep(3000);
		} finally {
			Actions act = new Actions(driver);
			for (int i = 0; i < 6; i++) {
				act.sendKeys(Keys.ARROW_DOWN).perform();
			}
			WebElement wd = driver.findElement(By.xpath("//button[contains(text(),'Prompt')]"));
			act.click(wd).perform();
			Thread.sleep(3000);
			Alert alt = driver.switchTo().alert();
			alt.sendKeys("Yes");
			Thread.sleep(3000);
			alt.accept();
		}

	}

}
