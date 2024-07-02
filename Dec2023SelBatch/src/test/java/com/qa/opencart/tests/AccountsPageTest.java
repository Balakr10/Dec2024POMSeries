package com.qa.opencart.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;

public class AccountsPageTest extends BaseTest {
	
	//before test executes first than before class
	@BeforeClass
	public void accSetup() {
		
		accPage = Loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test
	public String accPageTitleTest() {
		String accPgTitle = accPage.getAccpgTitle();
		Assert.assertEquals(accPgTitle, AppConstants.ACCOUNT_PAGE_TITLE);
		return accPgTitle;
	}
	
	@Test
	public void accPageURLTest() {
		String accpgURL = accPage.getAccpgURL();
		Assert.assertTrue(accpgURL.contains(AppConstants.ACCOUNT_PAGE_URL_FRACTION));
	}
	
	@Test
	public void lglinkexistsTest() {
		Assert.assertTrue(accPage.lglinkexists());
	}
	
	@Test
	public void myAcctlinkexists() {
		Assert.assertTrue(accPage.myAccountLinkExists());
	}
	
	@Test
	public void getHeadersList() {
		List<String> accpghdlist = accPage.headerList();
		System.out.println(accpghdlist);
	}
   
	@Test
	public void dosearchItem() {
		accPage.doSearch("Samsung");
	}
}
