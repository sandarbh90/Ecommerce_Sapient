package com.somedomain.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class ForgotPasswordPage extends Common {
	
	private WebElement PageTitle;
	private WebElement Email;
	private WebElement SubmitBtn;
	private WebElement CancelBtn;
	private WebElement ConfirmationText;

	public String pageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void email(WebDriver driver, String email) {
		fnInput(driver,Email,email);
	}
	
	public void submitBtn(WebDriver driver) {
		fnClick(driver,SubmitBtn);
	}
	
	public void cancelBtn(WebDriver driver) {
		fnClick(driver,CancelBtn);
	}
	
	public String confirmationText(WebDriver driver) {
		return getText(driver,ConfirmationText);
	}

}
