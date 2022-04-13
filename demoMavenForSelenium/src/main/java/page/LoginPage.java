package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver lpdriver;	// declaring WebDriver object, not yet initialized
	
	
	
	public LoginPage(WebDriver lpdriver) // parameterized constructor used to initialize global variable lpdriver
	{
		super();
		this.lpdriver = lpdriver;
	}

	//all WebElements and its methods
	
	public WebElement getUname() 
	{
		return lpdriver.findElement(By.id("email"));
	}
	
	public WebElement getPassword() 
	{
		return lpdriver.findElement(By.id("password"));
	}
	
	public WebElement getLoginButton() 
	{
		return lpdriver.findElement(By.xpath("//button"));
	}
	
	public void loginApplication() 	//this method will be called by diff team members in  their test cases instead of 
	{								//rewriting the code for login again in their test cases
		
		getUname().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getLoginButton().click();
	}
}
