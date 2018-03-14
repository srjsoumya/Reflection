package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		driver.findElement(By.className("gsfi")).sendKeys("Wipro careers", Keys.ENTER);
		Actions act = new Actions(driver);
		WebElement wb = driver.findElement(By.linkText("Job Search"));
		act.contextClick(wb).sendKeys("T").build().perform();

	}

}
