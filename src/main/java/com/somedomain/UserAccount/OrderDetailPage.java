package com.somedomain.UserAccount;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class OrderDetailPage extends Common {
	
	private WebElement OrderDetails;
	private WebElement OrderID;
	private WebElement OrderTime;
	private WebElement OrderAmount;
	private List<WebElement> ProductCount;
	private WebElement ReturnLink;
	private WebElement ExchangeLink;
	private WebElement OrderStatus;
	private WebElement TrackItem;
	private WebElement CancelOrder;
	private WebElement ShippingAddress;
	private WebElement MailingAddress;
	private WebElement PaymentMode;
	private WebElement CourierName;
	private WebElement TrackingId;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String orderDetails(WebDriver driver) {
		return getText(driver,OrderDetails);
	}
	
	public String orderID(WebDriver driver) {
		return getText(driver,OrderID);
	}
	
	public String orderTime(WebDriver driver) {
		return getText(driver,OrderTime);
	}
	
	public String orderAmount(WebDriver driver) {
		return getText(driver,OrderAmount);
	}
	
	public int productCount(WebDriver driver) {
		return ProductCount.size();
	}
	
	public void returnLink(WebDriver driver) {
		fnClick(driver,ReturnLink);
	}
	
	public void exchangeLink(WebDriver driver) {
		fnClick(driver,ExchangeLink);
	}
	
	public String orderStatus(WebDriver driver) {
		return getText(driver,OrderStatus);
	}
	
	public void trackItem(WebDriver driver) {
		fnClick(driver,TrackItem);
	}

	public void cancelOrder(WebDriver driver) {
		fnClick(driver,CancelOrder);
	}
	
	public String shippingAddress(WebDriver driver) {
		return getText(driver,ShippingAddress);
	}
	
	public String mailingAddress(WebDriver driver) {
		return getText(driver,MailingAddress);
	}
	
	public String paymentMode(WebDriver driver) {
		return getText(driver,PaymentMode);
	}
	
	public String courierName(WebDriver driver) {
		return getText(driver,CourierName);
	}
	
	public String trackingId(WebDriver driver) {
		return getText(driver,TrackingId);
	}
}
