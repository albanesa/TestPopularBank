package com.BP.qa.baseTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.BP.qa.driver.Driver;
import com.BP.qa.enums.ConfigProperties;
import com.BP.qa.pages.LoginPage;
import com.BP.qa.utils.ReaderPropertyFile;
@Listeners(com.BP.qa.listeners.ListenerClass.class)
public class BaseTest {
	protected LoginPage loginPage = new LoginPage();

	@BeforeMethod
	protected void setUp() throws Exception {
		
		Driver.initDriver(ReaderPropertyFile.getValue(ConfigProperties.BROWSER));

	}

	@AfterMethod

	protected void tearDown() {
		Driver.quitDriver();
	}

}
