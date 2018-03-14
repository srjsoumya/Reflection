package firefoxtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLoginTest {
	public static void login(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("srj.soumya@live.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10000);
		driver.manage().window().maximize();
	}

	public static void logout(WebDriver driver) throws InterruptedException {
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		Thread.sleep(5000);
	}

	public static void main(String[] args) throws InterruptedException {
		String expLogTitle = "Facebook – log in or sign up";
		String expHomeTitle = "Log in to Facebook | Facebook";

		/* Open Login page */
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		/* Verify Login */
		if (expLogTitle.equals(driver.getTitle())) {
			System.out.println("Login Page opened===PASS");
			login(driver);
			if (driver.getTitle().contains(expHomeTitle)) {
				System.out.println("Home page not opened ====FAILED");

			} else {
				System.out.println("Home page opened===PASS");
				logout(driver);

			}

		} else {
			System.out.println("Login Page not opened===FAIL");
		}

		Thread.sleep(5000);

		driver.close();

	}

}
