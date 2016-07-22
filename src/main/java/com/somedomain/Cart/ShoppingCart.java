package com.somedomain.Cart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.somedomain.common.Common;

public class ShoppingCart extends Common {
	
	private WebElement EmptyCartMessage;
	private WebElement SignInLinkOnCart;
	private WebElement ContinueShoppingLink;
	private WebElement CheckoutLink;
	private List<WebElement> TotalProductInCart;
	private WebElement ProductDetail;
	private WebElement ProductCost;
	private WebElement ProductQty;
	private WebElement ProductSize;
	private WebElement EditProduct;
	private WebElement SavetoWishlist;
	private WebElement RemoveProduct;
	private WebElement AddProductFromWishlist;
	private WebElement CartTitle;
	private WebElement TotalCartCost;
	private WebElement OfferBtn;
	private WebElement OfferTextBox;
	private WebElement ApplyOfferBtn;
	private WebElement TotalOrderCost;
	private WebElement TotalDiscount;
	private WebElement DeliveryDetails;
	private WebElement CheckForZipTextBox;
	private WebElement CheckForZipBtn;
	private WebElement CheckForZipMessage;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String emptyCartMessage(WebDriver driver) {
		return getText(driver,EmptyCartMessage);
	}
	
	public void signInLinkOnCart(WebDriver driver) {
		fnClick(driver,SignInLinkOnCart);
	}
	
	public void continueShoppingLink(WebDriver driver) {
		fnClick(driver,ContinueShoppingLink);
	}

	public void checkoutLink(WebDriver driver) {
		fnClick(driver,CheckoutLink);
	}
	
	public int totalProductInCart(WebDriver driver) {
		return TotalProductInCart.size();
	}
	
	public String productDetail(WebDriver driver) {
		return getText(driver,ProductDetail);
	}
	
	public String productCost(WebDriver driver) {
		return getText(driver,ProductCost);
	}
	
	public String productQty(WebDriver driver) {
		return getText(driver,ProductQty);
	}
	
	public String productSize(WebDriver driver) {
		return getText(driver,ProductSize);
	}

	public void editProduct(WebDriver driver) {
		fnClick(driver,EditProduct);
	}
	
	public void savetoWishlist(WebDriver driver) {
		fnClick(driver,SavetoWishlist);
	}
	
	public void removeProduct(WebDriver driver) {
		fnClick(driver,RemoveProduct);
	}
	
	public void addProductFromWishlist(WebDriver driver) {
		fnClick(driver,AddProductFromWishlist);
	}
	
	public String cartTitle(WebDriver driver) {
		return getText(driver,CartTitle);
	}
	
	public String totalCartCost(WebDriver driver) {
		return getText(driver,TotalCartCost);
	}
	
	public void offerBtn(WebDriver driver) {
		fnClick(driver,OfferBtn);
	}
	
	public void offerTextBox(WebDriver driver, String PromotionCode) {
		fnInput(driver,OfferTextBox,PromotionCode);
	}
	
	public void applyOfferBtn(WebDriver driver) {
		fnClick(driver,ApplyOfferBtn);
	}
	
	public String totalOrderCost(WebDriver driver) {
		return getText(driver,TotalOrderCost);
	}
	
	public String totalDiscount(WebDriver driver) {
		return getText(driver,TotalDiscount);
	}
	
	public String deliveryDetails(WebDriver driver) {
		return getText(driver,DeliveryDetails);
	}
	
	public void checkForZipTextBox(WebDriver driver, String ZipCode) {
		fnInput(driver,CheckForZipTextBox,ZipCode);
	}
	
	public void checkForZipBtn(WebDriver driver) {
		fnClick(driver,CheckForZipBtn);
	}
	
	public String checkForZipMessage(WebDriver driver) {
		return getText(driver,CheckForZipMessage);
	}
}
