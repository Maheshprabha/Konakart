package com.atmecs.konakart.helpers;

import org.testng.Assert;

public class ValidationHelper {
	
	public static boolean imageValidation(boolean actual) {
		try {
			Assert.assertEquals(actual, true);
			System.out.println("image is validated");
		} catch (AssertionError e) {
			System.out.println("Image not present in the page"+e.getMessage());
		}
		return false;
	}
	
	public static String textValidation(String actual,String expected) {
		try {
			Assert.assertEquals(actual, expected);
			System.out.println(actual+" validation is done ");
		} catch (Exception e) {
			System.out.println(actual+"not present in the page"+e.getMessage());
		}
		return actual;
	}
}