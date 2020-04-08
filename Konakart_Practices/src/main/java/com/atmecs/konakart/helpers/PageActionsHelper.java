package com.atmecs.konakart.helpers;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class PageActionsHelper {

	public static void dropDown(WebDriver driver, final String locatorType, final String mainMenu, final String subMenu, final String selectType) {
		
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
					.ignoring(NoSuchElementException.class).pollingEvery(2, TimeUnit.SECONDS)
					.withTimeout(10, TimeUnit.SECONDS);
		
		fluentWait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
			WebElement element = CommonHelpers.findElement(driver, locatorType, mainMenu);
			Select select = new Select(element);
			if (selectType.equalsIgnoreCase("text")) {
				select.selectByVisibleText(subMenu);
			} else if (selectType.equalsIgnoreCase("value")) {
				select.selectByValue(subMenu);
			}
			return true;
			}
		});

	}
}