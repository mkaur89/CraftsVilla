package com.craftsvilla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
	@FindBy(xpath = "//a[@class=\"logo-container\"]")
	private WebElement TTL_logo;
	
	@FindBy(id = "id=\"cartCount\"")
	private WebElement LNK_cart;
	
	@FindBy(xpath = "//span[text() = 'Sign In']")
	private WebElement LNK_signin;
	
	@FindBy(xpath = "//a[contains(text(), 'SAREES')]")
	private WebElement LNK_sarees;
	
	@FindBy(xpath = "//a[contains(text(), 'SALWAR SUITS')]")
	private WebElement LNK_salwar;
	
	@FindBy(xpath = "//*[@class='ds-flex']/li/ul/li/a[text() = 'Cotton Sarees']")
	private WebElement LNK_cottonSarees;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean  ClickOnLogo()
	{
		try
		{
			verifyElementPresent(TTL_logo);
			click(TTL_logo);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean  ClickOnCart()
	{
		try
		{
			verifyElementPresent(LNK_cart);
			click(LNK_cart);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean  ClickOnSignIn()
	{
		try
		{
			verifyElementPresent(LNK_signin);
			click(LNK_signin);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean  goToSarees()
	{
		try
		{
			verifyElementPresent(LNK_sarees);
			mouseHover(LNK_sarees);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean  goToSalwar()
	{
		try
		{
			verifyElementPresent(LNK_salwar);
			mouseHover(LNK_salwar);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean  clickOnCottonSarees()
	{
		try
		{
			verifyElementPresent(LNK_cottonSarees);
			click(LNK_cottonSarees);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
