package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPageNew;

public class LoginPageNewTest {
	
	

	@Test
	public void test01() 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		
		LoginPageNew lp = new LoginPageNew(driver);
		lp.LoginApplication();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard"); //if correct uname and password webelements are passed then next
																			//page will be Dashboard
	}
}
