package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstRechargeOption {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Open Vodafone Page
		driver.get("https://vodafone.in");

		// Close popUp Window
		driver.findElement(By.xpath("//a[@class='closeBtn mv_closeBtn']")).click();

		// Recharged Offer
		driver.findElement(By.xpath("//h3[contains(text(),'Prepaid Offers')]/../a")).click();

		// Enter Phone number
		driver.findElement(By.xpath("//input[@id='mobileNum']")).sendKeys("9619477620");
		// driver.findElement(By.xpath("//div[@class='rowFrm
		// leftSpace']/a[@id='rechargePromoOtp']")).click();
		Thread.sleep(5000);

		// choose recharged option
		for (int i = 1; i <= 10; i++) {
			String x = "//div[@class='offersBoxes']/div[" + i + "]/div[2]/div/a";
			WebElement wb = driver.findElement(By.xpath(x));
			if (wb.getText().contains("Buy now")) {
				System.out.println(wb.getText());
				wb.click();
				break;
			}
		}

		// Authenticate Test Case
		String strUrl = driver.getCurrentUrl();
		if (strUrl.contains("billdesk.com")) {
			System.out.println("Payment Page Showed------PASS");
			String amount = driver.findElement(By.xpath("//div[@class='box box-primary']/div[2]/strong")).getText();
			System.out.println("Number Recharged with Rs " + amount);
		} else
			System.out.println("Payment Page not Showed------FAIL");
		// Close The Browser
		driver.close();
	}

}
