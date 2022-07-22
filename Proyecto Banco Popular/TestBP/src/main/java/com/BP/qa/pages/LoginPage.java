package com.BP.qa.pages;

import org.openqa.selenium.By;

import com.BP.qa.basePage.BasePage;
import com.BP.qa.enums.WaitStrategy;

public final class LoginPage extends BasePage {
	private final By userName = By.xpath("//input[@name=\"username\" or type=\"text\" or id=\"username\"] ");
	private final By password = By.xpath("//input[@name=\"password\" or type=\"text\" or id=\"username\"] ");
	private final By loginBtn = By.xpath("//button[@class=\"radius\" or type=\"submit\"] ");
	private final By alert = By.xpath("//div//following::div[@id=\"flash\" or @class=\"flash error\"]");

	public LoginPage() {

	}

	public void sendTextUserNameField(String text) {

		doSendKeys(userName, text, WaitStrategy.VISIBLE);
	}
	public void sendTextPasswordField(String text) {

		doSendKeys(password, text, WaitStrategy.VISIBLE);
	}
	public void clickLoginBtn( ) {

		doClick(loginBtn, WaitStrategy.CLICKABLE);
	}

	public String getAlertText() throws InterruptedException {
		Thread.sleep(3000);
		return getText(alert, WaitStrategy.PRESENCE);
	}


}
