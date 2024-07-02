package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	public void Loginpagetitletest() {
		
		String pgtitle = Loginpage.getLoginpagetitle();
		Assert.assertEquals(pgtitle, AppConstants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test(priority=2)
	public void testLoginpageurl() {
		
		String pgUrl = Loginpage.getLoginpageurl();
		Assert.assertTrue(pgUrl.contains(AppConstants.LOGIN_PAGE_URL_FRACTION));
	}
	
	@Test(priority=4)
	public void testforgotpwdlink() {
		
		Assert.assertTrue(Loginpage.forgotpwdlinkexist());
		
	}
	
	@Test(priority=3)
	public void loginTestwithCredential() {
		
		accPage = Loginpage.doLogin("test123@mail.com", "Test123");
		Assert.assertEquals(accPage.getAccpgTitle(), "My Account");
	}
	
	

}
