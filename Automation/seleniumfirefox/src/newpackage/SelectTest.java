package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		WebElement web =driver.findElement(By.id("continents"));
		Select sel=new Select(web);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		sel.selectByVisibleText("Europe");
		Thread.sleep(3000);
		List <WebElement> lst=sel.getOptions();
		for(int i=0;i<lst.size();i++)
		{
			String string =lst.get(i).getText();
			System.out.println(string);
			if(string.equals("Australia"))
			{
				lst.get(i).click();
			}
		}
		WebElement webel=driver.findElement(By.id("selenium_commands"));
		sel=new Select(webel);
		sel.selectByVisibleText("Browser Commands");
		sel.selectByVisibleText("Wait Commands");
		sel.selectByVisibleText("Switch Commands");
		lst=sel.getAllSelectedOptions();
		for(int j=0;j<lst.size();j++)
		{
			System.out.println(lst.get(j).getText());
		}
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.deselectAll();
		Thread.sleep(3000);
		driver.close();
	}

}
