package newpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileUploadTest {
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.monsterindia.com/");
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		driver.findElement(By.id("wordresume")).click();
		
		StringSelection path=new StringSelection("C:\\Users\\SONYVAIO\\Desktop\\hello.txt");
		Toolkit tool=Toolkit.getDefaultToolkit();
		Clipboard clip=tool.getSystemClipboard();
		clip.setContents(path, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
	}

}
