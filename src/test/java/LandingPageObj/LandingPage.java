package LandingPageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPage {

	public static void main(String[] args) {
		// browser launch
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Locators loginpg = new Locators(driver);
		
		//url Open
		driver.get("https://naveenautomationlabs.com/opencart/");
		loginpg.clickmyaccount();
		loginpg.clicklogin();
		loginpg.enteremail("Vasu1@yopmail.com");
		loginpg.enterpassword("Pass@123");
		loginpg.clickToLogin();
		loginpg.clickSearch("Nikon D300");
		loginpg.clickSearch_btn();
		
	
	}

}
