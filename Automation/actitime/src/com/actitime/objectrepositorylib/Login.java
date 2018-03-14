package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	@FindBy(id="username") WebElement userNameEdt;
	@FindBy(name="pwd") WebElement passwordEdt;
	@FindBy(id="loginButton") WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox") WebElement keepmeChk;
	
	public void login(WebDriver driver,String userName,String password)
	{
		Actions act=new Actions(driver);
		userNameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		act.click(loginBtn).perform();
	}
	
	

}
