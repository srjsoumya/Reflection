package firefoxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripCalender {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		
		driver.findElement(By.id("hp-widget__depart")).click();
		String d = "//td[@data-year='2018' and @data-month='1']/a[text()='27']";
		String x = "//div[@class='dateFilter hasDatepicker']// span[text()='Next']";
		int month = 0;
		while (month < 12) {
			try {
				driver.findElement(By.xpath(d)).click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath(x)).click();
				month++;
			}
		}
		if (month == 12)
			System.out.println("invalid entry");
	}

}
