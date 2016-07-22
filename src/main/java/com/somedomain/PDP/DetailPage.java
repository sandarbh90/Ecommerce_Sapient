package com.somedomain.PDP;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class DetailPage extends Common{
	
	private WebElement ProductDetail;
	private WebElement ProductCost;
	private WebElement SizeDropDown;
	private WebElement SizeBtn;
	private WebElement ProductViewLeft;
	private WebElement ProductViewRight;
	private List<WebElement> ProductImageCount;
	private WebElement AddToCartBtn;
	private WebElement BuyNowBtn;
	private WebElement SaveForLaterBtn;
	private WebElement ProductDesc;
	private WebElement ProductDetailTab1;
	private WebElement ProductTab1Desc;
	private WebElement SizeGuide;
	private WebElement BreadcrumbText;
	private WebElement BreadcrumbLink1;
	private WebElement BreadcrumbLink2;
	private WebElement OfferLink;
	private WebElement OfferDesc;
	private WebElement AddToBagNotification;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String productDetail(WebDriver driver) {
		return getText(driver,ProductDetail);
	}
	
	public String productCost(WebDriver driver) {
		return getText(driver,ProductCost);
	}
	
	public void sizeDropDown(WebDriver driver, String value) {
		selectDropDown(driver,SizeDropDown,value);
	}
	
	public void sizeBtn(WebDriver driver) {
		fnClick(driver,SizeBtn);
	}
	
	public void productViewLeft(WebDriver driver) {
		fnClick(driver,ProductViewLeft);
	}
	
	public void productViewRight(WebDriver driver) {
		fnClick(driver,ProductViewRight);
	}
	
	public int productImageCount(WebDriver driver) {
		return ProductImageCount.size();
	}
	
	public void addToCartBtn(WebDriver driver) {
		fnClick(driver,AddToCartBtn);
	}
	
	public void buyNowBtn(WebDriver driver) {
		fnClick(driver,BuyNowBtn);
	}
	
	public void saveForLaterBtn(WebDriver driver) {
		fnClick(driver,SaveForLaterBtn);
	}
	
	public String productDesc(WebDriver driver) {
		return getText(driver,ProductDesc);
	}
	
	public void productDetailTab1(WebDriver driver) {
		fnClick(driver,ProductDetailTab1);
	}
	
	public String productTab1Desc(WebDriver driver) {
		return getText(driver,ProductTab1Desc);
	}
	
	public void sizeGuide(WebDriver driver) {
		fnClick(driver,SizeGuide);
	}
	
	public String breadcrumbText(WebDriver driver) {
		return getText(driver,BreadcrumbText);
	}
	
	public void breadcrumbLink1(WebDriver driver) {
		fnClick(driver,BreadcrumbLink1);
	}
	
	public void breadcrumbLink2(WebDriver driver) {
		fnClick(driver,BreadcrumbLink2);
	}
	
	public void offerLink(WebDriver driver) {
		fnClick(driver,OfferLink);
	}
	
	public String offerDesc(WebDriver driver) {
		return getText(driver,OfferDesc);
	}
	
	public String addToBagNotification(WebDriver driver) {
		return getText(driver,AddToBagNotification);
	}

}
