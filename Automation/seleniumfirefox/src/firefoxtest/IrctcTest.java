package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcTest {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://irctc.co.in");
		WebElement twb=driver.findElement(By.linkText("Tourism"));
		Actions act=new Actions(driver); 
		act.moveToElement(twb);
		act.perform();
		driver.findElement(By.linkText("Cab")).click();
		
		driver.close();
	}

}
