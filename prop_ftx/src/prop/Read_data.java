package prop;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Read_data {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://New folder//webdrivers//chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://propftxdevadmin.iworklab.com/");
		 driver.manage().window().maximize();
		 
		// Actions act = new Actions(driver);
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("rahul.agarwal@mail.vinove.com");
		   //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/div[2]/div[2]/input")).sendKeys("Admin@123");
		   //driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div[2]/div/form/button")).click();
		   
		   Thread.sleep(3000);
		     
		// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		   //email
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[3]/ul/li[2]/a/span")).click();
		//
		  // sidebar
		  driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]")).click();
		  System.out.println("located sidebar");
		  //user management
		  driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/a")).click();
		  System.out.println("locate user management");
		  //list
		  driver.findElement(By.xpath("//*[@id='root']/div[1]/div[1]/div[3]/ul/li[2]/ul/div/li[1]/a")).click();
		  System.out.println("located list");
		  // table on module
		  driver.findElement(By.xpath("//*[@id='dashboard-analytics']/div/div/div/div[3]")).click();
		  System.out.println("locate table on module");
		  
		  //Step1 - To switch on the web table of module
		  WebElement frame1 = driver.findElement(By.xpath("//*[@id='dashboard-analytics']/div/div/div/div[3]"));
		  driver.switchTo().frame(frame1);
		  System.out.println("switch successful :" +"frame1");
		  
		  
		  //Step2 - To get the number of rows
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"dashboard-analytics\"]/div/div/div/div[3]/div[1]/div/div/div[2]"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size();
		
		 //Step2 - To get the number of column
		List<WebElement> columnelements = driver.findElements(By.xpath("//*[@id=\"dashboard-analytics\"]/div/div/div/div[3]/div[1]/div/div/div[1]/div"));
		System.out.println(columnelements.size());
		int columnsize = columnelements.size();
		  
		 // Step4- To Get data from the row
		
		
		//driver.close();
		
		

	}

}
