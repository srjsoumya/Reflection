package com.zoho.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLib {
	/* username EditBox */
	@FindBy(id = "userName")
	WebElement usernameEdt;
	/* Password Editbox */
	@FindBy(id = "passWord")
	WebElement paswordEdt;
	/* Remember me checkbox */
	@FindBy(name = "j_remember")
	WebElement rememberChk;
	/* sign in Button */
	@FindBy(xpath = "//input[@title='Sign In']")
	WebElement signinBtn;
	/* forget password link */
	@FindBy(xpath = "//a[contains(text(),'Forgot Password')]")
	WebElement forgetPsdLnk;
	/**
	 * 
	 * @param username  UserName of The Application
	 * @param password Password of The Application
	 * @throws InterruptedException 
	 * @throws Throwable
	 * It is used to login to the Application
	 */
	public void login(String username, String password) throws InterruptedException  {
		usernameEdt.sendKeys(username);
		paswordEdt.sendKeys(password);
		Thread.sleep(3000);
		signinBtn.click();
	}

}
