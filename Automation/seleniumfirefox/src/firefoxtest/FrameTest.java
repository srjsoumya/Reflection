package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");

		WebElement wb1 = driver.findElement(By.xpath("//frame[@name='classFrame']"));

		driver.switchTo().frame(wb1);
		driver.getTitle();
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		System.out.println(driver.getTitle());

		driver.close();

	}

}
