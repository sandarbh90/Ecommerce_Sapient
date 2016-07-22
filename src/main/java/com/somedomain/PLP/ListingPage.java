package com.somedomain.PLP;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.somedomain.common.Common;

public class ListingPage extends Common {
	
	private WebElement BreabCrumb;
	
	@FindBy(css="div.catalog-product-info h1")
	private WebElement CategoryHeading;
	private WebElement CategoryDesc;
	private WebElement ProductCount;
	private WebElement SortByDropDown;
	private WebElement SortByLink1;
	private WebElement FilterText;
	private WebElement Filter1HideShowBtn;
	private WebElement Filter1Option;
	private WebElement PriceSlider;
	private WebElement PaginationLeft;
	private WebElement PaginationRight;
	private WebElement PagesButton;
	private WebElement ProductCountFilter;
	private List<WebElement> CountOfProductsPerPage;
	private WebElement Product1Image;
	private WebElement Product1Title;
	private WebElement Product1Price;
	private WebElement MarkFavourite;
	private WebElement FavouriteCount;
	private WebElement ViewMore;
	private WebElement BackToTopBtn;
	private WebElement PageTitle;
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public String breabCrumb(WebDriver driver) {
		return getText(driver,BreabCrumb);
	}
	
	public String categoryHeading(WebDriver driver) {
		return getText(driver,CategoryHeading);
	}
	
	public String categoryDesc(WebDriver driver) {
		return getText(driver,CategoryDesc);
	}
	
	public String productCount(WebDriver driver) {
		return getText(driver,ProductCount);
	}
	
	public void sortByDropDown(WebDriver driver,String option) {
		selectDropDown(driver,SortByDropDown,option);
	}
	
	public String filterText(WebDriver driver) {
		return getText(driver,FilterText);
	}
	
	public void filter1HideShowBtn(WebDriver driver) {
		fnClick(driver,Filter1HideShowBtn);
	}
	
	public void filter1Option(WebDriver driver) {
		fnClick(driver,Filter1Option);
	}
	
	public void setPriceSlider(WebDriver driver, int pixel) {
		slider(driver,PriceSlider,pixel);
	}
	
	public void paginationLeft(WebDriver driver) {
		fnClick(driver,PaginationLeft);
	}
	
	public void paginationRight(WebDriver driver) {
		fnClick(driver,PaginationRight);
	}
	
	public void pagesButton(WebDriver driver) {
		fnClick(driver,PagesButton);
	}
	
	public void productCountFilter(WebDriver driver, String value) {
		selectDropDown(driver,ProductCountFilter,value);
	}
	
	public int countOfProductsPerPage(WebDriver driver) {
		return CountOfProductsPerPage.size();
	}
	
	public void product1Image(WebDriver driver) {
		fnClick(driver,Product1Image);
	}
	
	public String product1Title(WebDriver driver) {
		return getText(driver,Product1Title);
	}
	
	public String product1Price(WebDriver driver) {
		return getText(driver,Product1Price);
	}
	
	public void markFavourite(WebDriver driver) {
		fnClick(driver,MarkFavourite);
	}
	
	public String favouriteCount(WebDriver driver) {
		return getText(driver,FavouriteCount);
	}
	
	public String viewMore(WebDriver driver) {
		return getText(driver,ViewMore);
	}
	
	public void backToTopBtn(WebDriver driver) {
		fnClick(driver,BackToTopBtn);
	}
	
	public void sortByLink1(WebDriver driver) {
		fnClick(driver,SortByLink1);
	}
	
}
