package com.craftsvilla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(xpath = "//input[@id=\"emailId\"]")
	private WebElement INP_email;
	
	@FindBy(xpath = "//div[text() = 'CONTINUE']")
	private WebElement BTN_continue;
	
	@FindBy(xpath = "//span[text() = 'New User? Sign Up']")
	private WebElement LNK_signUp;
	
	@FindBy(xpath = "//input[@placeholder=\"Enter Your Password\"]")
	private WebElement INP_password;
	
	LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
}
