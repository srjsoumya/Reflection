package firefoxtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YahooTopStory {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		//Wait for the Element to load 
		String x="//ul[contains(@class,'trendTrs')]/li/a";
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(x)));
		
		//Fetch all the WebElement of Top 10 list
		List <WebElement> lst= driver.findElements(By.xpath(x));
		
		//Display The Results
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
				
		//Close the browser
		driver.close();
				
	}

}
