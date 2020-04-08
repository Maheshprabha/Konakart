package com.atmecs.konakart.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDataGetter {

	public static boolean getImageStatus(WebDriver driver, String locatorType, String locatorValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = CommonHelpers.findElement(driver, locatorType, locatorValue);
		wait.until(ExpectedConditions.visibilityOf(element));
		boolean imageStatus = CommonHelpers.findElement(driver, locatorType, locatorValue).isDisplayed();
		return imageStatus;
	}

	public static String getAttribute(WebDriver driver, String locatorType, String locatorValue) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = CommonHelpers.findElement(driver, locatorType, locatorValue);
		wait.until(ExpectedConditions.visibilityOf(element));
		String attribute = CommonHelpers.findElement(driver, locatorType, locatorValue).getText();
		return attribute;
	}
}