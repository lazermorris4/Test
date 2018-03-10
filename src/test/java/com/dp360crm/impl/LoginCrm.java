package com.dp360crm.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dp360crm.model.CrmLogin;

import junit.framework.Assert;

public class LoginCrm {
	
	StepsImpl stepsImpliment = new StepsImpl();

	// This function is used to login to the crm portal

	public void login_crm(WebDriver driver, String userId, String password) {
		CrmLogin crmLogin = PageFactory.initElements(driver, CrmLogin.class);
		driver.get("https://dev.dp360crm.com/#/login");
		stepsImpliment.isElementLoaded(crmLogin.Submitlogin, driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		crmLogin.username.sendKeys(userId);
		crmLogin.passwordvalue.sendKeys(password);
		stepsImpliment.isElementLoaded(crmLogin.Submitlogin, driver);		
		crmLogin.Submitlogin.click();
		stepsImpliment.isElementLoaded(crmLogin.Submitlogin, driver);	
		Assert.assertTrue("user login failed",driver.findElements(crmLogin.dashboard));
		
	}

}
