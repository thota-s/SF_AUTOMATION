package com.sf.qa.stepDefinations;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;
import com.sf.qa.pages.HomePage;
import com.sf.qa.pages.LoginPage;
import com.sf.qa.pages.NewCasePage;
import com.sf.qa.pages.NewCustomerDetailPage;
import com.sf.qa.pages.NewCustomerPage;
import com.sf.qa.util.TestUtil;

public class CreatenewCaseAssetCustSD extends TestBase {
	
	LoginPage loginpage;
	static HomePage homepage;
	static NewCustomerPage newcustpage;
	static NewCasePage newcasepage;
	NewCustomerDetailPage newcustdetailpage;

	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		
		TestBase.initialization();
		System.out.println("The Browser Initialised");
		
	}
	
	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		loginpage = new LoginPage();
		String title = loginpage.validatePageTitle();
		System.out.println("The user is on login page:" +title);
		Assert.assertEquals("Login | Salesforce", title);
		}
	
	@Then("^user enters username and password$")
	public HomePage user_enters_username_and_password() throws Throwable {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("User Entered the correct username and password details");
		//setHomePage1(homepage);
		return new HomePage();
		
		}

	@Then("^click on new customer button$")
	public NewCustomerPage click_the_new_cust_button() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	   	//homepage.ClickOnNewCustButton();
		newcustpage = homepage.ClickOnNewCustButton();
		return new NewCustomerPage();
	 	}

	@Then("^user enter the Firstname \"(.*)\"$")
	public void user_enter_the_customer_FirstName(String firstname) throws Throwable {
	   
		newcustpage.Enter_FirstName(firstname);
		
	}

	@Then("^user enter the Lastname \"(.*)\"$")
	public void user_enter_the_customer_LastName(String lastname) throws Throwable {
	    
		newcustpage.Enter_LastName(lastname);
	}

	@Then("^user enter the EmaiId \"(.*)\"$")
	public void user_enter_the_customer_EmailID(String Email_ID) throws Throwable {
	    
		newcustpage.Enter_Email(Email_ID);
	}

	@Then("^user enter the MobileNum \"(.*)\"$")
	public void user_enter_the_customer_MobileNum(String Mobile_Num) throws Throwable {
	    
		newcustpage.Enter_mobilenumber(Mobile_Num);
	}
	
	@Then("^user enter the customer StoreName \"([^\"]*)\" Region \"([^\"]*)\"and Country \"([^\"]*)\"$")
	public void user_enter_the_customer_StoreName(String Store_Name, String Region_Name, String Country_Name) throws Throwable {
	    
		newcustpage.Enter_store(Store_Name, Region_Name, Country_Name);
	}
	
	
	@Then("^user click on save button to create the customer account and case$")
	public NewCasePage  user_click_on_save_button_to_create_the_customer_account_and_case() throws Throwable {
	    
		newcustpage.click_on_savebutton();
		
		return new NewCasePage();
	}
	
	
	@Then("^user click on save button in new case page$")
	public HomePage user_click_on_save_button_in_new_case_page() throws Throwable {
	    
		System.out.println("Validating the New Case is saved successfully");
		
		NewCasePage cs = new NewCasePage();
		
		cs.save_newcase();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//System.out.println("Validating the New Case is saved");
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
		//newcustdetailpage.return_to_homepage();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//homepage.ClickOnNewCustButton();
		
		driver.quit();
		
		return new HomePage();
	}
	
	
	/*public static NewCasePage getHomePage3() {
		return newcasepage;
	}
	
	private void setHomePage3(NewCasePage newcasepage) {
		
		NewCustomerSD.newcasepage = newcasepage;
	}
	
		
	public static NewCustomerPage getHomePage2() {
		return newcustpage;
	}
	
	private void setHomePage2(NewCustomerPage newcustomerpage) {
		
		HomePageSD.newcustomerpage = newcustomerpage;
	}
	
	
	
	public static HomePage getHomePage1() {
		return homepage;
	}
	
	private void setHomePage1(HomePage homepage) {
		
		CreatenewCaseAssetCustSD.homepage = homepage;
	}
	*/
	
	
		
	}
