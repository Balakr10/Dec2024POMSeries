package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class Accountspage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private By lgout = By.xpath("//a[contains(text(),'Logout')]");
	private By searchbox = By.name("search");
	private By srchicon = By.cssSelector("div#search button");
	private By headerlist = By.cssSelector("div#content h2");
	private By MyAccount = By.linkText("My Account");
	
	public Accountspage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getAccpgTitle() {
		String accpgtitle = eleUtil.waitForTitleIs(AppConstants.ACCOUNT_PAGE_TITLE, 5);
		System.out.println(accpgtitle);
		return accpgtitle;
	}
	
	public String getAccpgURL() {
		
		String accURL = eleUtil.waitForURLContains(AppConstants.ACCOUNT_PAGE_URL_FRACTION, 10);
		System.out.println(accURL);
		return accURL;
	}
	
	public boolean lglinkexists() {
		return (eleUtil.isElementExist(lgout));
	}
	
	public boolean myAccountLinkExists() {
		return eleUtil.waitForElementVisible(MyAccount, 10).isDisplayed();
	}
	
	public List<String> headerList() {
		List<WebElement> headerlisttitle = eleUtil.getElements(headerlist);
		List<String> headerlistname = new ArrayList<String>();
		for(WebElement e : headerlisttitle) {
			String headerText = e.getText();
			//System.out.println(headerText);
			headerlistname.add(headerText);
		}
		
		return headerlistname;
	}
	
	public searchResultsPage doSearch(String searchItem) {
		System.out.println("searching for :" +searchItem);
		eleUtil.doSendKeys(searchbox, "Samsung");
		eleUtil.doClick(srchicon);
		return new searchResultsPage(driver);
	}
	
	


}
