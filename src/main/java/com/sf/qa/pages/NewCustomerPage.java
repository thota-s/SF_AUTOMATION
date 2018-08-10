//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//Entering the customer details such as first name, last name etc... during new customer creation.

package com.sf.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sf.qa.base.TestBase;
import com.sf.qa.util.TestUtil;



public class NewCustomerPage extends TestBase {
	
	HomePage homepage;
	
	NewCasePage newcasepage;
	
	//Page Factory - Object Repository
	
	
	@FindBy(xpath="//iframe[@id='ext-comp-1011']")
	WebElement framenewcustpage;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//td/input[@placeholder='Customer']")
	WebElement custsearch;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//td[@class='dataCol first']/input[@name='j_id0:j_id12:j_id89:j_id93:j_id94']")
	WebElement firstname;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//td[@class='dataCol first']/input[@name='j_id0:j_id12:j_id89:j_id93:j_id95']")
	WebElement Email;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//td[@class='dataCol last']/input[@name='j_id0:j_id12:j_id89:j_id93:j_id96']")
	WebElement lastname;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//td[@class='dataCol last']/input[@name='j_id0:j_id12:j_id89:j_id93:j_id97']")
	WebElement mobilenum;

	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//select")
	WebElement store;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//select[@name='j_id0:j_id12:j_id89:userSelection:countryArea:countryField']")
	WebElement countrync;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//select[@name='j_id0:j_id12:j_id89:userSelection:fieldArea:regionField']")
	WebElement region;
	
	@FindBy(xpath="//div[@class='pbSubsection']/table[1]//input[@name='j_id0:j_id12:j_id89:j_id90:j_id92']")
	WebElement save;
	
	
	//Initialising the Page Object
		public NewCustomerPage() {
			PageFactory.initElements(driver, this);
		}

		public String validate_titlenc() {
			
			
			String NC_Page_Title = driver.getTitle();
			return NC_Page_Title;
		}
		
		
		
		public void Enter_FirstName(String first_name) {
			
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			String custhandle= driver.getWindowHandle();
			System.out.println("New Customer Page Window Name: " +custhandle);
			//driver.switchTo().frame(framenewcustpage);
			
			firstname.sendKeys(first_name);
		}
		
	public void Enter_LastName(String last_name) {
			
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			//driver.switchTo().frame(framenewcustpage);
			
			lastname.sendKeys(last_name);
		}
	
	public void Enter_Email(String email_id) {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(framenewcustpage);
		
		Email.sendKeys(email_id);
	}
	
public void Enter_mobilenumber(String Mobile_Number) {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(framenewcustpage);
		
		mobilenum.sendKeys(Mobile_Number);
	}
	
	public void Enter_store(String Store_Name, String Region_Name, String Country_Name) {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(framenewcustpage);
		
		//CANNOT USE SWITCH WITH STRING VALUE ABOVE JAVA VERSION 7
		/*switch (Store_Name) {
		case "NET-A-PORTER":
		store.sendKeys(Store_Name);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		region.sendKeys(Region_Name);
		break;
		case "MR PORTER":
		store.sendKeys(Store_Name);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		region.sendKeys(Region_Name);
		break;
		case "THE OUTNET":
		store.sendKeys(Store_Name);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		countrync.sendKeys(Country_Name);
		break;
		default:
		store.sendKeys(Store_Name);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		countrync.sendKeys(Country_Name);
		break;
		}*/
		
		if(Store_Name.equals("NET-A-PORTER")) {
			store.sendKeys(Store_Name);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			region.sendKeys(Region_Name);
		}
			else if (Store_Name.equals("MR PORTER")) {
				store.sendKeys(Store_Name);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				region.sendKeys(Region_Name);
			}
			else  {
				store.sendKeys(Store_Name);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				countrync.sendKeys(Country_Name);
			}
	}
	
public NewCasePage click_on_savebutton() {
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(framenewcustpage);
		
		save.click();
		
		return new NewCasePage();
	}
	




}
