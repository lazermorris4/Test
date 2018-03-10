package com.dp360crm.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dp360crm.model.CrmLogin;

public class StepsImpl {

	// This function will wait for web element presence
	
		public WebElement isElementLoaded(WebElement elementToBeLoaded, WebDriver driver) {
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    WebElement element = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));
	    return element;
	}
}
