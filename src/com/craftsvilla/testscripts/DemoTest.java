package com.craftsvilla.testscripts;

import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pages.CottonSareesPage;

public class DemoTest extends BaseTest
{
	@Test
	public void testMethod()
	{
		CottonSareesPage page = new CottonSareesPage(driver);
				page//.clickOnHighToLowLink();
				//.clickOnLowToHighLink();
				.clickOnMultiColorSaree1();
				//.clickOnPage2();
				//.clickOnSareeColor();
				///.clickOnSareeGreyImage();
				//.searchColor();
				//.selectCottonBlendFabric();
				//.selectCottonFabrics();
				//.selectPrice1000To2000();
				//.selectPrice500To1000();
	}
	@Test
	public void tc_02_fakeTest()
	{
		
	}
}
