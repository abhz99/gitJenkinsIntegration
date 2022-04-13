package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageNew {
	
	WebDriver driver;


	public LoginPageNew(WebDriver driver) 
	{
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "email")		//@FindBy annotaion will replace findElement() 
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button")
	private WebElement button;
	
	public WebElement getUname() 
	{
		return email;
	}
	
	public WebElement getPassword() 
	{
		return password;
	}
	
	public WebElement getButton() 
	{
		return button;
	}
	
	public void LoginApplication() 
	{
		getUname().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getButton().click();
	}
}
