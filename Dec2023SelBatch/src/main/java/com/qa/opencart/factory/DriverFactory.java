package com.qa.opencart.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.opencart.exceptions.BrowserException;
import com.qa.opencart.exceptions.FrameworkException;

public class DriverFactory {
	
	WebDriver driver;
	Properties prop;
	OptionsManager opManager;
	public static String highlight;
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initDriver(Properties prop) {
		
		String BrowserName = prop.getProperty("browser");
	
		System.out.println("Browser passed:" +BrowserName);
		
		highlight = prop.getProperty("highlight");
		
		opManager = new OptionsManager(prop);
		
		switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver(opManager.getChromeOptions());
			tldriver.set(driver);
			break;
			
		case "firefox":
			driver = new FirefoxDriver(opManager.getFirefoxOptions());
			tldriver.set(driver);
			break;
			
		case "edge":
			driver = new EdgeDriver(opManager.getEdgeOptions());
			tldriver.set(driver);
			break;
		
		case "safari":
			driver = new SafariDriver();
			tldriver.set(driver);
			break;
			
		default:
			System.out.println("Please pass the correct browser" +BrowserName);
			throw new BrowserException("No Browser Found" +BrowserName);
		
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().get(prop.getProperty("url"));
		return getDriver();
		}
	
	public static WebDriver getDriver() {
		return tldriver.get();
	}

	public Properties initProp() throws FileNotFoundException {
		
		prop = new Properties();
		FileInputStream ip;
		
        String envName = prop.getProperty("env");
        System.out.println("test is executed on environment" +envName);
        try {
		if(envName==null) 
		{
			System.out.println("please pass the correct environment" +envName);
		}
		
		else {
			switch(envName.toLowerCase().trim()) {
			
			case"qa":
				ip = new FileInputStream("./src/test/resources/config/com.qa.properties");
				break;
			case"stage":
				ip = new FileInputStream("./src/test/resources/config/com.stage.properties");
				break;
			case"prod":
				ip = new FileInputStream("./src/test/resources/config/config.properties");
				break;
				
			default:
				System.out.println("invalid env passed" +envName);
				throw new FrameworkException("Env is not valid hence test not executed");
			
			}
		}
        }
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
        
		return prop;
	}
	
	
	public static String getScreenshot(String methodName) {
		File fileSrc = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"/screeshot"+ methodName +"_"+System.currentTimeMillis()+
				".png";
		File destination = new File(path);
		
		try {
			FileHandler.copy(fileSrc, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
	}
}
