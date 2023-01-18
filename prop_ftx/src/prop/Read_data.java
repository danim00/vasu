package prop;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\webdrivers\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://propftxdevadmin.iworklab.com/");
		 driver.manage().window().maximize();
		 //driver.sleep();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		   driver.findElement(By.xpath("//input[@name='loginEmail']")).sendKeys("rahul.agarwal@mail.vinove.com");
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		//driver.close();

	}

}
