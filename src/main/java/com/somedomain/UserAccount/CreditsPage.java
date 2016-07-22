package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class CreditsPage extends Common{
	
	private WebElement PageTitle;
	private WebElement Credits;
	private WebElement AddGiftCard;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String Availablecredits(WebDriver driver) {
		return getText(driver,Credits);
	}
	
	public void addGiftCard(WebDriver driver) {
		fnClick(driver,AddGiftCard);
	}	
}
