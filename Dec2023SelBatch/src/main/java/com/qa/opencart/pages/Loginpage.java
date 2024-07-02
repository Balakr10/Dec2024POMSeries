package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class Loginpage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//Private by Locators
	//Public page action methods
	//Public class constructor
	
	//locators
	private By emailID = By.id("input-email");
	private By pwd = By.id("input-password");
	private By loginbtn = By.className("btn btn-primary");
	private By forgotpwd = By.linkText("Forgotten Password");
	private By registerlink = By.linkText("register");
	
	//class constructor
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//public action methods
	public String getLoginpagetitle() {
		
		String Title = eleUtil.waitForTitleIs(AppConstants.LOGIN_PAGE_TITLE, 5);
		//String Title = driver.getTitle();
		System.out.println("The page title is:" +Title);
		return Title;
	}
	
	//login page url
	public String getLoginpageurl() {
		String url = eleUtil.waitForURLContains(AppConstants.LOGIN_PAGE_URL_FRACTION, 5);
		//String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	//check forgot pwd link
	public boolean forgotpwdlinkexist() {
		return driver.findElement(forgotpwd).isDisplayed();
	}
	
	//perform login function
	public Accountspage doLogin(String username, String password) {
		eleUtil.waitForElementVisible(emailID, 5).sendKeys(username);
		eleUtil.doSendKeys(pwd, password);
		eleUtil.doClick(loginbtn);
		return new Accountspage(driver);
		//return eleUtil.waitForTitleIs(getLoginpagetitle(), 5);
		//driver.findElement(emailID).sendKeys(username);
		//driver.findElement(pwd).sendKeys(password);
		//driver.findElement(loginbtn).click();
		//return getLoginpagetitle();
	}
	
	//perform navigation to registration page
	public Registrationpage donavigateRegistrationpage() {
		eleUtil.doClick(registerlink, 10);
		return new Registrationpage(driver);
	}

}
