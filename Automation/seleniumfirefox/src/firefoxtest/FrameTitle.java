package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTitle {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demos.telerik.com/aspnet-ajax/slider/examples/overview/defaultcs.aspx");
		for(int count=1;count<=6;count++)
		{
			driver.findElement(By.xpath("//div[@class='rslHorizontal rslMiddle']/a[contains(@id,\"RadSlider_Items\") and @title=\"Increase\"]/*")).click();
			Thread.sleep(500);
		}

	}

}
