package com.somedomain.UserAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class MyAccount extends Common {
	
	private WebElement Orders;
	private WebElement OpenOrders;
	private WebElement ReturnedOrders;
	private WebElement ExchangedOrders;
	private WebElement PersonalInfo;
	private WebElement SavedCards;
	private WebElement SavedAddress;
	private WebElement BankDetails;
	private WebElement Subscriptions;
	private WebElement Coupons;
	private WebElement Credits;
	private WebElement AddGiftCard;
	private WebElement LogOut;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void orders(WebDriver driver) {
		fnClick(driver,Orders);
	}
	
	public void openOrders(WebDriver driver) {
		fnClick(driver,OpenOrders);
	}
	
	public void returnedOrders(WebDriver driver) {
		fnClick(driver,ReturnedOrders);
	}
	
	public void exchangedOrders(WebDriver driver) {
		fnClick(driver,ExchangedOrders);
	}
	
	public void personalInfo(WebDriver driver) {
		fnClick(driver,PersonalInfo);
	}
	
	public void savedAddress(WebDriver driver) {
		fnClick(driver,SavedAddress);
	}
	
	public void savedCards(WebDriver driver) {
		fnClick(driver,SavedCards);
	}
	
	public void bankDetails(WebDriver driver) {
		fnClick(driver,BankDetails);
	}
	
	public void subscriptions(WebDriver driver) {
		fnClick(driver,Subscriptions);
	}
	
	public void coupons(WebDriver driver) {
		fnClick(driver,Coupons);
	}
	
	public void credits(WebDriver driver) {
		fnClick(driver,Credits);
	}
	
	public void addGiftCard(WebDriver driver) {
		fnClick(driver,AddGiftCard);
	}
	
	public void logOut(WebDriver driver) {
		fnClick(driver,LogOut);
	}
	
}
