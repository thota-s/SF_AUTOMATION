//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//New case detail page -- Skeleton not coded still

package com.sf.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;



public class NewCaseDetailPage extends TestBase {
	
	//@FindBy(xpath="//iframe[@id='ext-comp-1011']")
	//WebElement framenewcustpages;
	
	//@FindBy(xpath="//div[@class='caseBlock']/div/div/div/table//td/input[@name='page:form:pb:j_id40:saveBtn']")
	//WebElement newcasesave;
	
	
	//Initialising the Page Object
	public NewCaseDetailPage() {
		PageFactory.initElements(driver, this);
		
		String casepghandle= driver.getWindowHandle();
		System.out.println("New Case detail Page Window Name: " +casepghandle);
	}
	
	public void TearDown()
	{
	    if (driver != null)
	      driver.quit();
	}
	


}

