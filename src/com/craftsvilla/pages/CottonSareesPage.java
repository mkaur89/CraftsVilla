package com.craftsvilla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CottonSareesPage extends BasePage 
{
	@FindBy(xpath = "//label[@title='500-1000']")
	private WebElement LBL_price1;
	@FindBy(xpath = "//label[@title='1000-2000']")
	private WebElement LBL_price2;
	@FindBy(xpath = "//label[@title='Cotton']")
	private WebElement LBL_cottonFabric;
	@FindBy(xpath = "//label[@title='Cotton Blend']")
	private WebElement LBL_cottonBlendFabric;
	@FindBy(xpath = "//*[@id = 'clear_Saree Color']")
	private WebElement DIV_sareeColor;
	@FindBy(xpath = "//*[@placeholder='Search By Saree Color']")
	private WebElement INP_searchByColor;
	@FindBy(xpath = "//span[@id=\"discountedPriceOrder_ASC\"]")
	private WebElement LNK_priceLowToHigh;
	@FindBy(xpath = "//span[@id=\"discountedPriceOrder_DESC\"]")
	private WebElement LNK_priceHighToLow;
	@FindBy(xpath = "//span[@id=\"sortByNone\"]")
	private WebElement LNK_popular;
	@FindBy(xpath = "//div[@data-url-path=\"craftsvilla-grey-color-cotton-handwoven-traditional-saree\"]")
	private WebElement IMG_sareeGreyImg;
	@FindBy(xpath = "//div[@data-url-path=\"craftsvilla-multicolor-cotton-handwoven-traditional-saree\"]")
	private WebElement LNK_multiColorSaree;
	@FindBy(xpath = "//a[text() = '2']")
	private WebElement LNK_page2;
	
	public CottonSareesPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public boolean selectPrice500To1000()
	{
		try 
		{
			click(LBL_price1);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean selectPrice1000To2000()
	{
		try 
		{
			click(LBL_price2);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean selectCottonFabrics()
	{
		try 
		{
			click(LBL_cottonFabric);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean selectCottonBlendFabric()
	{
		try 
		{
			click(LBL_cottonBlendFabric);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnSareeColor()
	{
		try 
		{
			click(DIV_sareeColor);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean searchColor()
	{
		try 
		{
			verifyElementPresent(INP_searchByColor);
			INP_searchByColor.sendKeys("Red"); //need to read data from excel - to do
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnLowToHighLink()
	{
		try 
		{
			click(LNK_priceLowToHigh);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnHighToLowLink()
	{
		try 
		{
			click(LNK_priceHighToLow);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnSareeGreyImage()
	{
		try 
		{
			click(IMG_sareeGreyImg);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnMultiColorSaree1()
	{
		try 
		{
			click(LNK_multiColorSaree);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean clickOnPage2()
	{
		try 
		{
			click(LNK_page2);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
}
