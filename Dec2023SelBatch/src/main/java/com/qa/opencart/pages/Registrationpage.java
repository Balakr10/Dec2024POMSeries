package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class Registrationpage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By firstname = By.id("firstname");
	private By lasttname = By.id("lastname");
	private By email = By.id("email");
	private By telephone = By.id("phone");
	private By passwd = By.id("password");
	private By conpasswd = By.id("confirmpassword");
	private By subscyes = By.id("subscribeyes");
	private By subscno = By.id("subscribeno");
	private By agreecheckbox = By.id("agree");
	private By ctnbtn = By.id("continue");
	
	private By succmsg = By.id("div.h1");
	private By logoutlink = By.id("logout");
	private By registerlink = By.id("register");
	
	public Registrationpage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public boolean doRegistrationmethod(String firstname, String lasttname, String email, String telephone,
			                         String passwd, String conpasswd, String subscribe) {
		
		eleUtil.waitForElementVisible(this.firstname, 10).sendKeys(firstname);
		eleUtil.doSendKeys(this.lasttname, lasttname);
		eleUtil.doSendKeys(this.email, email);
		eleUtil.doSendKeys(this.telephone, telephone);
		eleUtil.doSendKeys(this.passwd, passwd);
		eleUtil.doSendKeys(this.conpasswd, conpasswd);
		
		if(subscribe.equalsIgnoreCase("yes")) {
			eleUtil.doActionsClick(subscyes);
		}else {
			eleUtil.doActionsClick(subscno);
		}
		eleUtil.doActionsClick(agreecheckbox);
		eleUtil.doActionsClick(ctnbtn);
		
		String succmessage = eleUtil.doGetElementText(succmsg);
		
		if(succmessage.equals(AppConstants.SUCCESS_MSG)) {
			return true;
		}
		return false;
	}

     
}
