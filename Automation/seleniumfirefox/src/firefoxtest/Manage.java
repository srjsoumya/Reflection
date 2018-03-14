package firefoxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manage {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:irctc.co.in");

		int cnt = driver.findElements(By.tagName("a")).size();
		System.out.println(cnt);
	}

}
