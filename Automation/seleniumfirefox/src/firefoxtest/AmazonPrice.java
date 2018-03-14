package firefoxtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		//Get Number of Product 
		String str=driver.findElement(By.xpath("//h1[@id='s-result-count']")).getText();
		String []arrStr=str.split(" ");
		int noProduct=Integer.parseInt(arrStr[2].replace(",", ""));
		System.out.println("Number of Product is: "+noProduct);
		
		//Get price of a product
		String product="Apple iPhone 6 Unlocked Smartphone, 16 GB (Gold) (Certified Refurbished)";
		String xPth="//h2[text()=\'"+product+"\']/../../../..//span[@class='sx-price sx-price-large']";
		String strPrice=driver.findElement(By.xpath(xPth)).getText();
		String []arrPrice=strPrice.split(" ");
		String  strPrice1=arrPrice[1]+"."+arrPrice[2];
		strPrice1=strPrice1.replace(",", "");
		Double price=Double.parseDouble(strPrice1);
		System.out.println("Price of Product in Us Dollar = $"+price);
		System.out.printf("Price of Product in Indian Rupee = Rs%.2f",price*64.41);
		//driver.close();

	}

}
