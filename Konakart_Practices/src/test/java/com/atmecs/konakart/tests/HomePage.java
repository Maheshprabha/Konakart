package com.atmecs.konakart.tests;

import org.testng.annotations.Test;

import com.atmecs.konakart.dataallocators.ValidationDataAllocator;
import com.atmecs.konakart.pages.HomePageHelper;
import com.atmecs.konakart.testsuite.BaseClass;

public class HomePage extends BaseClass{
	
	ValidationDataAllocator val = new ValidationDataAllocator();
	@Test
	public void searchProduct() throws Exception {
		val.getValidationData();
		HomePageHelper.searchProduct(driver, "Computer Peripherals", "matrox",val.getMatroxName(),val.getMatroxPrice());
		HomePageHelper.searchProduct(driver, "Games", "call of duty", val.getGameName(), val.getGamePrice());
		HomePageHelper.searchProduct(driver, "Software", "microsoft", val.getSoftName(), val.getSoftPrice());
	}
}