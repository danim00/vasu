package ui;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']"));
		//Thread.sleep(3000);
		WebElement rightclickelement =driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']"));
		Actions action = new Actions(driver);
		//Right click and open in new tab the element link
		action.keyDown(Keys.CONTROL).moveToElement(rightclickelement).click().perform();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));

		action.contextClick(rightclickelement).sendKeys(Keys.ARROW_DOWN).build().perform();
		

	}

}
