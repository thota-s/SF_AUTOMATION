package com.sf.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 20;

	
	//Initialising the Page Object
		public TestUtil() {
			PageFactory.initElements(driver, this);
		}
	
	public static WebElement  waitForPresenceOfElement (WebDriver driver, By xpath){
        WebElement element = null;
        try {
            element = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.presenceOfElementLocated(xpath));
        } catch (Exception e){
            e.printStackTrace();
            driver.quit();
        }
        return element;
    }
	
		

}
