package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookMessenger {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://facebook.com");

		// Enter credential to facebook
		driver.findElement(By.id("email")).sendKeys("email");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// open facebook messenger
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class='fbChatTypeahead flipped']/div/div[3]/a")));
		driver.findElement(By.xpath("//div[@class='fbChatTypeahead flipped']/div/div[3]/a")).click();

		// Search receiver name
		String x = "//div[contains(@class,'fbDockChatTabFlyout')]//div[@class='uiTypeahead']/div/div/input";
		driver.findElement(By.xpath(x)).sendKeys("Amit Sinha");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		// navigate to message textbox
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER).perform();

		// Type and Send the message
		act.sendKeys("Automated text").perform();
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys("Automated text").perform();
		act.sendKeys(Keys.ENTER).perform();

	}
}