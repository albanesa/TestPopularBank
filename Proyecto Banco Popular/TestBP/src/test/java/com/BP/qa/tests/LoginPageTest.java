package com.BP.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BP.qa.baseTest.BaseTest;
import com.BP.qa.utils.ExcelUtils;

public class LoginPageTest extends BaseTest {


	@Test(priority = 0)
	public void invalidLoginWrongUserName() throws Exception {
		loginPage.sendTextUserNameField(ExcelUtils.getCellStringData("userdata", 0, 0));
		loginPage.sendTextPasswordField(ExcelUtils.getCellStringData("userdata", 0, 1));
		loginPage.clickLoginBtn();
		String alert = loginPage.getAlertText();
		System.out.println(alert);
		Assert.assertEquals(alert, ExcelUtils.getCellStringData("resultdata", 0, 0));
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void invalidLoginWrongPass() throws Exception {
		loginPage.sendTextUserNameField(ExcelUtils.getCellStringData("userdata", 1, 0));
		loginPage.sendTextPasswordField(ExcelUtils.getCellStringData("userdata", 1, 1));
		loginPage.clickLoginBtn();
		String alert = loginPage.getAlertText();
		System.out.println(alert);
		Assert.assertEquals(alert, ExcelUtils.getCellStringData("resultdata", 1, 0));
		Thread.sleep(5000);
	}
	
	@Test(priority = 2)
	public void validLogin() throws Exception {
		loginPage.sendTextUserNameField(ExcelUtils.getCellStringData("userdata", 2, 0));
		loginPage.sendTextPasswordField(ExcelUtils.getCellStringData("userdata", 2, 1));
		loginPage.clickLoginBtn();
		String alert = loginPage.getAlertText();
		System.out.println(alert);
		Assert.assertEquals(alert, ExcelUtils.getCellStringData("resultdata", 2, 0));
		Thread.sleep(5000);
	}



}
