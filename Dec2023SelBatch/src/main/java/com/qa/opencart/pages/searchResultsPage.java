package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtil;

public class searchResultsPage {
	
	//private drivers
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	//constructor
	public searchResultsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	//private by locators
	private By searchproducts = By.xpath("//div/h1[contains(text(),'Search - samsung')]");
	private By searchProdRes = By.cssSelector("div.product-thumb");
	
	//public methods
	public boolean searchprodresMessage() {
		return eleUtil.isElementDisplayed(searchproducts);
	}
	
	public int searchProdCount() {
		return eleUtil.waitForElementsVisible(searchProdRes, 10).size();
	}
	
	public ProductInfoPage selectProduct(String prodname) {
		System.out.println("searching for product:"+prodname);
		eleUtil.waitForElementVisible(By.linkText("macbook"), 10).click();
		return new ProductInfoPage(driver);
	}
	
	

}
