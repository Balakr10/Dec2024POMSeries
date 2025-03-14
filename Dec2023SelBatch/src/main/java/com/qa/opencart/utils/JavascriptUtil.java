package com.qa.opencart.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtil {
	
	private WebDriver driver;
	
	public JavascriptUtil(WebDriver driver) {
		this.driver= driver;	
		}
	
	public void changeColor(String color, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundcolor= '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public void flash(WebElement element) {
		String bgcolor = element.getCssValue("backgroundcolor");//red
		for(int i=0; i<10; i++) {
			changeColor("rgb(0,200,0)", element);
			changeColor(bgcolor, element);
		}
	}

}
