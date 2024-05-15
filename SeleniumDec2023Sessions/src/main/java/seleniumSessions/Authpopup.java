package seleniumSessions;

import java.util.function.Supplier;

import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authpopup {

	public static void main(String[] args) {  
		
             WebDriver driver = new ChromeDriver();
		
		//basic auth: 
		String username = "admin";
		String password = "admin";
		
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		
		//sel 4.x:
		//HasAuthentication
//		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		Supplier<Credentials> cred = () -> new UsernameAndPassword(username, password);
		
		((HasAuthentication)driver).register(cred);
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		
		
//		wait.until(d -> ExpectedConditions.textToBePresentInElementValue(d.findElement(By.tagName("h3")), "Basic Auth"));
		
	}
	}


