//Automaton Author Name: SUBHRA THOTA
//Version2.0
//This Step Definition Page is defined to create New Customer, Asset and Case from console page.
//Each step is very descriptive to understand the functionality.

package com.sf.qa.stepDefinations;





import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;
import com.sf.qa.pages.CasePage;
import com.sf.qa.pages.HomePage;
import com.sf.qa.pages.LoginPage;
import com.sf.qa.pages.NewCasePage;
import com.sf.qa.pages.NewCustomerDetailPage;
import com.sf.qa.pages.NewCustomerPage;
import com.sf.qa.util.TestUtil;

public class CreatenewCaseAssetCustSD extends TestBase {
	
	CasePage casepage;
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
	
	//This Code is written to handle the pop up window but giving errors. Need to look into it later

	/*@Then("^user is on case console page$")
		public void user_is_on_case_console_page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		casepage = new CasePage();
		String title = casepage.validateCasePageTitle();
		System.out.println("The user is on Case Cons page:" +title);
		Assert.assertEquals("Cases - Console", title);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		/*String parent = driver.getWindowHandle();

        Set<String> pops=driver.getWindowHandles();
        {
        Iterator<String> it =pops.iterator();
        while (it.hasNext()) {

            String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            driver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ driver.switchTo().window(popupHandle).getTitle());
            driver.close();
		}

		
	@Then("^user click on new case button$")
	public HomePage user_click_on_new_case_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	   	//homepage.ClickOnNewCustButton();
		/*if(driver.switchTo().alert() != null)
		{
		    Alert alert = driver.switchTo().alert();
		    String alertText = alert.getText();
		    System.out.println("Pop up window is closed: "+alertText);
		    alert.dismiss(); // alert.accept();

		}
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//casepage.driver.findElement(By.xpath("//div[@class='subNav']/descendant-or-self::input[4][@value='New Case'][@class='btn']").
		casepage = new CasePage();
		casepage.click_on_newcase();
		return new HomePage();
	 	}*/
	
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
