package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class AddGiftCardPage extends Common {
	
	private WebElement PageTitle;
	private WebElement EnterCode;
	private WebElement ApplyBtn;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void enterCode(WebDriver driver, String voucher) {
		fnInput(driver,EnterCode,voucher);
	}
	
	public void applyBtn(WebDriver driver) {
		fnClick(driver,ApplyBtn);
	}

}
