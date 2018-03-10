package com.dp360crm.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CrmLogin {

	public CrmLogin(WebDriver driver) {
		this.driver = driver;
	}

	final WebDriver driver;

	@FindBy(xpath = "//*[@id=\"input_13\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id='input_14']")
	public WebElement passwordvalue;
	
	@FindBy(xpath ="//*[@class='md-raised md-primary md-button md-ink-ripple flex-100']")
	public WebElement Submitlogin;


}
