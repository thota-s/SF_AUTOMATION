//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//Case console page.

package com.sf.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;



public class CasePage extends TestBase {
	
	String casepagetitle = "Cases - Console";
	
	//------------------ LIST VALUES-------------
	
	@FindBy(xpath="//option[contains(text(),'0.0 Emails to Clear_GLOBAL_ESC')]")
	WebElement Emails_to_Clear_GLOBAL_ESC_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 Emails to Clear_MRP')]")
	WebElement Emails_to_Clear_MRP_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 Emails to Clear_NAP')]")
	WebElement Emails_to_Clear_NAP_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 Emails to Clear_TON')]")
	WebElement Emails_to_Clear_TON_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 My Open Cases')]")
	WebElement My_Open_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 NAP & MRP Global emails')]")
	WebElement NAP_MRP_Global_emails_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'0.0 YNAP CC Support')]")
	WebElement YNAP_CC_Support_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'All NAP AM Open Cases')]")
	WebElement All_NAP_AM_Open_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'All NAP APAC Open Cases')]")
	WebElement All_NAP_APAC_Open_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'All NAP INTL Open Cases')]")
	WebElement All_NAP_INTL_Open_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'All Open Cases')]")
	WebElement All_Open_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'APAC ESCALATION')]")
	WebElement APAC_ESCALATION_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'APAC GENERAL')]")
	WebElement APAC_GENERAL_ListValue;
			
	@FindBy(xpath="//option[contains(text(),'ARABIC GENERAL')]")
	WebElement ARABIC_GENERAL_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Assistant PS Case View')]")
	WebElement Assistant_PS_Case_View_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'AW US')]")
	WebElement AW_US_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'AW US PRODUCT')]")
	WebElement AW_US_PRODUCT_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Backup Queue')]")
	WebElement Backup_Queue_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'BAL FREEFORM')]")
	WebElement BAL_FREEFORM_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'BAL ROW')]")
	WebElement BAL_ROW_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'BAL US')]")
	WebElement BAL_US_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'California In Progress Cases')]")
	WebElement California_In_Progress_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'MRP CC')]")
	WebElement MRP_CC_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'MRP PS AM')]")
	WebElement MRP_PS_AM_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'MRP PS APAC')]")
	WebElement MRP_PS_APAC_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'MRP PS INTL')]")
	WebElement MRP_PS_INTL_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'My Customers' )]")
	WebElement My_Customers_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Tailor-Made APAC' )]")
	WebElement Tailor_Made_APAC_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Tailor-Made UK' )]")
	WebElement Tailor_Made_UK_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Tailor-Made US' )]")
	WebElement Tailor_Made_US_ListValue;
	
	@FindBy(xpath="//option[@value='00B0N000005AjJe']")
	WebElement Today_ListValue;
	
	@FindBy(xpath="//option[@value='00Bb0000004Wo42']")
	WebElement YOOX_SOCIAL_ListValue;
	
	@FindBy(xpath="//option[@value='00Bb0000002VQup']")
	WebElement TON_CC_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Recently Viewed Cases' )]")
	WebElement Recently_Viewed_Cases_ListValue;
	
	@FindBy(xpath="//option[contains(text(),'Tailor-Made IT' )]")
	WebElement Tailor_Made_IT_ListValue;
	
	
	//----------------Filter Links----------------------------
	
	@FindBy(xpath="//div[@class='filterLinks']/descendant-or-self::a[1]")
	WebElement Editlist;
	
	@FindBy(xpath="//div[@class='filterLinks']/descendant-or-self::a[2]")
	WebElement Deletelist;
	
	@FindBy(xpath="//div[@class='filterLinks']/descendant-or-self::a[3]")
	WebElement CreateNewViewlist;
	
	
	//---------- Case Buttons ------------------------------------------
	
	
	@FindBy(xpath="//div[@class='subNav']/descendant-or-self::input[1][@value=' Close ']")
	WebElement CloseCase;
	
	@FindBy(xpath="//div[@class='subNav']/descendant-or-self::input[2][@value='Change Owner']")
	WebElement ChangeOwner;
	
	@FindBy(xpath="//div[@class='subNav']/descendant-or-self::input[3][@value='Accept Case']")
	WebElement AcceptCase;
	
	@FindBy(xpath="//div[@class='subNav']/descendant-or-self::input[4][@value='New Case'][@class='btn']")
	WebElement newcase;
	
	//input[@value='New Case']
	//div[@class='subNav']/descendant-or-self::input[4][@value='New Case'][@class='btn']
	
	//Initialising the Page Object
	public CasePage() {
		PageFactory.initElements(driver, this);
	}
	

	public String validateCasePageTitle() {
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		String handles= driver.getWindowHandle();
		System.out.println("Case Page Window Name: " +handles);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		if (!wait.until(ExpectedConditions.titleContains(casepagetitle)))
			throw new RuntimeException("Case Console page is not displayed");
		return driver.getTitle();
	}
	
	
public HomePage click_on_newcase() {
		
				
		//String casehandles= driver.getWindowHandle();
		//System.out.println("New Case Page Window Name: " +casehandles);
		
		System.out.println("CLICK ON NEW CASE TO GOTO NEW CASE OR CUSTOMER OR ASSET CREATION PAGE");
		
		int Frame_Indexes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iframes in newcase page: " +Frame_Indexes);
		int j;
		for(j=0;j<=Frame_Indexes;j++) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(j);
		int counts =0;
		counts =driver.findElements(By.xpath("//div[@class='subNav']/descendant-or-self::input[4][@value='New Case'][@class='btn']")).size();
		//System.out.println("New case Xpath is found in this frame Index: " +j);
		System.out.println(counts);
	    if(counts > 0) {
	    	System.out.println("New Case Xpath is found in this frame Index: " +j);
	    	System.out.println("New Case Xpath is found: " +counts);
	    	
	    	newcase.submit();
	    	
	    	
	    	break;
	        }
	    else {
	    	System.out.println("New Case Xpath is not found in this frame Index: " +counts);
	    }	
	   
		}
		
				
		return new HomePage();
	}


}

