package com.sf.qa.pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;
import com.sf.qa.util.TestUtil;



public class LoginPage extends TestBase {
	
	TestUtil testutil;
	
	//Page Factory - Object Repository
	
			@FindBy(xpath="//input[@name='username']")
			WebElement username;

			@FindBy(xpath="//input[@id='password']")
			WebElement password;
			
			@FindBy(xpath="//input[@type='submit']")
			WebElement loginbtn;
			
			@FindBy(xpath="//a[@id='forgot_password_link']")
			WebElement forgottenpwd;
			
			@FindBy(xpath="//img[@id='logo']")
			WebElement sflogo;
	
	//Initialising the Page Object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	
	
	public String validatePageTitle() {
		String handle= driver.getWindowHandle();
		System.out.println("Login Window Name: " +handle);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.titleContains("Login | Salesforce"));
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return sflogo.isDisplayed();
	}
	
	
	public HomePage login(String us, String ps) {
		username.sendKeys(us);
		password.sendKeys(ps);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		loginbtn.submit();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("click();", loginbtn);
		
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
}

