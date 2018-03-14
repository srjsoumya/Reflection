package chromeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.className("gsfi")).sendKeys("apple");
		List<WebElement> lst=driver.findElements(By.xpath("//li[@class='sbsb_c gsfs']"));
	    Thread.sleep(3000);
	    for(int i=0;i<lst.size();i++)
	    {
	    	System.out.println(lst.get(i).getText());
	    }
		//lst.get(lst.size()-2).click();
		driver.close();
	}

}
