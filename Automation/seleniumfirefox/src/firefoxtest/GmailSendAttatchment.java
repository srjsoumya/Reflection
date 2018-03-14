package firefoxtest;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailSendAttatchment {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("automation.selenium2017", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("selenium");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		driver.findElement(By.xpath("//div[@class='nM']//div[text()='COMPOSE']")).click();
		
		
		driver.findElement(By.xpath("//table[@class='GS']//textarea[@aria-label='To']")).sendKeys("automation.selenium2017@gmail.com");
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("AUTOMATED MAIL").build().perform();
		String str="Hello This is automated mail";
		act.sendKeys(Keys.TAB).sendKeys(str).build().perform();
		driver.findElement(By.xpath("//table[@class='IZ']//td[4]/div/div[1]/div/div/div")).click();
		
		//Get the file Location
		StringSelection path=new StringSelection("C:\\Users\\SONYVAIO\\Desktop\\hello.txt");
		
		//Create a Object to Desktop tool
		Toolkit t=Toolkit.getDefaultToolkit();
		//get control of mouse cursor
		Clipboard clip=t.getSystemClipboard();
		//copy the location to clipboard
		clip.setContents(path, null);
		
		//create RObot class And copy the content
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.setAutoDelay(2000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_O);
		
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//r.setAutoDelay(2000);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//if Using snap to then comment above 2 line and uncomment below 2 line
//		r.mousePress(InputEvent.BUTTON1_MASK);
//		r.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='IZ']//div[text()='Send']")).click();
		
		
		
		
		
		
		
		
	}

}
