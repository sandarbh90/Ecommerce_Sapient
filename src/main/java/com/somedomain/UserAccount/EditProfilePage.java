package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class EditProfilePage extends Common {
	
	private WebElement FName;
	private WebElement LName;
	private WebElement MobileNo;
	private WebElement DOB;
	private WebElement Submit;
	private WebElement Cancel;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void editFName(WebDriver driver, String fname) {
		clearTextBox(driver, FName);
		fnInput(driver,FName,fname);
	}
	
	public void editLName(WebDriver driver, String lname) {
		clearTextBox(driver, LName);
		fnInput(driver,LName,lname);
	}
	
	public void editMobileNo(WebDriver driver, String mobile) {
		clearTextBox(driver, MobileNo);
		fnInput(driver,MobileNo,mobile);
	}
	
	public void editDOB(WebDriver driver, String dob) {
		clearTextBox(driver, DOB);
		fnInput(driver,DOB,dob);
	}
	
	public void submit(WebDriver driver) {
		fnClick(driver,Submit);
	}

	public void cancel(WebDriver driver) {
		fnClick(driver,Cancel);
	}
}
