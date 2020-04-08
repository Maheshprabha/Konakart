package com.atmecs.konakart.pages;

import org.openqa.selenium.WebDriver;
import com.atmecs.konakart.constants.LocatorTypes;
import com.atmecs.konakart.dataallocators.LocatorDataAllocator;
import com.atmecs.konakart.helpers.CommonHelpers;
import com.atmecs.konakart.helpers.PageActionsHelper;
import com.atmecs.konakart.helpers.ProductDataGetter;
import com.atmecs.konakart.helpers.ValidationHelper;

public class HomePageHelper {
	static LocatorDataAllocator loc = new LocatorDataAllocator();
	public static String selectValue;

	public static void searchProduct(WebDriver driver, String category, String product,String titleExp,String priceExp) throws Exception {
		loc.getHomepageData();

		PageActionsHelper.dropDown(driver, LocatorTypes.ID, loc.getDropDownMainMenu(), category, "text");
		CommonHelpers.sendKeys(driver, CommonHelpers.findElement(driver, LocatorTypes.ID, loc.getSearchBox()), product);
		CommonHelpers.clickElement(driver, CommonHelpers.findElement(driver, LocatorTypes.ID, loc.getSearchButton()));
		ValidationHelper.imageValidation(ProductDataGetter.getImageStatus(driver, LocatorTypes.XPATH, loc.getProductImage()));
		ValidationHelper.textValidation(ProductDataGetter.getAttribute(driver, LocatorTypes.XPATH, loc.getProductTitle()), titleExp);
		ValidationHelper.textValidation(ProductDataGetter.getAttribute(driver, LocatorTypes.XPATH, loc.getProductPrice()), priceExp);
		
	}
}