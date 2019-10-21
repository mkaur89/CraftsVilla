package com.craftsvilla.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst
{
	public static WebDriver driver = null;
	//static WebDriverWait explicitWait = null;
	
	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE); 
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE); 
			driver = new FirefoxDriver();
		}
		else
		{
			Reporter.log("Invalid browser selection");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(APP_URL);
		
		//explicitWait = new WebDriverWait(driver, 10);
	}
	
	@AfterMethod
	public void CloseBrowsers()
	{
		//driver.quit();
	}
}