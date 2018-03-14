package com.zoho.testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zoho.genericlib.BaseClass;
import com.zoho.genericlib.ExcelLib;
import com.zoho.objectrepository.Lead;
import com.zoho.objectrepository.TabLib;

/**
 * 
 * @author SOUMYA
 *
 */
@Listeners(com.zoho.genericlib.SampleListenter.class)
public class CreateLeadTest extends BaseClass {
	@Test
	public void createlead() throws Throwable {
		ExcelLib excel = PageFactory.initElements(driver, ExcelLib.class);

		String company = excel.getExcelData("lead", 0, 1);
		String saltName = excel.getExcelData("lead", 1, 1);
		String firstName = excel.getExcelData("lead", 2, 1);
		String lastName = excel.getExcelData("lead", 3, 1);
		String campaign = excel.getExcelData("lead", 4, 1);
		Reporter.log("Navigate to Lead Tab");
		TabLib tl = PageFactory.initElements(driver, TabLib.class);
		tl.navigateToLeads();
		Thread.sleep(3000);
		Lead led = PageFactory.initElements(driver, Lead.class);
		Reporter.log("Create a lead using necessary field");
		led.createLead(company, saltName, firstName, lastName, campaign);
		Thread.sleep(3000);
		Reporter.log("save the lead page");
		led.saveTop();
	}

}
