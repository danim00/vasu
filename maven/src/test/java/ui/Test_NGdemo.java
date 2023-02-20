package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_NGdemo {
	
	@Test
	public void verifyPageTitle() {
		
		//launch browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//open URl
		driver.get("https://www.amazon.in/");
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		driver.quit();
		
	}

}
