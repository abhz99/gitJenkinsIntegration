package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;

public class LoginPageTest {
	

	@Test
	public void test01()
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Selenium/Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		LoginPage lp = new LoginPage(driver);	//passing value of driver through constructor of object so that 
		lp.loginApplication();					//in class LoginPage, lpdriver variable is initialized thr constructor
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
}
