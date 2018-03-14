package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);
		
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().window().maximize();
		String url="https://www.google.com/";
		driver.get(url);
		driver.findElement(By.className("gsfi")).sendKeys("apple",Keys.ENTER);
		Actions act=new Actions(driver);
		WebElement wb=driver.findElement(By.xpath("//a[text()='Apple (India)']"));
		act.contextClick(wb).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL),"t").perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.TAB)).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='iPhone']/..")).click();
			
	}

}
