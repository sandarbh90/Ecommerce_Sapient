package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class SavedAddressPage extends Common {
	
	private WebElement PageTitle;
	private WebElement BillingAddressDetail;
	private WebElement EditBillingAddress;
	private WebElement MailingAddressDetail;
	private WebElement EditMailingAddress;
	private WebElement RemoveAddress;
	private WebElement AddNewAddress;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String billingAddressDetail(WebDriver driver) {
		return getText(driver,BillingAddressDetail);
	}
	
	public String editBillingAddress(WebDriver driver) {
		return getText(driver,EditBillingAddress);
	}
	
	public String mailingAddressDetail(WebDriver driver) {
		return getText(driver,MailingAddressDetail);
	}
	
	public String editMailingAddress(WebDriver driver) {
		return getText(driver,EditMailingAddress);
	}
	
	public void removeAddress(WebDriver driver) {
		fnClick(driver,RemoveAddress);
	}
	
	public void addNewAddress(WebDriver driver) {
		fnClick(driver,AddNewAddress);
	}
}
