package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarTest {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		
		co.addArguments("--disable notifications");
		
		driver = new ChromeDriver(co);
		
		driver.get("https://www.redbus.in");
		
		

	}

}
