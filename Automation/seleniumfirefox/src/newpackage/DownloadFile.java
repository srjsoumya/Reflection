package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/soumyavaio/selenium/geckodriver");
		FirefoxOptions option =new FirefoxOptions();
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 1);
		profile.setPreference("browser.helperApp.neverAsk.saveToDisk", "application/x-gzip");
		option.addPreference("browser.download.folderList", 1);
		option.addPreference("browser.helperApp.neverAsk.saveToDisk", "application/x-gzip");
		

		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.apache.org/dyn/closer.lua/poi/release/bin/poi-bin-3.17-20170915.tar.gz");
		driver.findElement(By.linkText("http://www-eu.apache.org/dist/poi/release/bin/poi-bin-3.17-20170915.tar.gz")).click();
		

	}
}
