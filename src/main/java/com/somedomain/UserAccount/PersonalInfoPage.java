package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class PersonalInfoPage extends Common {

	private WebElement Name;
	private WebElement Email;
	private WebElement Password;
	private WebElement ChangePasswordLink;
	private WebElement MobileNo;
	private WebElement DOB;
	private WebElement EditProfile;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String name(WebDriver driver) {
		return getText(driver,Name);
	}
	
	public String email(WebDriver driver) {
		return getText(driver,Email);
	}
	
	public String password(WebDriver driver) {
		return getText(driver,Password);
	}
	
	public String mobileNo(WebDriver driver) {
		return getText(driver,MobileNo);
	}
	
	public String dOB(WebDriver driver) {
		return getText(driver,DOB);
	}
	
	public void changePasswordLink(WebDriver driver) {
		fnClick(driver,ChangePasswordLink);
	}
	
	public void editProfile(WebDriver driver) {
		fnClick(driver,EditProfile);
	}
}
