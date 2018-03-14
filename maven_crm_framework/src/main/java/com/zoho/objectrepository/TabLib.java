package com.zoho.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabLib {
	/* Leads Tab */
	@FindBy(xpath = "//a[text()='Leads']")
	WebElement leadTab;
	/* Accounts Tab */
	@FindBy(xpath = "//a[text()='Accounts']")
	WebElement accountsTab;
	/* Contacts Tab */
	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement contactsTab;
	/* Potentials Tab */
	@FindBy(xpath = "//a[text()='Potentials']")
	WebElement potentialsTab;
	/* Campaigns Tab */
	@FindBy(xpath = "//a[text()='Campaigns']")
	WebElement campaignsTab;
	/* Reports Tab */
	@FindBy(xpath = "//a[text()='Reports']")
	WebElement reportsTab;
	/* Dashboards Tab */
	@FindBy(xpath = "//a[text()='Dashboards']")
	WebElement dashboardsTab;
	/* Forecasts Tab */
	@FindBy(xpath = "//a[text()='Forecasts']")
	WebElement forecastsTab;
	/* Activities Tab */
	@FindBy(xpath = "//a[text()='Activities']")
	WebElement activitiesTab;
	/* Products Tab */
	@FindBy(xpath = "//a[text()='Products']")
	WebElement productsTab;
	/* Cases Tab */
	@FindBy(xpath = "//a[text()='Cases']")
	WebElement casesTab;
	/* Solutions Tab */
	@FindBy(xpath = "//a[text()='Solutions']")
	WebElement solutionsTab;
	/* Vendors Tab */
	@FindBy(xpath = "//a[text()='Vendors']")
	WebElement vendorsTab;
	/* Price Books Tab */
	@FindBy(xpath = "//a[text()='Price Books']")
	WebElement priceBooksTab;
	/* Quotes Tab */
	@FindBy(xpath = "//a[text()='Quotes']")
	WebElement quotesTab;
	/* Sales Orders Tab */
	@FindBy(xpath = "//a[text()='Sales Orders']")
	WebElement salesOrdersTab;
	/* Purchase Orders Tab */
	@FindBy(xpath = "//a[text()='Purchase Orders']")
	WebElement purchaseOrdersTab;
	/* Invoices Tab */
	@FindBy(xpath = "//a[text()='Invoices']")
	WebElement invoicesTab;
	/* Scroll Right*/
	@FindBy(id = "scrollright")
	WebElement scrollRight;
	/* Scroll Left */
	@FindBy(id = "scrollleft")
	WebElement scrollLeft;

	public void navigateToLeads() {
		leadTab.click();
	}

	public void navigateToAccounts() {
		accountsTab.click();
	}

	public void navigateToContacts() {
		contactsTab.click();
	}

	public void navigateToPotentials() {
		potentialsTab.click();
	}

	public void navigateToCampaigns() {
		campaignsTab.click();
	}

	public void navigateToReports() {
		reportsTab.click();
	}

	public void navigateToDashboards() {
		dashboardsTab.click();
	}

	public void navigateToForecasts() {
		forecastsTab.click();
	}

	public void navigateToActivities() {
		activitiesTab.click();
	}

	public void navigateToProducts() {
		productsTab.click();
	}

	public void navigateToCases() {
		casesTab.click();
	}

	public void navigateToSolutions() {
		solutionsTab.click();
	}

	public void navigateToVendors() {
		vendorsTab.click();
	}

	public void navigateToPriceBooks() {
		priceBooksTab.click();
	}

	public void navigateToQuotes() {
		quotesTab.click();
	}

	public void navigateToSalesOrders() {
		salesOrdersTab.click();
	}

	public void navigateToPurchaseOrders() {
		purchaseOrdersTab.click();
	}

	public void navigateToInvoices() {
		invoicesTab.click();
	}

	public void arrowRight() {
		for (int i = 0; i < 20; i++) {
			scrollRight.click();
		}
	}
	public void arrowLeft() {
		for (int i = 0; i < 20; i++) {
			scrollLeft.click();
		}
	}

}
