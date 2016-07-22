package com.somedomain.Cart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class SavedItems extends Common {
	
	private WebElement PageTitle;
	private WebElement SomeDropDown;
	private List<WebElement> ProductsCount;
	private WebElement ProductIcon;
	private WebElement ProductDesc;
	private WebElement ProductPrice;
	private WebElement AddToCartBtn;
	private WebElement SelectProductCheckBox;
	private WebElement EditProduct;
	private WebElement RemoveProduct;
	private WebElement GoToCartLink;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void someDropDown(WebDriver driver, String value) {
		selectDropDown(driver,SomeDropDown,value);
	}
	
	public int productsCount(WebDriver driver) {
		return ProductsCount.size();
	}
	
	public void productIcon(WebDriver driver) {
		fnClick(driver,ProductIcon);
	}
	
	public String productDesc(WebDriver driver) {
		return getText(driver,ProductDesc);
	}
	
	public String productPrice(WebDriver driver) {
		return getText(driver,ProductPrice);
	}
	
	public void addToCartBtn(WebDriver driver) {
		fnClick(driver,AddToCartBtn);
	}
	
	public void selectProductCheckBox(WebDriver driver) {
		fnClick(driver,SelectProductCheckBox);
	}
	
	public void editProduct(WebDriver driver) {
		fnClick(driver,EditProduct);
	}
	
	public void removeProduct(WebDriver driver) {
		fnClick(driver,RemoveProduct);
	}
	
	public void goToCartLink(WebDriver driver) {
		fnClick(driver,GoToCartLink);
	}
}
