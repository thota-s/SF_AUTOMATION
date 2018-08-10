
@loginpage-feature

Feature: Salesforce Login



Scenario Outline: Validate Salesforce login page

	Given user opens browser
	Then user is on login page
	Then user enters username and password
	Then click on new customer button
	Then user enter the Firstname "<first_name>"
	Then user enter the Lastname "<last_name>"
	Then user enter the EmaiId "<Email_ID>"
	Then user enter the MobileNum "<Mobile_Num>"
	Then user enter the customer StoreName "<Store_Name>" Region "<Region_Name>"and Country "<Country_Name>"
	Then user click on save button to create the customer account and case	
	Then user click on save button in new case page
				
Examples:
|first_name|last_name|Email_ID|Mobile_Num|Store_Name|Region_Name|Country_Name|
|AUT_UAT_MRP_TESTER85|A_UAT_MRP_85|AUTUATTONMRP85@GMAIL.COM|0929069999|MR PORTER|APAC|United Kingdom|
