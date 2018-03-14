package com.zoho.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.genericlib.BaseClass;
import com.zoho.genericlib.WebDriverCommonLib;

public class Lead extends BaseClass {
	/* New Lead */
	@FindBy(xpath="//input[@value='New Lead']")
	WebElement newLeadBtn;
	/* Save Top */
	@FindBy(xpath="//form[@name='createEntityForm']/table[3]//input[@value='Save']")
	WebElement saveTop;
	/* Save Button */
	@FindBy(xpath="//form[@name='createEntityForm']/table[10]//input[@value='Save']")
	WebElement saveButton;
	/* Save And New Button */
	@FindBy(xpath="//form[@name='createEntityForm']/table[3]//input[@value='Save & New']")
	WebElement saveNewTop;
	/* Save And New Button */
	@FindBy(xpath="//form[@name='createEntityForm']/table[10]//input[@value='Save & New']")
	WebElement saveNewButton;
	/* Cancel Button */
	@FindBy(xpath="//form[@name='createEntityForm']/table[3]//input[@value='Cancel']")
	WebElement cancelTop;
	/* Cancel Button */
	@FindBy(xpath="//form[@name='createEntityForm']/table[10]//input[@value='Cancel']")
	WebElement cancelButton;
	/* Company Txtbox */
	@FindBy(xpath="//input[@name='property(Company)']")
	WebElement companyTxt;
	/* Salutation Dropbox */
	@FindBy(xpath="//select[@name='property(saltName)']")
	WebElement saltNameDrop;
	/* First name Txtbox */
	@FindBy(xpath="//input[@name='property(First Name)']")
	WebElement firstNameTxt;
	/* Last name Txtbox */
	@FindBy(xpath="//input[@name='property(Last Name)']")
	WebElement lastNameTxt;
	/* Campaign Look up*/ 
	@FindBy(xpath="//img[@title='Campaign Name Lookup']")
	WebElement campLookUp;
	/**
	 * 
	 * @param company Company Name
	 * @param saltName Salutation 
	 * @param firstName First Name of Lead
	 * @param lastName Last Name Of Lead
	 * @param campaign Campaign name 
	 * @throws InterruptedException 
	 * It is used to create a lead 
	 */
	public void createLead(String company,String saltName,String firstName,String lastName,String campaign) throws InterruptedException
	{
		newLeadBtn.click();
		WebDriverCommonLib wlib=PageFactory.initElements(driver, WebDriverCommonLib.class);
		companyTxt.sendKeys(company);
		wlib.selectDropdown(saltNameDrop, saltName);
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(lastName);
		wlib.selectFromWindow(campLookUp, campaign);		
	}
	
	/**
	 * Save the Data
	 */
	public void saveTop()
	{
		saveTop.click();
	}
	

}
