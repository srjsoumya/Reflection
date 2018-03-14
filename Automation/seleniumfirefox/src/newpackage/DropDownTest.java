package newpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://172.16.213.129:8080/crm/ShowHomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		WebElement web=driver.findElement(By.xpath("//select[@name='property(Lead Source)']"));
		Select sel=new Select(web);
		System.out.println(sel.getClass());
		System.out.println(driver.getClass());
		List<WebElement> lst=sel.getOptions();
		WebElement webel=sel.getFirstSelectedOption();
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
		System.out.println(webel.getText());
		System.out.println(lst.get(lst.size()-1).getText());
		driver.close();
	}

}
