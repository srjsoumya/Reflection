package com.zoho.genericlib;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseClass {
	/**
	 * 
	 * @param selWb WebElement of Dropdown
	 * @param text Visible Text
	 * Select A element from Dropdown in Application
	 */
	public void selectDropdown(WebElement selWb ,String text){
		Select sel = new Select(selWb);
		sel.selectByVisibleText(text);
	}
	/**
	 * Move mouse to Element
	 * @param element WebElement Mouse To move
	 * Move mouse to a element in Application
	 */
	public void moveMouseToElement(WebElement element){
		Actions act = new Actions(BaseClass.driver);
		act.moveToElement(element).perform();
	}
	/**
	 * Wait for the element to load
	 */
	public void waitForPageToLoad(){
		driver.manage().timeouts(). implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * Wait for the element to visible
	 * @param element Element to wait
	 */
	public void waitForElementPresent(WebElement element){
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * Select a link from Lookup
	 * @param element LookUp WebElement
	 * @param link Link value
	 * @throws InterruptedException
	 */
	public void selectFromWindow(WebElement element,String link) throws InterruptedException
	{
		element.click();
		Thread.sleep(4000);
		Set<String> set= driver.getWindowHandles();
		Iterator <String> itr=set.iterator();
		String parentid=itr.next();
		String childWin=itr.next();
		driver.switchTo().window(childWin);
		driver.findElement(By.linkText(link)).click();
		driver.switchTo().window(parentid);
	}

}




