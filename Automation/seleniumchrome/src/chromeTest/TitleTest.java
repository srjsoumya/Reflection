package chromeTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.get("https://facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		Dimension dim = new Dimension(100, 400);

		driver.manage().window().setSize(dim);
		if (driver.getTitle().equals("Gmail"))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		// driver.close();
	}

}
