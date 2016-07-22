package com.somedomain.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class SignUpPage extends Common {
	
	private WebElement FirstName;
	private WebElement LastName;
	private WebElement Email;
	private WebElement Password;
	private WebElement DOB;
	private WebElement MOB;
	private WebElement YOB;
	private WebElement Gender;
	private WebElement Mobile;
	private WebElement PreferencesCheckBox1;
	private WebElement PreferencesCheckBox2;
	private WebElement JoinBtn;
	private WebElement TermsConditions;
	private WebElement AcceptConditions;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void firstName(WebDriver driver, String FName) {
		fnInput(driver,FirstName,FName);
	}
	
	public void lastName(WebDriver driver, String LName) {
		fnInput(driver,LastName,LName);
	}
	
	public void email(WebDriver driver, String email) {
		fnInput(driver,Email,email);
	}
	
	public void Password(WebDriver driver, String Pswrd) {
		fnInput(driver,Password,Pswrd);
	}
	
	public void dateOfBirth(WebDriver driver, String date) {
		selectDropDown(driver,DOB,date);
	}
	
	public void monthOfBirth(WebDriver driver, String month) {
		selectDropDown(driver,MOB,month);
	}
	
	public void yearOfBirth(WebDriver driver, String year) {
		selectDropDown(driver,YOB,year);
	}
	
	public void Gender(WebDriver driver) {
		fnClick(driver,Gender);
	}
	
	public void mobile(WebDriver driver, String mNumber) {
		fnInput(driver,Mobile,mNumber);
	}
	
	public void preferencesCheckBox1(WebDriver driver) {
		fnClick(driver,PreferencesCheckBox1);
	}
	
	public void preferencesCheckBox2(WebDriver driver) {
		fnClick(driver,PreferencesCheckBox2);
	}
	
	public void joinBtn(WebDriver driver) {
		fnClick(driver,JoinBtn);
	}
	
	public void termsConditions(WebDriver driver) {
		fnClick(driver,TermsConditions);
	}
	
	public void acceptConditions(WebDriver driver) {
		fnClick(driver,AcceptConditions);
	}
}
