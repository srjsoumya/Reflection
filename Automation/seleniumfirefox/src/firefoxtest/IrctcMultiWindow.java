package firefoxtest;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcMultiWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https:irctc.co.in");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Tourism"))).perform();
		act.click(driver.findElement(By.linkText("Cab"))).perform();
		driver.findElement(By.linkText("Counter Ticket Cancellation")).click();

		Set<String> set = driver.getWindowHandles();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		String cabId, cancelId;
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			cabId = it.next();
			driver.switchTo().window(cabId);
			if (driver.getTitle().contains("IRCTC Hotel India")) {
				System.out.println(cabId);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("withoutPnr")).click();
		Thread.sleep(2000);
		driver.close();

		while (it.hasNext()) {
			cancelId = it.next();
			driver.switchTo().window(cancelId);
			if (driver.getTitle().contains("Counter Ticket Cancellation")) {
				System.out.println(cancelId);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[contains(@id,'pnrid')]")).sendKeys("HELLO");
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(parentId);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();

	}
}
