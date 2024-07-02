package com.qa.opencart.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.opencart.utils.ElementUtil;

public class ProductInfoPage {
	
	//private drivers
		private WebDriver driver;
		private ElementUtil eleUtil;
		
	//Private HashMap
		Map<String, String> prodMap = new HashMap<String, String>();
		
		
		//constructor
		public ProductInfoPage(WebDriver driver) {
			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}
		
		//Private BY Locators
		private By prodheader = By.linkText("h1");
		private By images  = By.cssSelector("u.thumbnails img");
		private By ProdMetaData = By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[1]/li");
		private By ProdPriceData = By.xpath("(//div[@id='content']//ul[@class='list-unstyled'])[2]/li");
		
		//public methods
		public String getProdHeader() {
			String headers = eleUtil.doGetElementText(prodheader);
			System.out.println("header list:" +headers);
			return headers;
		}
		
		public int getProdImagesCount() {
			int totalimages = eleUtil.waitForElementsVisible(images, 0).size();
			System.out.println("The total images of" + getProdHeader()+ ":" +totalimages);
			return totalimages;
		}
		
		public void getProdMetaData() {
			List<WebElement> prodDataList = eleUtil.getElements(ProdMetaData);
			for (WebElement e: prodDataList) {
				String DataText = e.getText();
				String ProdKey = DataText.split(":")[0].trim();
				String ProdVal = DataText.split(":")[1].trim();
				prodMap.put(ProdKey, ProdVal);
			}
		}
		
		public void getProdMetVal() {
			List<WebElement> prodpricelist  = eleUtil.getElements(ProdPriceData);
			String price = prodpricelist.get(0).getText();
			String taxPrice = prodpricelist.get(1).getText().split(":")[1].trim();
			prodMap.put("price", price);
			prodMap.put("Taxprice", taxPrice);
		}
		
		public Map<String, String> getProdDetails() {
			prodMap.put("Headers", getProdHeader());
			prodMap.put("Imagescount", String.valueOf(getProdImagesCount()));
			getProdMetaData();
			getProdMetVal();
			return prodMap;
		}

}
