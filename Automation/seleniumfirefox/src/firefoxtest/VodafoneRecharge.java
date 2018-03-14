package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VodafoneRecharge {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Open Vodafone Page
		driver.get("https://vodafone.in");
		
		//Close popUp Window
		driver.findElement(By.xpath("//a[@class='closeBtn mv_closeBtn']")).click();
		
		
		//Recharged Offer
		driver.findElement(By.xpath("//h3[contains(text(),'Prepaid Offers')]/../a")).click();
		
		
		//Enter Phone number  
		driver.findElement(By.xpath("//input[@id='mobileNum']")).sendKeys("9619477620");
		
		//choose recharged option		
		driver.findElement(By.xpath("//p[contains(text(),'RC146')]/../../div[2]/div/a")).click();
		
		
		//Authenticate Test Case
		String strUrl=driver.getCurrentUrl();
		if(strUrl.contains("billdesk.com"))
			System.out.println("Payment Page Showed------PASS");
		else
			System.out.println("Payment Page not Showed------FAIL");
		//Close The Browser 
		driver.close();
		

	}

}
