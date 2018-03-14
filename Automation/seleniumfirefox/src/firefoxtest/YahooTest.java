package firefoxtest;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooTest {
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(100,400)");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		String x="//div[contains(text(),'Trending now')]/../../..//a[contains(@title,'Vijay Mallya')]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(x)));
		
		driver.findElement(By.xpath(x)).click();
		String title=driver.getTitle();
		if(title.contains("Vijay Mallya"))
			System.out.println("Page opened ----PASS");
		else
			System.out.println("Page not opened-----FAIL");
		driver.close();
	}

}
