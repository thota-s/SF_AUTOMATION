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
import com.sf.qa.pages.SendEmail;

public class SendEmailSD extends TestBase {
	
	
	LoginPage loginpage;
	static HomePage homepage;
	static NewCustomerPage newcustpage;
	static NewCasePage newcasepage;
	NewCustomerDetailPage newcustdetailpage;

	
	@Given("^user is on email box to send the email to advisor$")
	public void  user_is_on_email_box_to_send_the_email_to_advisor() throws Throwable {
		
		
		System.out.println("The SMTP Email Servr is Initialised");
		
	}
	
	
	@Then("^user enter receiver EmailId \"([^\"]*)\" receiver Subject \"([^\"]*)\" and receiver Email Body \"([^\"]*)\"$")
	public void user_enter_receiver_EmailId_receiver_Subject_and_receiver_Email_Body(String receiveremailid,String receiversubject,String  receiveremailbody) throws Throwable {
	    
		SendEmail sendemail = new SendEmail();
		
		sendemail.SendEmailTo(receiveremailid, receiversubject, receiveremailbody);
		
	}

	
	
		
	}
