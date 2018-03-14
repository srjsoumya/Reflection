package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFile {
	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.helperApp.neverAsk.saveToDisk", "application/exe");
		profile.setPreference("browser.download.dir", "e://");
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);

		WebDriver driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.mozilla.org/en-US/firefox/new/");
		driver.findElement(By.xpath("//div[@class='main-download']//li[@class='os_win']//strong")).click();
		

	}
}
