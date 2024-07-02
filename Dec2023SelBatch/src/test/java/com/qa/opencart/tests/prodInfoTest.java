package com.qa.opencart.tests;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.pages.Loginpage;

public class prodInfoTest extends BaseTest {
	
	@BeforeTest
	public void infoPageSetup() {
		accPage = Loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getProdImagesData() {
		
		return new Object[][] {
			{"macbook", "macbookPro", 3},
			{"Samsun", "Galaxy24", 7},
			{"Imac", "mac", 3}
		};
	}
	
	//method will iterate for all the product data in DP
	@Test(dataProvider = "getProdImagesData")
	public void prodHeaderTest(String ProdKey, String ProdResult) {
		
		searchResultsPg = accPage.doSearch(ProdKey);
		productinfoPg = searchResultsPg.selectProduct(ProdKey);
		Assert.assertEquals(productinfoPg.getProdHeader(), ProdResult);
	}
	
	@Test(dataProvider = "getProdImagesData")
	public void getProdImagesCountTest(String seachKey, String prodName, String imgCount) {
		
		searchResultsPg = accPage.doSearch(seachKey);
		productinfoPg = searchResultsPg.selectProduct(prodName);
		Assert.assertEquals(productinfoPg.getProdImagesCount(), imgCount);
		
	}
	
	@Test
	public void getProdDetailsTest() {
		
		searchResultsPg = accPage.doSearch("macbook");
		productinfoPg = searchResultsPg.selectProduct("macbook");
		Map<String, String> prodDetailsMap = productinfoPg.getProdDetails();
		softAssert.assertEquals(prodDetailsMap.get("Brand"), "Apple");
		softAssert.assertEquals(prodDetailsMap.get("Price"), "2,000");
		softAssert.assertEquals(prodDetailsMap.get("Availability"), "In Stock");
		softAssert.assertEquals(prodDetailsMap.get("ExTax"), "2,000");
		softAssert.assertAll();
		}
}
