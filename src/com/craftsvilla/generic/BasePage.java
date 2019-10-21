package com.craftsvilla.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage 
{
	public WebDriver driver = null;

	public BasePage(WebDriver driver) 
	{
		this.driver = driver;
	}

	public void verifyTitle(String expectedTitile)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.titleContains(expectedTitile));
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitile);
		}
		catch(Exception e)
		{

		}
	}
	public void verifyElementPresent(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.invisibilityOf(element));
		}
		catch(Exception e)
		{

		}
	}
	public void mouseHover(WebElement element)
	{
		try
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		}
		catch(Exception e)
		{

		}
	}
	public void click(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		catch(Exception e)
		{

		}
	}
	public void scrollWindow()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try 
		{
			js.executeScript("window.scroll(0,200)");
		}
		catch(Exception e)
		{
			
		}
	}
}
