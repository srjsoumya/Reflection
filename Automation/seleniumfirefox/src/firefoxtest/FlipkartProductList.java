package firefoxtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartProductList {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("iphone 8",Keys.ENTER);
		List<WebElement> nameList=driver.findElements(By.xpath("//div[contains(@class,'Iqu row')]/div[1]/div[1]"));
		List<WebElement> priceList=driver.findElements(By.xpath("//div[contains(@class,'Iqu row')]/div[2]/div[1]/div[1]/div[1]"));
		
		for(int i=0;i<nameList.size();i++)
		{
			System.out.println(nameList.get(i).getText()+"   Price:- "+"\u20B9"+priceList.get(i).getText());  
		}
		driver.close();

	}

}
