package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.RegistrationPage;

public class RegistrationPageTest {

	@Test
	public void testRegistration() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		RegistrationPage register = new RegistrationPage(driver);
		
		register.RegisterPage();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Registration Page");
		
	}
}
