package firefoxtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonProduct {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 8", Keys.ENTER);

		String x = "//ul[@id='s-results-list-atf']//h2";
		List<WebElement> lst = driver.findElements(By.xpath(x));
		ArrayList<String> sortList = new ArrayList<String>();

		for (int i = 0; i < lst.size(); i++) {
			sortList.add(lst.get(i).getText());
		}

		Collections.sort(sortList);

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(sortList.get(i));
		}

		driver.close();
	}

}
