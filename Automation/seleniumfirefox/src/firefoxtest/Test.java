package firefoxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
/**
 * 
 * @param string
 * take String value And return respective integer value
 * @return integer
 */
	public static int stringToInt(String string) {
		String outstr = "";
		int integer;
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (Character.isDigit(ch)) {
				outstr += ch;
			}
		}
		integer = Integer.parseInt(outstr);
		return integer;
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// open Amazon app
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);

		// search iphone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7", Keys.ENTER);
		Thread.sleep(5000);

		// find product price
		String x1 = "//h2[text()='Apple iPhone 7 (Jet Black, 128GB)']/../../../../div[4]/div[1]/a/span[2]";
		String x2 = "//h2[text()='Apple iPhone 7 (Jet Black, 128GB)']/../../../../div[4]/div[1]/span[2]";
		String disPrice = driver.findElement(By.xpath(x1)).getText();
		String actPrice = driver.findElement(By.xpath(x2)).getText();

		System.out.println(disPrice);
		System.out.println(actPrice);
		// print the values
		int intDisPrice = stringToInt(disPrice);
		int intActPrice = stringToInt(actPrice);
		System.out.println("Discounted Price of Apple iPhone 7 (Jet Black, 128GB) is: Rs " + intDisPrice);
		System.out.println("Actual Price of Apple iPhone 7 (Jet Black, 128GB) is: Rs " + intActPrice);

		System.out.println("Discounted price is: " + (intActPrice - intDisPrice));

		driver.close();

	}

}
