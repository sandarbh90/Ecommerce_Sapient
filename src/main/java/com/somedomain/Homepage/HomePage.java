package com.somedomain.Homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.somedomain.common.Common;

public class HomePage extends Common {
	
	//WebDriver driver;

	private WebElement SearchBox;
	private WebElement SearchBtn;
	
	@FindBy(xpath=".//a[.='Sign In'] ")
	private WebElement LogIn;
	
	//@FindBy(tagName="a")
	private List<WebElement> ActiveLinks;
	
	private WebElement Link;
	
	private WebElement MyAccount;
	private WebElement DropDown1;
	
	@FindBy(linkText="Jabong")
	private WebElement HomePageTitle;
	
	@FindBy(css="#mainTopNav li:nth-of-type(2) a")
	private WebElement MainCategory1;
	
	private WebElement MainCategory2;
	
	@FindBy(linkText="Polos & Tees")
	private WebElement SubCategory1;
	private WebElement SubCategory2;
	private WebElement WelcomeMessage;
	private WebElement SavedItem;
	private WebElement Bag;
	private WebElement BagCounter;
	private WebElement MainBanner1;
	private WebElement MainBanner2;
	private WebElement SubBanner1;
	private WebElement SubBanner2;
	private WebElement Tile1;
	private WebElement Tile2;
	private WebElement BannerScroller;
	private WebElement BannerScrollerLeft;
	private WebElement BannerScrollerRight;
	private WebElement Text1;
	private WebElement Text2;
	private WebElement Footer1_Help;
	private WebElement Footer1_GiftVoucher;
	private WebElement Footer1_YouTube;
	private WebElement Footer1_MarketPlace;
	private WebElement Footer2_Privacy;
	private WebElement Footer2_TermsConditions;
	private WebElement Footer2_AboutUs;
	private WebElement ScrollToBottom;
	private WebElement ScrollToElement;
	private WebElement SignUp;
	private WebElement TrackOrder;
	
	@FindBy(xpath=".//a[.='Hi, SANDARBH'] ")
	private WebElement PageTitle;
	
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public List<WebElement> activeLinks(WebDriver driver) {
		ActiveLinks = driver.findElements(By.tagName("a"));
		return ActiveLinks;
	}
	
	public boolean linkEnabled(WebDriver driver,WebElement element, int size) {
		if(element.isEnabled())
		 return true;
		else
		 return false;
	}
	
	public String linkText(WebDriver driver, int index){
		String LinkText = ActiveLinks.get(index).getText();
		return LinkText;
	}
	
	public void searchItem(WebDriver driver, String item)  {
		fnInput(driver,SearchBox,item);
	}
	
	public void searchBtn(WebDriver driver) {
		fnClick(driver,SearchBtn);
	}
	
	public void LoginLink(WebDriver driver) {
		fnClick(driver,LogIn);
	}
	
	public void DropDown(WebDriver driver, String value) {
		selectDropDown(driver,DropDown1,value);
	}
	
	public String homePageTitle(WebDriver driver) {
		return getText(driver,HomePageTitle);
	}
	
	public void mainCategory1(WebDriver driver) {
		mouseHover(driver,MainCategory1,SubCategory1);
	}
			
	public String welcomeMessage(WebDriver driver) {
		return getText(driver,WelcomeMessage);
	}
	
	public void savedItem(WebDriver driver) {
		fnClick(driver,SavedItem);
	}
	
	public void bag(WebDriver driver) {
		fnClick(driver,Bag);
	}
	
	public String bagCounter(WebDriver driver) {
		return getText(driver,BagCounter);
	}
	
	public void scrollBottom(WebDriver driver) {
		scrollToBottom(driver);
	}
		
	public void scrollElement(WebDriver driver) {
		scrollToElement(driver,ScrollToElement);
	}
	
	public void signUp(WebDriver driver) {
		fnClick(driver,SignUp);
	}
	
	public void trackOrder(WebDriver driver) {
		fnClick(driver,TrackOrder);
	}
	
	public void myAccount(WebDriver driver, String value) {
		selectDropDown(driver,MyAccount,value);
	}
}
