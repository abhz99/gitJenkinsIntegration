package page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) //constructor to initialize Webdriver
	{
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Register a new membership']")
	private WebElement RegisterNewMember;
	
	public WebElement getRegisterNewMemberButton() 
	{
		return RegisterNewMember;
	}
	
	@FindBy(id = "name")
	private WebElement name;
	
	public WebElement getName() 
	{
		return name;
	}
	
	@FindBy(id="mobile")
	private WebElement mobile;
	
	public WebElement getMobile() 
	{
		return mobile;
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getEmail() 
	{
		return email;
	}
	
	@FindBy(id="password")
	private WebElement password;
	
	public WebElement getPassword() 
	{
		return password;
	}
	
	@FindBy(xpath = "//*[@id=\"form\"]/div[5]/div/button")
	private WebElement RegisterButton;
	
	public WebElement getRegisterButton() 
	{
		return RegisterButton;
	}
	
	public void RegisterPage() 
	{
		getRegisterNewMemberButton().click();
		getName().sendKeys("Abhilash");
		getMobile().sendKeys("4578654");
		getEmail().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getRegisterButton().click();
		//for alert use object of child of interface Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
}
