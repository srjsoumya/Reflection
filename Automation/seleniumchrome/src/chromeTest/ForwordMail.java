package chromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwordMail {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("soumya6srj", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("sony1ericsson2");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		driver.findElement(By.xpath("//div[text()='Promotions']")).click();
		driver.findElement(By.xpath("//table[@class='F cf zt']/tbody/tr/td[5]/div[2]/span[contains(text(),'Paytm')]")).click();
		
		driver.findElement(By.xpath("//table[@class='cf gJ']/tbody/tr[1]/td[4]/div[2]/img")).click();
		driver.findElement(By.xpath("//div[@class='cj' and @act='25']")).click();
		
		driver.findElement(By.xpath("//table[@class='GS']/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("soumya6srj@gmail.com");
		driver.findElement(By.xpath("//table[@id=':sw' and @class='IZ']/tbody/tr/td[1]/div/*")).click();
		
		driver.findElement(By.xpath("//span[@class='gb_ab gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		driver.close();
	}

}
