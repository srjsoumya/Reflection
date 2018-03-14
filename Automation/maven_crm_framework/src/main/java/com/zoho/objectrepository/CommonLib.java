package com.zoho.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonLib {
	/* log out */
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn;
	/**
	 * Logout From Application
	 */
	public void logout()
	{
		logoutBtn.click();
	}

}
