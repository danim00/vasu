package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C://directory//chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://propftxdevadmin.iworklab.com/login");
 driver.manage().window().maximize();
 
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("rahul.agarwal@mail.vinove.com");
  
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div[2]/input")).sendKeys("Admin@123");
  
driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/button")).click();
   
   Thread.sleep(3000);
 
  // sidebar
 driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]")).click();
System.out.println("located sidebar");
 //user management
 driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/a")).click();
System.out.println("locate user management");
//list
WebElement rightclickelement =driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/ul/div/li[1]/a"));
System.out.println("located list");
Actions action = new Actions(driver);
action.contextClick(rightclickelement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();


	}

	
	}


