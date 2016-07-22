package com.somedomain.TestScript;



import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.somedomain.Homepage.HomePage;
import com.somedomain.Login.LoginPage;
import com.somedomain.PLP.ListingPage;
import com.somedomain.common.CaptureScreenshot;
import com.somedomain.common.Common;


public class VerifyHomepageTest extends Common {
 

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	ExtentReports report = new ExtentReports(".//test-output//Extent.html",true);
	ExtentTest test;
	HashMap<String,String> map = new HashMap<String, String>();
	private String ActualPageTitle;

	
	@BeforeClass
	public void setup(){
		//String Browser = System.getProperty("browser");
		String Browser = "Firefox";
		String URL = "http://jabong.com";
		//System.out.println("Browser is "+Browser);
		//String URL = System.getProperty("url");
		//.out.println("URL is"+URL);
		
		if(Browser.startsWith("F"))
		{
			driver = openFirefoxBrowser(driver);
			driver.get(URL);
			driver.manage().window().maximize();
		}
		else if(Browser.startsWith("C")) {
			driver = new ChromeDriver();
			driver.get(URL);
		}
		else if(Browser.startsWith("I")) {
			driver = new InternetExplorerDriver();
			driver.get(URL);
		}
			
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult result) throws Exception
	{
		  String methodName=result.getName().toString().trim();				
        if(ITestResult.FAILURE==result.getStatus())
		{
        	
        	String destination = CaptureScreenshot.takescreenshot(driver,methodName);
        	String image =test.addScreenCapture(destination);
        	test.log(LogStatus.INFO,methodName+" FAILS");
        	test.log(LogStatus.FAIL,methodName,image);
        	report.endTest(test);
   		  	report.flush();
		}
	}
	

  @Test(priority = 1)
  public void LoginWithExistingUser() {
	  
	  HomePage HomePageobj = PageFactory.initElements(driver,HomePage.class);
	  LoginPage LoginPageobj = PageFactory.initElements(driver,LoginPage.class);
	  
	  test = report.startTest("LoginWithExistingUser");	  
	  map = getDataFromCsv("SN001","DataSheet001.csv");
	  //login into user account
	  HomePageobj.LoginLink(driver);
	  ActualPageTitle = LoginPageobj.PageTitle(driver);
	  Assert.assertEquals("SIGN IN", ActualPageTitle);
	  
	  test.log(LogStatus.INFO, "Login window title verified");
	  
	  LoginPageobj.loginId(driver,map.get("UserToLoginWith"));
	  LoginPageobj.password(driver,map.get("Password"));
	  LoginPageobj.loginBtn(driver);
	  implicitWait(driver);
	  ActualPageTitle = HomePageobj.PageTitle(driver);
	  Assert.assertEquals("HI, SANDARBH", ActualPageTitle);
	  test.log(LogStatus.INFO, "User succesfully logged in");
	  report.endTest(test);
	  report.flush();
  }
  
  @Test(priority = 2)
  public void verifyActiveLinksCount() {
	 
	  HomePage HomePageobj = PageFactory.initElements(driver,HomePage.class);
	  map = getDataFromCsv("SN001","DataSheet001.csv");
	  test = report.startTest("verifyActiveLinksCount");	
	  implicitWait(driver);
	  List<WebElement> Links = HomePageobj.activeLinks(driver);
	  int ActualLinks = Links.size();
	  int ExpectedLinks = Integer.parseInt(map.get("CountOfActiveLinks"));
	 // System.out.println("Total number of actual links on homepage are "+ActualLinks);
	 // System.out.println("Total number of expected links on homepage are "+ExpectedLinks);

	  implicitWait(driver);
	  for (int i =0; i<Links.size();i++) {
		  WebElement Link = Links.get(i);
		  boolean bool = HomePageobj.linkEnabled(driver, Link, Links.size());
		  String linktext = HomePageobj.linkText(driver,i);
		  if(bool = true) {
			  //System.out.println(linktext+" is ENABLED"); 
			  test.log(LogStatus.INFO, linktext+" is enabled on homepage");
			  Assert.assertEquals(ExpectedLinks,ActualLinks);
			  report.endTest(test);
			  report.flush();
		  }
		  else {
			  System.out.println(linktext+" is NOT ENABLED");
			  test.log(LogStatus.INFO, linktext+" is not enabled on homepage");
			  report.endTest(test);
			  report.flush();
		  }	  
	  }
  }
  
  @Test(priority = 3)
  public void verifyCategories() {
	  
	  test = report.startTest("verifyCategories");
	  
	  HomePage HomePageobj = PageFactory.initElements(driver,HomePage.class); 
	  HomePageobj.mainCategory1(driver);
	  ListingPage ListingPageobj = PageFactory.initElements(driver,ListingPage.class);
	  map = getDataFromCsv("SN001","DataSheet001.csv");
	  String ActualHeading = ListingPageobj.categoryHeading(driver);
	  Assert.assertEquals(map.get("CategoryHeading"),ActualHeading);
	  test.log(LogStatus.INFO, "User succesfully reached on category page");
	  report.endTest(test);
	  report.flush();	  
  } 
}
