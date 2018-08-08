package com.sf.qa.pages;





import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;




public class NewCasePage extends TestBase {
	
	NewCaseDetailPage newcasedetailpage= new NewCaseDetailPage();
	
	String NewcasepageTitle = "Details - Console";
	
	//@FindBy(xpath="//iframe[@id='ext-comp-1036']")
	//WebElement framenewcustpages;
	
	@FindBy(xpath="//div[@class='caseBlock']/div/div/div/table//td/input[@name='page:form:pb:j_id40:saveBtn']")
	WebElement newcasesave;
	
	
	//Initialising the Page Object
	public NewCasePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateNewcasesavePageTitle() {
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		String casehandle= driver.getWindowHandle();
		System.out.println("New Case Page Window Name: " +casehandle);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		if (!wait.until(ExpectedConditions.titleContains(NewcasepageTitle)))
			throw new RuntimeException("New Case save page is not displayed");
		return driver.getTitle();
	}
	
	
	public NewCaseDetailPage save_newcase() {
		
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		String casehandle= driver.getWindowHandle();
		System.out.println("New Case Page Window Name: " +casehandle);
		
		System.out.println("SAVE BUTTON CLICKED TO SAVE NEW CASE");
		
		int Frame_Indexs = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iframes in newcase page: " +Frame_Indexs);
		int j;
		for(j=0;j<=Frame_Indexs;j++) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(j);
		int counts =0;
		counts =driver.findElements(By.xpath("//div[@class='caseBlock']/div/div/div/table//td/input[@name='page:form:pb:j_id40:saveBtn']")).size();
		System.out.println("New case Xpath is found in this frame Index: " +j);
		System.out.println(counts);
	    if(counts > 0) {
	    	System.out.println("New Case Xpath is found in this frame Index: " +j);
	    	System.out.println("New Case Xpath is found: " +counts);
	    	
	    	newcasesave.click();
	    	
	    	break;
	        }
	    else {
	    	System.out.println("New Case Xpath is not found in this frame Index: " +counts);
	    }	
	   
		}
		
				
		return new NewCaseDetailPage();
	}
	


}
