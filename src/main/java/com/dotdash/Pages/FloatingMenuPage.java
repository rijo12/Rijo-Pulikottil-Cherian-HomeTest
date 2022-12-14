package com.dotdash.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ProxyDriver;

public class FloatingMenuPage extends Page {

	public FloatingMenuPage(WebDriver driver, boolean waitForPageToLoad) {
		super(driver, waitForPageToLoad);
	}

	private By floatingMenu = By.cssSelector("div.example #menu");

	public boolean isFloatingMenuDisplayed() {
		return ((ProxyDriver) driver).isDisplayed(floatingMenu);
	}

	public void scrollToBottom() {
		((ProxyDriver) driver).scrollDownUsingJavaScript();
	}
}
