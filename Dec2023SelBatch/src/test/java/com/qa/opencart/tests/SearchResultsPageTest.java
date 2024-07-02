package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class SearchResultsPageTest extends BaseTest{
	
	@BeforeClass
	public void searchResultspgSetup() {
		
		accPage = Loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@DataProvider
	public Object[][] getSearchProdCount() {
		return new Object[][] {
			{"Samsung", 2},
			{"macbook", 3},
			{"imac", 1}
		};
	}
	
	@Test(dataProvider = "getSearchProdCount")
	public void SearchProdTest(String Searchkey, int Prodcount ) {
		
		searchResultsPg = accPage.doSearch(Searchkey);
		Assert.assertTrue(searchResultsPg.searchprodresMessage());
		Assert.assertEquals(searchResultsPg.searchProdCount(), Prodcount);
		
	}
	
	@Test
	public void searchProdResultTest() {
		Assert.assertEquals(searchResultsPg.searchProdCount(), 3);
	}

}
