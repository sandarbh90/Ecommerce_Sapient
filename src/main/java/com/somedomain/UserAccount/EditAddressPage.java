package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class EditAddressPage extends Common {
	
	private WebElement PageTitle;
	private WebElement ZipCode;
	private WebElement Name;
	private WebElement Address;
	private WebElement City;
	private WebElement State;
	private WebElement Mobile;
	private WebElement ConfirmationCheckBox;
	private WebElement SaveBtn;
	private WebElement CancelBtn;
	

	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void editZipCode(WebDriver driver, String zip) {
		clearTextBox(driver, ZipCode);
		fnInput(driver,ZipCode,zip);
	}
	
	public void editAddress(WebDriver driver, String address) {
		clearTextBox(driver, Address);
		fnInput(driver,Address,address);
	}
	
	public void editName(WebDriver driver, String name) {
		clearTextBox(driver, Name);
		fnInput(driver,Name,name);
	}
	
	public void editCity(WebDriver driver, String city) {
		clearTextBox(driver, City);
		fnInput(driver,City,city);
	}
	
	public void editState(WebDriver driver, String state) {
		clearTextBox(driver, State);
		fnInput(driver,State,state);
	}
	
	public void editMobile(WebDriver driver, String mobile) {
		clearTextBox(driver, Mobile);
		fnInput(driver,Mobile,mobile);
	}
	
	public void confirmationCheckBox(WebDriver driver) {
		fnClick(driver,ConfirmationCheckBox);
	}
	
	public void saveBtn(WebDriver driver) {
		fnClick(driver,SaveBtn);
	}
	
	public void cancelBtn(WebDriver driver) {
		fnClick(driver,CancelBtn);
	}

}
