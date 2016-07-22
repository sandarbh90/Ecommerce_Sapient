package com.somedomain.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.somedomain.common.Common;

public class LoginPage extends Common {

	private WebElement AlreadyMemberBtn;
		
	@FindBy(id="login-email")
	private WebElement LoginId;
	
	@FindBy(id="login-pwd")
	private WebElement Password;
	
	@FindBy(id="btn-login")
	private WebElement LoginBtn;
	private WebElement ForgotPswrd;
	private WebElement SignUp;
	
	@FindBy(css="div.modal-dialog h4")
	private WebElement PageTitle;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public String PageTitle(WebDriver driver) {
		return getText(driver,PageTitle);
	}
	
	public void alreadyMemberBtn(WebDriver driver) {
		fnClick(driver,AlreadyMemberBtn);
	}
	
	
	public void loginId(WebDriver driver, String Id) {
		fnInput(driver,LoginId,Id);
	}
	
	public void password(WebDriver driver, String pswrd) {
		fnInput(driver,Password,pswrd);
	}
	
	public void loginBtn(WebDriver driver) {
		fnClick(driver,LoginBtn);
	}
	
	public void forgotPswrd(WebDriver driver) {
		fnClick(driver,ForgotPswrd);
	}
	
	public void signUp(WebDriver driver) {
		fnClick(driver,SignUp);
	}
}
