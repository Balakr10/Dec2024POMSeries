package com.qa.opencart.base;

import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.Accountspage;
import com.qa.opencart.pages.Loginpage;
import com.qa.opencart.pages.ProductInfoPage;
import com.qa.opencart.pages.Registrationpage;
import com.qa.opencart.pages.searchResultsPage;


public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected Loginpage Loginpage;
	protected Accountspage accPage;
	protected searchResultsPage searchResultsPg;
	protected ProductInfoPage productinfoPg;
	protected Registrationpage regPg;
	protected Properties prop;
	protected SoftAssert softAssert;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browserName) throws FileNotFoundException {
		
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		
		if(browserName!=null) {
			prop.setProperty("browser", browserName);
			}
		
		Loginpage = new Loginpage(driver);
		softAssert = new SoftAssert();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
