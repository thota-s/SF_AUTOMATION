//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//NewCustomer Creation button page in console page.
//Click the New Customer button

package com.sf.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sf.qa.base.TestBase;
import com.sf.qa.util.TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;




public class HomePage extends TestBase {
	
LoginPage loginpage;
	
NewCustomerPage newcustomer;


String homeTitle = "Details - Console";

	//Page Factory - Object Repository
	
	
			// Sandbox Environment
			@FindBy(xpath="//*[text()='UAT']")
			WebElement sfenvcheck;

			//Case console page logo
			
			@FindBy(xpath="//div[contains(@class,'sd_custom_logo')]")
			WebElement sdcustlogo;
			
						
			//Search box
						
			@FindBy(xpath="//input[@id='phSearchInput']")
			WebElement searchTerm;
			
			//@FindBy(xpath="//iframe[@id='ext-comp-1011']")
			//WebElement frameclick;
			
			//driver.findElement(By.xpath("//iframe[@id='ext-comp-1011']"));
			
			@FindBy(xpath="//div[@class='pbBottomButtons']/table/tbody/tr/td/following::td/*")
			WebElement CustomerText;
			
												
			@FindBy(xpath="//input[@value='Search'][@type='submit']")
			WebElement searchbtn;
			
			@FindBy(xpath="//input[@type='text'][@placeholder='Customer']")
			WebElement EnterCustDtls;
			
			//@FindBy(xpath="//*[@id=\"j_id0:j_id12:j_id15\"]/label")
			//WebElement labeltxt;
			
			@FindBy(xpath="//span[@id='tsidLabel']")
			WebElement appicon;
			
			//Initialising the Page Object
			
			public HomePage() {
				PageFactory.initElements(driver, this);
			}
			
			public String validateEnvCheck() {
				
				
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				String Envh = driver.getTitle();
				return Envh;
			}
			
			public void validateAppCheck() {
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				appicon.click();
				//driver.findElement(By.linkText("NET-A-PORTER Advisor Console")).click();
				//return Envh;
			}
			
						
			public String validateHomePageTitle() {
				//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				String handles= driver.getWindowHandle();
				System.out.println("Home Page Window Name: " +handles);
				
				WebDriverWait wait = new WebDriverWait(driver, 15);
				if (!wait.until(ExpectedConditions.titleContains(homeTitle)))
					throw new RuntimeException("home page is not displayed");
				return driver.getTitle();
			}
			
			//WebDriverWait wait = new WebDriverWait(driver, 15); wait.until(ExpectedConditions.titleContains("Detail"));
			
			
			public NewCustomerPage ClickOnNewCustButton() {
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				
				/*WebElement crtnewcust = null;
				
				crtnewcust = driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td/following::td/*"));
				
				driver.switchTo().frame(crtnewcust);
				
				
				CustomerText.click();*/
								
				int Frame_Index = driver.findElements(By.tagName("iframe")).size();
				System.out.println("Number of iframes in homepage: " +Frame_Index);
				int i;
				for(i=0;i<=Frame_Index;i++) {
					driver.switchTo().defaultContent();
					driver.switchTo().frame(i);
				int count =0;
				count =driver.findElements(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td/following::td/*")).size();
				System.out.println("Xpath is found in this frame Index: " +i);
				System.out.println(count);
			    if(count > 0) {
			    	System.out.println("Xpath is found in this frame Index: " +i);
			    	System.out.println("Xpath is found: " +count);
			    	CustomerText.click();
			    	break;
			        }
			    else {
			    	System.out.println("Xpath is not found in this frame Index: " +count);
			    }	
			   
				}
				return new NewCustomerPage();
				
				  
			
			}
			
			
		/*	public SearchResultsPage performSearch(String search) throws InterruptedException {
		        WebElement theSearch = UtilityMethods.waitForElementToBeVisible(driver,searchTerm);
		        SalesforceObjects.enterTextInTextBox(theSearch, search);
		        //WebElement hitSearch = UtilityMethods.waitForElementToBeVisible(driver, searchButton);
		        Thread.sleep(2000);
		        Assert.assertTrue(theSearch.isDisplayed());
		        SalesforceObjects.click(theSearch);
		        return new SearchResultsPage(driver);

		    }*/

				
}

