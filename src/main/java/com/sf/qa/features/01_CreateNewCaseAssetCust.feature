
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
|AUT_UAT_MRP_TESTER74|A_UAT_MRP_74|AUTUATTONMRP74@GMAIL.COM|0229069999|MR PORTER|APAC|United Kingdom|
|AUT_UAT_NAP_TESTER75|A_UAT_NAP_75|AUTUATTONNAP74@GMAIL.COM|0139069999|NET-A-PORTER|INTL|United Kingdom|
|AUT_UAT_TON_TESTER76|A_UAT_TON_76|AUTUATTONTON76@GMAIL.COM|0339069999|THE OUTNET|INTL|United Kingdom|
|AUT_UAT_YOOX_TESTER77|A_UAT_YOOX_77|AUTUATTONYOOX77@GMAIL.COM|0439069999|YOOX|INTL|Chile|
|AUT_UAT_DODO_TESTER78|A_UAT_DODO_78|AUTUATTONDODO78@GMAIL.COM|0539069999|DODO|INTL|Germany|
