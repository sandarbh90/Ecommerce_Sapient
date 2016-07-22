package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class ReturnOrderPage extends Common{
	
	private WebElement OrderId;
	private WebElement OrderDetail;
	private WebElement OrderAmount;
	private WebElement ReturnPolicy;
	private WebElement Issue;
	private WebElement IssueDetail;
	private WebElement Comments;
	private WebElement ModeOfRefund;
	private WebElement ConfirmationCheckBox;
	private WebElement ConfirmLink;
	private WebElement CancelLink;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	
	public String orderID(WebDriver driver) {
		return getText(driver,OrderId);
	}
	
	public String orderDetail(WebDriver driver) {
		return getText(driver,OrderDetail);
	}
	
	public String orderAmount(WebDriver driver) {
		return getText(driver,OrderAmount);
	}
	
	public void returnPolicy(WebDriver driver) {
		fnClick(driver,ReturnPolicy);
	}
	
	public void issue(WebDriver driver, String value) {
		selectDropDown(driver,Issue,value);
	}
	
	public void issueDetail(WebDriver driver, String value) {
		selectDropDown(driver,IssueDetail,value);
	}
	
	public void comments(WebDriver driver, String Comment) {
		fnInput(driver,Comments,Comment);
	}
	
	public void modeOfRefund(WebDriver driver) {
		fnClick(driver,ModeOfRefund);
	}
	
	public void confirmationCheckBox(WebDriver driver) {
		fnClick(driver,ConfirmationCheckBox);
	}
	
	public void confirmLink(WebDriver driver) {
		fnClick(driver,ConfirmLink);
	}
	
	public void cancelLink(WebDriver driver) {
		fnClick(driver,CancelLink);
	}
}
