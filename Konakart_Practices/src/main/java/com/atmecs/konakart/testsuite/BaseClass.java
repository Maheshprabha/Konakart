package com.atmecs.konakart.testsuite;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import com.atmecs.konakart.constants.FilePaths;
import com.atmecs.konakart.utils.ReadProperties;

public class BaseClass {
	Properties properties;
	public WebDriver driver;
	public String baseUrl;
	public String browserName;

	@BeforeTest
	public void invokeBrowser() throws IOException {
		properties = ReadProperties.loadProperty(FilePaths.CONFIG_FILE);
		System.setProperty("webdriver.chrome.driver", FilePaths.CHROME_FILE);
		baseUrl = properties.getProperty("url");
		browserName = properties.getProperty("browser");
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
	
		
		}
}
