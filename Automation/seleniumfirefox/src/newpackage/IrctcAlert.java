package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IrctcAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/home");
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
		String text=driver.findElement(By.className("rf-msg rf-msg-err")).getText();
		System.out.println(text);
		driver.findElement(By.id("loginerrorpanelok")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
