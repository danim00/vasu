package LandingPageObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {
WebDriver driver;
	
	public Locators(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	//WebElement myaccount = driver.findElement(By.linkText("My Account"));
	@FindBy(xpath="//a[@title='My Account']")
	WebElement myaccount;
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-password")
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login_btn;
	
	@FindBy(name="search")
	WebElement search;
	
	@FindBy(xpath="//span[@class='input-group-btn']")
	WebElement searchbtn;
	
	public void clickmyaccount( )
	{	
		myaccount.click();	
	}
	public void clicklogin() 
	{
		login.click();
	}
	public void enteremail(String username)
	{
		Email.sendKeys(username);
	}
	public void enterpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickToLogin()
	{
		login_btn.click();
	}
	public void clickSearch(String text)
	{
		search.sendKeys(text);
	}
	public void clickSearch_btn()
	{
		searchbtn.click();
	}
	
	
	
	
}