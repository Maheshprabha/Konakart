package com.atmecs.konakart.dataallocators;

import java.util.Properties;
import com.atmecs.konakart.constants.FilePaths;
import com.atmecs.konakart.utils.ReadProperties;

public class LocatorDataAllocator {
	Properties properties;

	public String dropDownMainMenu;
	public String dropDownSubMenu;
	public String searchBox;
	public String searchButton;
	public String dropDownList;
	public String productImage;
	public String productTitle;
	public String productPrice;

	public void getHomepageData() throws Exception {
		properties = ReadProperties.loadProperty(FilePaths.HOMEPAGE_LOCFILE);
		setDropDownMainMenu();
		setDropDownSubMenu();
		setSearchBox();
		setSearchButton();
		setdropDownList();
		setProductImage();
		setProductPrice();
		setProductTitle();
	}

	public String getDropDownMainMenu() {
		return dropDownMainMenu;
	}

	public void setDropDownMainMenu() {
		this.dropDownMainMenu = properties.getProperty("loc.dropDownMainMenu");
	}

	public String getDropDownSubMenu() {
		return dropDownSubMenu;
	}

	public void setDropDownSubMenu() {
		this.dropDownSubMenu = properties.getProperty("loc.dropDownSubMenu");
	}

	public String getSearchBox() {
		return searchBox;
	}

	public void setSearchBox() {
		this.searchBox = properties.getProperty("loc.searchBox");
	}

	public String getSearchButton() {
		return searchButton;
	}

	public void setSearchButton() {
		this.searchButton = properties.getProperty("loc.searchButton");
	}
	
	public String getdropDownList() {
		return dropDownList;
	}

	public void setdropDownList() {
		this.dropDownList = properties.getProperty("loc.dropDownList");
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage() {
		this.productImage = properties.getProperty("loc.productImage");
	}

	public String getProductTitle() {
		return productTitle;
	}

	public void setProductTitle() {
		this.productTitle = properties.getProperty("loc.productTitle");
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice() {
		this.productPrice = properties.getProperty("loc.productPrice");
	}
	
	
}
