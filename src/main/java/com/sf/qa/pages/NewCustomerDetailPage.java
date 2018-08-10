//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//Browser Initialisation page -- Its a duplicate page to case page. Need to see how to user it or removed it later.

package com.sf.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;
import com.sf.qa.util.TestUtil;

public class NewCustomerDetailPage extends TestBase {
	
	HomePage homepage;
	
	
	@FindBy(xpath="//iframe[@id='ext-comp-1011']")
	WebElement framenewcustpages;
	
	@FindBy(xpath="//td[@class='x-btn-mc']/em/button/span")
	WebElement cases;
	
	@FindBy(xpath="//div[@class='subNav']/descendant-or-self::input[4][@value='New Case'][@class='btn']")
	WebElement newcase;
	
	//Initialising the Page Object
	public NewCustomerDetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage return_to_homepage() {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		cases.click();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		newcase.click();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
		
		return new HomePage();
	}
	


}
