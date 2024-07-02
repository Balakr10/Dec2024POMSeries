package com.qa.opencart.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.constants.AppConstants;
import com.qa.opencart.utils.ElementUtil;
import com.qa.opencart.utils.ExcelUtil;
import com.qa.opencart.utils.Stringutils;

public class registrationPageTest extends BaseTest {
	
	@BeforeClass
	public void RegPageSetup() {
		
		regPg = Loginpage.donavigateRegistrationpage();
	}
	
	@DataProvider
	public Object[][] RegTestData() {
		
		return new Object[][] {
			
			{"gav", "gup", "1231231231", "gg@123", "gg@123", "yes"},
			{"gav", "gupa", "1231231231", "gg@123", "gg@123", "yes"},
			{"gav", "gupt", "1231231231", "gg@123", "gg@123", "yes"}
		
		};
	}
	
	/*return type of dataprovider is 2D array*/
	@DataProvider(name="passdatainexcel")
	public Object[][] getUserRegDatafromExcel() {
		return ExcelUtil.getTestData(AppConstants.SHEET_NAME);
		
	}
	
	@Test(dataProvider="getUserRegDatafromExcel")
	public void doRegistrationTest() {
		
		Assert.assertTrue(regPg.doRegistrationmethod("gaurav", "gupta", Stringutils.randomstrUtil(), "1231231231", 
				"gg@123", "gg@123", "yes"));
	}
	
}
